package scheduler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Start start = new Start(scanner);

        while (true) {
            System.out.println("1. 로그인");
            System.out.println("2. 회원가입");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 줄바꿈 문자 제거

            if (choice == 1) {
                Member member = start.login();
                if (member != null) {
                    Select select = new Select(scanner, member);
                    select.chooseFunction();
                } else {
                    System.out.println("로그인 실패!");
                }
            } else if (choice == 2) {
                start.signup();
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
