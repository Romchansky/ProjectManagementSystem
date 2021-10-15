package ua.goit.service.commands.query;

import ua.goit.service.commands.Command;
import ua.goit.service.commands.QueryCommand;
import ua.goit.view.View;

import java.util.Map;

public class GetDeveloperSkillCommand extends QueryCommand {


    public GetDeveloperSkillCommand(View view, Map<String, Command> commands) {
        super(view, commands);
    }

    @Override
    public void process() {
        super.getDeveloperSkill();
    }

    @Override
    public String commandName() {
        return "get_developer_skill";
    }

    @Override
    public String description() {
        return "Получить навыки разработчиков";
    }
}
