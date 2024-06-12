package scheduler;
import java.util.Scanner;

public class Year {
    private Month[] months;
    private Scanner scanner;

    public Year() {
        months = new Month[12];
        months[0] = new Month(31);
        months[1] = new Month(28);
        months[2] = new Month(31);
        months[3] = new Month(30);
        months[4] = new Month(31);
        months[5] = new Month(30);
        months[6] = new Month(31);
        months[7] = new Month(31);
        months[8] = new Month(30);
        months[9] = new Month(31);
        months[10] = new Month(30);
        months[11] = new Month(31);
        scanner = new Scanner(System.in);
    }

    public void input_month() {
        System.out.print("몇 월? >> ");
        int month = scanner.nextInt();
        month--;
        if (month < 0 || month >= 12) {
            System.out.println("1~12월만 존재합니다.");
            return;
        }
        months[month].input();
    }

    public void view_month() {
        System.out.print("몇 월? >> ");
        int month = scanner.nextInt();
        month--;
        if (month < 0 || month >= 12) {
            System.out.println("1~12월만 존재합니다.");
            return;
        }
        months[month].view();
    }

    public void delete_month() {
        System.out.print("몇 월? >> ");
        int month = scanner.nextInt();
        month--;
        if (month < 0 || month >= 12) {
            System.out.println("1~12월만 존재합니다.");
            return;
        }
        months[month].delete();
    }
}
