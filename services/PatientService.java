package services;

import models.Patient;
import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    public void addPatient(String name, String phone, int age, String address, String additionalInfo) {
        Patient patient = new Patient(name, phone, age, address, additionalInfo);
        patients.add(patient);
        System.out.println("Patient added: " + name);
    }

    public void searchPatient(String name) {
        for (Patient patient : patients) {
            if (patient.getName().equalsIgnoreCase(name)) {
                System.out.println("Patient found: " + patient.getName());
                return;
            }
        }
        System.out.println("Patient not found.");
    }
}
