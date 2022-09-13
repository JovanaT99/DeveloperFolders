package Utorak.posts;

import java.time.LocalDate;

// 1. Направити класу Comment
//     - `int id`
//     - `String text`
//     - *Датум (не мора)
//     - Конструктор коментара сам одређује `id` по принципу ++

public class Comment {
    private static int count = 0;

    private final int id;
    private String text;
    private LocalDate date;
    private int postId;

    public Comment(String text, int postId) {
        this.text = text;
        this.date = LocalDate.now();
        this.id = count++;
        this.postId=postId;

        // Додати у базу
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", date=" + date +
                '}';
    }
}
