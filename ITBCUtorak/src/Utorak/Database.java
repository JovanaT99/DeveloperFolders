package Utorak;

import Utorak.posts.Comment;
import Utorak.posts.Post;
import Utorak.users.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public abstract class Database {
    private static final HashMap<Integer, User> RegisteredUsers = new HashMap<>();
    private static final HashMap<Integer, Post> allPosts = new HashMap<>();
    private static final List<Comment> allComments = new ArrayList<>();

    // RegisteredUsers
    public static User getUser(int id) {
        return RegisteredUsers.get(id);
    }

    public static void updateOrCreateUser(User user) {
        RegisteredUsers.put(user.getId(), user);
    }

    public static void deleteUser(int id) {
        RegisteredUsers.remove(id);
    }

    public static ArrayList<User> getAllUsers() {
        var x = RegisteredUsers.values();

        return new ArrayList<>(x);
    }

    public static boolean isExistingId(int id) {
        return getUser(id) != null;
    }

    public static User getUser(String username, String password) throws IOException {
        var allUsers = getAllUsers();

        for (var user : allUsers) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }

        throw new IOException("Korisnik nije pronadjen");
    }

    // AllPosts
    public static boolean isPostInList(int postId) {

        return allPosts.containsKey(postId);
    }

    public static ArrayList<Post> allPosts() {

        return allPosts();

    }

    public static void dodajPost(Post post) {

        allPosts.put(post.getId(), post);

    }

    public static void removePost(int postId) {

        allPosts.remove(postId);

    }

    public static void creatComment(Comment comment) {

        allComments.add(comment);

    }



}
