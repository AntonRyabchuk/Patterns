package creational.abstract_factory.first_project;

import creational.abstract_factory.factory_interfaces.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code");
    }
}
