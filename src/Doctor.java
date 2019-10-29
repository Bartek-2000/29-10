public class Doctor extends Person{
    private float bonus;

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public Doctor(String name, String surename, float wage, float bonus) {
        super(name, surename, wage);
        this.bonus = bonus;
    }
    public String getInfo(){
        return super.getInfo() + " Bonus: " + bonus;
    }
}
