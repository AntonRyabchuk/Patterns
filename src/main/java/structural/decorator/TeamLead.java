package structural.decorator;

public class TeamLead extends DeveloperDecorator {

    public TeamLead(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob() + "Send week report.";
    }
}
