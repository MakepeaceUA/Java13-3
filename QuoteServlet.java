package com.example.jk01;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("")
public class QuoteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String quoteText = "Bad programmers worry about the code. Good programmers worry about data structures and their relationships";

        req.setAttribute("linusQuote", quoteText);

        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
