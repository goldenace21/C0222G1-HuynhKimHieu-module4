package com.example.borrow_book_application.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class BookAspect {
    @After("execution(* com.example.borrow_book_application.controller.BookController.borrowBook(..))")
    public void logAfterMethodController(JoinPoint joinPoint) {
        String method = joinPoint.getSignature().getName();
        System.err.println("The method just called is:" + method);
    }

    private int countVisitor = 0;

    @Pointcut("within(com.example.borrow_book_application.controller.BookController*)")
    public void allControllerPointCut() {
    }

    @After("allControllerPointCut()")
    public void countVisitor() {
        System.out.println("------------------");
        System.err.println("The number of visitor = " + countVisitor++);
    }
}
