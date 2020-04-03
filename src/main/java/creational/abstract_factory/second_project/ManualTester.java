package creational.abstract_factory.second_project;

import creational.abstract_factory.factory_interfaces.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("manual tester tests code");
    }
}
