package br.com.leo;


import br.com.leo.model.person;
import br.com.leo.services.personServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class personController {

    @Autowired
    private personServices services;

    //private personServices service = new personServices();
    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<person> findAll() {
        return services.findAll();
    }


    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public person findByID(@PathVariable(value = "id") Long id) {
        return services.findByID(id);


    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public person create(@RequestBody person Person){
        return services.create(Person);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public person update(@RequestBody person Person){
        return services.update(Person);
    }


    @RequestMapping(value = {"/{id}"},
            method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id")Long id){
         services.delete(id);
    }


}
