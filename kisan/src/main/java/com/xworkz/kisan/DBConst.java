package com.xworkz.kisan;


public enum DBConst {

    Url("jdbc:mysql://localhost:3306/kisan"),
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
