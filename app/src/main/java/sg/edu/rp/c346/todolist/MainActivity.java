package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvTodo;
    ArrayList<TodoItem> alTodoList;
    CustomAdapter caTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvTodo = findViewById(R.id.listViewTodo);

        alTodoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);
        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);
        TodoItem todo1 = new TodoItem("MSA",date1);
        TodoItem todo2 = new TodoItem("Go for haircut",date2);

        alTodoList.add(todo1);
        alTodoList.add(todo2);

        caTodo = new CustomAdapter(this,R.layout.todo_item,alTodoList);

        lvTodo.setAdapter(caTodo);

    }
}
