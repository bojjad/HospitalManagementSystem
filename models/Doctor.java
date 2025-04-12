package models;

public class Doctor {
    private String name;
    private String specialization;
    private String phone;
    private String address;

    public Doctor(String name, String specialization, String phone, String address) {
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.address = address;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
