package scheduler;

import java.util.Scanner;

public class Select {
    private Scanner scanner;
    private Member member;

    public Select(Scanner scanner, Member member) {
        this.scanner = scanner;
        this.member = member;
    }

    public void chooseFunction() {
        while (true) {
            System.out.println("1. TodoList");
            System.out.println("2. Schedule");
            System.out.println("3. 로그아웃");
            System.out.print("선택: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                member.getTodoList().show();
            } else if (choice == 2) {
                member.getSchedule().run();
            } else if (choice == 3) {
                System.out.println("로그아웃 되었습니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
