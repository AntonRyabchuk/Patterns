package creational.abstract_factory.first_project;

import creational.abstract_factory.factory_interfaces.ProjectManager;

public class FirstProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages project");
    }
}
