package servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String title = DemoServlet.class.getName();
        String nome = req.getParameter("nome");

        String saluto = (nome == null || nome.isBlank()) ? "World" : nome;

        var html = String.format("<html>\n" +
                "    <head>\n" +
                "        <title>%s</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>Hello %s!</h1>\n" +
                "    <a href=\"/hello-war-1.0.0\">Torna alla home </a>\n" +
                "    </body>\n" +
                "</html>\n", title, saluto);


        resp.setStatus(200);
        resp.getWriter().print(html);

    }

}
