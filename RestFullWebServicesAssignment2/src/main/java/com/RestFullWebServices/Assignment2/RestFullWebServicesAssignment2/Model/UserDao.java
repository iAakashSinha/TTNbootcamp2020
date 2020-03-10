package com.RestFullWebServices.Assignment2.RestFullWebServicesAssignment2.Model;

import com.RestFullWebServices.Assignment2.RestFullWebServicesAssignment2.Service.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "User Model Class")
@Component
public class UserDao {

    List<User> ls = new ArrayList<User>();

    //Get List of Users
    public List<User> getUserList()
    {
        return ls;
    }

    //Get Single User
    public User findOne(Integer id)
    {
        for (User user:ls)
        {
            if (user.getId()==id)
                return user;
        }
        return null;
    }

    //Post a Single User
    public User addUser(User user)
    {
        ls.add(user);
        return user;
    }

    //Delete a Single User
    public String deleteUser(Integer id)
    {
        for (User user1:ls)
        {
            if (user1.getId()==id)
            {
                ls.remove(user1);
                return "User Deleted";
            }
        }
        return null;
    }

}
