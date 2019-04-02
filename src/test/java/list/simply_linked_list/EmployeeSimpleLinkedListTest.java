package list.simply_linked_list;

import model.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeSimpleLinkedListTest {

    @Test
    public void simpleLinkedListTest() {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeLinkedList list = new EmployeeLinkedList();

        assertTrue(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        assertEquals(list.getSize(), 4);

        list.printList();

        list.removeFromFront();
        assertEquals(list.getSize(), 3);
        list.printList();
    }
}