/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.IProveedorDAO;
import edu.patrones.model.Proveedor;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProveedorDAOImpl implements IProveedorDAO, Serializable {

	private Connection cx;

	public ProveedorDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(Proveedor proveedor) {
		try {
			String sql = "INSERT INTO PROVEEDOR(proveedor_id, cargo_id, tipodoc_id, nombre, apepat, apemat, celular, nrodoc, estado, usuario_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, proveedor.getProveedorId());
                        preparedStatement.setString(2, proveedor.getRuc());
			preparedStatement.setString(3, proveedor.getNombre());
                        preparedStatement.setString(4, proveedor.getDireccion());
                        preparedStatement.setString(5, proveedor.getTelefono());
                        preparedStatement.setString(6, proveedor.getPaginaWeb());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM PROVEEDOR WHERE proveedor_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(Proveedor proveedor) {
		try {
			String sql = "UPDATE PROVEEDOR SET ruc=?, nombre=?, direccion=?, telefono=?, pagina_web=? WHERE proveedor_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
                        preparedStatement.setString(1, proveedor.getRuc());
			preparedStatement.setString(2, proveedor.getNombre());
                        preparedStatement.setString(3, proveedor.getDireccion());
                        preparedStatement.setString(4, proveedor.getTelefono());
                        preparedStatement.setString(5, proveedor.getPaginaWeb());
                        preparedStatement.setString(6, proveedor.getProveedorId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Proveedor> listar() {
		List<Proveedor> proveedors = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM PROVEEDOR");
			while (resultSet.next()) {
				Proveedor proveedor = new Proveedor();
				proveedor.setProveedorId(resultSet.getString("proveedor_id"));
                                proveedor.setRuc(resultSet.getString("ruc"));
				proveedor.setNombre(resultSet.getString("nombre"));
                                proveedor.setDireccion(resultSet.getString("direccion"));
                                proveedor.setTelefono(resultSet.getString("telefono"));
                                proveedor.setPaginaWeb(resultSet.getString("pagina_web"));
				proveedors.add(proveedor);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proveedors;
	}

	@Override
	public Proveedor listarPorId(String id) {
		Proveedor proveedor = new Proveedor();
		try {
			String query = "SELECT * FROM PROVEEDOR WHERE proveedor_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				proveedor.setProveedorId(resultSet.getString("proveedor_id"));
                                proveedor.setRuc(resultSet.getString("ruc"));
				proveedor.setNombre(resultSet.getString("nombre"));
                                proveedor.setDireccion(resultSet.getString("direccion"));
                                proveedor.setTelefono(resultSet.getString("telefono"));
                                proveedor.setPaginaWeb(resultSet.getString("pagina_web"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return proveedor;
	}

}
