/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.patrones.dao.impl;

import edu.patrones.dao.ICanjeDAO;
import edu.patrones.model.Canje;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CanjeDAOImpl implements ICanjeDAO, Serializable {

    private Connection cx;

    public CanjeDAOImpl() {
        cx = Conexion.getInstance();
    }

    @Override
    public void agregar(Canje canje) {
        try {
            String sql = "INSERT INTO CANJE(canje_id, cliente_id, tipo_canje, personal_id, costo_total, fecha_canje, estado) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, canje.getCanjeId());
            preparedStatement.setString(2, canje.getClienteId());
            preparedStatement.setString(3, canje.getTipoCanje());
            preparedStatement.setString(4, canje.getPersonalId());
            preparedStatement.setDouble(5, canje.getCostoTotal());
            preparedStatement.setDate(6, (Date) canje.getFechaCanje());
            preparedStatement.setShort(7, canje.getEstado());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminar(String id) {
        try {
            String sql = "DELETE FROM CANJE WHERE canje_id = ?";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, id);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Canje canje) {
        try {
            String sql = "UPDATE CANJE SET cliente_id=?, tipo_canje=?, personal_id=?, costo_total=?, fecha_canje=?, estado=? WHERE canje_id = ?";
            PreparedStatement preparedStatement = cx.prepareStatement(sql);
            preparedStatement.setString(1, canje.getClienteId());
            preparedStatement.setString(2, canje.getTipoCanje());
            preparedStatement.setString(3, canje.getPersonalId());
            preparedStatement.setDouble(4, canje.getCostoTotal());
            preparedStatement.setDate(5, (Date) canje.getFechaCanje());
            preparedStatement.setShort(6, canje.getEstado());
            preparedStatement.setString(7, canje.getCanjeId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Canje> listar() {
        List<Canje> canjes = new ArrayList<>();

        try {
            Statement statement = cx.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM CANJE");
            while (resultSet.next()) {
                Canje canje = new Canje();
                canje.setCanjeId(resultSet.getString("canje_id"));
                canje.setClienteId(resultSet.getString("cliente_id"));
                canje.setTipoCanje(resultSet.getString("tipo_canje"));
                canje.setPersonalId(resultSet.getString("personal_id"));
                canje.setCostoTotal(resultSet.getDouble("costo_total"));
                canje.setFechaCanje(resultSet.getDate("fecha_canje"));
                canje.setEstado(resultSet.getShort("estado"));
                canjes.add(canje);
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return canjes;
    }

    @Override
    public Canje listarPorId(String id) {
        Canje canje = new Canje();
        try {
            String query = "SELECT * FROM CANJE WHERE canje_id =?";
            PreparedStatement preparedStatement = cx.prepareStatement(query);
            preparedStatement.setString(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                canje.setCanjeId(resultSet.getString("canje_id"));
                canje.setClienteId(resultSet.getString("cliente_id"));
                canje.setTipoCanje(resultSet.getString("tipo_canje"));
                canje.setPersonalId(resultSet.getString("personal_id"));
                canje.setCostoTotal(resultSet.getDouble("costo_total"));
                canje.setFechaCanje(resultSet.getDate("fecha_canje"));
                canje.setEstado(resultSet.getShort("estado"));
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return canje;
    }

    @Override
    public List<Canje> listarPorFecha(Date fecha) {
        List<Canje> canjes = new ArrayList<>();
        try {
            String query = "SELECT * FROM CANJE WHERE fecha_canje =?";
            PreparedStatement preparedStatement = cx.prepareStatement(query);
            preparedStatement.setDate(1, fecha);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Canje canje = new Canje();
                canje.setCanjeId(resultSet.getString("canje_id"));
                canje.setClienteId(resultSet.getString("cliente_id"));
                canje.setTipoCanje(resultSet.getString("tipo_canje"));
                canje.setPersonalId(resultSet.getString("personal_id"));
                canje.setCostoTotal(resultSet.getDouble("costo_total"));
                canje.setFechaCanje(resultSet.getDate("fecha_canje"));
                canje.setEstado(resultSet.getShort("estado"));
                canjes.add(canje);
            }
            resultSet.close();
            preparedStatement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return canjes;
    }

}
