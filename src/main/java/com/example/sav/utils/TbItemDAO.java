package com.example.sav.utils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface TbItemDAO<T> {
    List<String> getManager(HttpServletRequest request, HttpServletResponse response);

    List<String> getProd(HttpServletRequest request, HttpServletResponse response, String manager);

    List<String> getMark(HttpServletRequest request, HttpServletResponse response, String manager, String prod);

    List<TbItem> getTable(HttpServletRequest request, HttpServletResponse response, String manager, String prod, String mark);
}
