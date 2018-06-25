/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.IUsuarioDAO;
import edu.patrones.model.Usuario;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO, Serializable {

	private Connection cx;

	public UsuarioDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(Usuario usuario) {
		try {
			String sql = "INSERT INTO USUARIO(usuario_id, perfil_id, nom_usuario, clve_usuario, estado) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, usuario.getUsuarioId());
                        preparedStatement.setString(2, usuario.getPerfilId());
			preparedStatement.setString(3, usuario.getNomUsuario());
                        preparedStatement.setString(4, usuario.getClveUsuario());
                        preparedStatement.setShort(5, usuario.getEstado());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM USUARIO WHERE usuario_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Usuario usuario) {
		try {
			String sql = "UPDATE USUARIO SET perfil_id=?, nom_usuario=?, clve_usuario=?, estado=? WHERE usuario_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
                        preparedStatement.setString(1, usuario.getPerfilId());
			preparedStatement.setString(2, usuario.getNomUsuario());
                        preparedStatement.setString(3, usuario.getClveUsuario());
                        preparedStatement.setShort(4, usuario.getEstado());
                        preparedStatement.setString(5, usuario.getUsuarioId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Usuario> listar() {
		List<Usuario> usuarios = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM USUARIO");
			while (resultSet.next()) {
				Usuario usuario = new Usuario();
				usuario.setUsuarioId(resultSet.getString("usuario_id"));
                                usuario.setPerfilId(resultSet.getString("perfil_id"));
				usuario.setNomUsuario(resultSet.getString("nom_usuario"));
                                usuario.setClveUsuario(resultSet.getString("clve_usuario"));
                                usuario.setEstado(resultSet.getShort("estado"));
				usuarios.add(usuario);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;
	}

	@Override
	public Usuario listarPorId(String id) {
		Usuario usuario = new Usuario();
		try {
			String query = "SELECT * FROM USUARIO WHERE usuario_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				usuario.setUsuarioId(resultSet.getString("usuario_id"));
                                usuario.setPerfilId(resultSet.getString("perfil_id"));
				usuario.setNomUsuario(resultSet.getString("nom_usuario"));
                                usuario.setClveUsuario(resultSet.getString("clve_usuario"));
                                usuario.setEstado(resultSet.getShort("estado"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

}
