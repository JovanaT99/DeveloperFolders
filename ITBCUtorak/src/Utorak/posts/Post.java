package Utorak.posts;

import Utorak.Database;

import java.util.ArrayList;
import java.util.List;

// 2. Направити класу Post
//     - `int id`
//     - `title` - String
//     - `text` - String
//     - `comments` - Листа коментара
//     - Метода за додавање коментара
//     - Метода за брисање коментара са одређеним `id`

public class Post {
    private static int count = 0;

    private final int id;
    private String title;
    private String text;
    private final List<Comment> comments;
    private int userId;

    public Post(String title, String text,int userId) {
        this.title = title;
        this.text = text;
        this.comments = new ArrayList<>();
        this.userId=userId;
        this.id = count++;
        Database.dodajPost(this);
        // Додати у базу
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addComment(Comment comment){
        this.comments.add(comment);
    }

    public void removeComment(int id){
        // int index = -1;
        // for(int i = 0; i < this.comments.size(); i++){
        //     if(comments.get(i).getId() == id){
        //         index = i;
        //         break;
        //     }
        // }
        // this.comments.remove(index);

        this.comments.removeIf(comment -> comment.getId() == id);
    }

    public void printComments(){
        for(var comment : comments){
            System.out.println(comment);
        }
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", comments=" + comments +
                '}';
    }
}
