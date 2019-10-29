public class Person {
    private String name;
    private String surename;
    private float wage;

    public Person(String name, String surename, float wage) {
        this.name = name;
        this.surename = surename;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }
public String getInfo(){
        return "Name: " + name + " Surename: " + surename + " Wage: " + wage;


}
}

