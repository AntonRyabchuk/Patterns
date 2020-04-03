package creational.abstract_factory.first_project;

import creational.abstract_factory.factory_interfaces.Developer;
import creational.abstract_factory.factory_interfaces.ProjectManager;
import creational.abstract_factory.factory_interfaces.ProjectTeamFactory;
import creational.abstract_factory.factory_interfaces.Tester;

public class FirstProjectTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new FirstProjectManager();
    }
}
