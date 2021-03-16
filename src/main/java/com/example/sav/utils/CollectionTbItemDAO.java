package com.example.sav.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTbItemDAO implements TbItemDAO<TbItem> {
    private TbItem clearItem = new TbItem();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public List<String> getManager(HttpServletRequest request, HttpServletResponse response) {
        List<String> result = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11398242", "sql11398242", "DShXYc6HG8");
            String sql = "SELECT DISTINCT TradeMarketMail FROM `tbli`";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            PrintWriter out = response.getWriter();

            while (rs.next()) {
                result.add(rs.getString("TradeMarketMail"));
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("SQL | Class  error!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<String> getProd(HttpServletRequest request, HttpServletResponse response, String manager) {
        List<String> result = new ArrayList<>();
//        {"TradeMarketMail": "gumeniuk.o@asnova.com"}
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11398242", "sql11398242", "DShXYc6HG8");
            String sql = "SELECT DISTINCT ProdName FROM `tbli` WHERE TradeMarketMail = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, manager);
            ResultSet rs = ps.executeQuery();
            PrintWriter out = response.getWriter();

            while (rs.next()) {
                result.add(rs.getString("ProdName"));
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("error!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<String> getMark(HttpServletRequest request, HttpServletResponse response, String manager, String prod) {
        List<String> result = new ArrayList<>();
//        {"TradeMarketMail": "gumeniuk.o@asnova.com","ProdName": "CHOCO CAO"}
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11398242", "sql11398242", "DShXYc6HG8");
            String sql = "SELECT DISTINCT MarkName FROM `tbli` WHERE TradeMarketMail = ? AND ProdName = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, manager);
            ps.setString(2, prod);
            ResultSet rs = ps.executeQuery();
            PrintWriter out = response.getWriter();

            while (rs.next()) {
                result.add(rs.getString("MarkName"));
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("error!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result;
    }

    @Override
    public List<TbItem> getTable(HttpServletRequest request, HttpServletResponse response, String manager, String prod, String mark) {
//        {"TradeMarketMail": "gumeniuk.o@asnova.com","ProdName": "CHOCO CAO","MarkName": "CHOCO CAO"}
        List<TbItem> result = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11398242", "sql11398242", "DShXYc6HG8");
            String sql = "SELECT * FROM `tbli` WHERE TradeMarketMail = ? AND ProdName = ? AND MarkName = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, manager);
            ps.setString(2, prod);
            ps.setString(3, mark);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                result.add(new TbItem(
                        rs.getLong("ItemID"),
                        rs.getLong("SortNO"),
                        rs.getLong("CSKUID"),
                        rs.getString("CSKU"),
                        rs.getString("ItemName"),
                        rs.getString("ProdName"),
                        rs.getString("MarkName"),
                        rs.getString("TradeMarketMail"),
                        rs.getLong("ProdID"),
                        rs.getLong("MarkID")
                ));
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("error!");
        }

        return result;
    }
}
