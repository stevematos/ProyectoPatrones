/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.IDetalleCanjeDAO;
import edu.patrones.model.DetalleCanje;
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
public class DetalleCanjeDAOImpl implements IDetalleCanjeDAO, Serializable {

	private Connection cx;

	public DetalleCanjeDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(DetalleCanje detalleCanje) {
		try {
			String sql = "INSERT INTO DETALLE_CANJE(detalle_id, premio_id, canje_id, estado_id) VALUES (?, ?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, detalleCanje.getDetalleId());
			preparedStatement.setString(2, detalleCanje.getPremioId());
                        preparedStatement.setString(3, detalleCanje.getCanjeId());
                        preparedStatement.setShort(4, detalleCanje.getEstadoId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM DETALLE_CANJE WHERE detalle_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(DetalleCanje detalleCanje) {
		try {
			String sql = "UPDATE DETALLE_CANJE SET premio_id=?, canje_id=?, estado_id=? WHERE detalle_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, detalleCanje.getPremioId());
                        preparedStatement.setString(2, detalleCanje.getCanjeId());
                        preparedStatement.setShort(3, detalleCanje.getEstadoId());
                        preparedStatement.setString(4 , detalleCanje.getDetalleId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<DetalleCanje> listar() {
		List<DetalleCanje> detalleCanjes = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM DETALLE_CANJE");
			while (resultSet.next()) {
				DetalleCanje detalleCanje = new DetalleCanje();
				detalleCanje.setDetalleId(resultSet.getString("detalle_id"));
				detalleCanje.setPremioId(resultSet.getString("premio_id"));
                                detalleCanje.setCanjeId(resultSet.getString("canje_id"));
                                detalleCanje.setEstadoId(resultSet.getShort("estado_id"));
				detalleCanjes.add(detalleCanje);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return detalleCanjes;
	}

	@Override
	public DetalleCanje listarPorId(String id) {
		DetalleCanje detalleCanje = new DetalleCanje();
		try {
			String query = "SELECT * FROM DETALLE_CANJE WHERE detalle_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				detalleCanje.setDetalleId(resultSet.getString("detalle_id"));
				detalleCanje.setPremioId(resultSet.getString("premio_id"));
                                detalleCanje.setCanjeId(resultSet.getString("canje_id"));
                                detalleCanje.setEstadoId(resultSet.getShort("estado_id"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return detalleCanje;
	}

}
