import java.time.Year;

public class DrivingLicence {
    private String name;
    private String surname;
    private String licenseNumber;
    private int age;

    public DrivingLicence(String name, String surname, String licenseNumber, int age) {
        this.name = name;
        this.surname = surname;
        this.licenseNumber = licenseNumber;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public String GetSurname(){
        return surname;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearOfIssue(int yearOfIssue) {
        int currentYear = Year.now().getValue(); 

        if (yearOfIssue >= 1980 && yearOfIssue <= currentYear) {
            this.yearOfIssue = yearOfIssue;
        } else {
            throw new IllegalArgumentException("Year of issue has tobe between 1980 and 2024!");
        }
    }

    public void display() {
        System.out.println("Driving License Information:");
        System.out.println("=============================");
        System.out.printf("Name: %s %s%n", name, surname);
        System.out.printf("License Number: %s%n", licenseNumber);
        System.out.printf("Age: %d%n", age);
        System.out.println("=============================");
    }

    public static void main(String[] args) {
        DrivingLicence license = new DrivingLicence("John", "Doe", "D1234567", 30);
        license.setAge(31);
        license.setLicenseNumber("D7654321");
        license.display();

        license.setName("ANNA");
        license.setYearOfIssue(1975); 
        license.setYearOfIssue(2022); 
        license.display(); 
    }
}
