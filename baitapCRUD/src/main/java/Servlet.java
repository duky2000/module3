import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = "")
public class Servlet extends HttpServlet {
    ArrayList<SanPham> list = new ArrayList<>();

    @Override
    public void init() throws ServletException {
        list.add(new SanPham(1, "opp", "img/oppo.jpg", 100000));
        list.add(new SanPham(2, "iphone", "img/iphone.jpg", 500000));
        list.add(new SanPham(3, "samsung", "img/samsung.jpg", 300000));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher requestDispatcher;
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "create":
                resp.sendRedirect("create.jsp");
                break;
            case "delete":
                int indexDelete = Integer.parseInt(req.getParameter("index"));
                list.remove(indexDelete);
                req.setAttribute("newsp", list);
                requestDispatcher = req.getRequestDispatcher("show.jsp");
                requestDispatcher.forward(req, resp);
                break;
            case "edit":
                int indexEdit = Integer.parseInt(req.getParameter("index"));
                SanPham sanPham = list.get(indexEdit);
                req.setAttribute("sanpham", sanPham);
                requestDispatcher = req.getRequestDispatcher("edit.jsp");
                requestDispatcher.forward(req, resp);
                break;
            default:

                req.setAttribute("newsp", list);
                requestDispatcher = req.getRequestDispatcher("show.jsp");
                requestDispatcher.forward(req, resp);

        }
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String img = req.getParameter("img");
        float price = Float.parseFloat(req.getParameter("price"));
        list.add(new SanPham(id, name, img, price));
        resp.sendRedirect("/");

    }
}
