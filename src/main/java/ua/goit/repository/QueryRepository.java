package ua.goit.repository;

import ua.goit.model.BaseEntity;
import ua.goit.model.Developer;

import java.util.List;

public interface QueryRepository<T extends BaseEntity<ID>, ID> {

    Long getSalaryDevsByProject(Long id);

    List<T> listDevelopersByProject(Long id);

    List<T> listDevelopersByProgramLanguage(String language);

    List<T> listLevelDevelopers(String levelDev);

    List<T> listProWithData();

}
