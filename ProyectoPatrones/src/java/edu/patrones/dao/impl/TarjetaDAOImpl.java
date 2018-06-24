/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.ITarjetaDAO;
import edu.patrones.model.Tarjeta;
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
public class TarjetaDAOImpl implements ITarjetaDAO, Serializable {

	private Connection cx;

	public TarjetaDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(Tarjeta tarjeta) {
		try {
			String sql = "INSERT INTO TARJETA(tarjeta_id, pts_actuales, pts_acumulados, num_tarjeta) VALUES (?, ?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, tarjeta.getTarjetaId());
                        preparedStatement.setInt(2, tarjeta.getPtsActuales());
			preparedStatement.setInt(3, tarjeta.getPtsAcumulados());
                        preparedStatement.setString(4, tarjeta.getNumTarjeta());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM TARJETA WHERE tarjeta_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Tarjeta tarjeta) {
		try {
			String sql = "UPDATE TARJETA SET pts_actuales=?, pts_acumulados=?, num_tarjeta=? WHERE tarjeta_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
                        preparedStatement.setInt(1, tarjeta.getPtsActuales());
			preparedStatement.setInt(2, tarjeta.getPtsAcumulados());
                        preparedStatement.setString(3, tarjeta.getNumTarjeta());
                        preparedStatement.setString(4, tarjeta.getTarjetaId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Tarjeta> listar() {
		List<Tarjeta> tarjetas = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM TARJETA");
			while (resultSet.next()) {
				Tarjeta tarjeta = new Tarjeta();
				tarjeta.setTarjetaId(resultSet.getString("tarjeta_id"));
                                tarjeta.setPtsActuales(resultSet.getInt("pts_actuales"));
				tarjeta.setPtsAcumulados(resultSet.getInt("pts_acumulados"));
                                tarjeta.setNumTarjeta(resultSet.getString("num_tarjeta"));
				tarjetas.add(tarjeta);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tarjetas;
	}

	@Override
	public Tarjeta listarPorId(String id) {
		Tarjeta tarjeta = new Tarjeta();
		try {
			String query = "SELECT * FROM TARJETA WHERE tarjeta_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				tarjeta.setTarjetaId(resultSet.getString("tarjeta_id"));
                                tarjeta.setPtsActuales(resultSet.getInt("pts_actuales"));
				tarjeta.setPtsAcumulados(resultSet.getInt("pts_acumulados"));
                                tarjeta.setNumTarjeta(resultSet.getString("num_tarjeta"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tarjeta;
	}

}
