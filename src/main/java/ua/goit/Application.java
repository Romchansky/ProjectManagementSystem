package ua.goit;


import ua.goit.controller.ConsoleController;
import ua.goit.model.Developer;
import ua.goit.model.Skills;
import ua.goit.repository.CrudRepository;
import ua.goit.repository.QueryRepository;
import ua.goit.repository.QueryRepositoryImpl;
import ua.goit.repository.RepositoryFactory;
import ua.goit.view.Console;
import ua.goit.view.View;

import java.util.List;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        CrudRepository<Developer, Long> repository = RepositoryFactory.of(Developer.class);
        View view = new Console();

        ConsoleController controller = new ConsoleController(view, repository);
        controller.run();


        /*
        CrudRepository<Skills,Long> skillRepository = RepositoryFactory.of (Skills.class);

        QueryRepository queryRepository = new QueryRepositoryImpl();

        List list = queryRepository.listDevelopersByProject(5L);
        System.out.println(list);

        Long totalSalaryDevelopersByProject = queryRepository.getSalaryDevsByProject(5L);
        System.out.println(totalSalaryDevelopersByProject);

        List developersBySkill = queryRepository.listDevelopersByProgramLanguage("C++");
        System.out.println(developersBySkill);
        List developerByLevel = queryRepository.listLevelDevelopers("Junior");
        System.out.println(developerByLevel);

        List projectWithCountDevAndDate = queryRepository.listProWithData();
        System.out.println(projectWithCountDevAndDate);
*/


        /*Company
        CrudRepository<Company, Long> companyRepository = RepositoryFactory.of(Company.class);
        List<Company> findAll = companyRepository.findAll();
        System.out.println(findAll);

        Optional<Company> c = companyRepository.findById(1L);
        System.out.println(c.get());

        Company company = Company.builder()
                .name("Epam")
                .city("Kiev")
                .build();
        Company create = companyRepository.save(company);
        System.out.println(create);

        companyRepository.deleteById(9L);
        companyRepository.close();
*/

        /*Developer
        CrudRepository<Developer, Long> developersRepository = RepositoryFactory.of(Developer.class);
        List<Developer> findAllDevs = developersRepository.findAll();
        System.out.println(findAllDevs);

        Optional<Developer> d = developersRepository.findById(2L);
        System.out.println(d.get());

        Developer developer = Developer.builder()
                .name("Tom")
                .gender("male")
                .age(25)
                .salary(1000L)
                .build();
          Developer createDeveloper = developersRepository.save(developer);
          System.out.println(createDeveloper);

          developersRepository.deleteById(14L);
*/


        /*Project
        CrudRepository<Project, Long> projectRepository = RepositoryFactory.of(Project.class);
        List<Project> findAllProject = projectRepository.findAll();
        System.out.println(findAllProject);

        System.out.println("*******************************************************");
        CrudRepository<DeveloperProject, Long> dPRepository = RepositoryFactory.of(DeveloperProject.class);
        List<DeveloperProject> findAllDevProject = dPRepository.findAll();

        List<Long> developerIdByProject = getDeveloperIdByProject(findAllDevProject);


        developersRepository.close();
        dPRepository.close();


        Optional<Project> p = projectRepository.findById(4L);
        System.out.println(p);

        Project project = Project.builder()
                .name("Red Dead Redemption")
                .field("Gaming")
                .cost(540000000L)
                .createData("2018-10-26")
                .build();
        Project createProject = projectRepository.save(project);
        System.out.println(createProject);

        projectRepository.deleteById(3L);
        projectRepository.close();
*/

        /*Customer
        CrudRepository<Customer, Long> customerRepository = RepositoryFactory.of(Customer.class);
        List<Customer> findAllCustomer = customerRepository.findAll();
        System.out.println(findAllCustomer);

        Optional<Customer> cu = customerRepository.findById(2L);
        System.out.println(cu);

        Customer customer = Customer.builder()
                .name("Rockstar Games")
                .city("New York")
                .industry("Video Games")
                .build();

        Customer createCustomer = customerRepository.save(customer);
        System.out.println(createCustomer);

        customerRepository.deleteById(5L);
        customerRepository.close();

        */
    }

}
