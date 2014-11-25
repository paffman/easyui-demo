package de.pentasys.easyui.demo.servlet;

import de.pentasys.easyui.demo.mapper.JsonMapper;
import de.pentasys.easyui.demo.service.model.BusinessModel;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by paffenan on 25.11.2014.
 */
public class JsonServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(JsonServlet.class);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        JsonMapper mapper = new JsonMapper();

        // parameter nehmen und object bauen
        BusinessModel model = new BusinessModel();
        model.setVorname(req.getParameter("vorname"));
        model.setName(req.getParameter("name"));
        model.setAlter(Integer.valueOf(req.getParameter("alter")));

        // response basteln
        PrintWriter writer = resp.getWriter();
        writer.write(mapper.mapToJson(model));
    }
}
