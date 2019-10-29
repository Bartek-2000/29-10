public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Doctor doc = new Doctor("Jan", "Kowalski", 20000, 1500);
        Nurse nurse = new Nurse("Joanna", "Kowalska", 4000, 10);
        Nurse nurse2 = new Nurse("Danuta", "Kowalska", 5000, 12);
        hospital.add(doc);
        hospital.add(nurse);
        hospital.add(nurse2);
        System.out.println("Hospital employees:");
        System.out.println(hospital.getInfo());

    }
}
