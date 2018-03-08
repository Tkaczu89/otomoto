package com.tkaczu.otomoto.webapplication;


import com.tkaczu.otomoto.database.repository.AdvertisementsRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.tkaczu.otomoto.database.repository.AdvertisementsRepository.factory;

@WebServlet(name = "AdvertisementsSortedByPriceAscServlet", value = "/sortedByPriceAsc")
public class AdvertisementsSortedByPriceAscServlet extends HttpServlet {
    AdvertisementsRepository advertisementsRepository = new AdvertisementsRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("advertisements", advertisementsRepository.getAllSorted(factory, "price", "asc"));
        req.getRequestDispatcher("advertisements.jsp").forward(req, resp);
    }
}

