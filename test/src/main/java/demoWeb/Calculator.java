package demoWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/display")
public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String product = req.getParameter("mieuta");
        double price = Double.parseDouble(req.getParameter("gia"));
        double percent = Double.parseDouble(req.getParameter("phantram"));
        double amount = price * percent * 0.01;
        double discountPrice = price - amount;

        PrintWriter writer = resp.getWriter();
        writer.println("sản phẩm : "+product);
        writer.println("giá : "+price);
        writer.println(" triết khấu : "+percent);
        writer.println("số tiền triết khấu : "+amount);
        writer.println("giảm giá : "+discountPrice);
    }
}
