package Nedelja6.users;

import Nedelja6.users.enums.PermissionLevel;

import static Nedelja6.Blog.userNextId;

public class AdminUser extends User {
    private int id;

    public AdminUser(String username, String password) {
        super(username, password);
        id = userNextId;
    }

    public int getId() {
        return id;
    }

    @Override
    PermissionLevel getPermisionLevel() {
        return PermissionLevel.ADMIN;
    }

}
