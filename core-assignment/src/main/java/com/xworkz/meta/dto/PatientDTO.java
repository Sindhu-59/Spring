package com.xworkz.meta.dto;
public class PatientDTO {

    private int patientId;
    private String name;
    private int age;
    private String disease;
    private String doctorAssigned;
    private String admissionDate;
    private String dischargeDate;
    private double billAmount;

    public PatientDTO() {
        System.out.println("No-arg constructor of PatientDTO");
    }

    public PatientDTO(int patientId, String name, int age, String disease,
                      String doctorAssigned, String admissionDate,
                      String dischargeDate, double billAmount) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.doctorAssigned = doctorAssigned;
        this.admissionDate = admissionDate;
        this.dischargeDate = dischargeDate;
        this.billAmount = billAmount;
    }

    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getDisease() { return disease; }
    public void setDisease(String disease) { this.disease = disease; }

    public String getDoctorAssigned() { return doctorAssigned; }
    public void setDoctorAssigned(String doctorAssigned) { this.doctorAssigned = doctorAssigned; }

    public String getAdmissionDate() { return admissionDate; }
    public void setAdmissionDate(String admissionDate) { this.admissionDate = admissionDate; }

    public String getDischargeDate() { return dischargeDate; }
    public void setDischargeDate(String dischargeDate) { this.dischargeDate = dischargeDate; }

    public double getBillAmount() { return billAmount; }
    public void setBillAmount(double billAmount) { this.billAmount = billAmount; }

    @Override
    public String toString() {
        return "PatientDTO{" +
                "patientId=" + patientId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                ", doctorAssigned='" + doctorAssigned + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", dischargeDate='" + dischargeDate + '\'' +
                ", billAmount=" + billAmount +
                '}';
    }
}
