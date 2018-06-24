/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.IPersonalDAO;
import edu.patrones.model.Personal;
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
public class PersonalDAOImpl implements IPersonalDAO, Serializable {

	private Connection cx;

	public PersonalDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(Personal personal) {
		try {
			String sql = "INSERT INTO PERSONAL(personal_id, cargo_id, tipodoc_id, nombre, apepat, apemat, celular, nrodoc, estado, usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, personal.getPersonalId());
                        preparedStatement.setString(2, personal.getCargoId());
			preparedStatement.setString(3, personal.getTipodocId());
                        preparedStatement.setString(4, personal.getNombre());
                        preparedStatement.setString(5, personal.getApepat());
                        preparedStatement.setString(6, personal.getApemat());
                        preparedStatement.setString(7, personal.getCelular());
                        preparedStatement.setString(8, personal.getNrodoc());
                        preparedStatement.setShort(9, personal.getEstado());
                        preparedStatement.setString(10, personal.getUsuarioId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM PERSONAL WHERE personal_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Personal personal) {
		try {
			String sql = "UPDATE PERSONAL SET tipodoc_id=?, nombre=?, apepat=?, apemat=?, celular=?, nrodoc=?, estado=?, usuario_id=? WHERE personal_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
                        preparedStatement.setString(1, personal.getCargoId());
			preparedStatement.setString(2, personal.getTipodocId());
                        preparedStatement.setString(3, personal.getNombre());
                        preparedStatement.setString(4, personal.getApepat());
                        preparedStatement.setString(5, personal.getApemat());
                        preparedStatement.setString(6, personal.getCelular());
                        preparedStatement.setString(7, personal.getNrodoc());
                        preparedStatement.setShort(8, personal.getEstado());
                        preparedStatement.setString(9, personal.getUsuarioId());
                        preparedStatement.setString(10, personal.getPersonalId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Personal> listar() {
		List<Personal> personals = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSONAL");
			while (resultSet.next()) {
				Personal personal = new Personal();
				personal.setPersonalId(resultSet.getString("personal_id"));
                                personal.setCargoId(resultSet.getString("cargo_id"));
				personal.setTipodocId(resultSet.getString("tipodoc_id"));
                                personal.setNombre(resultSet.getString("nombre"));
                                personal.setApepat(resultSet.getString("apepat"));
                                personal.setApemat(resultSet.getString("apemat"));
                                personal.setCelular(resultSet.getString("celular"));
                                personal.setNrodoc(resultSet.getString("nrodoc"));
                                personal.setEstado(resultSet.getShort("estado"));
                                personal.setUsuarioId(resultSet.getString("usuario_id"));
				personals.add(personal);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return personals;
	}

	@Override
	public Personal listarPorId(String id) {
		Personal personal = new Personal();
		try {
			String query = "SELECT * FROM PERSONAL WHERE personal_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				personal.setPersonalId(resultSet.getString("personal_id"));
                                personal.setCargoId(resultSet.getString("cargo_id"));
				personal.setTipodocId(resultSet.getString("tipodoc_id"));
                                personal.setNombre(resultSet.getString("nombre"));
                                personal.setApepat(resultSet.getString("apepat"));
                                personal.setApemat(resultSet.getString("apemat"));
                                personal.setCelular(resultSet.getString("celular"));
                                personal.setNrodoc(resultSet.getString("nrodoc"));
                                personal.setEstado(resultSet.getShort("estado"));
                                personal.setUsuarioId(resultSet.getString("usuario_id"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return personal;
	}

}

