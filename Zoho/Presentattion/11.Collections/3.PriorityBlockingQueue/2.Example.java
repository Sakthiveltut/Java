import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Comparator<Patient> patientComparator = Comparator.comparingInt(Patient::getPriority);
        PriorityBlockingQueue<Patient> patientQueue = new PriorityBlockingQueue<>(10, patientComparator);

        // Adding patients with different priorities
        patientQueue.put(new Patient("John", 3));
        patientQueue.put(new Patient("Alice", 1));
        patientQueue.put(new Patient("Bob", 2));

        // Treating patients in order of priority
        while (!patientQueue.isEmpty()) {
            Patient patient = patientQueue.poll();
            System.out.println("Treating patient: " + patient.getName() + " (Priority: " + patient.getPriority() + ")");
        }
    }
}

class Patient {
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
}


