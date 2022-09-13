package Nedelja6.posts;

import java.util.ArrayList;
import java.util.HashMap;

public class Post {


    private static int id = 0;
    private String title;
    private String text;
    HashMap<Integer, Comment> comments = new HashMap<>();
    //ArrayList<Comment> comments;


    public Post(String title, String text) {
        this.title = title;
        this.text = text;
        id++;
    }

    public void dodajKomentar(Comment comment) {

        comments.put(comment.getId(), comment);
    }

    public void obrisiKomentar(int id) {

        comments.remove(id);

    }

}
