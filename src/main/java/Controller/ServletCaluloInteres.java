/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import Model.CalculoInteres;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JavierSoto
 */
@WebServlet(name = "ServletCaluloInteres", urlPatterns = {"/ServletCaluloInteres"})
public class ServletCaluloInteres extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
      //    Double   tinteres,  capital, nyears; // , resultado;
           Float   tinteres,  capital, nyears; // , resultado;
//        capital = Double.parseDouble(request.getParameter("capital"));
//         tinteres = Double.parseDouble(request.getParameter("tinteres"));
//        nyears = Double.parseDouble(request.getParameter("nyears"));
      //capital = Double.valueOf(request.getParameter("capital"));
      //tinteres = Double.valueOf(request.getParameter("tinteres"));
      //nyears = Double.valueOf(request.getParameter("nyears"));
      
          capital = Float.parseFloat(request.getParameter("capital"));
          tinteres = Float.parseFloat(request.getParameter("tinteres"));
          nyears = Float.parseFloat(request.getParameter("nyears"));
    
            
            CalculoInteres cin = new CalculoInteres(tinteres,capital,nyears);
            request.setAttribute("calculo",cin);
            
            CalculoInteres res = new CalculoInteres(tinteres,capital,nyears);
            request.setAttribute("resultado",res);
            
            request.getRequestDispatcher("endindex.jsp").forward(request,response);
        
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
      
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet Servlet at " + request.getContextPath() + "</h1>");
            out.println("<h1>El inetres Simple es:$" + Math.round(cin.calculo()) + "</h1>");
            out.println("<h1>El Resultado es:$" +  Math.round(res.resultado()) + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
