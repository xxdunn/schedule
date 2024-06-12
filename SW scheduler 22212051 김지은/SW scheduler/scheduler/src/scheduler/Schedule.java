package scheduler;

import java.util.Scanner;

public class Schedule {
    private Year[] years;
    private Scanner scanner;

    public Schedule() {
        this.scanner = new Scanner(System.in); // 인스턴스를 새로 만들어서 생성자에서 받지 않음
        years = new Year[99];
        for (int i = 0; i < 99; i++) {
            years[i] = new Year();
        }
    }

    public void addYear() {
        System.out.print("몇 년? >> 20");
        int year = scanner.nextInt();
        year--;
        if (year < 0 || year >= 99) {
            System.out.println("2099년 이내의 스케줄만 작성할 수 있습니다.");
            return;
        }
        years[year].input_month();
    }

    public void viewYear() {
        System.out.print("몇 년? >> 20");
        int year = scanner.nextInt();
        year--;
        if (year < 0 || year >= 99) {
            System.out.println("2099년 이내의 스케줄만 작성할 수 있습니다.");
            return;
        }
        years[year].view_month();
    }

    public void deleteYear() {
        System.out.print("몇 년? >> 20");
        int year = scanner.nextInt();
        year--;
        if (year < 0 || year >= 99) {
            System.out.println("2099년 이내의 스케줄만 작성할 수 있습니다.");
            return;
        }
        years[year].delete_month();
    }

    public void finish() {
        System.out.println("종료!");
    }

    public void run() {
        while (true) {
            System.out.print("할일(입력:1, 보기:2, 삭제:3, 끝내기:4) ");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    addYear();
                    break;
                case 2:
                    viewYear();
                    break;
                case 3:
                    deleteYear();
                    break;
                case 4:
                    finish();
                    return;
                default:
                    System.out.println("메뉴 오류");
            }
        }
    }
}
