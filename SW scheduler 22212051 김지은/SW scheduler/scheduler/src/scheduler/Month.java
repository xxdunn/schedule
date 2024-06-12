package scheduler;

import java.util.Scanner;

public class Month {
    private int nDays;
    private Day[] days;
    private Scanner scanner;

    public Month(int nDays) {
        this.nDays = nDays;
        days = new Day[nDays];
        for (int i = 0; i < nDays; i++) {
            days[i] = new Day();
        }
        scanner = new Scanner(System.in);
    }

    public void input() {
        System.out.print("날짜(1~" + nDays + ")?");
        int day = scanner.nextInt();
        day--;
        if (day < 0 || day >= nDays) {
            System.out.println("날짜 잘못 입력!");
            return;
        }
        System.out.print("할 일?");
        scanner.nextLine();
        String work = scanner.nextLine();
        days[day].set(work);
    }

    public void view() {
        System.out.print("날짜(1~" + nDays + ")?");
        int day = scanner.nextInt();
        day--;
        if (day < 0 || day >= nDays) {
            System.out.println("날짜 잘못 입력!");
            return;
        }
        System.out.print((day + 1) + "일의 할 일은 ");
        days[day].show();
    }

    public void delete() {
        System.out.print("날짜(1~" + nDays + ")?");
        int day = scanner.nextInt();
        day--;
        if (day < 0 || day >= nDays) {
            System.out.println("날짜 잘못 입력!");
            return;
        }
        days[day].delete();
        System.out.println((day + 1) + "일의 할 일이 삭제되었습니다.");
    }
}
