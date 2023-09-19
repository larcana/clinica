public class Patient extends User {
    //Atributos

    private Long id;
    private int age;
    private Doctor doctorInCharge;
    private String phoneNumber;

    public Patient(String name, String lastName, String email, int age, String phoneNumber, Doctor doctorInCharge, Long id) {
        super(name, lastName, email);
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.doctorInCharge = doctorInCharge;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Doctor getDoctorInCharge() {
        return doctorInCharge;
    }

    public void setDoctorInCharge(Doctor doctorInCharge) {
        this.doctorInCharge = doctorInCharge;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void displayUserInfo() {

    }
}
