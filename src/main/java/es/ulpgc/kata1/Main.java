

package es.ulpgc.kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Main {
    
    public static void main(String[] args) {
        Calendar birthdate = GregorianCalendar.getInstance();
        birthdate.set(1976, 1, 3);
        Person person = new Person("Antonio", birthdate);
        System.out.println(person.getName() + " tiene " +  person.getAge() + " años.");
                
        
    }

}
