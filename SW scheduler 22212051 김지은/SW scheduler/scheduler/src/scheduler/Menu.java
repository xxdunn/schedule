package scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<String> todoList;

    public Menu() {
        this.todoList = new ArrayList<>();
    }

    public void addTodo() {
        Scanner scanner = new Scanner(System.in); // 인스턴스를 새로 만들어서 생성자에서 받지 않음
        System.out.print("할 일: ");
        String todo = scanner.nextLine();
        todoList.add(todo);
        System.out.println("일정이 추가되었습니다: " + todo);
    }

    public void deleteTodo() {
        Scanner scanner = new Scanner(System.in); // 인스턴스를 새로 만들어서 생성자에서 받지 않음
        System.out.print("삭제할 일정: ");
        String todo = scanner.nextLine();
        if (todoList.remove(todo)) {
            System.out.println("일정이 삭제되었습니다: " + todo);
        } else {
            System.out.println("해당 일정이 존재하지 않습니다.");
        }
    }

    public void showTodoList() {
        System.out.println("현재 일정:");
        if (todoList.isEmpty()) {
            System.out.println("등록된 일정이 없습니다.");
        } else {
            for (String todo : todoList) {
                System.out.println(todo);
            }
        }
    }
}
