package com.diosoft.course.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/submit")
public class SubmitController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        return "submit";
    }
//    @RequestMapping(value = "submit", method = RequestMethod.POST)
//    public String handle(@ModelAttribute("person") Person person,
//                         BindingResult result, SessionStatus status) throws IOException {
//
//        System.out.println(person.toString());
//
//        return "submit";
//
//    }
//
//    @RequestMapping( method = RequestMethod.GET)
//        public String printHelloForUser() {
//            return "submit";
//        }


}