package scheduler;

public class Member {
    private String ID;
    private String password;
    private TodoList todoList;
    private Schedule schedule;

    public Member(String ID, String password) {
        this.ID = ID;
        this.password = password;
        this.todoList = new TodoList();
        this.schedule = new Schedule();
    }

    public String getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public TodoList getTodoList() {
        return todoList;
    }

    public Schedule getSchedule() {
        return schedule;
    }
}
