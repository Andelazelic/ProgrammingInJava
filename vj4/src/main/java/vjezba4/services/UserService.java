package vjezba4.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vjezba4.entitiy.Users;
import vjezba4.repositories.DeviceRepository;
import vjezba4.repositories.UserRepository;

import lombok.AllArgsConstructor;
import lombok.Data;
//@AllArgsConstructor
//@Data
@Service
public class UserService {
    private   UserRepository user;
    @Autowired
    public UserService(UserRepository u) {
        this.user=u;
    }

    public List<Users> findAllUsers(){
        return user.getAll();
    }
    public Users findUserById(Long x) {
        return user.getById(x);
    }
    public void addUser(Users u) {
        user.add(u);
    }
    public void deleteUser(Long x) {
        user.deleteById(x);
    }




}
