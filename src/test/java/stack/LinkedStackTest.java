package stack;

import model.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedStackTest {

    @Test
    public void linkedStackTest() {
        LinkedStack stack = new LinkedStack();

        stack.push(new Employee("Jane", "Jones", 123));
        stack.push(new Employee("John", "Doe", 4567));
        stack.push(new Employee("Mary", "Smith", 22));

        Employee mike = new Employee("Mike", "Wilson", 3245);
        Employee bill = new Employee("Bill", "End", 78);
        stack.push(mike);
        stack.push(bill);

        assertEquals(stack.peek(), bill);
        assertEquals(stack.pop(), bill);
        assertEquals(stack.pop(), mike);
    }
}