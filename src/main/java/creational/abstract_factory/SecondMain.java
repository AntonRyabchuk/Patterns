package creational.abstract_factory;

import creational.abstract_factory.factory_interfaces.Developer;
import creational.abstract_factory.factory_interfaces.ProjectManager;
import creational.abstract_factory.factory_interfaces.ProjectTeamFactory;
import creational.abstract_factory.factory_interfaces.Tester;
import creational.abstract_factory.second_project.SecondProjectTeamFactory;

public class SecondMain {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new SecondProjectTeamFactory();

        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getPM();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
