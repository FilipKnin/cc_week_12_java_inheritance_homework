import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Filip Kuszenin", "NI1234567", 1400.00);
    }

    @Test
    public void hasName() {
        assertEquals("Filip Kuszenin", databaseAdmin.getName());
    }

    @Test
    public void hasNin() {
        assertEquals("NI1234567", databaseAdmin.getInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1400.00, databaseAdmin.getSalary(), 0.01);
    }


    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(200.00);
        assertEquals(1600.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(14.00, databaseAdmin.payBonus(), 0.01);
    }


}
