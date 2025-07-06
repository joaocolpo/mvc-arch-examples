package github.lucasmartins.classes.view;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class TasksView {

    final Logger logger = Logger.getLogger(TasksView.class.getName());

    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        logger.info("\n--- Tasks List ---");
        logger.info("1. Adicionar tarefa");
        logger.info("2. Listar tarefas");
        logger.info("3. Remover tarefa");
        logger.info("0. Sair");
        logger.info("Escolha uma opção: ");
    }

    public String getTaskInput() {
        logger.info("Digite a nova tarefa: ");
        return scanner.nextLine();
    }

    public void showTasks(List<String> tasks) {
        if (tasks.isEmpty()) {
            logger.info("Nenhuma tarefa.");
            return;
        }
        logger.info("Tarefas:");
        for (int i = 0; i < tasks.size(); i++) {
            final String message = i + " - " + tasks.get(i);
            logger.info(message);
        }
    }

    public int getTaskIndexToRemove() {
        logger.info("Digite o índice da tarefa para remover: ");
        return scanner.nextInt();
    }

    public void pause() {
        logger.info("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }

    public int getUserOption() {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    public void showMessage(String message) {
        logger.info(message);
    }
}