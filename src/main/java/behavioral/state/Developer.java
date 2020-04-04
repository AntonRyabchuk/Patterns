package behavioral.state;

import behavioral.state.action.Activity;
import behavioral.state.action.Coding;
import behavioral.state.action.Eating;
import behavioral.state.action.Sleeping;

public class Developer {

    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Eating());
        } else if (activity instanceof Eating) {
            setActivity(new Coding());
        } else if (activity instanceof Coding) {
            setActivity(new Sleeping());
        }
    }

    public void performAction() {
        activity.performAction();
    }
}
