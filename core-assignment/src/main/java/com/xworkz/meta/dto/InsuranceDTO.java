package com.xworkz.meta.dto;

public class InsuranceDTO {

    private int policyId;
    private String policyName;
    private String policyType;
    private String holderName;
    private double premiumAmount;
    private int tenureYears;
    private String startDate;
    private String endDate;

    public InsuranceDTO() {}

    public InsuranceDTO(int policyId, String policyName, String policyType, String holderName,
                        double premiumAmount, int tenureYears, String startDate, String endDate) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.policyType = policyType;
        this.holderName = holderName;
        this.premiumAmount = premiumAmount;
        this.tenureYears = tenureYears;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters & Setters
    public int getPolicyId() { return policyId; }
    public void setPolicyId(int policyId) { this.policyId = policyId; }

    public String getPolicyName() { return policyName; }
    public void setPolicyName(String policyName) { this.policyName = policyName; }

    public String getPolicyType() { return policyType; }
    public void setPolicyType(String policyType) { this.policyType = policyType; }

    public String getHolderName() { return holderName; }
    public void setHolderName(String holderName) { this.holderName = holderName; }

    public double getPremiumAmount() { return premiumAmount; }
    public void setPremiumAmount(double premiumAmount) { this.premiumAmount = premiumAmount; }

    public int getTenureYears() { return tenureYears; }
    public void setTenureYears(int tenureYears) { this.tenureYears = tenureYears; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    @Override
    public String toString() {
        return "InsuranceDTO{" +
                "policyId=" + policyId +
                ", policyName='" + policyName + '\'' +
                ", policyType='" + policyType + '\'' +
                ", holderName='" + holderName + '\'' +
                ", premiumAmount=" + premiumAmount +
                ", tenureYears=" + tenureYears +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

