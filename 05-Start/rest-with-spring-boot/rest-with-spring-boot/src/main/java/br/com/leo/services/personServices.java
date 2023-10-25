package br.com.leo.services;

import br.com.leo.model.person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service

public class personServices {

    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(personServices.class.getName());

    public person findByID(String id){
        logger.info("Finding one person!");

        person Person = new person();


        Person.setId(counter.incrementAndGet());
        Person.setFirstName("Leonardo");
        Person.setLastName("Piaui");
        Person.setAddress("Londrina-PR");
        Person.setGender("Male");
        return Person;
    }

    public List<person> findAll(){
        logger.info("Finding all people");
         List<person> persons = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            person Person = mockPerson(i);
            persons.add(Person);
        }

        return persons;
    }

    private person mockPerson(int i) {
        person Person = new person();


        Person.setId(counter.incrementAndGet());
        Person.setFirstName("Person name "+i );
        Person.setLastName("Last Name "+i);
        Person.setAddress("Some address in Brazil "+i);
        if(i%2==0){Person.setGender("Male");}
        else{Person.setGender("Female");}

        return Person;

    }

    public person create(person Person){
        logger.info("Creating one person");

        return Person;
    }

    public person update(person Person){
        logger.info("Updating one person");
        return Person;
    }


    public void delete(String id){
        logger.info("Deleting one person");

    }
}
