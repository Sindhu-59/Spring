package com.xworkz.medisales;

public enum DBConst {
    Url("jdbc:mysql://localhost:3306/medisales"),
    Username("root"),
    Secret("Sindhu@478");
    private String property;

    DBConst(String property){
        this.property=property;
        System.out.println("running db const");
    }

    public String getProperty() {
        return property;
    }
}