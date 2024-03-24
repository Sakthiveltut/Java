import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        EmergencyWard emergencyWard = new EmergencyWard();

        // Adding patients with different priorities
        emergencyWard.addPatient(new Patient("John", 3));
        emergencyWard.addPatient(new Patient("Alice", 1));
        emergencyWard.addPatient(new Patient("Bob", 2));

        // Treating patients in order of priority
        emergencyWard.treatPatient();
        emergencyWard.treatPatient();
        emergencyWard.treatPatient();
    }
}


class Patient implements Comparable<Patient> {
    private String name;
    private int priority; // Higher priority indicates more urgent cases

    public Patient(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Patient other) {
        // Patients are compared based on their priority
        return Integer.compare(this.getPriority(), other.getPriority());
    }
}

class EmergencyWard {
    private PriorityBlockingQueue<Patient> patientQueue;

    public EmergencyWard() {
        patientQueue = new PriorityBlockingQueue<>();
    }

    public void addPatient(Patient patient) {
        patientQueue.put(patient);
        System.out.println(patient.getName() + " has been admitted to the emergency ward.");
    }

    public void treatPatient() {
        try {
            Patient patient = patientQueue.take();
            System.out.println("Treating patient: " + patient.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

