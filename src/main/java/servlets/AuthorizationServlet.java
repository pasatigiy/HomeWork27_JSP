package servlets;

import Service.UserService;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth")
public class AuthorizationServlet extends HttpServlet {

    private UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/auth.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");


        req.setAttribute("username", username);
        req.setAttribute("password", password);

        User byUsername = userService.findByUsername(username);

        String result = null;

        if(password.length()>0){
            if (byUsername.getPassword().equals(password)){
                req.getSession().setAttribute("user", byUsername);
                result = "authorization completed";
            } else {
                result="Wrong password";
            }
        } else {
            result = "no password entered";
        }

        req.setAttribute("result",  result);
        getServletContext().getRequestDispatcher("/auth.jsp").forward(req, resp);
    }
}
