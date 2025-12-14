package com.xworkz.bean;

import com.xworkz.bean.coreConfig.CoreConfiguaration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ApplicationContext context =
                        new AnnotationConfigApplicationContext(CoreConfiguaration.class);

                Institute institute = context.getBean(Institute.class);
                institute.setId(1);
                institute.setName("Xworkz");

                Trainee trainee1 = institute.getTrainee();
                trainee1.setId(101);
                trainee1.setType("Java");
                System.out.println(trainee1);

                Trainee trainee2 = institute.getTrainee();
                trainee2.setId(102);
                trainee2.setType("Spring");
                System.out.println(trainee2);

                System.out.println(institute);
                System.out.println("--------------------------------");

                Hospital hospital = context.getBean(Hospital.class);
                hospital.setId(2);
                hospital.setName("Apollo");

                Doctor doctor1 = hospital.getDoctor();
                doctor1.setId(201);
                doctor1.setType("Cardiology");
                System.out.println(doctor1);

                Doctor doctor2 = hospital.getDoctor();
                doctor2.setId(202);
                doctor2.setType("Neurology");
                System.out.println(doctor2);

                System.out.println(hospital);
                System.out.println("--------------------------------");

                School school = context.getBean(School.class);
                school.setId(3);
                school.setName("DPS");

                Teacher teacher1 = school.getTeacher();
                teacher1.setId(301);
                teacher1.setType("Maths");
                System.out.println(teacher1);

                Teacher teacher2 = school.getTeacher();
                teacher2.setId(302);
                teacher2.setType("Science");
                System.out.println(teacher2);

                System.out.println(school);
                System.out.println("--------------------------------");

                College college = context.getBean(College.class);
                college.setId(4);
                college.setName("NIE");

                Professor professor1 = college.getProfessor();
                professor1.setId(401);
                professor1.setType("CS");
                System.out.println(professor1);

                Professor professor2 = college.getProfessor();
                professor2.setId(402);
                professor2.setType("ECE");
                System.out.println(professor2);

                System.out.println(college);
                System.out.println("--------------------------------");

                Company company = context.getBean(Company.class);
                company.setId(5);
                company.setName("Infosys");

                Employee emp1 = company.getEmployee();
                emp1.setId(501);
                emp1.setType("Developer");
                System.out.println(emp1);

                Employee emp2 = company.getEmployee();
                emp2.setId(502);
                emp2.setType("Tester");
                System.out.println(emp2);

                System.out.println(company);
                System.out.println("--------------------------------");

                Bank bank = context.getBean(Bank.class);
                bank.setId(6);
                bank.setName("SBI");

                Account acc1 = bank.getAccount();
                acc1.setId(601);
                acc1.setType("Savings");
                System.out.println(acc1);

                Account acc2 = bank.getAccount();
                acc2.setId(602);
                acc2.setType("Current");
                System.out.println(acc2);

                System.out.println(bank);
                System.out.println("--------------------------------");
                Airport airport = context.getBean(Airport.class);
                airport.setId(7);
                airport.setName("Kempegowda");

                Flight flight1 = airport.getFlight();
                flight1.setId(701);
                flight1.setType("Domestic");
                System.out.println(flight1);

                Flight flight2 = airport.getFlight();
                flight2.setId(702);
                flight2.setType("International");
                System.out.println(flight2);

                System.out.println(airport);
                System.out.println("--------------------------------");

                Hotel hotel = context.getBean(Hotel.class);
                hotel.setId(8);
                hotel.setName("Taj");

                Room room1 = hotel.getRoom();
                room1.setId(801);
                room1.setType("Deluxe");
                System.out.println(room1);

                Room room2 = hotel.getRoom();
                room2.setId(802);
                room2.setType("Suite");
                System.out.println(room2);

                System.out.println(hotel);
                System.out.println("--------------------------------");

        // 9. Restaurant → Chef
        Restaurant restaurant = context.getBean(Restaurant.class);
        restaurant.setId(9);
        restaurant.setName("Udupi");

        Chef chef1 = restaurant.getChef();
        chef1.setId(901);
        chef1.setType("South Indian");
        System.out.println(chef1);

        Chef chef2 = restaurant.getChef();
        chef2.setId(902);
        chef2.setType("North Indian");
        System.out.println(chef2);

        System.out.println(restaurant);
        System.out.println("--------------------------------");

        // 10. Shop → Customer
        Shop shop = context.getBean(Shop.class);
        shop.setId(10);
        shop.setName("Reliance");

        Customer customer1 = shop.getCustomer();
        customer1.setId(1001);
        customer1.setType("Regular");
        System.out.println(customer1);

        Customer customer2 = shop.getCustomer();
        customer2.setId(1002);
        customer2.setType("Premium");
        System.out.println(customer2);


        Factory factory = context.getBean(Factory.class);
        factory.setId(11);
        factory.setName("Tata Steel");

        Worker worker1 = factory.getWorker();
        worker1.setId(1101);
        worker1.setType("Welder");
        System.out.println(worker1);

        Worker worker2 = factory.getWorker();
        worker2.setId(1102);
        worker2.setType("Supervisor");
        System.out.println(worker2);

        System.out.println(factory);
        System.out.println("--------------------------------");

        Cinema cinema = context.getBean(Cinema.class);
        cinema.setId(12);
        cinema.setName("PVR");

        Movie movie1 = cinema.getMovie();
        movie1.setId(1201);
        movie1.setType("Action");
        System.out.println(movie1);

        Movie movie2 = cinema.getMovie();
        movie2.setId(1202);
        movie2.setType("Drama");
        System.out.println(movie2);

        System.out.println(cinema);
        System.out.println("--------------------------------");

        Gym gym = context.getBean(Gym.class);
        gym.setId(13);
        gym.setName("CultFit");

        Trainer trainer1 = gym.getTrainer();
        trainer1.setId(1301);
        trainer1.setType("Weight Training");
        System.out.println(trainer1);

        Trainer trainer2 = gym.getTrainer();
        trainer2.setId(1302);
        trainer2.setType("Cardio");
        System.out.println(trainer2);

        System.out.println(gym);
        System.out.println("--------------------------------");

        Salon salon = context.getBean(Salon.class);
        salon.setId(14);
        salon.setName("Naturals");

        Stylist stylist1 = salon.getStylist();
        stylist1.setId(1401);
        stylist1.setType("Hair");
        System.out.println(stylist1);

        Stylist stylist2 = salon.getStylist();
        stylist2.setId(1402);
        stylist2.setType("Makeup");
        System.out.println(stylist2);

        System.out.println(salon);
        System.out.println("--------------------------------");

        Garage garage = context.getBean(Garage.class);
        garage.setId(15);
        garage.setName("Bosch");

        Mechanic mechanic1 = garage.getMechanic();
        mechanic1.setId(1501);
        mechanic1.setType("Car");
        System.out.println(mechanic1);

        Mechanic mechanic2 = garage.getMechanic();
        mechanic2.setId(1502);
        mechanic2.setType("Bike");
        System.out.println(mechanic2);

        System.out.println(garage);
        System.out.println("--------------------------------");

        Court court = context.getBean(Court.class);
        court.setId(16);
        court.setName("High Court");

        Judge judge1 = court.getJudge();
        judge1.setId(1601);
        judge1.setType("Civil");
        System.out.println(judge1);

        Judge judge2 = court.getJudge();
        judge2.setId(1602);
        judge2.setType("Criminal");
        System.out.println(judge2);

        System.out.println(court);
        System.out.println("--------------------------------");

        PoliceStation policeStation = context.getBean(PoliceStation.class);
        policeStation.setId(17);
        policeStation.setName("City PS");

        Officer officer1 = policeStation.getOfficer();
        officer1.setId(1701);
        officer1.setType("Inspector");
        System.out.println(officer1);

        Officer officer2 = policeStation.getOfficer();
        officer2.setId(1702);
        officer2.setType("Sub-Inspector");
        System.out.println(officer2);

        System.out.println(policeStation);
        System.out.println("--------------------------------");

        FireStation fireStation = context.getBean(FireStation.class);
        fireStation.setId(18);
        fireStation.setName("Central FS");

        Firefighter fire1 = fireStation.getFirefighter();
        fire1.setId(1801);
        fire1.setType("Rescue");
        System.out.println(fire1);

        Firefighter fire2 = fireStation.getFirefighter();
        fire2.setId(1802);
        fire2.setType("Emergency");
        System.out.println(fire2);

        System.out.println(fireStation);
        System.out.println("--------------------------------");

    }
        }

