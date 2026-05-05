package devops;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")

public class App extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Priyanka Kite Shop</title>");
        out.println("</head>");
        out.println("<body style='font-family:Arial;'>");

        out.println("<h1>Welcome to Priyanka Kite Shop</h1>");

        out.println("<h2>Available Kites</h2>");
        out.println("<ul>");
        out.println("<li>Dragon Kite</li>");
        out.println("<li>Box Kite</li>");
        out.println("<li>Diamond Kite</li>");
        out.println("<li>Stunt Kite</li>");
        out.println("</ul>");

        out.println("<h2>Kite Materials</h2>");
        out.println("<ul>");
        out.println("<li>Bamboo Sticks</li>");
        out.println("<li>Nylon Thread</li>");
        out.println("<li>Color Paper</li>");
        out.println("<li>Glue</li>");
        out.println("</ul>");

        out.println("<h3>Thank You for Visiting!</h3>");

        out.println("</body>");
        out.println("</html>");
    }
}
