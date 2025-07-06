package github.lucasmartins.classes.model;


import java.util.ArrayList;
import java.util.List;

public class TasksModel {

    private final List<String> tasks;

    public TasksModel() {
        tasks = new ArrayList<>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }

}