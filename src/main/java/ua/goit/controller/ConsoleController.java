package ua.goit.controller;

import ua.goit.repository.CrudRepository;
import ua.goit.view.Command;
import ua.goit.service.commands.FindAll;
import ua.goit.service.commands.Help;
import ua.goit.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleController {

    private View view;
    private List<Command> commands;

    public ConsoleController(View view, CrudRepository crudRepository) {
        this.view = view;
        this.commands = new ArrayList<>(Arrays.asList(new Help(view),new FindAll(view,crudRepository)));
    }


    public void run(){
        view.write("Hello to the console application");
        doCommand();
    }

    private void doCommand() {
        boolean isNotExit = true;
        while (isNotExit) {
            view.write("Введите команду help  для получения списка доступных команд.");
            String inputCommand = view.read();
            for (Command command : commands) {
                if (command.canProcess(inputCommand)) {
                    command.process();
                    break;
                } else if (inputCommand.equalsIgnoreCase("exit")) {
                    view.write("Сессия окончена. Вы покидаете библиотеку.");
                    isNotExit = false;
                    break;
                }
            }
        }

    }
}
