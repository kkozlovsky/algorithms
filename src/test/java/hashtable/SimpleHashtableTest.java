package hashtable;

import model.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleHashtableTest {

    @Test
    public void putAndGetFromSimpleHashTable() {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        SimpleHashtable ht = new SimpleHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.put("Bill", billEnd);

        ht.printHashtable();

        assertEquals(ht.get("Jones"), janeJones);
        assertEquals(ht.get("Smith"), janeJones); // Smith не вставился
    }
}