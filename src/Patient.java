public class Patient {
    private int id;
    private String name;
    private int birthYear;
    private double height;
    private double weight;
    private String bloodtype;
    private String phoneNumber;



    public Patient(int id,String name,int birthYear,double height,double weight,String bloodtype,String phoneNumber){
        this.id = id;
        this.name = name;
        this.bloodtype = bloodtype;
        this.phoneNumber = phoneNumber;
        if (birthYear > 0 && birthYear <= 2024){
            this.birthYear = birthYear;
        }
        else {
            System.out.println("! warning ! change to default : 2004" );
            this.birthYear = 2004;
        }
        if(height > 0){
            this.height = height;
        }
        else {
            System.out.println("! warning ! change to default : 165 " );
            this.height = 165;
        }
        if(weight > 0){
            this.weight = weight;
        }
        else {
            System.out.println("! warning ! change to default : 60 " );
            this.weight = 60;
        }

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    public String getBloodtype(){
        return bloodtype;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public int getAge(int currentYear) {
        if (currentYear > birthYear) {
            return currentYear - birthYear;
        } else {
            System.out.println("! warning ! ---Please fill this form correctly---");
            return -1;
        }
    }
    public double getBMI() {
        if (this.height > 0 && this.weight > 0) {
            double heightInMeters = this.height / 100.0;
            return this.weight / (heightInMeters * heightInMeters);
        } else {
            System.out.println("! warning ! incorrect height or weight for BMI calculation.");
            return 0.0;
        }
    }

    public void displayDetails(int currentYear) {

        System.out.println("Patient Name: " + name);
        int age = getAge(currentYear);
        if (age != -1){
        System.out.println("Patient Age: " + getAge(currentYear));
        }
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
        System.out.println("Patient Blood Group: " + this.bloodtype);
        System.out.println("Patient Phone Number: " + this.phoneNumber);
        System.out.println("Patient BMI: " + this.getBMI());
    }

}

