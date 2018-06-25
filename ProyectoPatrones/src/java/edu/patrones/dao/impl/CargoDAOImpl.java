/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.ICargoDAO;
import edu.patrones.model.Cargo;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CargoDAOImpl implements ICargoDAO, Serializable {

	private Connection cx;

	public CargoDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(Cargo cargo) {
		try {
			String sql = "INSERT INTO CARGO(cargo_id, descripcion, estado) VALUES (?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, cargo.getCargoId());
			preparedStatement.setString(2, cargo.getDescripcion());
                        preparedStatement.setShort(3, cargo.getEstado());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM CARGO WHERE cargo_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Cargo cargo) {
		try {
			String sql = "UPDATE CARGO SET descripcion=?, estado=? WHERE cargo_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, cargo.getDescripcion());
                        preparedStatement.setShort(2, cargo.getEstado());
                        preparedStatement.setString(3, cargo.getCargoId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Cargo> listar() {
		List<Cargo> cargos = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM CARGO");
			while (resultSet.next()) {
				Cargo cargo = new Cargo();
				cargo.setCargoId(resultSet.getString("cargo_id"));
				cargo.setDescripcion(resultSet.getString("descripcion"));
                                cargo.setEstado(resultSet.getShort("estado"));
				cargos.add(cargo);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cargos;
	}

	@Override
	public Cargo listarPorId(String id) {
		Cargo cargo = new Cargo();
		try {
			String query = "SELECT * FROM CARGO WHERE cargo_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				cargo.setCargoId(resultSet.getString("cargo_id"));
				cargo.setDescripcion(resultSet.getString("descripcion"));
                                cargo.setEstado(resultSet.getShort("estado"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cargo;
	}

}
