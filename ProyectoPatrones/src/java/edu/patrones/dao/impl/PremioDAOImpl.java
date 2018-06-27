/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.IPremioDAO;
import edu.patrones.model.Premio;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PremioDAOImpl implements IPremioDAO, Serializable {

	private Connection cx;

	public PremioDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(Premio premio) throws SQLException{
            String sql = "INSERT INTO PREMIO(premio_id, proveedor_id, nombre, costo_puntos, stock, imagen, observacion) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, premio.getPremioId());
            preparedStatement.setString(2, premio.getProveedorId());
            preparedStatement.setString(3, premio.getNombre());
            preparedStatement.setString(4, premio.getCostoPuntos());
            preparedStatement.setString(5, premio.getStock());
            preparedStatement.setString(6, premio.getImagen());
            preparedStatement.setString(7, premio.getObservacion());
            preparedStatement.executeUpdate();
            preparedStatement.close();
		
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM PREMIO WHERE premio_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Premio premio) {
		try {
			String sql = "UPDATE PREMIO SET proveedor_id=?, nombre=?, costo_puntos=?, stock=?, imagen=?, observacion=? WHERE premio_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
                        preparedStatement.setString(1, premio.getProveedorId());
			preparedStatement.setString(2, premio.getNombre());
                        preparedStatement.setString(3, premio.getCostoPuntos());
                        preparedStatement.setString(4, premio.getStock());
                        preparedStatement.setString(5, premio.getImagen());
                        preparedStatement.setString(6, premio.getObservacion());
                        preparedStatement.setString(7, premio.getPremioId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Premio> listar() {
		List<Premio> premios = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM PREMIO");
			while (resultSet.next()) {
				Premio premio = new Premio();
				premio.setPremioId(resultSet.getString("premio_id"));
                                premio.setProveedorId(resultSet.getString("proveedor_id"));
				premio.setNombre(resultSet.getString("nombre"));
                                premio.setCostoPuntos(resultSet.getString("costo_puntos"));
                                premio.setStock(resultSet.getString("stock"));
                                premio.setImagen(resultSet.getString("imagen"));
                                premio.setObservacion(resultSet.getString("observacion"));
				premios.add(premio);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return premios;
	}

	@Override
	public Premio listarPorId(String id) {
		Premio premio = new Premio();
		try {
			String query = "SELECT * FROM PREMIO WHERE premio_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				premio.setPremioId(resultSet.getString("premio_id"));
                                premio.setProveedorId(resultSet.getString("proveedor_id"));
				premio.setNombre(resultSet.getString("nombre"));
                                premio.setCostoPuntos(resultSet.getString("costo_puntos"));
                                premio.setStock(resultSet.getString("stock"));
                                premio.setImagen(resultSet.getString("imagen"));
                                premio.setObservacion(resultSet.getString("observacion"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return premio;
	}

}

