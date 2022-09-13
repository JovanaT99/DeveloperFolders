package Nedelja6;

import Nedelja6.users.AdminUser;
import Nedelja6.users.ModeratorUser;
import Nedelja6.users.RegularUser;
import Nedelja6.users.User;
import Nedelja6.users.enums.PermissionLevel;

import java.util.HashMap;

public class Blog {

    public static int userNextId = 0;

    public static HashMap<Integer, User> allUsers = new HashMap<>();

    public void registrujKorisnika(String username, String password, PermissionLevel permissionLevel) {
        User user;
        switch (permissionLevel) {
            case REGULAR -> user = new RegularUser(username, password);
            case MODERATOR -> user = new ModeratorUser(username, password);
            case ADMIN -> user = new AdminUser(username, password);
            default -> {
                System.out.println("Pogresan tip korisnika");
                return;
            }
        }

        if(user.register()) {
            System.out.println("Uspesna registracija");
        }
    }

    public void prijaviKorisnika(String username, String password) {

    }

//    private boolean daLiUserPostoji(String username) {
//        for (User user : registeredUsers.values()) {
//
//            if (user.getUsername().equalsIgnoreCase(username)) {
//                return true;
//            }
//        }
//        return false;
//
//    }
}

