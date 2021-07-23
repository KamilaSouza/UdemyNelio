import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Awesome!");
        Comment c3= new Comment("Good Night");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Travelling to new Zealand", "Im going to visit this wonderful country", 12);
        Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys!", "See you tomorrow",5);

        p1.addComment(c1);
        p1.addComment(c2);
        p2.addComment(c3);

        System.out.println(p1);
        System.out.println(p2);

    }
}
