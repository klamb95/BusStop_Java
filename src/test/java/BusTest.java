import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busStop;



    @Before
    public void before(){
        bus = new Bus("Edinburgh");
        person = new Person();
        busStop = new BusStop("Test");
        busStop.addPersonToQueue(person);

    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.personCount());
    }

    @Test
    public void canAddPassenger(){
        bus.addPerson(person);
        assertEquals(1, bus.personCount());
    }

    @Test
    public void cannotAddPassenger(){
        bus.addPerson(person);
        bus.addPerson(person);
        bus.addPerson(person);
        assertEquals(2, bus.personCount());
    }

    @Test
    public void canRemovePassenger(){
        bus.addPerson(person);
        bus.removePerson();
        assertEquals(0, bus.personCount());
    }

    @Test
    public void canPickUp(){
        bus.pickup(busStop);
        assertEquals(1, bus.personCount());
    }

}
