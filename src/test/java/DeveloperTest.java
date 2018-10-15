import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Filip Kuszenin", "NI1234567", 1400.00);
    }

    @Test
    public void hasName() {
        assertEquals("Filip Kuszenin", developer.getName());
    }

    @Test
    public void hasNin() {
        assertEquals("NI1234567", developer.getInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1400.00, developer.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(200.00);
        assertEquals(1600.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(14.00, developer.payBonus(), 0.01);
    }

}
