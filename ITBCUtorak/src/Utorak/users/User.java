package Utorak.users;

// 5. Направити апстрактну класу User која имплементира Registrable и Loginable
//     - `int id`
//     - `username` String
//     - `password` String
//     - Конструктор User-a сам одређује `id` по принципу ++
//     - Апстрактна метода `PermissionLevel getPermissionLevel()`


import Utorak.Database;
import Utorak.users.enums.PermissionLevel;
import Utorak.users.interfaces.Registrable;

public abstract class User implements Registrable {
    private static int count = 0;

    private final int id;
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.id = count++;
    }

    public abstract PermissionLevel getPermissionLevel();

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean register() {
        if(Database.isExistingId(this.getId())){
            return false;
        }

        Database.updateOrCreateUser(this);

        return true;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
