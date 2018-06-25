/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.ITipoCanjeDAO;
import edu.patrones.model.TipoCanje;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TipoCanjeDAOImpl implements ITipoCanjeDAO, Serializable {

	private Connection cx;

	public TipoCanjeDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(TipoCanje tipoCanje) {
		try {
			String sql = "INSERT INTO TIPO_CANJE(tipocanje_id, descripcion, estado) VALUES (?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, tipoCanje.getTipocanjeId());
                        preparedStatement.setString(2, tipoCanje.getDescripcion());
			preparedStatement.setShort(3, tipoCanje.getEstado());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM TIPO_CANJE WHERE tipocanje_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(TipoCanje tipoCanje) {
		try {
			String sql = "UPDATE TIPO_CANJE SET descripcion=?, estado=? WHERE tipocanje_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
                        preparedStatement.setString(1, tipoCanje.getDescripcion());
			preparedStatement.setShort(2, tipoCanje.getEstado());
                        preparedStatement.setString(3, tipoCanje.getTipocanjeId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<TipoCanje> listar() {
		List<TipoCanje> tipoCanjes = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM TIPO_CANJE");
			while (resultSet.next()) {
				TipoCanje tipoCanje = new TipoCanje();
				tipoCanje.setTipocanjeId(resultSet.getString("tipocanje_id"));
                                tipoCanje.setDescripcion(resultSet.getString("descripcion"));
				tipoCanje.setEstado(resultSet.getShort("estado"));
				tipoCanjes.add(tipoCanje);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tipoCanjes;
	}

	@Override
	public TipoCanje listarPorId(String id) {
		TipoCanje tipoCanje = new TipoCanje();
		try {
			String query = "SELECT * FROM TIPO_CANJE WHERE tipocanje_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				tipoCanje.setTipocanjeId(resultSet.getString("tipocanje_id"));
                                tipoCanje.setDescripcion(resultSet.getString("descripcion"));
				tipoCanje.setEstado(resultSet.getShort("estado"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tipoCanje;
	}

}
