public class Doctor extends Hospital {
    public boolean hasPHD;

    public Doctor(String name, int age, boolean hasPHD) {
        super(name, age);
        this.hasPHD = hasPHD;
    }

    public void cure(){
        System.out.println("The doctor cured the patient.");
    }

    public void examination(){
        System.out.println("The doctor is examining the patient.");
    }
    public boolean isHasPHD(){
        return hasPHD;
    }
}
