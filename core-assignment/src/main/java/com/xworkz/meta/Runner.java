package com.xworkz.meta;

import com.xworkz.meta.coreconfig.CoreConfiguaration;
import com.xworkz.meta.dto.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CoreConfiguaration.class);
        System.out.println(applicationContext);

        System.out.println("__________________________________________________________________________________");

        List<BookDTO> books = (List<BookDTO>) applicationContext.getBean("getBook");
        books.forEach(System.out::println);

        System.out.println("__________________________________________________________________________________");


        List<ProductDTO> products = (List<ProductDTO>) applicationContext.getBean("getProducts");
        products.forEach(System.out::println);

        System.out.println("__________________________________________________________________________________");


        List<EmployeeDTO> employees = (List<EmployeeDTO>) applicationContext.getBean("getEmployees");
        employees.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<CustomerDTO> customers = (List<CustomerDTO>) applicationContext.getBean("getCustomers");
        customers.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<OrderDTO> orders = (List<OrderDTO>) applicationContext.getBean("getOrders");
        orders.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


//        List<VehicleDTO> vehicles = (List<VehicleDTO>) applicationContext.getBean("getVehicles");
//        vehicles.forEach(System.out::println);


        List<StudentDTO> students = (List<StudentDTO>) applicationContext.getBean("getStudents");
        students.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<HospitalDTO> hospitals = (List<HospitalDTO>) applicationContext.getBean("getHospitals");
        hospitals.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<LaptopDTO> laptops = (List<LaptopDTO>) applicationContext.getBean("getLaptops");
        laptops.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<TrainDTO> trains = (List<TrainDTO>) applicationContext.getBean("getTrains");
        trains.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<FlightDTO> flights = (List<FlightDTO>) applicationContext.getBean("getFlights");
        flights.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<SchoolDTO> schools = (List<SchoolDTO>) applicationContext.getBean("getSchools");
        schools.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<HotelDTO> hotelList = (List<HotelDTO>) applicationContext.getBean("getHotels");
        hotelList.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<PatientDTO> patients = (List<PatientDTO>) applicationContext.getBean("getPatients");
        patients.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<RestaurantDTO> restaurants = (List<RestaurantDTO>) applicationContext.getBean("getRestaurants");
        restaurants.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<ApartmentDTO> apartments = (List<ApartmentDTO>) applicationContext.getBean("getApartments");
        apartments.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<InsuranceDTO> insurances = (List<InsuranceDTO>) applicationContext.getBean("getInsurances");
        insurances.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<CourseDTO> courses = (List<CourseDTO>) applicationContext.getBean("getCourses");
        courses.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<DeliveryDTO> deliveries = (List<DeliveryDTO>) applicationContext.getBean("getDeliveries");
        deliveries.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<GameDTO> games = (List<GameDTO>) applicationContext.getBean("getGames");
        games.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<FestivalDTO> festivals = (List<FestivalDTO>) applicationContext.getBean("getFestivals");
        festivals.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<GymDTO> gyms = (List<GymDTO>) applicationContext.getBean("getGyms");
        gyms.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<BagDTO> bags = (List<BagDTO>) applicationContext.getBean("getBags");
        bags.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<ParkDTO> parks = (List<ParkDTO>) applicationContext.getBean("getParks");
        parks.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<SandalDTO> sandals = (List<SandalDTO>) applicationContext.getBean("getSandals");
        sandals.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<NovelDTO> novels = (List<NovelDTO>) applicationContext.getBean("getNovels");
        novels.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<SocialMediaDTO> socialMediaList = (List<SocialMediaDTO>) applicationContext.getBean("getSocialMedia");
        socialMediaList.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<RadioDTO> radios = (List<RadioDTO>) applicationContext.getBean("getRadios");
        radios.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<WatchDTO> watches = (List<WatchDTO>) applicationContext.getBean("getWatches");
        watches.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<BeautyProductDTO> beautyProducts = (List<BeautyProductDTO>) applicationContext.getBean("getBeauty");
        beautyProducts.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");


        List<LodgeDTO> lodges = (List<LodgeDTO>) applicationContext.getBean("getLodge");
        lodges.forEach(System.out::println);
        System.out.println("__________________________________________________________________________________");

    }
}
