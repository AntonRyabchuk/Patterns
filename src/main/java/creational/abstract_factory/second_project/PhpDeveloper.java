package creational.abstract_factory.second_project;

import creational.abstract_factory.factory_interfaces.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes PHP code");
    }
}
