package vjezba4.repositories;

import vjezba4.entitiy.Users;

import java.util.List;
public class UserRepository implements MainRepository<Users> {
    private static List<Users> users;
    public List<Users> getAll(){
        return users;
    };
    public Users getById(Long x) {
        Users t = null;
        for (Users u:users) {
            if(u.getDeviceId()==x) {
                return u;
            }
        }
        return t;
    };
    public void add(Users u) {
        users.add(u);
    };
    public void deleteById(Long x) {
        for(Users u:users) {
            if(u.getUserId()==x) {
                users.remove(u);
            }
        }
    };
}
