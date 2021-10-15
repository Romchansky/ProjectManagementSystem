package ua.goit.service.commands.query;

import ua.goit.service.commands.Command;
import ua.goit.service.commands.QueryCommand;
import ua.goit.view.View;

import java.util.Map;

public class GetDataProjectCommand extends QueryCommand {

    public GetDataProjectCommand(View view, Map<String, Command> commands) {
        super(view, commands);
    }

    @Override
    public void process() {
        super.getDataProject();
    }

    @Override
    public String commandName() {
        return "get_data_project";
    }

    @Override
    public String description() {
        return "Список проектов";
    }
}
