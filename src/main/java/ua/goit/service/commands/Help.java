package ua.goit.service.commands;

import ua.goit.view.Command;
import ua.goit.view.View;

public class Help implements Command {

    private View view;

    public Help(View view) {
        this.view = view;
    }

    @Override
    public void process() {
        view.write("help - список всех доступных команд.");
        view.write("exit - выход из программы.");
        view.write("find_all_developers - вывести всех разработчиков ");
    }

    @Override
    public String commandName() {
        return "help";
    }
}
