package scheduler;

import java.util.Scanner;

public class TodoList {
    private Scanner scanner;
    private Menu menu;

    public TodoList() {
        this.menu = new Menu();
    }

    public void show() {
        scanner = new Scanner(System.in); // 인스턴스를 새로 만들어서 생성자에서 받지 않음
        while (true) {
            menu.showTodoList();  // 현재 일정을 먼저 출력
            System.out.println("1. 일정 추가");
            System.out.println("2. 일정 삭제");
            System.out.println("3. 메인 메뉴로 돌아가기");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 줄바꿈 문자 제거

            if (choice == 1) {
                menu.addTodo();
            } else if (choice == 2) {
                menu.deleteTodo();
            } else if (choice == 3) {
                System.out.println("메인 메뉴로 돌아갑니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
