package com.example.sav.servlets;

import com.example.sav.utils.CollectionTbItemDAO;
import com.example.sav.utils.ResultTbObject;
import com.example.sav.utils.TbItem;
import com.google.gson.Gson;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ResultServlet", value = "/res")
public class ResultServlet extends HttpServlet {
    private final Gson gson = new Gson();
    private final CollectionTbItemDAO collectionTbItemDAO = new CollectionTbItemDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ResultTbObject resultItem = gson.fromJson(request.getReader(), ResultTbObject.class);

        // Запросы направлять здесь, прописать скорее всего в коллекции

        PrintWriter out = response.getWriter();
        out.print(gson.toJson(resultItem));

        response.sendRedirect("finish.jsp");
    }
}
