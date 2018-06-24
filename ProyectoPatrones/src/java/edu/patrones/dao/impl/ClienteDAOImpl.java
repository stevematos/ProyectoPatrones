/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.IClienteDAO;
import edu.patrones.model.Cliente;
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
public class ClienteDAOImpl implements IClienteDAO, Serializable {

	private Connection cx;

	public ClienteDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(Cliente cliente) {
		try {
			String sql = "INSERT INTO CLIENTE(cliente_id, tipodoc_id, nombre, apepat, apemat, celular, nrodoc, estado, usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, cliente.getClienteId());
			preparedStatement.setString(2, cliente.getTipodocId());
                        preparedStatement.setString(3, cliente.getNombre());
                        preparedStatement.setString(4, cliente.getApepat());
                        preparedStatement.setString(5, cliente.getApemat());
                        preparedStatement.setString(6, cliente.getCelular());
                        preparedStatement.setString(7, cliente.getNrodoc());
                        preparedStatement.setShort(8, cliente.getEstado());
                        preparedStatement.setString(9, cliente.getUsuarioId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM CLIENTE WHERE cliente_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Cliente cliente) {
		try {
			String sql = "UPDATE CLIENTE SET tipodoc_id=?, nombre=?, apepat=?, apemat=?, celular=?, nrodoc=?, estado=?, usuario_id=? WHERE cliente_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, cliente.getTipodocId());
                        preparedStatement.setString(2, cliente.getNombre());
                        preparedStatement.setString(3, cliente.getApepat());
                        preparedStatement.setString(4, cliente.getApemat());
                        preparedStatement.setString(5, cliente.getCelular());
                        preparedStatement.setString(6, cliente.getNrodoc());
                        preparedStatement.setShort(7, cliente.getEstado());
                        preparedStatement.setString(8, cliente.getUsuarioId());
                        preparedStatement.setString(9, cliente.getClienteId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Cliente> listar() {
		List<Cliente> clientes = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM CLIENTE");
			while (resultSet.next()) {
				Cliente cliente = new Cliente();
				cliente.setClienteId(resultSet.getString("cliente_id"));
				cliente.setTipodocId(resultSet.getString("tipodoc_id"));
                                cliente.setNombre(resultSet.getString("nombre"));
                                cliente.setApepat(resultSet.getString("apepat"));
                                cliente.setApemat(resultSet.getString("apemat"));
                                cliente.setCelular(resultSet.getString("celular"));
                                cliente.setNrodoc(resultSet.getString("nrodoc"));
                                cliente.setEstado(resultSet.getShort("estado"));
                                cliente.setUsuarioId(resultSet.getString("usuario_id"));
				clientes.add(cliente);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clientes;
	}

	@Override
	public Cliente listarPorId(String id) {
		Cliente cliente = new Cliente();
		try {
			String query = "SELECT * FROM CLIENTE WHERE cliente_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cliente.setClienteId(resultSet.getString("cliente_id"));
				cliente.setTipodocId(resultSet.getString("tipodoc_id"));
                                cliente.setNombre(resultSet.getString("nombre"));
                                cliente.setApepat(resultSet.getString("apepat"));
                                cliente.setApemat(resultSet.getString("apemat"));
                                cliente.setCelular(resultSet.getString("celular"));
                                cliente.setNrodoc(resultSet.getString("nrodoc"));
                                cliente.setEstado(resultSet.getShort("estado"));
                                cliente.setUsuarioId(resultSet.getString("usuario_id"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;
	}

}
