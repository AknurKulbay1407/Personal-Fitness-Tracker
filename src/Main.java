import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        System.out.println("Do you wish to use the app? (yes, no)");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if (a.equals("Yes") || a.equals("yes")) {
            System.out.println("Write your expectation for the app (days, progress, review):");
            int b = sc.nextInt();
            String c = sc.next();
            int d = sc.nextInt();
            FitnessApp app = new FitnessApp(b, c, d);
            FitnessApp.userdata();
        }
        else {
                System.out.println("Okay, closing the app");
        }

    }
}