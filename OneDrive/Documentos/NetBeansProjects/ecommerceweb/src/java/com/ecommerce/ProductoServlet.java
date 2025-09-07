package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProductoServlet", urlPatterns = {"/producto"})
public class ProductoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Productos</title>");
            out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css'>");
            out.println("</head><body class='bg-light'>");

            out.println("<div class='container mt-5'>");
            out.println("<h2 class='mb-4 text-primary'>Listado de Productos</h2>");
            out.println("<table class='table table-striped table-bordered'>");
            out.println("<thead><tr><th>ID</th><th>Nombre</th><th>Precio</th><th>Stock</th></tr></thead>");
            out.println("<tbody>");
            out.println("<tr><td>PD-001</td><td>Curso Java POO</td><td>S/ 96.00</td><td>9998</td></tr>");
            out.println("<tr><td>PF-001</td><td>Laptop 14\"</td><td>S/ 2500.00</td><td>7</td></tr>");
            out.println("</tbody></table>");
            out.println("<a href='index.jsp' class='btn btn-secondary mt-3'>Volver al inicio</a>");
            out.println("</div>");

            out.println("</body></html>");
        }
    }
}

