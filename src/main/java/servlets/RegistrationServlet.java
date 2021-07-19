package servlets;

import Service.UserService;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/reg")
public class RegistrationServlet extends HttpServlet {

    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/reg.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        req.setAttribute("name", name);
        req.setAttribute("username", username);
        req.setAttribute("password", password);

        User user = new User(name, username, password);
        String result = null;
        boolean add = userService.add(user);
        if (add){
            result = "Registration completed successfully";
        } else {
            result = "Error";
        }
        req.setAttribute("result",  result);
        getServletContext().getRequestDispatcher("/reg.jsp").forward(req, resp);
    }
}
