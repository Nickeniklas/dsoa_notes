import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeTest {

    @Test
    void testInstantiateBike() {
        Bike bike = new Bike("testbike");

        assertEquals("testbike", bike.getName());
    }

}