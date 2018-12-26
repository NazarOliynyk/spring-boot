package ua.com.owu.springboot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import ua.com.owu.springboot.dao.CarDAO;
//import ua.com.owu.springboot.dao.EngineDAO;
import ua.com.owu.springboot.dao.UserDAO;
//import ua.com.owu.springboot.models.Car;
//import ua.com.owu.springboot.models.Engine;
import ua.com.owu.springboot.models.User;

@Controller
public class MainController {

    @Autowired
    private UserDAO userDAO;


    // gm snippet for @GetMapping
    @GetMapping("/")
    public String home(Model model){
        System.out.println("public String home();");
        model.addAttribute("msg", "HELLO GUYS!!");
        return "index"; // our html file(if thymeleaf does not work - add .html)
    }

    // pm snippet
    @PostMapping("/save")
    public String save(
            @RequestParam("data") String data, // if the name of String and the name of param are the same - the name of param might not be written
            Model model
    ){
        userDAO.save(new User(data));
        model.addAttribute("data", data);
        return "result";
    }

}
