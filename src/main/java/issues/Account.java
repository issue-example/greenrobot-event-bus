package issues;

public class Account {

    private boolean registered = false;

    public void onEvent(Registered registered) {
        this.registered = true;
    }

    public boolean isRegistered() {
        return registered;
    }
}
