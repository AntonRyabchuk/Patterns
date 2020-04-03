package creational.abstract_factory.factory_interfaces;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getPM();
}
