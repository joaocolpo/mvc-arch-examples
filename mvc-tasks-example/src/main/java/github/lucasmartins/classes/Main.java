package github.lucasmartins.classes;

import github.lucasmartins.classes.controller.TasksController;
import github.lucasmartins.classes.model.TasksModel;
import github.lucasmartins.classes.view.TasksView;


public class Main {
    public static void main(String[] args) {
        final TasksModel model = new TasksModel();
        final TasksView view = new TasksView();

        final TasksController controller = new TasksController(model, view);

        controller.run();
    }
}