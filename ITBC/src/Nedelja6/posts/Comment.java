package Nedelja6.posts;

import java.time.LocalDate;

public class Comment {
  private static int count=0;
    private  int id;
    private String text;
    private LocalDate localDate;


    public Comment(String text, LocalDate localDate) {
        this.text = text;
        this.localDate = localDate;
        this.id=count;
        count++;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "text='" + text + '\'' +
                ", localDate=" + localDate +
                '}';
    }
}
