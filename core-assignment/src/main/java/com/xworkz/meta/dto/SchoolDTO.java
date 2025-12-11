package com.xworkz.meta.dto;

public class SchoolDTO {
    private int id;
    private String name;
    private String city;
    private String board;
    private int studentsCount;
    private int teachersCount;
    private String principal;
    private String established;

    public SchoolDTO(int id, String name, String city, String board,
                     int studentsCount, int teachersCount, String principal, String established) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.board = board;
        this.studentsCount = studentsCount;
        this.teachersCount = teachersCount;
        this.principal = principal;
        this.established = established;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getBoard() { return board; }
    public void setBoard(String board) { this.board = board; }
    public int getStudentsCount() { return studentsCount; }
    public void setStudentsCount(int studentsCount) { this.studentsCount = studentsCount; }
    public int getTeachersCount() { return teachersCount; }
    public void setTeachersCount(int teachersCount) { this.teachersCount = teachersCount; }
    public String getPrincipal() { return principal; }
    public void setPrincipal(String principal) { this.principal = principal; }
    public String getEstablished() { return established; }
    public void setEstablished(String established) { this.established = established; }

    @Override
    public String toString() {
        return "SchoolDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", board='" + board + '\'' +
                ", studentsCount=" + studentsCount +
                ", teachersCount=" + teachersCount +
                ", principal='" + principal + '\'' +
                ", established='" + established + '\'' +
                '}';
    }
}
