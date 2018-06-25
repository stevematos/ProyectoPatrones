/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.ITarjetaClienteDAO;
import edu.patrones.model.TarjetaCliente;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TarjetaClienteDAOImpl implements ITarjetaClienteDAO, Serializable {

	private Connection cx;

	public TarjetaClienteDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(TarjetaCliente tarjetaCliente) {
		try {
			String sql = "INSERT INTO TARJETA_CLIENTE(tarcliente_id, tarjeta_id, cliente_id) VALUES (?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, tarjetaCliente.getTarclienteId());
                        preparedStatement.setString(2, tarjetaCliente.getTarjetaId());
			preparedStatement.setString(3, tarjetaCliente.getClienteId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM TARJETA_CLIENTE WHERE tarcliente_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(TarjetaCliente tarjetaCliente) {
		try {
			String sql = "UPDATE TARJETA_CLIENTE SET tarjeta_id=?, cliente_id=? WHERE tarcliente_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
                        preparedStatement.setString(1, tarjetaCliente.getTarjetaId());
			preparedStatement.setString(2, tarjetaCliente.getClienteId());
                        preparedStatement.setString(3, tarjetaCliente.getTarclienteId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<TarjetaCliente> listar() {
		List<TarjetaCliente> tarjetaClientes = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM TARJETA_CLIENTE");
			while (resultSet.next()) {
				TarjetaCliente tarjetaCliente = new TarjetaCliente();
				tarjetaCliente.setTarclienteId(resultSet.getString("tarcliente_id"));
                                tarjetaCliente.setTarjetaId(resultSet.getString("tarjeta_id"));
				tarjetaCliente.setClienteId(resultSet.getString("cliente_id"));
				tarjetaClientes.add(tarjetaCliente);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tarjetaClientes;
	}

	@Override
	public TarjetaCliente listarPorId(String id) {
		TarjetaCliente tarjetaCliente = new TarjetaCliente();
		try {
			String query = "SELECT * FROM TARJETA_CLIENTE WHERE tarcliente_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				tarjetaCliente.setTarclienteId(resultSet.getString("tarcliente_id"));
                                tarjetaCliente.setTarjetaId(resultSet.getString("tarjeta_id"));
				tarjetaCliente.setClienteId(resultSet.getString("cliente_id"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tarjetaCliente;
	}

}
