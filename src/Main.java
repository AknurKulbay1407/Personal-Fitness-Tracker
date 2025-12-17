import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Create your user account");
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        User1 user = new User1( a, b, c);
        System.out.println(user.smth());
        System.out.println("how many workouts are needed?");
        int d = sc.nextInt();
        System.out.println("Your Routine (workout, reps, duration in minutes, day of the week):");
        for (int i = 0; i < d; i++) {
            String aa = sc.next();
            int bb = sc.nextInt();
            int cc = sc.nextInt();
            String dd = sc.next();
            workoutRoutine1 work = new workoutRoutine1(aa, bb, cc, dd);
            System.out.println(work.workouts());
        }
        System.out.println("Write your goal (steps, heart rate, sleep hours):");
        int aaa = sc.nextInt();
        int bbb = sc.nextInt();
        int ccc = sc.nextInt();
        FitnessApp1 fit = new FitnessApp1(aaa, bbb, ccc);
        System.out.println("Write what you've accomplished:");
        int ddd = sc.nextInt();
        int eee = sc.nextInt();
        int fff = sc.nextInt();
        FitnessApp1 acom = new FitnessApp1(ddd, eee, fff);
        int coun = 0;
        if (fit.getSteps() != acom.getSteps()) {
            coun++;
        }
        if (fit.getHeart_rate() != acom.getHeart_rate()) {
            coun++;
        }
        if (fit.getSleep() != acom.getSleep()) {
            coun++;
        }
        if (coun == 0) {
            System.out.println("Good job!");
        } else {
            System.out.println("Take better care of your health");
        }
    }
}