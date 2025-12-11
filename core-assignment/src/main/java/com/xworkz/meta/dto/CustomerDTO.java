package com.xworkz.meta.dto;

public class CustomerDTO {

        private int id;
        private String name;
        private String email;
        private String phone;
        private String address;
        private String gender;
        private int age;
        private String registeredDate;


    public CustomerDTO(int id, String name, String email, String phone, String address,
                       int age, String gender, String registeredDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.registeredDate = registeredDate;
    }

        public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPhone() { return phone; }
        public void setPhone(String phone) { this.phone = phone; }

        public String getAddress() { return address; }
        public void setAddress(String address) { this.address = address; }

        public String getGender() { return gender; }
        public void setGender(String gender) { this.gender = gender; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        public String getRegisteredDate() { return registeredDate; }
        public void setRegisteredDate(String registeredDate) { this.registeredDate = registeredDate; }

        @Override
        public String toString() {
            return "CustomerDTO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", address='" + address + '\'' +
                    ", gender='" + gender + '\'' +
                    ", age=" + age +
                    ", registeredDate='" + registeredDate + '\'' +
                    '}';
        }
    }

