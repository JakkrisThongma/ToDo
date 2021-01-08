package com.jakkris.todolist;

import com.jakkris.todolist.datamodel.TodoItem;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;

    public void initialize(){
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for Peter", LocalDate.of(2021, Month.JANUARY, 30));
        TodoItem item2 = new TodoItem("Doctor's appointment", "See Dr.Smith at 123 Main Street. Bring paperwork.", LocalDate.of(2021, Month.FEBRUARY, 5));
        TodoItem item3 = new TodoItem("Finish school project", "Finish programming ToDoList project and push to Github", LocalDate.of(2021, Month.FEBRUARY, 15));
        TodoItem item4 = new TodoItem("Send out KYC", "Send out KYC to Binance in order to increase purchase limit", LocalDate.of(2021, Month.MARCH, 7));
        TodoItem item5 = new TodoItem("Order tickets for flight", "Order tickets for flight to Thailand summer 2021", LocalDate.of(2021, Month.APRIL, 23));

        todoItems = new ArrayList<>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

    }
}
