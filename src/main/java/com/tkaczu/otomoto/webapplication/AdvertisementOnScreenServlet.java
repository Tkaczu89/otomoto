package com.tkaczu.otomoto.webapplication;

import com.tkaczu.otomoto.database.model.Advertisement;
import com.tkaczu.otomoto.database.repository.AdvertisementsRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdvertisementOnScreenServlet", value = "/advertisement")

public class AdvertisementOnScreenServlet extends HttpServlet {
    private AdvertisementsRepository advertisementsRepository = new AdvertisementsRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Advertisement advertisement = advertisementsRepository.getAdvertisementById(Integer.parseInt(req.getParameter("advertId")));
        req.setAttribute("advertisement", advertisement);
        req.getRequestDispatcher("advertisement.jsp").forward(req, resp);

    }
}