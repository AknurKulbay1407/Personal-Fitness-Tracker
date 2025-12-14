import java.util.Scanner;

public class User {
    private int id;
    private String Name;
    private String Surname;

    public User(int id, String Name, String Surname) {
        this.id = id;
        this.Name = Name;
        this.Surname = Surname;
    }

    public static void userRoutine() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        WorkoutRoutine rout = new WorkoutRoutine(a, b, c);
        System.out.println("The routine:\nPush ups = " + rout.GetPush_up() + "\nSquats = " + rout.GetSquats()
                + "\nBench presses = " + rout.GetBench_press());
        System.out.println("What have you done: ");
        WorkoutRoutine done = new WorkoutRoutine();
        int aa = sc.nextInt();
        int bb = sc.nextInt();
        int cc = sc.nextInt();
        done.SetPush_up(aa);
        done.SetSquats(bb);
        done.SetBench_press(cc);
        System.out.println("What's done:\nPush ups = " + done.GetPush_up() + "\nSquats = " + done.GetSquats()
                + "\nBench presses = " + done.GetBench_press());

        if(rout.totalReps() <= done.totalReps() ) {
            System.out.println("You've met you exercise goal!");
        } else {
            System.out.println("Results: You still need to do some exercises");
        }
    }

}

//    public String GetName() {
//        return Name;
//    }
//    public void SetName(String Name) {
//        this.Name = Name;
//    }
//
//    public int GetId() {
//        return id;
//    }
//    public void SetId(int id) {
//        this.id = id;
//    }
//
//    public String GetSurname() {
//        return Surname;
//    }
//    public void SetSurname(String Surname) {
//        this.Surname = Surname;
//    }
