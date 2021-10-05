package ua.goit.service.commands;

import ua.goit.model.Developer;
import ua.goit.repository.CrudRepository;
import ua.goit.view.Command;
import ua.goit.view.View;

import java.util.List;

public class FindAll implements Command {

    private View view;
    private CrudRepository crudRepository;

    public FindAll(View view, CrudRepository crudRepository) {
        this.view = view;
        this.crudRepository = crudRepository;
    }

    @Override
    public void process() {
        List <Developer> allDevelopers = crudRepository.findAll();
        if(allDevelopers.isEmpty()){
            view.write("Developers Repository is empty. Add entity");
        }
        for (Developer dev: allDevelopers) {
            view.write(dev.toString());
        }
    }

    @Override
    public String commandName() {
        return "find_all_developers";
    }
}
