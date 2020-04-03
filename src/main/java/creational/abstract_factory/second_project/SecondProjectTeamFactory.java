package creational.abstract_factory.second_project;

import creational.abstract_factory.factory_interfaces.Developer;
import creational.abstract_factory.factory_interfaces.ProjectManager;
import creational.abstract_factory.factory_interfaces.ProjectTeamFactory;
import creational.abstract_factory.factory_interfaces.Tester;

public class SecondProjectTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getPM() {
        return new SecondProjectManager();
    }
}
