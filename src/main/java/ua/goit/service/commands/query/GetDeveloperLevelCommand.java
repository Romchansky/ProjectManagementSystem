package ua.goit.service.commands.query;

import ua.goit.service.commands.Command;
import ua.goit.service.commands.QueryCommand;
import ua.goit.view.View;

import java.util.Map;

public class GetDeveloperLevelCommand extends QueryCommand {

    public GetDeveloperLevelCommand(View view, Map<String, Command> commands) {
        super(view, commands);
    }

    @Override
    public void process() {
        super.getDeveloperLevel();
    }

    @Override
    public String commandName() {
        return "get_developer_level";
    }

    @Override
    public String description() {
        return "Получить уровень разработчиков";
    }
}
