package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16003753 on 16/7/2018.
 */

public class TodoItem {

    private String todo;
    private Calendar date;

    public TodoItem(String todo, Calendar date) {
        this.todo = todo;
        this.date = date;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH) + "/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "todo='" + todo + '\'' +
                ", date=" + date +
                '}';
    }
}
