package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.Users;
import com.r217887l.rawmaterialmanagement.Repo.UsersRepo;

public class UserService {

    UsersRepo usersRepo = new UsersRepo();
    
    public void saveUser(Users user){
    
        usersRepo.saveUser(user);
    
    }
    
    
    public void updateUser(Users user){
    
        usersRepo.updateUser(user);
    
    }
    
     public void deleteUser(Users user){
    
        usersRepo.deleteUser(user);
    
    }
    
}
