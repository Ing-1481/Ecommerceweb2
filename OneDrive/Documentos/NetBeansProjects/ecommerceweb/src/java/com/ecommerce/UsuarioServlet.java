package com.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuario"})
public class UsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Usuarios</title>");
            out.println("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css'>");
            out.println("</head><body class='bg-light'>");

            out.println("<div class='container mt-5'>");
            out.println("<h2 class='mb-4 text-success'>Listado de Usuarios</h2>");
            out.println("<table class='table table-striped table-bordered'>");
            out.println("<thead><tr><th>ID</th><th>Nombre</th><th>Email</th><th>Rol</th></tr></thead>");
            out.println("<tbody>");
            out.println("<tr><td>U-001</td><td>Ana Admin</td><td>ana@tienda.com</td><td>Administrador</td></tr>");
            out.println("<tr><td>U-002</td><td>Carlos Barrueta</td><td>carlos@tienda.com</td><td>Cliente</td></tr>");
            out.println("</tbody></table>");
            out.println("<a href='index.jsp' class='btn btn-secondary mt-3'>Volver al inicio</a>");
            out.println("</div>");

            out.println("</body></html>");
        }
    }
}
