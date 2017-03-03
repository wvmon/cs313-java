/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.io.*;

/**
 *
 * @author William Montesdeoca
 */
@WebServlet(urlPatterns = {"/submitPost"})
public class submitPost extends HttpServlet {
    
    Writer writer = null;
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
            out.println("<title>Servlet submitPost</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet submitPost at " + request.getContextPath() + "</h1>");
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
        
        String username = request.getParameter("username");
        String content = request.getParameter("post");
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String theDate = df.format(today);
        
        try(FileWriter fw = new FileWriter((this.getServletContext().getRealPath("/") + "discussion.txt"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
            {
                
                out.println(username);
                out.println("<br/>");
                out.println(theDate);
                out.println("<br/>");
                out.println(content);
                out.println("<br/><hr/>");
                
                //HttpSession session = request.getSession(true);
                //String user = (String) session.getAttribute("user");
            } catch (IOException e){
                //handle the exception!
            }
        
            try {
                Thread.sleep(2000);
                request.getRequestDispatcher("/thread.jsp").forward(request, response);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        

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
