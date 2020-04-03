package creational.abstract_factory.second_project;

import creational.abstract_factory.factory_interfaces.ProjectManager;

public class SecondProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages second project");
    }
}
