public class Patient extends Hospital{
    public boolean hasInsurance;

    public Patient(String name, int age) {
        super(name, age);
    }
    public void isBeingTreated(){
        System.out.println("The patient is being treated.");
    }

    public boolean HasInsurance(){
        return hasInsurance;
    }
}
