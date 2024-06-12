package scheduler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
    private List<Member> members;
    private Scanner scanner;

    public Start(Scanner scanner) {
        this.scanner = scanner;
        members = new ArrayList<>();
    }

    public void signup() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        Member member = new Member(id, password);
        members.add(member);
        System.out.println("회원가입이 완료되었습니다.");
    }

    public Member login() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();

        for (Member member : members) {
            if (member.getID().equals(id) && member.getPassword().equals(password)) {
                System.out.println("로그인 성공!");
                return member;
            }
        }
        return null;
    }
}
