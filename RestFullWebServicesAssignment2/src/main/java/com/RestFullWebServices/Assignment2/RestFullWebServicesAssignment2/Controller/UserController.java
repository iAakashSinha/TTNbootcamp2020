package com.RestFullWebServices.Assignment2.RestFullWebServicesAssignment2.Controller;

import com.RestFullWebServices.Assignment2.RestFullWebServicesAssignment2.Model.UserDao;
import com.RestFullWebServices.Assignment2.RestFullWebServicesAssignment2.Service.User;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
//import org.springframework.hateoas.EntityModel;
//import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
//import static org.springframework.hateoas.server.reactive.WebFluxLinkBuilder.methodOn;

@ApiModel(description = "User Controller Class")
@RestController
public class UserController {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private UserDao obj;

    @ApiOperation(value = "Get The List Of All Users")
    @GetMapping(path="/Users")
    public List<User> getAllUser()
    {
        return obj.getUserList();
    }

    @ApiOperation(value = "Get The Info About One User")
    @GetMapping(path="/Users/{id}")
    public User findOne(@PathVariable Integer id)
    {
        User user = obj.findOne(id);
        return user;
    }

//    //HATEOAS IMPLEMENTATION
//    @GetMapping(path="/Users/{id}")
//    public EntityModel<User> findOne(@PathVariable Integer id)
//    {
//        User user = obj.findOne(id);
//
//        EntityModel<User> model = new EntityModel<>(user);
//        WebMvcLinkBuilder linkTo = linkTo(methodOn(this.getClass()).getAllUser());
//        model.add(linkTo.withRel("all-users"));
//
//        return model;
//    }

    @ApiOperation(value = "Add the User")
    @PostMapping(path="/Users")
    public User addUser(@RequestBody User user)
    {
        User user1 = obj.addUser(user);
        return user1;
    }

    @ApiOperation(value = "Internationalized Method")
    @GetMapping(path = "/Users-internationalized/{id}")
    public String UserInternationalized(@PathVariable Integer id,@RequestHeader(name = "Accept-Language",required = false) Locale locale){
        User user = obj.findOne(id);
        String username = user.getUsername();
        return messageSource.getMessage("hello.message",null,locale) +" " +username;
    }

    @ApiOperation(value = "Delete A Single User")
    @DeleteMapping(path="/Users/{id}")
    public String deleteUser(@PathVariable Integer id)
    {
        String message = obj.deleteUser(id);
        return message;
    }

    //DYNAMIC FILTERING
    @ApiOperation(value = "Add the User using Dynamic Filter")
    @PostMapping(path="/Users/Users-Filters")
    public MappingJacksonValue addUserDynamicFilter(@RequestBody User user)
    {
        User user1 = obj.addUser(user);
        SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("id","username");

        FilterProvider filters = new SimpleFilterProvider().addFilter("PostDynamicFilter",filter);

        MappingJacksonValue mapping = new MappingJacksonValue(user1);

        mapping.setFilters(filters);
        return mapping;
    }

    //URI VERSIONING
    @GetMapping("Users/v1/{id}")
    public String userV1(@PathVariable Integer id){
        User user = obj.findOne(id);
        String username = user.getUsername();
        return "The Username is: "+username;
    }

    @GetMapping("Users/v2/{id}")
    public String userV2(@PathVariable Integer id){
        User user = obj.findOne(id);
        String username = user.getUsername();
        String id1 = user.getId().toString();
        return "The User id is: "+ id1 + " The Username is: "+username;
    }


    //Request Parameter versioning
    @GetMapping(value = "Users/{id}/param", params = "version=1")
    public String userparamV1(@PathVariable Integer id){
        User user = obj.findOne(id);
        String username = user.getUsername();
        return "The Username is: "+username;
    }

    @GetMapping(value = "Users/{id}/param", params = "version=2")
    public String userparamV2(@PathVariable Integer id){
        User user = obj.findOne(id);
        String username = user.getUsername();
        String id1 = user.getId().toString();
        return "The User id is: "+ id1 + " The Username is: "+username;
    }


    //Custom Header Versioning
    @GetMapping(value = "Users/{id}/header", headers = "X-version=1")
    public String userheaderV1(@PathVariable Integer id){
        User user = obj.findOne(id);
        String username = user.getUsername();
        return "The Username is: "+username;
    }

    @GetMapping(value = "Users/{id}/header", headers = "X-version=2")
    public String userheaderV2(@PathVariable Integer id){
        User user = obj.findOne(id);
        String username = user.getUsername();
        String id1 = user.getId().toString();
        return "The User id is: "+ id1 + " The Username is: "+username;
    }

    //MimeType Versioning
    @GetMapping(value = "Users/{id}/produces", produces = "application/vnd.company.app-v1+json")
    public String userproducesV1(@PathVariable Integer id){
        User user = obj.findOne(id);
        String username = user.getUsername();
        return "The Username is: "+username;
    }

    @GetMapping(value = "Users/{id}/produces", produces = "application/vnd.company.app-v2+json")
    public String userproducesV2(@PathVariable Integer id){
        User user = obj.findOne(id);
        String username = user.getUsername();
        String id1 = user.getId().toString();
        return "The User id is: "+ id1 + " The Username is: "+username;
    }
}
