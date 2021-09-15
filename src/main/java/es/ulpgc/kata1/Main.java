

package es.ulpgc.kata1;

import java.util.Date;


public class Main {
    
    public static void main(String[] args) {
        
        Person person = new Person("Antonio", new Date(76,0, 3));
        System.out.println(person.getName() + " tiene " +  person.getAge() + " años.");
        
        
        
    }

}
