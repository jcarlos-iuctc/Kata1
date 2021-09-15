
package es.ulpgc.kata1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Person {
    private final String name; 
    private final Calendar birthdate;
    

    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    int getAge() {
        
        Calendar today = GregorianCalendar.getInstance();
        
        final long MillisecondsPerYear = (long) (365.25*24*60*60*1000);
        return (int) ((today.getTimeInMillis() - birthdate.getTimeInMillis())/MillisecondsPerYear);
        
    }

    
    
    
    
    
    
    

}
