package Sevice;

import model.User;

import java.util.ArrayList;

public class UserSevice {
    public ArrayList<User> list = new ArrayList<>();
    public UserSevice(){
        list.add(new User(1,"nam","123","nam@gmail.com"));
        list.add(new User(2,"hoan","321","hoan@gmail.com"));
        list.add(new User(3,"cuong","111","cuong@gmail.com"));
    }
    public void save(User user){
        list.add(user);
    }
    public void edit(int id,User user){
        list.set(id,user);
    }
    public void remove(int id){
        list.remove(id);
    }

}
