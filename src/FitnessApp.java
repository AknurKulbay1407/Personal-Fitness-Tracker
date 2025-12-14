import java.util.Scanner;

public class FitnessApp {
    private int days;
    private String progress;
    private int review;

    public FitnessApp (int days, String progress, int review) {
        this.days = days;
        this.progress = progress;
        this.review = review;
    }

    public static void userdata () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write you user information (Id, Name, Surname):");
        int a = sc.nextInt();
        String b = sc.next();
        String c = sc.next();
        User user1 = new User(a, b, c);

        System.out.println("Write down your expected routine(Push ups, squats, bench presses:");
        User.userRoutine();

    }
}
