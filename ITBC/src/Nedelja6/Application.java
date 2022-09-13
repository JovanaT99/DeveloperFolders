package Nedelja6;

import Nedelja6.posts.Comment;
import Nedelja6.posts.Post;
import Nedelja6.users.User;
import Nedelja6.users.enums.PermissionLevel;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {

var com=new Comment("hhdhd", LocalDate.now());
var post=new Post("TEST","FFFF");

      //post.dodajKomentar(com);
        //System.out.println(post);
var blog = new Blog();
blog.registrujKorisnika("Jovana", "1234", PermissionLevel.ADMIN);
blog.registrujKorisnika("Jovan", "1234", PermissionLevel.ADMIN);
blog.prijaviKorisnika("Jovana","1234");





    }
}
