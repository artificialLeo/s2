package com.example.sav.servlets;

import com.example.sav.utils.CollectionTbItemDAO;
import com.example.sav.utils.TbItem;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "MarkServlet", value = "/mark")
public class MarkServlet extends HttpServlet {
    private final CollectionTbItemDAO collectionTbItemDAO = new CollectionTbItemDAO();
    private final Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TbItem tbItem = gson.fromJson(request.getReader(), TbItem.class);

        List<String> result = collectionTbItemDAO.getMark(request, response, tbItem.getTradeMarketMail(), tbItem.getProdName());

        PrintWriter out = response.getWriter();
        out.print(gson.toJson(result));
    }
}
