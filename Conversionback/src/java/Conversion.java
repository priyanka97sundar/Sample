/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rishikjnjkih
 */
public class Conversion extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Conversion</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Conversion at " + request.getContextPath() + "</h1>");
             float c,v;
            
            String name=request.getParameter("returnValue");
            out.println("Region="+name);
            
            
            if("india".equals(request.getParameter("region")))
            {
                v=45*Float.parseFloat(request.getParameter("volume"));
                    if("usd".equals(request.getParameter("type")))
                {
                    c=(float) ((63.80)*Float.parseFloat((request.getParameter("amount"))));
                }
                else
                {
                   c=(float) (78.29*Float.parseFloat((request.getParameter("amount"))));
                }
                
            out.println("AMOUNT:"+c+"<br>");
            out.println("VOLUME"+v);
            } 
            if("usa".equals(request.getParameter("region"))){
                v=65*Float.parseFloat(request.getParameter("volume"));
                if("usd".equals(request.getParameter("type")))
                {
                    c=1*Float.parseFloat((request.getParameter("amount")));
                }
                else
                {
                   c=(float) (1.23*Float.parseFloat((request.getParameter("amount"))));
                }
            out.println("AMOUNT:"+c+"<br>");
            out.println("VOLUME"+v);
            }
           
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
//         try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet Conversion</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet Conversion at " + request.getContextPath() + "</h1>");
//             float c,v;
//            
//            String name=request.getParameter("returnValue");
//            out.println("Region="+name);
//            
//            
//            if("india".equals(request.getParameter("region")))
//            {
//                v=45*Float.parseFloat(request.getParameter("volume"));
//                    if("usd".equals(request.getParameter("type")))
//                {
//                    c=(float) ((63.80)*Float.parseFloat((request.getParameter("amount"))));
//                }
//                else
//                {
//                   c=(float) (78.29*Float.parseFloat((request.getParameter("amount"))));
//                }
//            out.println("From"+request.getParameter("region")+"To India"+"<br>");    
//            out.println("AMOUNT:"+c+"<br>");
//            out.println("VOLUME"+v);
//            } 
//            if("usa".equals(request.getParameter("region"))){
//                v=65*Float.parseFloat(request.getParameter("volume"));
//                if("usd".equals(request.getParameter("type")))
//                {
//                    c=1*Float.parseFloat((request.getParameter("amount")));
//                }
//                else
//                {
//                   c=(float) (1.23*Float.parseFloat((request.getParameter("amount"))));
//                }
//            out.println("From"+request.getParameter("region")+"To India"+"<br>");    
//            out.println("AMOUNT:"+c+"<br>");
//            out.println("VOLUME"+v);
//            }
//           
//            out.println("</body>");
//            out.println("</html>");
//        }
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
