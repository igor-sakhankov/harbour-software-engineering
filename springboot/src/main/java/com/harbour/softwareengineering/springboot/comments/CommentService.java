package com.harbour.softwareengineering.springboot.comments;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private final Logger LOGGER =
        Logger.getLogger(CommentService.class.getName());

    public void publishComment(Comment comment) {
        LOGGER.info("[INFO] Publishing comment:" + comment.text());

        throw new RuntimeException("Failure");
    }
}
