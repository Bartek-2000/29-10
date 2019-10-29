public class Nurse extends Person{
    private float overtime;

    public float getOvertime() {
        return overtime;
    }

    public void setOvertime(float overtime) {
        this.overtime = overtime;
    }

    public Nurse(String name, String surename, float wage, float overtime) {
        super(name, surename, wage);
        this.overtime = overtime;
    }
    public String getInfo(){
        return super.getInfo() + " Overtime: " + overtime;
    }
}
