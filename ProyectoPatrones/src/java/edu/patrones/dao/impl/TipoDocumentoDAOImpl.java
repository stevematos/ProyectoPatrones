/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.ITipoDocumentoDAO;
import edu.patrones.model.TipoDocumento;
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
public class TipoDocumentoDAOImpl implements ITipoDocumentoDAO, Serializable {

	private Connection cx;

	public TipoDocumentoDAOImpl() {
		cx = Conexion.getInstance();
	}

	@Override
	public void agregar(TipoDocumento tipoDocumento) {
		try {
			String sql = "INSERT INTO TIPO_DOCUMENTO(tipodoc_id, descripcion, estado) VALUES (?, ?, ?)";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, tipoDocumento.getTipodocId());
                        preparedStatement.setString(2, tipoDocumento.getDescripcion());
			preparedStatement.setShort(3, tipoDocumento.getEstado());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void eliminar(String id) {
		try {
			String sql = "DELETE FROM TIPO_DOCUMENTO WHERE tipodoc_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actualizar(TipoDocumento tipoDocumento) {
		try {
			String sql = "UPDATE TIPO_DOCUMENTO SET descripcion=?, estado=? WHERE tipodoc_id = ?";
			PreparedStatement preparedStatement = cx.prepareStatement(sql);
                        preparedStatement.setString(1, tipoDocumento.getDescripcion());
			preparedStatement.setShort(2, tipoDocumento.getEstado());
                        preparedStatement.setString(3, tipoDocumento.getTipodocId());
			preparedStatement.executeUpdate();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<TipoDocumento> listar() {
		List<TipoDocumento> tipoDocumentos = new ArrayList<>();

		try {
			Statement statement = cx.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM TIPO_DOCUMENTO");
			while (resultSet.next()) {
				TipoDocumento tipoDocumento = new TipoDocumento();
				tipoDocumento.setTipodocId(resultSet.getString("tipodoc_id"));
                                tipoDocumento.setDescripcion(resultSet.getString("descripcion"));
				tipoDocumento.setEstado(resultSet.getShort("estado"));
				tipoDocumentos.add(tipoDocumento);
			}
			resultSet.close();
			statement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tipoDocumentos;
	}

	@Override
	public TipoDocumento listarPorId(String id) {
		TipoDocumento tipoDocumento = new TipoDocumento();
		try {
			String query = "SELECT * FROM TIPO_DOCUMENTO WHERE tipodoc_id =?";
			PreparedStatement preparedStatement = cx.prepareStatement(query);
			preparedStatement.setString(1, id);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				tipoDocumento.setTipodocId(resultSet.getString("tipodoc_id"));
                                tipoDocumento.setDescripcion(resultSet.getString("descripcion"));
				tipoDocumento.setEstado(resultSet.getShort("estado"));
			}
			resultSet.close();
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tipoDocumento;
	}

}
