package org.example;

import org.example.entities.Comment;
import org.example.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Congrats! You deserve this!!");
        Comment c2 = new Comment("Wow, now you can have a husky!");
        Post p1 = new Post(
                sdf.parse("22/05/2027 15:05:44"),
                "Going to Canada",
                "We are going to work in Canada!!",
                13);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Omg he's giant! I want to pet him");
        Comment c4 = new Comment("Hello devil eyes!");
        Post p2 = new Post(
                sdf.parse("13/02/2028 01:02:36"),
                "New partner!",
                "Meet the Sirius! Our black husky...look at those eyes lol",
                27);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);


    }
}