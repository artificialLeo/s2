package com.example.sav.servlets;

import com.example.sav.utils.CollectionTbItemDAO;
import com.example.sav.utils.TbItem;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.util.List;

@WebServlet(name = "ProdServlet", urlPatterns = "/prod")
public class ProdServlet extends HttpServlet {
    private final CollectionTbItemDAO collectionTbItemDAO = new CollectionTbItemDAO();
    private final Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TbItem tbItem = gson.fromJson(request.getReader(), TbItem.class);

        List<String> result = collectionTbItemDAO.getProd(request, response, tbItem.getTradeMarketMail());

        PrintWriter out = response.getWriter();
        out.print(gson.toJson(result));
    }
}
