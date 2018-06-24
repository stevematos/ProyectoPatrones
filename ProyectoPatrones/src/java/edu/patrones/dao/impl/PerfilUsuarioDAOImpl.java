/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.IPerfilUsuarioDAO;
import edu.patrones.model.PerfilUsuario;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Jhunior Cuadros
 */
@Stateless
public class PerfilUsuarioDAOImpl implements IPerfilUsuarioDAO, Serializable {

	private Connection cx;

	public PerfilUsuarioDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(PerfilUsuario perfilUsuario) {
		try {
			String sql = "INSERT INTO PERFIL_USUARIO(perfil_id, nombre, estado) VALUES (?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, perfilUsuario.getPerfilId());
			preparedStatement.setString(2, perfilUsuario.getNombre());
                        preparedStatement.setShort(3, perfilUsuario.getEstado());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM PERFIL_USUARIO WHERE detalle_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(PerfilUsuario perfilUsuario) {
		try {
			String sql = "UPDATE PERFIL_USUARIO SET nombre=?, estado=? WHERE perfil_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, perfilUsuario.getNombre());
                        preparedStatement.setShort(2, perfilUsuario.getEstado());
                        preparedStatement.setString(3, perfilUsuario.getPerfilId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<PerfilUsuario> listar() {
		List<PerfilUsuario> perfilUsuarios = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM PERFIL_USUARIO");
			while (resultSet.next()) {
				PerfilUsuario perfilUsuario = new PerfilUsuario();
				perfilUsuario.setPerfilId(resultSet.getString("perfil_id"));
				perfilUsuario.setNombre(resultSet.getString("nombre"));
                                perfilUsuario.setEstado(resultSet.getShort("estado"));
				perfilUsuarios.add(perfilUsuario);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return perfilUsuarios;
	}

	@Override
	public PerfilUsuario listarPorId(String id) {
		PerfilUsuario perfilUsuario = new PerfilUsuario();
		try {
			String query = "SELECT * FROM PERFIL_USUARIO WHERE detalle_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				perfilUsuario.setPerfilId(resultSet.getString("perfil_id"));
				perfilUsuario.setNombre(resultSet.getString("nombre"));
                                perfilUsuario.setEstado(resultSet.getShort("estado"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return perfilUsuario;
	}

}
