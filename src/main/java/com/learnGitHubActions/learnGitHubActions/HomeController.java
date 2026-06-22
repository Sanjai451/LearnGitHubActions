package com.learnGitHubActions.learnGitHubActions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String greet(){
        return homeService.getGreetingMessage();
    }

    @GetMapping("/add")
    public String addNum(@RequestParam int a,
                         @RequestParam int b) {
        return "Sum : " + homeService.addNumber(a, b);
    }

    // return the difference of two numbers
    @GetMapping("/diff")
    public String diffNum(@RequestParam int a,
                         @RequestParam int b) {
        return "Diff : " + homeService.subNumber(a, b);
    }

    @GetMapping("/mul")
    public String multipleNum(@RequestParam int a,
                         @RequestParam int b) {
        return "Product : " + (a * b);
    }

}
