package com.harbour.softwareengineering.springboot.aspects;

import java.time.Instant;
import java.util.logging.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {


    private final Logger LOGGER = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(org.springframework.web.bind.annotation.PostMapping) execution(* com.harbour.softwareengineering.springboot.comments.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
       try {
           var timeStart = Instant.now()
                                  .toEpochMilli();
           LOGGER.info("Method will execute");
           var proceed = joinPoint.proceed();
           LOGGER.info("Method executed");
           var timeEnd = Instant.now()
                                .toEpochMilli();

           LOGGER.info("Latency is " + (timeEnd - timeStart));

           return proceed;
       } catch (Exception e) {
           return "Emotional damage";
       }
    }
}
