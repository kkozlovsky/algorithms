package list.doubly_linked_list;

import model.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeDoublyLinkedListTest {

    @Test
    public void doubleLinkedListTest() {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        list.printList();
        assertEquals(list.getSize(), 4);

        Employee billEnd = new Employee("Bill", "End", 78);
        list.addToEnd(billEnd);
        list.printList();
        assertEquals(list.getSize(), 5);
        list.removeFromFront();
        list.printList();
        assertEquals(list.getSize(), 4);
        list.removeFromEnd();
        list.printList();
        assertEquals(list.getSize(), 3);

    }

}