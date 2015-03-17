package com.diosoft.course.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class HelloController {

//    @RequestMapping(method = RequestMethod.GET)
//    public String printWelcome(ModelMap model) {
//        model.addAttribute("message", "Hello world!");
//        return "hello";
//    }

    @RequestMapping("/bye")
    public String printBye(ModelMap model) {
        model.addAttribute("message", "Bye world!");
        return "hello";
    }

    @RequestMapping(value = "/foruser/{userId}", method = RequestMethod.GET)
    public String printHelloForUser(@PathVariable String userId, Model model) {
        model.addAttribute("message", "Hello " + userId + " !");
        return "hello";
    }

    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public String handle(@ModelAttribute("person") Person person,
                         BindingResult result, SessionStatus status) throws IOException {

        System.out.println(person.toString());
        return "hello";

    }

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(
            @RequestParam(
                    value = "userId",
                    required = true,
                    defaultValue = "Anonymous"
            )
            String userId,
            ModelMap model) {
        model.addAttribute("message", "Hello " + userId + " !");
        return "hello";
    }

}