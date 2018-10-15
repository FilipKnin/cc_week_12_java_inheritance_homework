import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Filip Kuszenin", "NI1234567", 1400.00, "department1", 2000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Filip Kuszenin", director.getName());
    }

    @Test
    public void hasNin() {
        assertEquals("NI1234567", director.getInsuranceNumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(1400.00, director.getSalary(), 0.01);
    }


    @Test
    public void hasDepartment() {
        assertEquals("department1", director.getDepartment());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(200.00);
        assertEquals(1600.00, director.getSalary(), 0.01);
    }

    @Test
    public void canPayBonus() {
        assertEquals(14.00, director.payBonus(), 0.01);
    }

    @Test
    public void hasBudget() {
        assertEquals(2000.00, director.getBudget(), 0.01);
    }
}
