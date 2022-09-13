package Utorak.users;

import Nedelja6.users.enums.PermissionLevel;

import java.util.ArrayList;
import java.util.List;

// 6. Направити класу RegularUser која наслеђује класу User
//     - `postIds` - Листа објава (id)
//     - `commentIds` - Листа  коментара (id)
//     - Имплементира `getPermissionLevel()` - Враћа `Regular`
public class RegularUser extends User{
    private final List<Integer> postIds;
    private final List<Integer> commentIds;

    public RegularUser(String username, String password) {
        super(username, password);
        postIds = new ArrayList<>();
        commentIds = new ArrayList<>();
    }

    public List<Integer> getPostIds() {
        return postIds;
    }

    public void addPostId(int id){
        postIds.add(id);
    }

    public List<Integer> getCommentIds() {
        return commentIds;
    }

    public void addCommentId(int id){
        commentIds.add(id);
    }

    @Override
    public PermissionLevel getPermissionLevel() {
        return PermissionLevel.REGULAR;
    }
}
