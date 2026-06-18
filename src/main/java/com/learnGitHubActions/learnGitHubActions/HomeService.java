package com.learnGitHubActions.learnGitHubActions;

import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public String getGreetingMessage(){
        return "Hello World!";
    }

    public int addNumber(int a, int b){
        return a + b;
    }

    public int subNumber(int a, int b){
        return a - b;
    }
}
