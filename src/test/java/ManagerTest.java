import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Filip Kuszenin", "NI1234567", 1400.00, "department1");
    }

    @Test
    public void hasName() {
        assertEquals("Filip Kuszenin", manager.getName());
    }

    @Test
    public void hasNin() {
        assertEquals("NI1234567", manager.getInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1400.00, manager.getSalary(), 0.01);
    }


    @Test
    public void hasDepartment() {
        assertEquals("department1", manager.getDepartment());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(200.00);
        assertEquals(1600.00, manager.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(14.00, manager.payBonus(), 0.01);
    }





}
