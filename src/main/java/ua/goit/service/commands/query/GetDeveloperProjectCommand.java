package ua.goit.service.commands.query;

import ua.goit.service.commands.Command;
import ua.goit.service.commands.QueryCommand;
import ua.goit.view.View;

import java.util.Map;

public class GetDeveloperProjectCommand extends QueryCommand {

    public GetDeveloperProjectCommand(View view, Map<String, Command> commands) {
        super(view, commands);
    }

    @Override
    public void process() {
        super.getDeveloperProject();
    }

    @Override
    public String commandName() {
        return "get_developer_project";
    }

    @Override
    public String description() {
        return "Список разработчиков отдельного проекта";
    }
}
