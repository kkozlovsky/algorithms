package queue;

import model.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayQueueTest {

    @Test
    public void arrayQueueTest() {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(10);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.add(mikeWilson);
        queue.add(billEnd);

        assertEquals(queue.size(), 5);

        queue.remove();
        queue.remove();

        assertEquals(queue.size(), 3);

        queue.remove();
        queue.remove();
        queue.remove();

        assertEquals(queue.size(), 0);

        queue.add(mikeWilson);

        assertEquals(queue.size(), 1);

        queue.printQueue();
    }
}