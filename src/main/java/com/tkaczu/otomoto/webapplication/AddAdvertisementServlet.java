package com.tkaczu.otomoto.webapplication;

import com.tkaczu.otomoto.database.model.Advertisement;
import com.tkaczu.otomoto.database.model.Car;
import com.tkaczu.otomoto.database.model.User;
import com.tkaczu.otomoto.database.service.AdvertisementService;
import com.tkaczu.otomoto.database.service.CarService;
import com.tkaczu.otomoto.database.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static com.tkaczu.otomoto.database.repository.AdvertisementsRepository.factory;


@WebServlet(name = "AddAdvertisementServlet", value = "/addadvertisement", loadOnStartup = 1)
public class AddAdvertisementServlet extends HttpServlet {
    public CarService carService = new CarService();
    public UserService userService = new UserService();
    public AdvertisementService advertisementService = new AdvertisementService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("advertismentAdd.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Car car = carService.createNewCar(
                req.getParameter("mark"),
                req.getParameter("model"),
                req.getParameter("year"),
                Integer.parseInt(req.getParameter("mileage")),
                req.getParameter("vin"));

        User user = userService.createNewUser(
                req.getParameter("firstName"),
                req.getParameter("lastName"));

        Advertisement advertisement = advertisementService.createNewAdvertisement(
                req.getParameter("description"),
                Integer.parseInt(req.getParameter("price")));

        advertisementService.insertNewAdvertisement(factory, advertisement, car, user);

        req.setAttribute("info", "<div class=\"alert alert-success\"><strong>Success!</strong>The advertisement has been added!</div>");
        req.getRequestDispatcher("advertismentAdd.jsp").forward(req, resp);
    }
}
