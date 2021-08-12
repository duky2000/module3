package JspJstl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    static ArrayList<Customer> list = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        list.add(new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "img/anh.jpg"));
        list.add(new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "img/anh.jpg"));
        list.add(new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "img/anh.jpg"));
        list.add(new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "img/anh.jpg"));
        list.add(new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "img/anh.jpg"));
        req.setAttribute("listCustomer", list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("JspJstl/showCustomer.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String birthday = req.getParameter("day");
        String address = req.getParameter("address");
        String img = req.getParameter("img");
        list.add(new Customer(name, birthday, address, img));
        req.setAttribute("listCustomer", list);
        RequestDispatcher dispatcher;
        dispatcher = req.getRequestDispatcher("JspJstl/showCustomer.jsp");
        dispatcher.forward(req, resp);
    }
}
