package Utorak;


import Utorak.users.AdminUser;
import Utorak.users.RegularUser;

public class Application {
    public static void main(String[] args) {
        // var com = new Comment("111111");
        // var com1 = new Comment("222222");
        // var com2 = new Comment("33333");
        // var com3 = new Comment("44444");
        //
        // System.out.println(com.getId() + " " + com1.getId());
        //
        // var post = new Post("Nesto", "Neki tekst");
        // post.addComment(com);
        // post.addComment(com1);
        // post.addComment(com2);
        //
        // post.printComments();
        // System.out.println("---------------");
        // var post2 = new Post("nesto drugo", "Nesto drugo tekst");
        // post2.addComment(com3);
        //
        // post2.printComments();
        // System.out.println("---------------");
        // post.removeComment(1);
        //
        // post.printComments();
        // System.out.println("---------------");
        //
        // System.out.println(post);

        var user = new RegularUser("peran", "1234");
        var user2 = new AdminUser("user", "1234");
        System.out.println(user);

        user.register();
        user2.register();
        //Blog.printRegisteredUsers();


//        if(testLogin != null){
//            System.out.println("Успешно");
//            System.out.println(testLogin);
//        }
//        else{
//            System.out.println("Није успешно");
//        }
    }
}
