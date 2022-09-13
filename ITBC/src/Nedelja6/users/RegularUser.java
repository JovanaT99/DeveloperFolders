package Nedelja6.users;

import Nedelja6.users.enums.PermissionLevel;

import java.util.ArrayList;

import static Nedelja6.Blog.userNextId;

public class RegularUser extends User {


    private int id;
    private ArrayList<Integer>postIds=new ArrayList<>();
    private ArrayList<Integer>commentsId=new ArrayList<>();

    public RegularUser(String username, String password) {
        super(username, password);
        id = userNextId;
    }

    public int getId() {
        return id;
    }

    @Override
    PermissionLevel getPermisionLevel() {
        return PermissionLevel.REGULAR;
    }
}
