package hashcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Khach on 04-Aug-18.
 */
public class TestHashCode {
    public static void main(String[] args) {
        Person p1 = new Person("Khach", 32);
        Person p2 = new Person("Gugo", 27);
        Person p3 = new Person("Khach", 32);

        System.out.println(p1.hashCode()); //1163157884
        System.out.println(p2.hashCode()); //1956725890
        System.out.println(p3.hashCode()); //356573597

        System.out.println("p1.equals(p2) " + p1.equals(p2)); //false
        System.out.println("p1.equals(p3) " + p1.equals(p3)); //false

        Set persons = new HashSet();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);

        Iterator iterator = persons.iterator();
        /**
         * hashcode.Person@74a14482
         * hashcode.Person@4554617c
         * hashcode.Person@1540e19d
         */
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("------------------------------------------------------------\n");

        PersonImplEx pi1 = new PersonImplEx("Khach", 32);
        PersonImplEx pi2 = new PersonImplEx("Gugo", 27);
        PersonImplEx pi3 = new PersonImplEx("Khach", 32);

        System.out.println(pi1.hashCode()); //-2048746665
        System.out.println(pi2.hashCode()); //69157989
        System.out.println(pi3.hashCode()); //-2048746665

        System.out.println("pi1.equals(pi2) " + pi1.equals(pi2)); //false
        System.out.println("pi1.equals(pi3) " + pi1.equals(pi3)); //true

        Set personsi = new HashSet();
        personsi.add(pi1);
        personsi.add(pi2);
        personsi.add(pi3);

        System.out.println("personsi.size() = " + personsi.size());

        Iterator iter = personsi.iterator();
        /**
         * hashcode.PersonImplEx@85e29b57
         * hashcode.PersonImplEx@41f4465
         */
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
