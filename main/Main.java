package main;

import services.PatientService;
import services.DoctorService;
import services.AppointmentService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PatientService patientService = new PatientService();
        DoctorService doctorService = new DoctorService();
        AppointmentService appointmentService = new AppointmentService();

        while (true) {
            System.out.println("=== Hospital Management Menu ===");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Create Appointment");
            System.out.println("4. View All Appointments");
            System.out.println("5. Update Appointment");
            System.out.println("6. Delete Appointment");
            System.out.println("7. Search Patient");
            System.out.println("8. Search Doctor");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter patient phone: ");
                    String patientPhone = scanner.nextLine();
                    System.out.print("Enter patient age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Enter patient address: ");
                    String patientAddress = scanner.nextLine();
                    patientService.addPatient(patientName, patientPhone, patientAge, patientAddress, "Additional Info");
                    break;
                case 2:
                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter doctor specialization: ");
                    String doctorSpecialization = scanner.nextLine();
                    System.out.print("Enter doctor phone: ");
                    String doctorPhone = scanner.nextLine();
                    System.out.print("Enter doctor address: ");
                    String doctorAddress = scanner.nextLine();
                    doctorService.addDoctor(doctorName, doctorSpecialization, doctorPhone, doctorAddress);
                    break;
                case 3:
                    System.out.print("Enter patient name for appointment: ");
                    String patientForAppointment = scanner.nextLine();
                    System.out.print("Enter doctor name for appointment: ");
                    String doctorForAppointment = scanner.nextLine();
                    System.out.print("Enter appointment date: ");
                    String appointmentDate = scanner.nextLine();
                    appointmentService.createAppointment(patientForAppointment, doctorForAppointment, appointmentDate);
                    break;
                case 4:
                    appointmentService.viewAllAppointments();
                    break;
                case 5:
                    System.out.print("Enter appointment date to update: ");
                    String appointmentDateToUpdate = scanner.nextLine();
                    System.out.print("Enter updated patient name: ");
                    String updatedPatientName = scanner.nextLine();
                    System.out.print("Enter updated doctor name: ");
                    String updatedDoctorName = scanner.nextLine();
                    appointmentService.updateAppointment(appointmentDateToUpdate, updatedPatientName, updatedDoctorName);
                    break;
                case 6:
                    System.out.print("Enter appointment date to delete: ");
                    String appointmentDateToDelete = scanner.nextLine();
                    appointmentService.deleteAppointment(appointmentDateToDelete);
                    break;
                case 7:
                    System.out.print("Enter patient name to search: ");
                    String searchPatientName = scanner.nextLine();
                    patientService.searchPatient(searchPatientName);
                    break;
                case 8:
                    System.out.print("Enter doctor name to search: ");
                    String searchDoctorName = scanner.nextLine();
                    doctorService.searchDoctor(searchDoctorName);
                    break;
                case 9:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
