package ua.goit.repository;


import ua.goit.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class QueryRepositoryImpl implements QueryRepository {

    CrudRepository<Developer, Long> developerRepository = RepositoryFactory.of(Developer.class);
    CrudRepository<Project, Long> projectRepository = RepositoryFactory.of(Project.class);
    CrudRepository<Skills, Long> skillRepository = RepositoryFactory.of(Skills.class);
    CrudRepository<DeveloperProject, Long> developerProjectRepository = RepositoryFactory.of(DeveloperProject.class);
    CrudRepository<DeveloperSkill, Long> developerSkillRepository = RepositoryFactory.of(DeveloperSkill.class);

    List<Developer> developerList = new ArrayList<>();
    List<Developer> developerLevel = new ArrayList<>();
    List<Developer> developerLanguage = new ArrayList<>();


    @Override
    public Long getSalaryDevsByProject(Long id) {
        return developerList.stream()
                .mapToLong(Developer::getSalary)
                .sum();
    }

    @Override
    public List listDevelopersByProject(Long id) {
        List<Long> resultId = developerProjectRepository.findAll().stream()
                .filter(e -> e.getProjectId().equals(id))
                .map(DeveloperProject::getDeveloperId)
                .collect(Collectors.toList());

        for (Long i : resultId) {
            Optional<Developer> byId = developerRepository.findById(i);
            developerList.add(byId.get());
        }
        return developerList;
    }

    @Override
    public List listDevelopersByProgramLanguage(String language) {
        List<Long> resultSkill = skillRepository.findAll().stream()
                .filter(s -> s.getLanguage().equals(language))
                .map(Skills::getId)
                .collect(Collectors.toList());


        for (Long id : resultSkill) {
            List<Long> result = developerSkillRepository.findAll().stream()
                    .filter(s -> s.getSkillId().equals(id))
                    .map(DeveloperSkill::getDeveloperId)
                    .collect(Collectors.toList());

            for (Long i : result) {
                Optional<Developer> byID = developerRepository.findById(i);
                developerLanguage.add(byID.get());
            }
        }
        return developerLanguage;
    }

    @Override
    public List listLevelDevelopers(String levelDev) {
        List<Long> resultLevel = skillRepository.findAll().stream()
                .filter(k -> k.getLevel().equals(levelDev))
                .map(Skills::getId)
                .collect(Collectors.toList());


        for (Long id : resultLevel) {
            List<Long> result = developerSkillRepository.findAll().stream()
                    .filter(s -> s.getSkillId().equals(id))
                    .map(DeveloperSkill::getDeveloperId)
                    .collect(Collectors.toList());

            for (Long i : result) {
                Optional<Developer> byId = developerRepository.findById(i);
                developerLevel.add(byId.get());
            }
        }
        return developerLevel;
    }

    @Override
    public List listProWithData() {
        return projectRepository.findAll().stream()
                .map(p -> p.getCreateData() + " - " + p.getName())
                .collect(Collectors.toList());
    }
}


