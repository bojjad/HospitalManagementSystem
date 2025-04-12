package services;

import models.Doctor;
import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    private List<Doctor> doctors = new ArrayList<>();

    public void addDoctor(String name, String specialization, String phone, String address) {
        Doctor doctor = new Doctor(name, specialization, phone, address);
        doctors.add(doctor);
        System.out.println("Doctor added: " + name);
    }

    public void searchDoctor(String name) {
        for (Doctor doctor : doctors) {
            if (doctor.getName().equalsIgnoreCase(name)) {
                System.out.println("Doctor found: " + doctor.getName());
                return;
            }
        }
        System.out.println("Doctor not found.");
    }
}
