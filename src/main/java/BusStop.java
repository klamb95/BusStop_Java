import java.util.ArrayList;

public class BusStop {

    private ArrayList<Person> queue;
    private String stopName;

    public BusStop(String stopName){
        this.queue = new ArrayList<>();
        this.stopName = stopName;

    }


    public int queueCount() {
        return this.queue.size();
    }

    public void addPersonToQueue(Person person) {
        this.queue.add(person);
    }

    public Person removePersonFromQueue() {
        return this.queue.remove(0);
    }
}
