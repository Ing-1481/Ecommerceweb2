package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CompraServlet", urlPatterns = {"/compra"})
public class CompraServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Compras</title>");
            out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css'>");
            out.println("</head><body class='bg-light'>");

            out.println("<div class='container mt-5'>");
            out.println("<h2 class='mb-4 text-warning'>Historial de Compras</h2>");
            out.println("<table class='table table-striped table-bordered'>");
            out.println("<thead><tr><th>Producto</th><th>Cantidad</th><th>Total</th><th>Fecha</th></tr></thead>");
            out.println("<tbody>");
            out.println("<tr><td>Curso Java POO</td><td>1</td><td>S/ 96.00</td><td>2025-09-05</td></tr>");
            out.println("<tr><td>Laptop 14\"</td><td>1</td><td>S/ 2500.00</td><td>2025-09-05</td></tr>");
            out.println("</tbody></table>");
            out.println("<a href='index.jsp' class='btn btn-secondary mt-3'>Volver al inicio</a>");
            out.println("</div>");

            out.println("</body></html>");
        }
    }
}

