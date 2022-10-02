import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/commandService")
public class Servlet extends javax.servlet.http.HttpServlet {
    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String s=request.getParameter("user");
        Gson gson = new Gson();

        response.getWriter().write(gson.toJson(s));
    }


}
