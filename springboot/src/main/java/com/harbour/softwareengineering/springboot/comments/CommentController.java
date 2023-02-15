package com.harbour.softwareengineering.springboot.comments;

import java.time.Instant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


//@EnableAspectJAutoProxy
@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/v1/comment")
    public String publish() {
        Comment comment = new Comment("comment", "Bob");
        commentService.publishComment(comment);

        return "OK";
    }

    @PostMapping("/v2/comment")
    public void publish2() {
        var timeStart = Instant.now().toEpochMilli();
        Comment comment = new Comment("comment", "Bob");

        commentService.publishComment(comment);
        var timeEnd = Instant.now().toEpochMilli();

        System.out.println("latency is " + (timeEnd - timeStart));
    }
}
