package model;

public class Paciente {
    private String name;
    private String surname;
    private String id;
    private String gender;
    private int age;
    private RiskFactor risk;

    public Paciente(String name, String surname, String id, String gender, int age, RiskFactor risk) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.gender = gender;
        this.age = age;
        this.risk = risk;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public RiskFactor getRisk() {
        return risk;
    }

    public void setRisk(RiskFactor risk) {
        this.risk = risk;
    }
}
