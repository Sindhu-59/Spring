package com.xworkz.meta.dto;

public class EmployeeDTO {

        private int id;
        private String name;
        private int age;
        private String designation;
        private double salary;
        private String department;
        private String email;
        private String phoneNumber;

    public EmployeeDTO(int i, String arjun, String it, String developer, int i1, String mail, long l, String bangalore) {
    }

    public int getId() { return id; }
        public void setId(int id) { this.id = id; }

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        public String getDesignation() { return designation; }
        public void setDesignation(String designation) { this.designation = designation; }

        public double getSalary() { return salary; }
        public void setSalary(double salary) { this.salary = salary; }

        public String getDepartment() { return department; }
        public void setDepartment(String department) { this.department = department; }

        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }

        public String getPhoneNumber() { return phoneNumber; }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

        @Override
        public String toString() {
            return "EmployeeDTO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", designation='" + designation + '\'' +
                    ", salary=" + salary +
                    ", department='" + department + '\'' +
                    ", email='" + email + '\'' +
                    ", phoneNumber='" + phoneNumber + '\'' +
                    '}';
        }
    }

