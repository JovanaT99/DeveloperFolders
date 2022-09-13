package Utorak.users;

import Nedelja6.users.enums.PermissionLevel;

public class ModeratorUser extends User{
    public ModeratorUser(String username, String password) {
        super(username, password);
    }

    @Override
    public PermissionLevel getPermissionLevel() {
        return PermissionLevel.MODERATOR;
    }
}
