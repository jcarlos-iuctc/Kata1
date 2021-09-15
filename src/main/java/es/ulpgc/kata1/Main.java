

package es.ulpgc.kata1;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    
    public static void main(String[] args) {
       LocalDate birthdate;
       birthdate = LocalDate.of(1976, Month.JANUARY, 3);
        
        Person person = new Person("Antonio", birthdate);
        System.out.println(person.getName() + " tiene " +  person.getAge() + " años.");
                
        
    }

}
