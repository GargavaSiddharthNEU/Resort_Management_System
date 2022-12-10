/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import java.util.ArrayList;
import Business.User.User;

/**
 *
 * @author manikantareddythikkavarapu
 */
public class UserDirectory {
    private ArrayList<User> users;
    
    public UserDirectory() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
    
    public User addPersons(){
        User person = new User();
        users.add(person);
        return person;
    }
    
    public User getUserById(String userId) {
        
        User selectedUser = new User();
        for(User user : users) {
            if(user.getUserId().equals(userId)) {
                selectedUser = user;
                break;
            }
        }
        return selectedUser;
    }
    
    public ArrayList<User> getUsersByRole(String userRole) {
        
        ArrayList<User> selectedUsers = new ArrayList<User>();
        for(User user : users) {
            if(user.getRoleType().equals(userRole)) {
                selectedUsers.add(user);
            }
        }
        return selectedUsers;
    }
}
