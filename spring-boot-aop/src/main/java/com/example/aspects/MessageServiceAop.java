package com.example.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Aspect
@Component
public class MessageServiceAop {

    @Before("execution(* com.example.service.*.*(..))")
    public void beforeGetMessageMethod(JoinPoint joinPoint){
        System.out.println("Catched before getMessage() method : "+ joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.example.service.*.*(..))")
    public void a(){
        System.out.println("Message received");
    }
}
