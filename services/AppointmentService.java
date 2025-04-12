package services;

import models.Appointment;
import models.Patient;
import models.Doctor;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public void createAppointment(String patientName, String doctorName, String appointmentDate) {
        // Simplified search logic for the example. You can expand it based on your requirements.
        Patient patient = new Patient(patientName, "1234567890", 30, "Some Address", "No issues");
        Doctor doctor = new Doctor(doctorName, "General Medicine", "0987654321", "Some Clinic");
        
        Appointment appointment = new Appointment(patient, doctor, appointmentDate);
        appointments.add(appointment);
        System.out.println("Appointment created for: " + patientName + " with Dr. " + doctorName);
    }

    public void viewAllAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            for (Appointment appointment : appointments) {
                System.out.println("Appointment: " + appointment.getPatient().getName() + " with Dr. " + appointment.getDoctor().getName() + " on " + appointment.getAppointmentDate());
            }
        }
    }

    public void updateAppointment(String appointmentDate, String updatedPatientName, String updatedDoctorName) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentDate().equals(appointmentDate)) {
                appointment.getPatient().setName(updatedPatientName);
                appointment.getDoctor().setName(updatedDoctorName);
                System.out.println("Appointment updated.");
                return;
            }
        }
        System.out.println("Appointment not found.");
    }

    public void deleteAppointment(String appointmentDate) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentDate().equals(appointmentDate)) {
                appointments.remove(appointment);
                System.out.println("Appointment deleted.");
                return;
            }
        }
        System.out.println("Appointment not found.");
    }
}
