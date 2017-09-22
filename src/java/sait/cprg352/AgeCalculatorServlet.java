/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 715060
 */
public class AgeCalculatorServlet extends HttpServlet {

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
          getServletContext().getRequestDispatcher("/WEB-INF/agejsp.jsp").forward(request,response);
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
        String message = ""; 
         
        try{  
      int ageInput = Integer.parseInt(request.getParameter("ageinput"));
        ageInput += 1; 
        message ="Your age next birthday will be: " +ageInput; 
        } catch(NumberFormatException nfe ){
            
             message ="You must give your current age"; 
        }
        
       
    request.setAttribute("agenext", message); //Use myfirstname in jsp
        
       getServletContext().getRequestDispatcher("/WEB-INF/agejsp.jsp").forward(request,response);
        
    }

  
}
