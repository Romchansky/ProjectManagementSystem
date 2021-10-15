package ua.goit.service.commands;

import ua.goit.repository.QueryRepository;
import ua.goit.repository.QueryRepositoryImpl;
import ua.goit.view.View;

import java.util.List;
import java.util.Map;

public abstract class QueryCommand implements Command {

    protected final View view;
    protected final Map<String, Command> commands;
    protected final QueryRepository queryRepository;

    public QueryCommand(View view, Map<String, Command> commands) {
        this.view = view;
        this.commands = commands;
        this.queryRepository = new QueryRepositoryImpl();
    }

    protected void getSalaryDeveloper() {
        view.write("Введите ID проекта");
        List result = queryRepository.getSalaryDevsByProject(Long.valueOf(view.read()));
        sendResult(!result.isEmpty(), result);
    }


    protected void getDeveloperProject() {
        view.write("Введите ID проекта");
        List result = queryRepository.listDevelopersByProject(Long.valueOf(view.read()));
        sendResult(!result.isEmpty(), result);
    }


    protected void getDeveloperSkill() {
        view.write("Введите навык");
        List result = queryRepository.listDevelopersByProgramLanguage(view.read());
        sendResult(!result.isEmpty(), result);
    }

    protected void getDeveloperLevel() {
        view.write("Введите позицию разработчика");
        List result = queryRepository.listLevelDevelopers(view.read());
        sendResult(!result.isEmpty(), result);
    }


    protected void getDataProject() {
        List result = queryRepository.listProWithData();
        sendResult(!result.isEmpty(), result);
    }


    private void sendResult(Boolean isDone, Object... result) {
        if (isDone) view.write(result);
        else view.write("По вашему запросу ничего не найдено");
    }

    private void sendResult(Boolean isDone, List result) {
        sendResult(isDone, result.toArray());
    }

}
