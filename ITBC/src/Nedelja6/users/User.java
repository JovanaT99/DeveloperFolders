package Nedelja6.users;

import Nedelja6.users.enums.PermissionLevel;
import Nedelja6.users.interfaces.Loginable;
import Nedelja6.users.interfaces.Registrable;

import java.util.HashMap;

import static Nedelja6.Blog.allUsers;
import static Nedelja6.Blog.userNextId;

public abstract class User implements Registrable, Loginable {

    protected String username;
    protected String password;
    abstract PermissionLevel getPermisionLevel();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login() {
        for (User user : allUsers.values()) {
            if (user.username.equalsIgnoreCase(username)) {
                if(user.password.equals(password)) {
                    return true;

                } else {
                    System.out.println("Pogresna sifra");
                    return false;
                }

            }
            System.out.println("Registeovan");
        }
        System.out.println("Korisnik ne postoji");
        return false;
    }

    @Override
    public boolean register() {
        for (User user : allUsers.values()) {
            if (user.username.equalsIgnoreCase(username)) {
                System.out.println();
                System.out.println("Korisnik vec postoji");
                return false;
            }
        }
        allUsers.put(userNextId, this);
        userNextId++;
        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
