import java.util.ArrayList;

public class Bus {

    private ArrayList<Person> passengers;
    private int capacity;
    private String destination;

    public Bus(String destination){
        this.passengers = new ArrayList<>();
        this.capacity = 2;
        this.destination = destination;
    }

    public int personCount() {
        return this.passengers.size();
    }

    public String addPerson(Person person) {
        if (personCount() < 2){
            this.passengers.add(person);
            return "Person has been added";
        }
            return "Bus is full" ;
    }

    public void removePerson() {
        this.passengers.remove(0);
    }

    public void pickup(BusStop busStop) {
        Person person = busStop.removePersonFromQueue();
        this.addPerson(person);
    }
}
