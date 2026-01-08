import java.util.*;

public class Main {
    public static void main(String[] args) {

        // --- Users data pool ---
        List<User> users = List.of(
                new FitnessUser("Ali", "Khan", "active"),
                new FitnessUser("Dana", "Lee", "inactive"),
                new FitnessUser("Aruzhan", "Nur", "active")
        );

        // --- Exercises ---
        Cardio run = new Cardio("Running", 30);
        Strength pushups = new Strength("Push-ups", 20);
        Strength plank = new Strength("Plank", 1);

        // --- Workout Routines ---
        WorkoutRoutine morning = new WorkoutRoutine("Morning Routine");
        morning.addExercise(run);
        morning.addExercise(pushups);

        WorkoutRoutine evening = new WorkoutRoutine("Evening Routine");
        evening.addExercise(plank);

        List<WorkoutRoutine> routines = List.of(morning, evening);

        // --- Filtering Users ---
        System.out.println("=== Active Users ===");
        users.stream()
                .filter(u -> u.toString().contains("active"))
                .forEach(System.out::println);

        // --- Searching Morning Routine ---
        System.out.println("\n=== Morning Routine ===");
        routines.stream()
                .filter(r -> r.getRoutineName().contains("Morning"))
                .findFirst()
                .ifPresent(System.out::println);

        // --- Sorting Routines by number of exercises ---
        System.out.println("\n=== Routines Sorted by Number of Exercises ===");
        routines.stream()
                .sorted(Comparator.comparingInt(r -> r.getExercises().size()))
                .forEach(System.out::println);

        // --- Polymorphism example ---
        List<Object> allRecords = new ArrayList<>();
        allRecords.addAll(users);
        allRecords.addAll(routines);
        allRecords.add(new FitnessApp(10000, 80, 7));

        System.out.println("\n=== All Records Summary (Polymorphism) ===");
        allRecords.forEach(System.out::println);
    }
}
