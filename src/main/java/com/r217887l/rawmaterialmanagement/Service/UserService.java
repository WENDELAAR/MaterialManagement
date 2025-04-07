package com.r217887l.rawmaterialmanagement.Service;

import com.r217887l.rawmaterialmanagement.Model.Users;
import com.r217887l.rawmaterialmanagement.Repo.UsersRepo;
import java.util.List;

public class UserService {

    UsersRepo usersRepo = new UsersRepo();
    
    public void saveUser(Users user){
    
        usersRepo.saveUser(user);
    
    }
    
    
    public void updateUser(Users user,int id){
    
        usersRepo.updateUser(user,id);
    
    }
    
    public void deleteUser(int id){
    
        usersRepo.deleteUser(id);
    
    }
    
    public List<Users> findAllUsers(Users users){
    
        return usersRepo.findAllUsers(users);
    
    }

    public boolean checkIfUserTableEmpty() {
   
        return usersRepo.chechIfUserTableEmpty();
   
    }
    
}
