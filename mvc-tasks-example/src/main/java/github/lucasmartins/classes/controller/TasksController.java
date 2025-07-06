package github.lucasmartins.classes.controller;


import github.lucasmartins.classes.model.TasksModel;
import github.lucasmartins.classes.view.TasksView;

public class TasksController {

    private final TasksModel model;

    private final TasksView view;

    private boolean running = true;

    public TasksController(TasksModel model, TasksView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        while (running) {
            view.showMenu();
            int option = view.getUserOption();
            handleOption(option);
        }
    }

    private void handleOption(int option) {
        switch (option) {
            case 1:
                String task = view.getTaskInput();
                model.addTask(task);
                view.showMessage("Tarefa adicionada.");
                break;
            case 2:
                view.showTasks(model.getTasks());
                break;
            case 3:
                view.showTasks(model.getTasks());
                int index = view.getTaskIndexToRemove();
                model.removeTask(index);
                view.showMessage("Tarefa removida.");
                break;
            case 0:
                running = false;
                break;
            default:
                view.showMessage("Opção inválida.");
        }
        view.pause();
    }
}
