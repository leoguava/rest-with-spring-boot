package br.com.leo.services;

import br.com.leo.exceptions.ResourceNotFound;
import br.com.leo.model.person;
import br.com.leo.repositories.PersonRepositoriy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service

public class personServices {


    @Autowired
    PersonRepositoriy repositoriy;

    private final Logger logger = Logger.getLogger(personServices.class.getName());

    public person findByID(Long id){
        logger.info("Finding one person!");


        return repositoriy.findById(id).orElseThrow(()->new ResourceNotFound("No records found for this id"));
    }

    public List<person> findAll(){


        return repositoriy.findAll();
    }

    public person create(person Person){
        logger.info("Creating one person");

        return repositoriy.save(Person);
    }

    public person update(person Person){
        logger.info("Updating one person");


        var entity = repositoriy.findById(Person.getId()).
                orElseThrow(()->new ResourceNotFound("No records found for this id"));


        entity.setFirstName(Person.getFirstName());
        entity.setLastName(Person.getLastName());
        entity.setAddress(Person.getAddress());
        entity.setGender(Person.getGender());

        return repositoriy.save(Person);
    }


    public void delete(Long id){
        logger.info("Deleting one person");
        var entity = repositoriy.findById(id).
                orElseThrow(()->new ResourceNotFound("No records found for this id"));
        repositoriy.delete(entity);




    }
}
