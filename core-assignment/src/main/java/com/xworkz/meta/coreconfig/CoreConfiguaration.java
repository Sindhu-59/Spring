package com.xworkz.meta.coreconfig;

import com.xworkz.meta.dto.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ComponentScan(basePackages = "com.xworkz.meta")
@Configuration
public class CoreConfiguaration {

    public CoreConfiguaration() {
        System.out.println("Configuration is invoked");
    }

    @Bean
    public List<BookDTO> getBook() {

        List<BookDTO> book = new ArrayList<>();
        Collections.addAll(book,
                new BookDTO("1", "Maleyali Madumagalu", "Kuvempu", "Novel", 80, 200.00, "Story", "Kannada"),
                new BookDTO("2", "Ramayana", "Valmiki", "Epic", 300, 450.00, "Mythology", "Sanskrit"),
                new BookDTO("3", "Mahabharata", "Vyasa", "Epic", 400, 550.00, "Mythology", "Sanskrit"),
                new BookDTO("4", "Malgudi Days", "R.K. Narayan", "Short Stories", 180, 250.00, "Fiction", "English"),
                new BookDTO("5", "Wings of Fire", "A.P.J. Abdul Kalam", "Autobiography", 250, 350.00, "Life", "English"),
                new BookDTO("6", "The Alchemist", "Paulo Coelho", "Novel", 160, 299.00, "Inspirational", "English"),
                new BookDTO("7", "Panchatantra", "Vishnu Sharma", "Moral Stories", 120, 199.00, "Kids", "Sanskrit"),
                new BookDTO("8", "Gitanjali", "Rabindranath Tagore", "Poetry", 180, 320.00, "Poems", "Bengali"),
                new BookDTO("9", "Discovery of India", "Jawaharlal Nehru", "History", 350, 480.00, "Nation", "English"),
                new BookDTO("10", "Kannada Sahitya Charitre", "R. Narasimhachar", "Literature", 220, 280.00, "Research", "Kannada"),
                new BookDTO("11", "Samskara", "U.R. Ananthamurthy", "Novel", 140, 220.00, "Culture", "Kannada"),
                new BookDTO("12", "Parva", "S.L. Bhyrappa", "Epic Retelling", 420, 600.00, "Mythology", "Kannada"),
                new BookDTO("13", "Karvalo", "Poornachandra Tejaswi", "Novel", 150, 230.00, "Adventure", "Kannada"),
                new BookDTO("14", "Gulliver's Travels", "Jonathan Swift", "Fantasy", 280, 310.00, "Adventure", "English"),
                new BookDTO("15", "Origin of Species", "Charles Darwin", "Science", 500, 650.00, "Biology", "English")
        );


        return book;
    }

    @Bean
    public List<ProductDTO> getProducts() {

        List<ProductDTO> productDTOS = new ArrayList<>();

        Collections.addAll(productDTOS,
                new ProductDTO(1, "Shampoo", 250.00, "Dove", "Haircare", 50, "2024-01-10", "2026-01-10"),
                new ProductDTO(2, "Face Cream", 450.00, "Nivea", "Skincare", 30, "2024-03-15", "2025-12-30"),
                new ProductDTO(3, "Perfume", 1500.00, "Fogg", "Fragrance", 20, "2024-02-01", "2029-02-01"),
                new ProductDTO(4, "Soap", 40.00, "Lux", "Bathing", 100, "2024-04-20", "2026-04-20"),
                new ProductDTO(5, "Hair Oil", 120.00, "Parachute", "Haircare", 60, "2024-01-18", "2026-01-18"),
                new ProductDTO(6, "Toothpaste", 90.00, "Colgate", "Dental", 80, "2024-05-01", "2026-05-01"),
                new ProductDTO(7, "Body Lotion", 320.00, "Vaseline", "Skincare", 40, "2024-03-28", "2026-03-28"),
                new ProductDTO(8, "Lip Balm", 99.00, "Maybelline", "Cosmetics", 70, "2024-02-15", "2026-02-15"),
                new ProductDTO(9, "Conditioner", 300.00, "Clinic Plus", "Haircare", 45, "2024-01-05", "2026-01-05"),
                new ProductDTO(10, "Face Wash", 200.00, "Himalaya", "Skincare", 70, "2024-01-25", "2026-01-25"),
                new ProductDTO(11, "Deodorant", 150.00, "Axe", "Fragrance", 55, "2024-04-11", "2027-04-11"),
                new ProductDTO(12, "Handwash", 120.00, "Dettol", "Hygiene", 85, "2024-02-19", "2026-02-19"),
                new ProductDTO(13, "Talcum Powder", 85.00, "Ponds", "Bodycare", 65, "2024-03-30", "2027-03-30"),
                new ProductDTO(14, "Face Serum", 399.00, "Lakme", "Skincare", 35, "2024-01-14", "2026-01-14"),
                new ProductDTO(15, "Shaving Cream", 150.00, "Gillette", "Men Grooming", 40, "2024-05-20", "2026-05-20")
        );

        return productDTOS;
    }

    @Bean
    public List<EmployeeDTO> getEmployees() {

        List<EmployeeDTO> employeeDTOS = new ArrayList<>();

        Collections.addAll(employeeDTOS,
                new EmployeeDTO(1, "Arjun", "IT", "Developer", 45000, "arjun@gmail.com", 9876543210L, "Bangalore"),
                new EmployeeDTO(2, "Meera", "HR", "HR Manager", 55000, "meera@gmail.com", 9876543211L, "Mysore"),
                new EmployeeDTO(3, "Kiran", "Finance", "Accountant", 40000, "kiran@gmail.com", 9876543212L, "Mumbai"),
                new EmployeeDTO(4, "Ravi", "Sales", "Sales Executive", 30000, "ravi@gmail.com", 9876543213L, "Chennai"),
                new EmployeeDTO(5, "Priya", "IT", "Tester", 35000, "priya@gmail.com", 9876543214L, "Hyderabad"),
                new EmployeeDTO(6, "Sneha", "Marketing", "Marketing Lead", 60000, "sneha@gmail.com", 9876543215L, "Pune"),
                new EmployeeDTO(7, "Vikram", "Support", "Support Engineer", 28000, "vikram@gmail.com", 9876543216L, "Delhi"),
                new EmployeeDTO(8, "Rahul", "IT", "Backend Dev", 48000, "rahul@gmail.com", 9876543217L, "Bangalore"),
                new EmployeeDTO(9, "Tara", "IT", "Frontend Dev", 47000, "tara@gmail.com", 9876543218L, "Mumbai"),
                new EmployeeDTO(10, "Gowri", "Admin", "Admin Officer", 32000, "gowri@gmail.com", 9876543219L, "Chennai"),
                new EmployeeDTO(11, "Varun", "Sales", "Area Manager", 52000, "varun@gmail.com", 9876543220L, "Delhi"),
                new EmployeeDTO(12, "Divya", "Marketing", "Digital Marketer", 42000, "divya@gmail.com", 9876543221L, "Pune"),
                new EmployeeDTO(13, "Rohan", "Finance", "Analyst", 50000, "rohan@gmail.com", 9876543222L, "Mumbai"),
                new EmployeeDTO(14, "Sandhya", "HR", "Recruiter", 33000, "sandhya@gmail.com", 9876543223L, "Hyderabad"),
                new EmployeeDTO(15, "Naveen", "IT", "Cloud Engineer", 65000, "naveen@gmail.com", 9876543224L, "Bangalore")
        );

        return employeeDTOS;

    }
        @Bean
        public List<CustomerDTO> getCustomers() {

            List<CustomerDTO> customerDTOS = new ArrayList<>();

            Collections.addAll(customerDTOS,
                    new CustomerDTO(1, "Arjun", "arjun@gmail.com", "9876543210", "Bangalore", 25, "Male", "2024-01-10"),
                    new CustomerDTO(2, "Meera", "meera@gmail.com", "9876543211", "Mysore", 28, "Female", "2024-02-15"),
                    new CustomerDTO(3, "Ravi", "ravi@gmail.com", "9876543212", "Chennai", 30, "Male", "2024-03-01"),
                    new CustomerDTO(4, "Sneha", "sneha@gmail.com", "9876543213", "Hyderabad", 24, "Female", "2024-03-18"),
                    new CustomerDTO(5, "Kiran", "kiran@gmail.com", "9876543214", "Mumbai", 31, "Male", "2024-04-10"),
                    new CustomerDTO(6, "Divya", "divya@gmail.com", "9876543215", "Pune", 27, "Female", "2024-04-20"),
                    new CustomerDTO(7, "Naveen", "naveen@gmail.com", "9876543216", "Delhi", 29, "Male", "2024-05-10"),
                    new CustomerDTO(8, "Tara", "tara@gmail.com", "9876543217", "Bangalore", 26, "Female", "2024-05-25"),
                    new CustomerDTO(9, "Varun", "varun@gmail.com", "9876543218", "Chennai", 33, "Male", "2024-06-01"),
                    new CustomerDTO(10, "Priya", "priya@gmail.com", "9876543219", "Hyderabad", 23, "Female", "2024-06-18"),
                    new CustomerDTO(11, "Rahul", "rahul@gmail.com", "9876543220", "Mumbai", 34, "Male", "2024-07-10"),
                    new CustomerDTO(12, "Sanjana", "sanjana@gmail.com", "9876543221", "Pune", 25, "Female", "2024-07-30"),
                    new CustomerDTO(13, "Rohit", "rohit@gmail.com", "9876543222", "Delhi", 32, "Male", "2024-08-05"),
                    new CustomerDTO(14, "Keerthi", "keerthi@gmail.com", "9876543223", "Mysore", 28, "Female", "2024-08-21"),
                    new CustomerDTO(15, "Gaurav", "gaurav@gmail.com", "9876543224", "Bangalore", 30, "Male", "2024-09-10")
            );

            return customerDTOS;
        }

        @Bean
        public List<OrderDTO> getOrders() {

            List<OrderDTO> orderDTOS = new ArrayList<>();

            Collections.addAll(orderDTOS,
                    new OrderDTO(1, 101, "2024-01-10", 1200, "Delivered", "UPI", "2024-01-15", "Bangalore"),
                    new OrderDTO(2, 102, "2024-01-12", 800, "Shipped", "Card", "2024-01-18", "Mysore"),
                    new OrderDTO(3, 103, "2024-01-15", 1500, "Pending", "Cash", "2024-01-20", "Chennai"),
                    new OrderDTO(4, 104, "2024-01-18", 500, "Delivered", "UPI", "2024-01-23", "Hyderabad"),
                    new OrderDTO(5, 105, "2024-02-01", 2500, "Cancelled", "Card", "2024-02-05", "Mumbai"),
                    new OrderDTO(6, 106, "2024-02-05", 900, "Shipped", "Cash", "2024-02-10", "Delhi"),
                    new OrderDTO(7, 107, "2024-02-10", 600, "Delivered", "UPI", "2024-02-15", "Pune"),
                    new OrderDTO(8, 108, "2024-02-15", 1400, "Pending", "Card", "2024-02-20", "Bangalore"),
                    new OrderDTO(9, 109, "2024-02-20", 750, "Delivered", "Card", "2024-02-25", "Chennai"),
                    new OrderDTO(10, 110, "2024-03-01", 1600, "Shipped", "UPI", "2024-03-06", "Hyderabad"),
                    new OrderDTO(11, 111, "2024-03-05", 1300, "Delivered", "Cash", "2024-03-10", "Mumbai"),
                    new OrderDTO(12, 112, "2024-03-12", 2000, "Pending", "Card", "2024-03-18", "Pune"),
                    new OrderDTO(13, 113, "2024-03-18", 1100, "Delivered", "UPI", "2024-03-23", "Delhi"),
                    new OrderDTO(14, 114, "2024-03-25", 700, "Cancelled", "Card", "2024-03-28", "Mysore"),
                    new OrderDTO(15, 115, "2024-04-01", 950, "Shipped", "UPI", "2024-04-06", "Bangalore")
            );

            return orderDTOS;
        }

    public List<VehicleDTO> getVehicles() {

        List<VehicleDTO> vehicleDTOS = new ArrayList<>();

        Collections.addAll(vehicleDTOS,
                new VehicleDTO("KA01AB1234", "Honda", "City", 2020, "White", 1200000, "Petrol", "Arjun"),
                new VehicleDTO("KA02CD5678", "Hyundai", "i20", 2019, "Red", 800000, "Diesel", "Meera"),
                new VehicleDTO("KA03EF9012", "Maruti", "Swift", 2021, "Blue", 750000, "Petrol", "Ravi"),
                new VehicleDTO("MH01GH2345", "Tata", "Punch", 2022, "Grey", 650000, "Petrol", "Kiran"),
                new VehicleDTO("MH02IJ6789", "Toyota", "Innova", 2018, "Silver", 1800000, "Diesel", "Varun"),
                new VehicleDTO("DL01KL3456", "Kia", "Seltos", 2021, "Black", 1400000, "Petrol", "Priya"),
                new VehicleDTO("DL02MN7890", "Mahindra", "XUV700", 2023, "White", 2200000, "Diesel", "Rahul"),
                new VehicleDTO("TN01OP2345", "Renault", "Kwid", 2018, "Orange", 450000, "Petrol", "Keerthi"),
                new VehicleDTO("TN02QR6789", "BMW", "X5", 2020, "Black", 6500000, "Petrol", "Naveen"),
                new VehicleDTO("TS01ST1234", "Audi", "A4", 2021, "Blue", 4200000, "Petrol", "Divya"),
                new VehicleDTO("TS02UV5678", "Ford", "EcoSport", 2019, "Grey", 900000, "Petrol", "Sneha"),
                new VehicleDTO("GJ01WX9012", "Volkswagen", "Polo", 2017, "Red", 600000, "Petrol", "Gaurav"),
                new VehicleDTO("GJ02YZ3456", "Mercedes", "C-Class", 2022, "White", 5500000, "Diesel", "Tara"),
                new VehicleDTO("RJ01AA7890", "Skoda", "Rapid", 2020, "Black", 950000, "Petrol", "Rohit"),
                new VehicleDTO("RJ02BB1234", "Nissan", "Magnite", 2021, "Blue", 750000, "Petrol", "Sandhya")
        );

        return vehicleDTOS;
    }

    @Bean
    public List<StudentDTO> getStudents() {

        List<StudentDTO> studentDTOS = new ArrayList<>();

        Collections.addAll(studentDTOS,
                new StudentDTO(1, "Arjun", 20, "BCA", 85.5, "9876543210", "arjun@gmail.com", "Bangalore"),
                new StudentDTO(2, "Meera", 21, "BSc", 88.0, "9876543211", "meera@gmail.com", "Mysore"),
                new StudentDTO(3, "Ravi", 22, "BCom", 78.4, "9876543212", "ravi@gmail.com", "Chennai"),
                new StudentDTO(4, "Sneha", 19, "BA", 82.1, "9876543213", "sneha@gmail.com", "Hyderabad"),
                new StudentDTO(5, "Kiran", 23, "BCA", 91.2, "9876543214", "kiran@gmail.com", "Mumbai"),
                new StudentDTO(6, "Divya", 20, "BSc", 79.8, "9876543215", "divya@gmail.com", "Pune"),
                new StudentDTO(7, "Naveen", 22, "BTech", 87.6, "9876543216", "naveen@gmail.com", "Delhi"),
                new StudentDTO(8, "Tara", 21, "BBA", 77.4, "9876543217", "tara@gmail.com", "Bangalore"),
                new StudentDTO(9, "Varun", 20, "BSc", 89.3, "9876543218", "varun@gmail.com", "Chennai"),
                new StudentDTO(10, "Priya", 19, "BCom", 83.5, "9876543219", "priya@gmail.com", "Hyderabad"),
                new StudentDTO(11, "Rahul", 22, "BA", 80.1, "9876543220", "rahul@gmail.com", "Mumbai"),
                new StudentDTO(12, "Sanjana", 21, "BTech", 92.0, "9876543221", "sanjana@gmail.com", "Pune"),
                new StudentDTO(13, "Rohit", 23, "BBA", 76.3, "9876543222", "rohit@gmail.com", "Delhi"),
                new StudentDTO(14, "Keerthi", 20, "BCA", 90.5, "9876543223", "keerthi@gmail.com", "Mysore"),
                new StudentDTO(15, "Gaurav", 21, "BSc", 86.2, "9876543224", "gaurav@gmail.com", "Bangalore")
        );

        return studentDTOS;
    }

    @Bean
    public List<HospitalDTO> getHospitals() {

        List<HospitalDTO> hospitalDTOS = new ArrayList<>();

        Collections.addAll(hospitalDTOS,
                new HospitalDTO(1, "Apollo", "Bangalore", 120, 300, 500, "Multi-Speciality", "9876543000"),
                new HospitalDTO(2, "Fortis", "Mysore", 90, 200, 400, "Cardiac", "9876543001"),
                new HospitalDTO(3, "Narayana", "Chennai", 150, 350, 600, "Cancer", "9876543002"),
                new HospitalDTO(4, "Manipal", "Hyderabad", 80, 250, 350, "Neurology", "9876543003"),
                new HospitalDTO(5, "Aster", "Mumbai", 110, 290, 450, "General", "9876543004"),
                new HospitalDTO(6, "Columbia Asia", "Delhi", 95, 230, 420, "Multi-Speciality", "9876543005"),
                new HospitalDTO(7, "KIMS", "Pune", 60, 150, 300, "Cardiac", "9876543006"),
                new HospitalDTO(8, "Sparsh", "Bangalore", 70, 180, 330, "Ortho", "9876543007"),
                new HospitalDTO(9, "Jayadeva", "Mangalore", 130, 310, 520, "Cardiac", "9876543008"),
                new HospitalDTO(10, "Vijaya", "Chennai", 85, 210, 370, "Neuro", "9876543009"),
                new HospitalDTO(11, "Rainbow", "Hyderabad", 55, 140, 260, "Children", "9876543010"),
                new HospitalDTO(12, "Sagar", "Bangalore", 65, 160, 280, "General", "9876543011"),
                new HospitalDTO(13, "Global", "Mumbai", 140, 320, 580, "Cancer", "9876543012"),
                new HospitalDTO(14, "Sunshine", "Pune", 75, 200, 340, "Women Care", "9876543013"),
                new HospitalDTO(15, "CloudNine", "Delhi", 50, 120, 200, "Maternity", "9876543014")
        );

        return hospitalDTOS;
    }

    @Bean
    public List<LaptopDTO> getLaptops() {

        List<LaptopDTO> laptopDTOS = new ArrayList<>();

        Collections.addAll(laptopDTOS,
                new LaptopDTO(1, "Dell", "Inspiron 5518", 65000, 8, 512, "i5", "Windows"),
                new LaptopDTO(2, "HP", "Pavilion 14", 70000, 16, 512, "i5", "Windows"),
                new LaptopDTO(3, "Lenovo", "ThinkPad E14", 72000, 16, 512, "i7", "Windows"),
                new LaptopDTO(4, "Acer", "Aspire 7", 58000, 8, 512, "Ryzen 5", "Windows"),
                new LaptopDTO(5, "Asus", "VivoBook", 60000, 8, 512, "i5", "Windows"),
                new LaptopDTO(6, "Apple", "MacBook Air M1", 90000, 8, 256, "M1", "macOS"),
                new LaptopDTO(7, "Apple", "MacBook Pro M2", 150000, 16, 512, "M2", "macOS"),
                new LaptopDTO(8, "MSI", "GF63 Thin", 82000, 16, 512, "i7", "Windows"),
                new LaptopDTO(9, "Samsung", "Galaxy Book 3", 85000, 16, 512, "i5", "Windows"),
                new LaptopDTO(10, "LG", "Gram 16", 120000, 16, 512, "i7", "Windows"),
                new LaptopDTO(11, "Huawei", "MateBook D15", 60000, 8, 512, "Ryzen 5", "Windows"),
                new LaptopDTO(12, "Realme", "Book Slim", 50000, 8, 256, "i3", "Windows"),
                new LaptopDTO(13, "Infinix", "INBook X2", 38000, 8, 256, "i3", "Windows"),
                new LaptopDTO(14, "Honor", "MagicBook X14", 52000, 8, 512, "i5", "Windows"),
                new LaptopDTO(15, "Toshiba", "Satellite Pro", 45000, 8, 512, "i3", "Windows")
        );

        return laptopDTOS;
    }
    @Bean
    public List<TrainDTO> getTrains() {

        List<TrainDTO> trainDTOS = new ArrayList<>();

        Collections.addAll(trainDTOS,
                new TrainDTO(1, "Rajdhani Express", "Delhi", "Mumbai", 2450, "06:00", "20:00", "AC"),
                new TrainDTO(2, "Shatabdi Express", "Chennai", "Bangalore", 1200, "07:30", "12:00", "AC Chair"),
                new TrainDTO(3, "Duronto Express", "Mumbai", "Kolkata", 3100, "05:00", "23:00", "Sleeper"),
                new TrainDTO(4, "Garib Rath", "Delhi", "Chennai", 1800, "09:00", "22:00", "3AC"),
                new TrainDTO(5, "Jan Shatabdi", "Mysore", "Bangalore", 350, "10:00", "12:30", "Chair"),
                new TrainDTO(6, "Intercity Express", "Hubli", "Bangalore", 450, "06:30", "13:00", "Chair"),
                new TrainDTO(7, "Express Line", "Pune", "Mumbai", 300, "08:00", "11:00", "Sleeper"),
                new TrainDTO(8, "Superfast Express", "Delhi", "Jaipur", 600, "05:45", "10:30", "Chair"),
                new TrainDTO(9, "Passenger Train", "Coimbatore", "Erode", 60, "07:45", "09:30", "General"),
                new TrainDTO(10, "Metro Express", "Kolkata", "Howrah", 50, "07:00", "07:20", "Metro"),
                new TrainDTO(11, "Mail Express", "Hyderabad", "Chennai", 900, "11:00", "18:00", "Sleeper"),
                new TrainDTO(12, "Humsafar Express", "Delhi", "Patna", 1500, "14:00", "03:00", "3AC"),
                new TrainDTO(13, "Tejas Express", "Ahmedabad", "Mumbai", 2100, "06:40", "13:00", "Executive"),
                new TrainDTO(14, "Vande Bharat", "Mumbai", "Shirdi", 900, "16:00", "19:00", "AC Chair"),
                new TrainDTO(15, "Uday Express", "Coimbatore", "Bangalore", 1150, "05:45", "11:45", "Double Deck")
        );

        return trainDTOS;
    }

    @Bean
    public List<FlightDTO> getFlights() {

        List<FlightDTO> flightDTOS = new ArrayList<>();

        Collections.addAll(flightDTOS,
                new FlightDTO(1, "Indigo", "Bangalore", "Delhi", 5500, "06:00", "08:30", "Economy"),
                new FlightDTO(2, "Air India", "Mumbai", "Chennai", 6200, "09:00", "11:10", "Economy"),
                new FlightDTO(3, "Vistara", "Delhi", "Goa", 7000, "14:00", "16:20", "Premium"),
                new FlightDTO(4, "SpiceJet", "Pune", "Kolkata", 8500, "07:15", "11:30", "Economy"),
                new FlightDTO(5, "Akasa Air", "Hyderabad", "Mumbai", 5400, "12:00", "13:30", "Economy"),
                new FlightDTO(6, "AirAsia", "Bangalore", "Jaipur", 9000, "08:00", "10:45", "Premium"),
                new FlightDTO(7, "Indigo", "Chennai", "Kochi", 3500, "06:50", "07:50", "Economy"),
                new FlightDTO(8, "Vistara", "Delhi", "Dubai", 22000, "18:00", "20:30", "Business"),
                new FlightDTO(9, "Air India", "Mumbai", "London", 55000, "01:00", "10:00", "Business"),
                new FlightDTO(10, "SpiceJet", "Kolkata", "Assam", 4500, "16:00", "17:50", "Economy"),
                new FlightDTO(11, "Indigo", "Bangalore", "Pune", 3000, "10:00", "11:15", "Economy"),
                new FlightDTO(12, "AirAsia", "Delhi", "Bangkok", 18000, "02:00", "06:30", "Premium"),
                new FlightDTO(13, "Emirates", "Chennai", "Dubai", 26000, "20:00", "22:20", "Business"),
                new FlightDTO(14, "Vistara", "Mumbai", "Delhi", 7200, "17:00", "19:20", "Premium"),
                new FlightDTO(15, "SpiceJet", "Delhi", "Lucknow", 3200, "15:00", "16:00", "Economy")
        );

        return flightDTOS;
    }
    @Bean
    public List<SchoolDTO> getSchools() {

        List<SchoolDTO> schoolDTOS = new ArrayList<>();

        Collections.addAll(schoolDTOS,
                new SchoolDTO(1, "National Public School", "Bangalore", "CBSE", 3000, 150, "Ramesh Rao", "1980"),
                new SchoolDTO(2, "Delhi Public School", "Delhi", "CBSE", 3500, 180, "Sushma Malhotra", "1972"),
                new SchoolDTO(3, "Kendriya Vidyalaya", "Mumbai", "CBSE", 2500, 120, "Rajesh Kumar", "1965"),
                new SchoolDTO(4, "Greenwood High", "Bangalore", "ICSE", 2200, 130, "Sunitha Rani", "2004"),
                new SchoolDTO(5, "Ryan International", "Chennai", "CBSE", 2800, 140, "Vijay Kumar", "1985"),
                new SchoolDTO(6, "Vidya Mandir", "Chennai", "State", 2000, 110, "Lakshmi Devi", "1970"),
                new SchoolDTO(7, "Sophia High School", "Bangalore", "ICSE", 1800, 100, "Mary Joseph", "1950"),
                new SchoolDTO(8, "Mount Carmel", "Hyderabad", "State", 2300, 125, "Anita Reddy", "1988"),
                new SchoolDTO(9, "St. Joseph's School", "Pune", "ICSE", 1600, 90, "John Francis", "1960"),
                new SchoolDTO(10, "Orchid International", "Mumbai", "CBSE", 2700, 135, "Arun Rao", "2002"),
                new SchoolDTO(11, "Army Public School", "Delhi", "CBSE", 2600, 150, "Kiran Singh", "1975"),
                new SchoolDTO(12, "Sacred Heart School", "Goa", "State", 1400, 80, "Joseph Fernandes", "1945"),
                new SchoolDTO(13, "Cambridge School", "Bangalore", "ICSE", 2100, 115, "Meena Shetty", "1998"),
                new SchoolDTO(14, "Euro School", "Hyderabad", "CBSE", 2400, 130, "Prakash Rao", "2005"),
                new SchoolDTO(15, "Sainik School", "Kerala", "CBSE", 1900, 100, "Narayanan", "1962")
        );

        return schoolDTOS;
    }

    @Bean
            public List<HotelDTO> getHotels() {
        List<HotelDTO> hotels = new ArrayList<>();

        Collections.addAll(hotels,
                new HotelDTO(1, "Taj Hotel", "Mumbai", 200, 4.9, 15000, "12:00 PM", "11:00 AM"),
                new HotelDTO(2, "Oberoi Palace", "Delhi", 180, 4.8, 12000, "1:00 PM", "12:00 PM"),
                new HotelDTO(3, "Leela Palace", "Bangalore", 250, 4.7, 10000, "2:00 PM", "12:00 PM"),
                new HotelDTO(4, "Sea View Resort", "Goa", 120, 4.6, 8000, "11:00 AM", "10:00 AM"),
                new HotelDTO(5, "Grand Hyatt", "Chennai", 300, 4.5, 9000, "12:30 PM", "11:30 AM"),
                new HotelDTO(6, "ITC Gardenia", "Bangalore", 220, 4.6, 11000, "1:00 PM", "11:00 AM"),
                new HotelDTO(7, "The Park", "Hyderabad", 160, 4.3, 7500, "12:00 PM", "10:00 AM"),
                new HotelDTO(8, "Novotel", "Pune", 190, 4.4, 7000, "2:00 PM", "12:00 PM"),
                new HotelDTO(9, "Radisson Blu", "Mysore", 210, 4.5, 8500, "12:00 PM", "11:00 AM"),
                new HotelDTO(10, "Lemon Tree", "Coimbatore", 140, 4.1, 6000, "11:00 AM", "10:00 AM"),
                new HotelDTO(11, "JW Marriott", "Kolkata", 260, 4.7, 13000, "1:30 PM", "12:00 PM"),
                new HotelDTO(12, "Holiday Inn", "Ahmedabad", 180, 4.2, 6500, "12:00 PM", "11:00 AM"),
                new HotelDTO(13, "Vivanta", "Mangalore", 170, 4.3, 7200, "12:30 PM", "10:30 AM"),
                new HotelDTO(14, "Trident Hotel", "Jaipur", 240, 4.6, 9000, "1:00 PM", "11:00 AM"),
                new HotelDTO(15, "Royal Orchid", "Bangalore", 230, 4.5, 9500, "12:00 PM", "11:00 AM")
        );
        return hotels;
    }
        @Bean
                public List<PatientDTO> getPatients() {
            List<PatientDTO> patients = new ArrayList<>();

            Collections.addAll(patients,
                    new PatientDTO(101, "Rahul", 32, "Fever", "Dr. Sharma", "2024-01-05", "2024-01-08", 4500),
                    new PatientDTO(102, "Sneha", 45, "Diabetes", "Dr. Verma", "2024-02-10", "2024-02-18", 12000),
                    new PatientDTO(103, "Arjun", 28, "Fracture", "Dr. Reddy", "2024-03-02", "2024-03-12", 35000),
                    new PatientDTO(104, "Meera", 50, "Asthma", "Dr. Khan", "2024-04-15", "2024-04-20", 8000),
                    new PatientDTO(105, "Vikas", 60, "Heart Attack", "Dr. Jain", "2024-05-01", "2024-05-15", 120000),
                    new PatientDTO(106, "Anita", 34, "Thyroid", "Dr. Rao", "2024-06-10", "2024-06-12", 5000),
                    new PatientDTO(107, "Rohit", 29, "Migraine", "Dr. Gupta", "2024-07-05", "2024-07-07", 3000),
                    new PatientDTO(108, "Pooja", 41, "Arthritis", "Dr. Menon", "2024-08-01", "2024-08-10", 15000),
                    new PatientDTO(109, "Mahesh", 55, "Kidney Stone", "Dr. Shetty", "2024-09-12", "2024-09-18", 25000),
                    new PatientDTO(110, "Lakshmi", 62, "Pneumonia", "Dr. Nair", "2024-10-22", "2024-10-30", 40000),
                    new PatientDTO(111, "Kiran", 47, "BP Issue", "Dr. Joshi", "2024-11-03", "2024-11-05", 6000),
                    new PatientDTO(112, "Divya", 30, "Dengue", "Dr. Thomas", "2024-12-10", "2024-12-18", 20000),
                    new PatientDTO(113, "Suresh", 53, "Stroke", "Dr. Sundar", "2024-01-20", "2024-02-04", 85000),
                    new PatientDTO(114, "Sandhya", 38, "Skin Allergy", "Dr. Rao", "2024-03-11", "2024-03-14", 3500),
                    new PatientDTO(115, "Harish", 26, "Food Poisoning", "Dr. Kumar", "2024-04-05", "2024-04-07", 2500)
            );
            return patients;
        }

        @Bean
    public List<RestaurantDTO> getRestaurants(){
            List<RestaurantDTO> restaurants = new ArrayList<>();

            Collections.addAll(restaurants,
                    new RestaurantDTO(1, "Barbeque Nation", "Multi-Cuisine", "Bangalore", 4.5, 120, "12:00 PM", "11:00 PM"),
                    new RestaurantDTO(2, "Paradise Biryani", "Non-Veg", "Hyderabad", 4.7, 150, "11:00 AM", "12:00 AM"),
                    new RestaurantDTO(3, "Sagar Ratna", "Veg", "Delhi", 4.3, 200, "8:00 AM", "10:00 PM"),
                    new RestaurantDTO(4, "KFC", "Fast Food", "Mumbai", 4.2, 90, "10:00 AM", "11:00 PM"),
                    new RestaurantDTO(5, "Dominos", "Fast Food", "Chennai", 4.1, 80, "10:00 AM", "11:30 PM"),
                    new RestaurantDTO(6, "Tandoori Nights", "North Indian", "Pune", 4.4, 110, "12:00 PM", "11:00 PM"),
                    new RestaurantDTO(7, "Udupi Upahar", "Veg", "Mangalore", 4.6, 100, "7:00 AM", "10:00 PM"),
                    new RestaurantDTO(8, "Pizza Hut", "Fast Food", "Bangalore", 4.0, 95, "10:30 AM", "11:00 PM"),
                    new RestaurantDTO(9, "A2B", "Veg", "Coimbatore", 4.3, 180, "7:30 AM", "10:30 PM"),
                    new RestaurantDTO(10, "Meghana Foods", "Biryani", "Bangalore", 4.6, 130, "11:00 AM", "11:00 PM"),
                    new RestaurantDTO(11, "Empire", "Non-Veg", "Mysore", 4.2, 140, "11:00 AM", "12:00 AM"),
                    new RestaurantDTO(12, "Beijing Bites", "Chinese", "Bangalore", 4.1, 110, "12:00 PM", "11:00 PM"),
                    new RestaurantDTO(13, "Haldi Ram's", "Snacks", "Nagpur", 4.4, 160, "9:00 AM", "10:00 PM"),
                    new RestaurantDTO(14, "Biriyani House", "Non-Veg", "Chennai", 4.3, 120, "11:00 AM", "11:30 PM"),
                    new RestaurantDTO(15, "The Coffee Bar", "Cafe", "Delhi", 4.5, 90, "9:00 AM", "10:00 PM")
            );

            return restaurants;
        }



        @Bean
    public List<ApartmentDTO> getApartments(){
            List<ApartmentDTO> apartments = new ArrayList<>();

            Collections.addAll(apartments,
                    new ApartmentDTO(1, "Sunshine Residency", "Bangalore", 10, 100, 5000000, true, "ABC Builders"),
                    new ApartmentDTO(2, "Greenwood Apartments", "Mumbai", 15, 150, 7500000, true, "XYZ Constructions"),
                    new ApartmentDTO(3, "Silver Oak", "Delhi", 12, 120, 6500000, true, "LMN Developers"),
                    new ApartmentDTO(4, "Blue Horizon", "Chennai", 8, 80, 4500000, false, "PQR Builders"),
                    new ApartmentDTO(5, "Skyline Residency", "Pune", 20, 200, 9000000, true, "Sun Builders"),
                    new ApartmentDTO(6, "Palm Grove", "Hyderabad", 18, 180, 8500000, true, "Urban Developers"),
                    new ApartmentDTO(7, "Lotus Apartments", "Kolkata", 14, 140, 7000000, false, "Metro Builders"),
                    new ApartmentDTO(8, "Emerald Heights", "Bangalore", 16, 160, 9500000, true, "Green Homes"),
                    new ApartmentDTO(9, "Crystal Residency", "Mumbai", 12, 120, 6000000, true, "City Builders"),
                    new ApartmentDTO(10, "Royal Park", "Delhi", 10, 100, 5500000, false, "Capital Builders"),
                    new ApartmentDTO(11, "Maple Residency", "Chennai", 9, 90, 4800000, true, "Urban Developers"),
                    new ApartmentDTO(12, "Orchid Heights", "Pune", 13, 130, 7200000, true, "Sunshine Builders"),
                    new ApartmentDTO(13, "Magnolia Apartments", "Hyderabad", 11, 110, 5800000, false, "Metro Builders"),
                    new ApartmentDTO(14, "Cedar Residency", "Kolkata", 15, 150, 8000000, true, "XYZ Constructions"),
                    new ApartmentDTO(15, "Rosewood Towers", "Bangalore", 17, 170, 8800000, true, "LMN Developers")
            );

            return apartments;
        }

        @Bean
    public List<InsuranceDTO> getInsurances(){
            List<InsuranceDTO> insurances = new ArrayList<>();

            Collections.addAll(insurances,
                    new InsuranceDTO(101, "Life Secure", "Life", "Rahul", 50000, 20, "2020-01-01", "2040-01-01"),
                    new InsuranceDTO(102, "Health Protect", "Health", "Sneha", 30000, 10, "2021-03-15", "2031-03-15"),
                    new InsuranceDTO(103, "Car Shield", "Vehicle", "Arjun", 20000, 5, "2019-06-01", "2024-06-01"),
                    new InsuranceDTO(104, "Home Guard", "Property", "Meera", 40000, 15, "2022-02-10", "2037-02-10"),
                    new InsuranceDTO(105, "Travel Safe", "Travel", "Vikas", 15000, 2, "2023-05-01", "2025-05-01"),
                    new InsuranceDTO(106, "Life Plus", "Life", "Anita", 60000, 25, "2020-07-10", "2045-07-10"),
                    new InsuranceDTO(107, "Health Max", "Health", "Rohit", 35000, 12, "2021-09-20", "2033-09-20"),
                    new InsuranceDTO(108, "Bike Secure", "Vehicle", "Lakshmi", 10000, 3, "2022-01-01", "2025-01-01"),
                    new InsuranceDTO(109, "Property Plus", "Property", "Karan", 45000, 18, "2019-11-10", "2037-11-10"),
                    new InsuranceDTO(110, "Travel Elite", "Travel", "Shruti", 20000, 4, "2023-03-01", "2027-03-01"),
                    new InsuranceDTO(111, "Life Shield", "Life", "Pooja", 55000, 22, "2020-12-01", "2042-12-01"),
                    new InsuranceDTO(112, "Health Guard", "Health", "Harish", 25000, 8, "2021-08-15", "2029-08-15"),
                    new InsuranceDTO(113, "Car Protect", "Vehicle", "Suresh", 18000, 6, "2019-05-10", "2025-05-10"),
                    new InsuranceDTO(114, "Home Elite", "Property", "Divya", 48000, 20, "2022-10-01", "2042-10-01"),
                    new InsuranceDTO(115, "Travel Max", "Travel", "Nithin", 22000, 3, "2023-06-15", "2026-06-15")
            );

            return insurances;
        }

        @Bean
    public List<CourseDTO> getCourses(){
            List<CourseDTO> courses = new ArrayList<>();

            Collections.addAll(courses,
                    new CourseDTO(1, "Java Programming", "IT", 60, 15000, "Rahul Sharma", "2025-01-10", "2025-03-10"),
                    new CourseDTO(2, "Python Basics", "IT", 50, 12000, "Sneha Verma", "2025-02-01", "2025-03-25"),
                    new CourseDTO(3, "Data Science", "IT", 80, 25000, "Arjun Reddy", "2025-01-20", "2025-04-20"),
                    new CourseDTO(4, "Digital Marketing", "Marketing", 40, 10000, "Meera Singh", "2025-03-05", "2025-04-10"),
                    new CourseDTO(5, "Graphic Design", "Design", 45, 12000, "Vikas Kumar", "2025-01-15", "2025-02-28"),
                    new CourseDTO(6, "UI/UX Design", "Design", 50, 15000, "Anita Rao", "2025-02-10", "2025-03-30"),
                    new CourseDTO(7, "Blockchain Basics", "IT", 60, 18000, "Rohit Jain", "2025-03-01", "2025-05-01"),
                    new CourseDTO(8, "AWS Cloud", "IT", 70, 20000, "Lakshmi Nair", "2025-01-25", "2025-04-05"),
                    new CourseDTO(9, "Photography", "Arts", 35, 8000, "Karan Mehta", "2025-02-20", "2025-03-25"),
                    new CourseDTO(10, "Music Production", "Arts", 40, 10000, "Shruti Desai", "2025-03-10", "2025-04-15"),
                    new CourseDTO(11, "Excel Advanced", "Business", 25, 5000, "Pooja Sharma", "2025-01-05", "2025-01-30"),
                    new CourseDTO(12, "Leadership Skills", "Management", 30, 6000, "Harish Reddy", "2025-02-05", "2025-02-28"),
                    new CourseDTO(13, "Project Management", "Management", 50, 15000, "Suresh Kumar", "2025-01-15", "2025-03-10"),
                    new CourseDTO(14, "Python for AI", "IT", 60, 22000, "Divya Menon", "2025-03-01", "2025-05-01"),
                    new CourseDTO(15, "Interior Design", "Design", 45, 12000, "Nithin R", "2025-02-15", "2025-03-30")
            );

            return courses;
        }

@Bean
    public List<DeliveryDTO> getDeliveries(){

    List<DeliveryDTO> deliveries = new ArrayList<>();

    Collections.addAll(deliveries,
            new DeliveryDTO(1, "Rahul", "MG Road 12", "Bangalore", "2025-01-10", "Delivered", 2.5, 500),
            new DeliveryDTO(2, "Sneha", "Brigade Road 45", "Bangalore", "2025-01-12", "In Transit", 1.2, 200),
            new DeliveryDTO(3, "Arjun", "Park Street 7", "Kolkata", "2025-01-15", "Delivered", 3.0, 600),
            new DeliveryDTO(4, "Meera", "Connaught Place 20", "Delhi", "2025-01-18", "Cancelled", 2.0, 400),
            new DeliveryDTO(5, "Vikas", "Jayanagar 5", "Bangalore", "2025-01-20", "Delivered", 4.5, 800),
            new DeliveryDTO(6, "Anita", "HSR Layout 10", "Bangalore", "2025-01-22", "In Transit", 1.5, 300),
            new DeliveryDTO(7, "Rohit", "BTM Layout 8", "Bangalore", "2025-01-25", "Delivered", 2.8, 550),
            new DeliveryDTO(8, "Lakshmi", "Whitefield 12", "Bangalore", "2025-01-28", "Delivered", 3.2, 650),
            new DeliveryDTO(9, "Karan", "MG Road 34", "Bangalore", "2025-02-01", "In Transit", 2.0, 400),
            new DeliveryDTO(10, "Shruti", "Brigade Road 18", "Bangalore", "2025-02-03", "Delivered", 1.8, 350),
            new DeliveryDTO(11, "Pooja", "Park Street 22", "Kolkata", "2025-02-05", "Cancelled", 2.5, 500),
            new DeliveryDTO(12, "Harish", "Jayanagar 9", "Bangalore", "2025-02-07", "Delivered", 4.0, 750),
            new DeliveryDTO(13, "Suresh", "Connaught Place 15", "Delhi", "2025-02-10", "Delivered", 3.5, 700),
            new DeliveryDTO(14, "Divya", "HSR Layout 20", "Bangalore", "2025-02-12", "In Transit", 1.0, 150),
            new DeliveryDTO(15, "Nithin", "BTM Layout 11", "Bangalore", "2025-02-15", "Delivered", 2.2, 450)
    );
return deliveries;
}

@Bean
    public List<GameDTO> getGames(){
    List<GameDTO> games = new ArrayList<>();

    Collections.addAll(games,
            new GameDTO(1, "FIFA 23", "Sports", "PC", 3500, "EA Sports", "2022-09-27", 4.5),
            new GameDTO(2, "Call of Duty", "FPS", "PC", 4500, "Activision", "2022-11-10", 4.7),
            new GameDTO(3, "Minecraft", "Adventure", "PC", 1500, "Mojang", "2011-11-18", 4.8),
            new GameDTO(4, "God of War", "Action", "PS5", 4000, "Santa Monica", "2018-04-20", 4.9),
            new GameDTO(5, "Cyberpunk 2077", "RPG", "PC", 5000, "CD Projekt", "2020-12-10", 4.2),
            new GameDTO(6, "Among Us", "Casual", "PC", 500, "Innersloth", "2018-06-15", 4.4),
            new GameDTO(7, "Valorant", "FPS", "PC", 0, "Riot Games", "2020-06-02", 4.6),
            new GameDTO(8, "Fortnite", "Battle Royale", "PC", 0, "Epic Games", "2017-07-25", 4.5),
            new GameDTO(9, "The Witcher 3", "RPG", "PC", 3500, "CD Projekt", "2015-05-19", 4.9),
            new GameDTO(10, "League of Legends", "MOBA", "PC", 0, "Riot Games", "2009-10-27", 4.7),
            new GameDTO(11, "GTA V", "Action", "PC", 3000, "Rockstar", "2013-09-17", 4.8),
            new GameDTO(12, "Red Dead Redemption 2", "Action", "PS4", 5000, "Rockstar", "2018-10-26", 4.9),
            new GameDTO(13, "Assassin's Creed Valhalla", "Action", "PS5", 4000, "Ubisoft", "2020-11-10", 4.6),
            new GameDTO(14, "Elden Ring", "RPG", "PC", 5000, "FromSoftware", "2022-02-25", 4.9),
            new GameDTO(15, "Horizon Forbidden West", "Action", "PS5", 4500, "Guerrilla Games", "2022-02-18", 4.8)
    );

    return games;
}

@Bean
    public List<FestivalDTO> getFestivals(){
    List<FestivalDTO> festivals = new ArrayList<>();

    Collections.addAll(festivals,
            new FestivalDTO(1, "Diwali", "Religious", "October", 5, "India", true, 2000),
            new FestivalDTO(2, "Holi", "Religious", "March", 2, "India", true, 1500),
            new FestivalDTO(3, "Christmas", "Religious", "December", 3, "Worldwide", true, 3000),
            new FestivalDTO(4, "Eid", "Religious", "May", 2, "Worldwide", true, 2500),
            new FestivalDTO(5, "New Year", "Cultural", "January", 1, "Worldwide", true, 2000),
            new FestivalDTO(6, "Thanksgiving", "Cultural", "November", 1, "USA", true, 1800),
            new FestivalDTO(7, "Lohri", "Religious", "January", 1, "India", false, 1000),
            new FestivalDTO(8, "Ganesh Chaturthi", "Religious", "September", 10, "India", true, 2500),
            new FestivalDTO(9, "Onam", "Cultural", "August", 10, "India", true, 2200),
            new FestivalDTO(10, "Makar Sankranti", "Religious", "January", 1, "India", false, 1200),
            new FestivalDTO(11, "Baisakhi", "Cultural", "April", 1, "India", false, 1500),
            new FestivalDTO(12, "Hanukkah", "Religious", "December", 8, "Israel", true, 2000),
            new FestivalDTO(13, "Ram Navami", "Religious", "April", 1, "India", false, 1000),
            new FestivalDTO(14, "Navratri", "Religious", "October", 9, "India", true, 1800),
            new FestivalDTO(15, "Easter", "Religious", "April", 1, "Worldwide", true, 2000)
    );

        return festivals;
}


@Bean
    public List<GymDTO> getGyms(){
    List<GymDTO> gyms = new ArrayList<>();

    Collections.addAll(gyms,
            new GymDTO(1, "Gold's Gym", "Bangalore", 10, 200, true, true, 3000),
            new GymDTO(2, "Talwalkars", "Mumbai", 8, 150, false, true, 2500),
            new GymDTO(3, "Fitness First", "Delhi", 12, 250, true, false, 3200),
            new GymDTO(4, "Snap Fitness", "Chennai", 6, 120, false, false, 2000),
            new GymDTO(5, "Anytime Fitness", "Pune", 7, 130, true, true, 2800),
            new GymDTO(6, "Power World", "Hyderabad", 9, 180, true, true, 3100),
            new GymDTO(7, "Cult Fit", "Bangalore", 15, 300, true, true, 3500),
            new GymDTO(8, "Bodycraft", "Kolkata", 5, 100, false, false, 1800),
            new GymDTO(9, "Gold's Gym Elite", "Bangalore", 12, 220, true, true, 4000),
            new GymDTO(10, "Talwalkars Pro", "Mumbai", 10, 200, true, false, 3200),
            new GymDTO(11, "Fitness Hub", "Delhi", 8, 160, false, true, 2700),
            new GymDTO(12, "Iron Gym", "Chennai", 6, 120, false, false, 2100),
            new GymDTO(13, "Muscle Factory", "Pune", 7, 140, true, true, 2900),
            new GymDTO(14, "Fit Squad", "Hyderabad", 9, 180, true, false, 3000),
            new GymDTO(15, "Health Hub", "Kolkata", 5, 110, false, true, 2200)
    );

    return gyms;
}

@Bean
    public List<BagDTO> getBags(){
    List<BagDTO> bags = new ArrayList<>();
    Collections.addAll(bags,
            new BagDTO(1, "Nike", "Backpack", "Black", 2500, 25, true, "Polyester"),
            new BagDTO(2, "Adidas", "Sports Bag", "Blue", 1800, 30, true, "Nylon"),
            new BagDTO(3, "Puma", "Tote Bag", "Red", 1500, 15, false, "Canvas"),
            new BagDTO(4, "Wildcraft", "Hiking Bag", "Green", 3000, 35, true, "Polyester"),
            new BagDTO(5, "Reebok", "Gym Bag", "Black", 2200, 28, true, "Nylon"),
            new BagDTO(6, "Louis Vuitton", "Handbag", "Brown", 25000, 10, false, "Leather"),
            new BagDTO(7, "Gucci", "Clutch", "Beige", 18000, 5, false, "Leather"),
            new BagDTO(8, "Herschel", "Backpack", "Grey", 3200, 27, true, "Polyester"),
            new BagDTO(9, "Fossil", "Messenger Bag", "Tan", 5500, 20, false, "Leather"),
            new BagDTO(10, "Tommy Hilfiger", "Shoulder Bag", "Blue", 6000, 18, false, "Canvas"),
            new BagDTO(11, "Wildcraft", "Duffel Bag", "Black", 4000, 32, true, "Polyester"),
            new BagDTO(12, "Nike", "Laptop Bag", "Grey", 3500, 22, true, "Nylon"),
            new BagDTO(13, "Adidas", "Sling Bag", "Red", 2000, 12, true, "Polyester"),
            new BagDTO(14, "Puma", "Travel Bag", "Blue", 4500, 40, true, "Nylon"),
            new BagDTO(15, "Reebok", "Crossbody Bag", "Black", 1800, 10, false, "Canvas")
    );
return bags;
}

@Bean
    public List<ParkDTO> getParks(){
    List<ParkDTO> parks = new ArrayList<>();
    Collections.addAll(parks,
            new ParkDTO(1, "Lalbagh Botanical Garden", "Bangalore", 240, true, "06:00", "19:00", 2000),
            new ParkDTO(2, "Cubbon Park", "Bangalore", 300, false, "05:00", "20:00", 2500),
            new ParkDTO(3, "Jantar Mantar Park", "Delhi", 50, true, "06:00", "18:00", 1500),
            new ParkDTO(4, "Marine Drive Park", "Mumbai", 100, false, "05:30", "21:00", 1800),
            new ParkDTO(5, "Victoria Memorial Garden", "Kolkata", 200, true, "06:30", "18:30", 2200),
            new ParkDTO(6, "Nehru Park", "Delhi", 60, true, "06:00", "19:00", 1200),
            new ParkDTO(7, "Eco Park", "Kolkata", 480, true, "06:00", "20:00", 3000),
            new ParkDTO(8, "Freedom Park", "Bangalore", 90, false, "05:00", "19:00", 1400),
            new ParkDTO(9, "Hanging Gardens", "Mumbai", 75, false, "06:00", "19:00", 1600),
            new ParkDTO(10, "Khan Market Park", "Delhi", 30, false, "06:30", "18:00", 800),
            new ParkDTO(11, "Garden of Five Senses", "Delhi", 20, true, "06:00", "19:00", 1000),
            new ParkDTO(12, "ISKCON Park", "Bangalore", 35, true, "05:30", "20:00", 1300),
            new ParkDTO(13, "Jogger's Park", "Mumbai", 25, false, "05:30", "21:00", 900),
            new ParkDTO(14, "Rajiv Gandhi Park", "Hyderabad", 150, true, "06:00", "19:30", 1100),
            new ParkDTO(15, "Cubbon Park Extension", "Bangalore", 180, false, "05:00", "20:00", 1700)
    );

    return parks;
}

@Bean
    public List<SandalDTO> getSandals(){
    List<SandalDTO> sandals = new ArrayList<>();
    Collections.addAll(sandals,
            new SandalDTO(1, "Bata", "Casual", "Black", 8, 1200, true, "Leather"),
            new SandalDTO(2, "Nike", "Sports", "Blue", 9, 1500, false, "Synthetic"),
            new SandalDTO(3, "Adidas", "Flip Flop", "Red", 7, 800, false, "Rubber"),
            new SandalDTO(4, "Puma", "Casual", "White", 8, 1300, true, "Leather"),
            new SandalDTO(5, "Reebok", "Sports", "Grey", 10, 1600, false, "Synthetic"),
            new SandalDTO(6, "Hush Puppies", "Formal", "Brown", 9, 2500, true, "Leather"),
            new SandalDTO(7, "Liberty", "Casual", "Black", 7, 900, false, "Synthetic"),
            new SandalDTO(8, "Woodland", "Hiking", "Green", 10, 2200, true, "Leather"),
            new SandalDTO(9, "Skechers", "Sports", "Blue", 9, 1400, false, "Synthetic"),
            new SandalDTO(10, "Clarks", "Formal", "Brown", 8, 2300, true, "Leather"),
            new SandalDTO(11, "Metro", "Casual", "White", 7, 1000, false, "Synthetic"),
            new SandalDTO(12, "Nike", "Flip Flop", "Red", 8, 850, false, "Rubber"),
            new SandalDTO(13, "Adidas", "Casual", "Black", 9, 1300, true, "Leather"),
            new SandalDTO(14, "Reebok", "Sports", "Green", 10, 1550, false, "Synthetic"),
            new SandalDTO(15, "Puma", "Casual", "Grey", 8, 1250, true, "Leather")
    );

    return sandals ;
}

@Bean
    public List<NovelDTO> getNovels(){
    List<NovelDTO> novels = new ArrayList<>();
    Collections.addAll(novels,
            new NovelDTO(1, "The Alchemist", "Paulo Coelho", "Fiction", 160, 299, "English", "HarperOne"),
            new NovelDTO(2, "1984", "George Orwell", "Dystopian", 328, 399, "English", "Secker & Warburg"),
            new NovelDTO(3, "Pride and Prejudice", "Jane Austen", "Romance", 279, 350, "English", "T. Egerton"),
            new NovelDTO(4, "To Kill a Mockingbird", "Harper Lee", "Fiction", 281, 320, "English", "J.B. Lippincott & Co."),
            new NovelDTO(5, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 180, 280, "English", "Scribner"),
            new NovelDTO(6, "Malgudi Days", "R.K. Narayan", "Short Stories", 180, 250, "English", "Indian Thought Publications"),
            new NovelDTO(7, "War and Peace", "Leo Tolstoy", "Historical", 1225, 900, "Russian", "The Russian Messenger"),
            new NovelDTO(8, "Crime and Punishment", "Fyodor Dostoevsky", "Crime", 671, 550, "Russian", "The Russian Messenger"),
            new NovelDTO(9, "The Kite Runner", "Khaled Hosseini", "Fiction", 371, 400, "English", "Riverhead Books"),
            new NovelDTO(10, "Harry Potter", "J.K. Rowling", "Fantasy", 500, 600, "English", "Bloomsbury"),
            new NovelDTO(11, "The Hobbit", "J.R.R. Tolkien", "Fantasy", 310, 450, "English", "George Allen & Unwin"),
            new NovelDTO(12, "Anna Karenina", "Leo Tolstoy", "Romance", 864, 700, "Russian", "The Russian Messenger"),
            new NovelDTO(13, "Les Misérables", "Victor Hugo", "Historical", 1463, 1000, "French", "A. Lacroix"),
            new NovelDTO(14, "The Da Vinci Code", "Dan Brown", "Thriller", 489, 500, "English", "Doubleday"),
            new NovelDTO(15, "The Catcher in the Rye", "J.D. Salinger", "Fiction", 214, 350, "English", "Little, Brown and Company")
    );

    return novels;
}

@Bean
    public  List<SocialMediaDTO> getSocialMedia(){
    List<SocialMediaDTO> socialMediaList = new ArrayList<>();
    Collections.addAll(socialMediaList,
            new SocialMediaDTO(1, "Facebook", "Networking", 2800, 2004, true, "Mark Zuckerberg", "Menlo Park, USA"),
            new SocialMediaDTO(2, "Instagram", "Photo Sharing", 2000, 2010, true, "Kevin Systrom", "Menlo Park, USA"),
            new SocialMediaDTO(3, "Twitter", "Microblogging", 450, 2006, true, "Jack Dorsey", "San Francisco, USA"),
            new SocialMediaDTO(4, "LinkedIn", "Professional", 900, 2003, true, "Reid Hoffman", "Sunnyvale, USA"),
            new SocialMediaDTO(5, "Snapchat", "Messaging", 600, 2011, true, "Evan Spiegel", "Santa Monica, USA"),
            new SocialMediaDTO(6, "TikTok", "Video Sharing", 1500, 2016, true, "Zhang Yiming", "Beijing, China"),
            new SocialMediaDTO(7, "Pinterest", "Photo Sharing", 450, 2010, true, "Ben Silbermann", "San Francisco, USA"),
            new SocialMediaDTO(8, "Reddit", "Forum", 430, 2005, true, "Steve Huffman", "San Francisco, USA"),
            new SocialMediaDTO(9, "YouTube", "Video Sharing", 2500, 2005, true, "Chad Hurley", "San Bruno, USA"),
            new SocialMediaDTO(10, "WhatsApp", "Messaging", 2300, 2009, true, "Jan Koum", "Menlo Park, USA"),
            new SocialMediaDTO(11, "WeChat", "Messaging", 1300, 2011, true, "Allen Zhang", "Shenzhen, China"),
            new SocialMediaDTO(12, "Telegram", "Messaging", 800, 2013, true, "Pavel Durov", "Dubai, UAE"),
            new SocialMediaDTO(13, "Quora", "Q&A", 300, 2009, true, "Adam D'Angelo", "Mountain View, USA"),
            new SocialMediaDTO(14, "Discord", "Chat", 350, 2015, true, "Jason Citron", "San Francisco, USA"),
            new SocialMediaDTO(15, "Snapchat Spotlight", "Video Sharing", 200, 2011, true, "Evan Spiegel", "Santa Monica, USA")
    );

    return socialMediaList;
}

@Bean
    public List<RadioDTO> getRadios(){
    List<RadioDTO> radios = new ArrayList<>();
    Collections.addAll(radios,
            new RadioDTO(1, "Sony", "Portable", true, 101.2, true, 2500, "Black"),
            new RadioDTO(2, "Philips", "Tabletop", true, 102.5, false, 1800, "Grey"),
            new RadioDTO(3, "Panasonic", "Digital", true, 98.7, true, 2200, "White"),
            new RadioDTO(4, "Saregama", "Retro", false, 90.5, false, 1500, "Brown"),
            new RadioDTO(5, "BPL", "Portable", false, 100.1, false, 1200, "Black"),
            new RadioDTO(6, "iBall", "Tabletop", true, 95.3, true, 2000, "Blue"),
            new RadioDTO(7, "JBL", "Digital", true, 103.8, true, 2800, "Red"),
            new RadioDTO(8, "Fender", "Retro", false, 92.2, false, 2500, "Wooden"),
            new RadioDTO(9, "Sony", "Tabletop", true, 104.4, true, 2300, "Grey"),
            new RadioDTO(10, "Philips", "Portable", true, 99.9, true, 1900, "White"),
            new RadioDTO(11, "Panasonic", "Retro", false, 101.5, false, 1600, "Brown"),
            new RadioDTO(12, "Saregama", "Digital", true, 97.3, true, 2100, "Black"),
            new RadioDTO(13, "BPL", "Tabletop", false, 103.1, false, 1700, "Blue"),
            new RadioDTO(14, "iBall", "Portable", true, 105.7, true, 2200, "Red"),
            new RadioDTO(15, "JBL", "Digital", true, 102.9, true, 3000, "Black")
    );

    return radios;
}
@Bean
    public List<WatchDTO> getWatches(){
    List<WatchDTO> watches = new ArrayList<>();
    Collections.addAll(watches,
            new WatchDTO(1, "Fossil", "Analog", "Black", true, true, 5000, "Leather"),
            new WatchDTO(2, "Casio", "Digital", "Blue", true, false, 3500, "Plastic"),
            new WatchDTO(3, "Titan", "Analog", "Brown", true, true, 6000, "Leather"),
            new WatchDTO(4, "Rolex", "Analog", "Gold", true, true, 250000, "Metal"),
            new WatchDTO(5, "Seiko", "Digital", "Black", true, false, 8000, "Metal"),
            new WatchDTO(6, "Timex", "Analog", "White", false, true, 4500, "Leather"),
            new WatchDTO(7, "Michael Kors", "Analog", "Rose Gold", false, true, 15000, "Metal"),
            new WatchDTO(8, "Citizen", "Analog", "Silver", true, true, 12000, "Metal"),
            new WatchDTO(9, "Swatch", "Digital", "Red", false, false, 4000, "Plastic"),
            new WatchDTO(10, "Omega", "Analog", "Blue", true, true, 200000, "Metal"),
            new WatchDTO(11, "Casio", "Digital", "Green", true, false, 3200, "Plastic"),
            new WatchDTO(12, "Fossil", "Analog", "Brown", true, true, 5500, "Leather"),
            new WatchDTO(13, "Titan", "Analog", "Black", true, false, 6200, "Leather"),
            new WatchDTO(14, "Seiko", "Digital", "Silver", true, false, 9000, "Metal"),
            new WatchDTO(15, "Timex", "Analog", "Black", false, true, 4600, "Leather")
    );

    return watches;
}

@Bean
    public  List<BeautyProductDTO> getBeauty(){
    List<BeautyProductDTO> beautyProducts = new ArrayList<>();
    Collections.addAll(beautyProducts,
            new BeautyProductDTO(1, "Shampoo", "Dove", "Haircare", 250, 50, "2024-01-10", "2026-01-10"),
            new BeautyProductDTO(2, "Face Cream", "Nivea", "Skincare", 450, 30, "2024-03-15", "2025-12-30"),
            new BeautyProductDTO(3, "Lipstick", "Maybelline", "Cosmetics", 350, 40, "2024-02-20", "2026-02-20"),
            new BeautyProductDTO(4, "Perfume", "Fogg", "Fragrance", 1500, 20, "2024-01-05", "2029-01-05"),
            new BeautyProductDTO(5, "Soap", "Lux", "Bathing", 40, 100, "2024-04-20", "2026-04-20"),
            new BeautyProductDTO(6, "Hair Oil", "Parachute", "Haircare", 120, 60, "2024-01-18", "2026-01-18"),
            new BeautyProductDTO(7, "Toothpaste", "Colgate", "Dental", 90, 80, "2024-05-01", "2026-05-01"),
            new BeautyProductDTO(8, "Body Lotion", "Vaseline", "Skincare", 320, 40, "2024-03-28", "2026-03-28"),
            new BeautyProductDTO(9, "Lip Balm", "Nivea", "Cosmetics", 99, 70, "2024-02-15", "2026-02-15"),
            new BeautyProductDTO(10, "Face Wash", "Himalaya", "Skincare", 200, 70, "2024-01-25", "2026-01-25"),
            new BeautyProductDTO(11, "Deodorant", "Axe", "Fragrance", 150, 55, "2024-04-11", "2027-04-11"),
            new BeautyProductDTO(12, "Handwash", "Dettol", "Hygiene", 120, 85, "2024-02-19", "2026-02-19"),
            new BeautyProductDTO(13, "Talcum Powder", "Ponds", "Bodycare", 85, 65, "2024-03-30", "2027-03-30"),
            new BeautyProductDTO(14, "Face Serum", "Lakme", "Skincare", 399, 35, "2024-01-14", "2026-01-14"),
            new BeautyProductDTO(15, "Shaving Cream", "Gillette", "Men Grooming", 150, 40, "2024-05-20", "2026-05-20")
    );

    return beautyProducts;
}

@Bean
    public List<LodgeDTO> getLodge(){

    List<LodgeDTO> lodges = new ArrayList<>();
    Collections.addAll(lodges,
            new LodgeDTO(1, "Sunrise Lodge", "Bangalore", 20, 1500, true, true, "08012345678"),
            new LodgeDTO(2, "Moonlight Lodge", "Chennai", 15, 1200, false, true, "04412345678"),
            new LodgeDTO(3, "Green Valley Lodge", "Mysore", 25, 1800, true, false, "08212345678"),
            new LodgeDTO(4, "Ocean View Lodge", "Goa", 30, 2500, true, true, "08321234567"),
            new LodgeDTO(5, "Hilltop Lodge", "Ooty", 18, 2200, true, true, "04231234567"),
            new LodgeDTO(6, "City Center Lodge", "Mumbai", 40, 3000, true, true, "02212345678"),
            new LodgeDTO(7, "Budget Stay", "Pune", 10, 800, false, false, "02012345678"),
            new LodgeDTO(8, "Comfort Inn", "Hyderabad", 35, 2700, true, true, "04012345678"),
            new LodgeDTO(9, "Royal Lodge", "Jaipur", 25, 3200, true, true, "01411234567"),
            new LodgeDTO(10, "Lakeview Lodge", "Udaipur", 20, 2800, true, true, "02941234567"),
            new LodgeDTO(11, "Mountain Lodge", "Manali", 15, 2600, true, false, "01901234567"),
            new LodgeDTO(12, "Sunset Lodge", "Kochi", 18, 2000, false, true, "04841234567"),
            new LodgeDTO(13, "Garden Lodge", "Lucknow", 22, 2100, true, true, "05221234567"),
            new LodgeDTO(14, "Riverfront Lodge", "Rishikesh", 16, 2300, true, false, "01352234567"),
            new LodgeDTO(15, "Palm Lodge", "Kolkata", 30, 2900, true, true, "03312345678")
    );
return lodges;
}
}




