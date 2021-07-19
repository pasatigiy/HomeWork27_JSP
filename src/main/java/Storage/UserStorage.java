package Storage;

import entity.User;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {

    private static List<User> userList = new ArrayList<>();

    public void save (User user){userList.add(user);}

    public boolean existByUsername(String username){
    for (User user: userList){
        if (user.getUsername().equals(username)){
            return true;
        }
    }
    return false;
    }

    public User getByUsername(String username){
        for (User user : userList) {
            if (user.getUsername().equals(username)){
                return user;
            }
        } return null;
    }
}
