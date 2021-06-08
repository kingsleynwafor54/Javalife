package Polling;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PollingTest {
Polling polling;
@BeforeEach
    void beforeEach() {
    polling = new Polling();
}
    @AfterEach
    void afterEach(){
        polling=null;
    }

@Test
    void methodAssertNull(){
    assertNotNull(polling);
}

}
