package com.example.sav.servlets;

import com.example.sav.utils.CollectionTbItemDAO;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "FormServlet", value = "/form")
public class FormServlet extends HttpServlet {
    private CollectionTbItemDAO collectionTbItemDAO = new CollectionTbItemDAO();
    private final Gson gson = new Gson();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> result = collectionTbItemDAO.getManager(request, response);

        PrintWriter out = response.getWriter();
        out.print(gson.toJson(result));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
