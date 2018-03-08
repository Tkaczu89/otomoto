package com.tkaczu.otomoto.database;

import com.tkaczu.otomoto.database.model.Advertisement;
import com.tkaczu.otomoto.database.repository.AdvertisementsRepository;
import com.tkaczu.otomoto.database.service.AdvertisementService;
import com.tkaczu.otomoto.database.service.CarService;
import com.tkaczu.otomoto.database.service.UserService;

import java.util.List;

import static com.tkaczu.otomoto.database.repository.AdvertisementsRepository.factory;

public class MainTest {
    public static void main(String[] args) {
        AdvertisementsRepository advertisementsRepository = new AdvertisementsRepository();
        CarService carService = new CarService();
        UserService userService = new UserService();
        AdvertisementService advertisementService = new AdvertisementService();

        /*Car car = carService.createNewCar("Opel","Astra","2007",20000,"23432554grfg");
        Car car2 = carService.createNewCar("Volkswagen","Polo","2009",30000,"67445654554grfg");

        User user = userService.createNewUser("Lukasz","Tkaczyk");
        User user2 = userService.createNewUser("Magdalena","Tkaczyk");

        Advertisement advertisement1 = advertisementService.createNewAdvertisement("Sprzedam Opla",10000);
        Advertisement advertisement2 = advertisementService.createNewAdvertisement("Sprzedam Volkswagena",15000);

        advertisementService.insertNewAdvertisement(factory, advertisement1, car, user);
        advertisementService.insertNewAdvertisement(factory, advertisement2, car2, user2);*/


        List<Advertisement> advertisementsAll = advertisementsRepository.getAll(factory);

        List<Advertisement> advertisementList1 = advertisementsRepository.getAllSorted(factory, "a.price", "asc");
        List<Advertisement> advertisementList2 = advertisementsRepository.getAllSorted(factory, "a.price", "desc");
        List<Advertisement> advertisementList3 = advertisementsRepository.getAllSorted(factory, "a.car.mileage", "asc");
        List<Advertisement> advertisementList4 = advertisementsRepository.getAllSorted(factory, "a.car.mileage", "desc");


        System.out.println();

        for (Advertisement advertisement : advertisementsAll) {
            System.out.println(advertisement.toString());
        }
        System.out.println();

        for (Advertisement advertisement : advertisementList1) {
            System.out.println(advertisement.toString());
        }

        System.out.println();

        for (Advertisement advertisement : advertisementList2) {
            System.out.println(advertisement.toString());
        }

        System.out.println();

        for (Advertisement advertisement : advertisementList3) {
            System.out.println(advertisement.toString());
        }

        System.out.println();

        for (Advertisement advertisement : advertisementList4) {
            System.out.println(advertisement.toString());
        }
    }
}
