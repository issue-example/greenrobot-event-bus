package issues;

import de.greenrobot.event.EventBus;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EventBusTest {

    private EventBus bus;
    private Account account;

    @Before
    public void setUp() throws Exception {
        bus = new EventBus();
        account = new Account();
    }

    @Test
    public void shouldMarkAccountAsRegisteredWhenReceiveEvent() {
        bus.post(new Registered());

        assertThat(account.isRegistered()).isTrue();
    }
}
