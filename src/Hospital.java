import java.lang.reflect.Array;

public class Hospital {
    private static final int maxEmplyees = 3;
    private int number;
    private Person[] workers = new Person[maxEmplyees];



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Person[] getWorkers() {
        return workers;
    }

    public void setWorkers(Person[] workers) {
        this.workers = workers;
    }






    public void add(Person person){
        if(getNumber()<maxEmplyees){
            getWorkers()[getNumber()] = person;
            setNumber(getNumber() + 1);
        }
    }
    public String getInfo(){
        String result = "";
        for(int i = 0; i<number;i++){
            result += workers[i].getInfo() + "\n";
        }
        return result;
    }
}
