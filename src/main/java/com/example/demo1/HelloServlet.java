package com.example.demo1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import jakarta.ejb.DependsOn;
import jakarta.enterprise.context.Dependent;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@DependsOn({"BookBean", "BuyBookService"})
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet
{
    private String message;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Dependent
    private BookBean bookBean; // variable declaration of type BookBean

    @Dependent
    private BookBean bookBean2;

    @Dependent
    private BuyBookService buyBookService;

    List<BookBean> bookBeanList = new ArrayList<>();

    public void init()
    {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
       // BookBean bookBean2 = new BookBean(); // You will never use the new keyword anymore unless and until it is some very localized object creation
        bookBean.getId();
        bookBean2.getId();

        buyBookService.buyBook(Long.valueOf(78));

        for( int i = 0; i<10; i++)
        {
            BookBean bookBean1 = new BookBean();
            bookBeanList.add(bookBean1);
        }

        response.setContentType("text/html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy()
    {

    }
}