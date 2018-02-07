package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String navigator() {return "index";}

    @GetMapping("/injera")
    public String injera() {return "injera";}

    @GetMapping("/crabby")
    public String crabby() {return "crabby";}

    @GetMapping("/golabjamun")
    public String gulabJamun(){return "golabjamun";}

    @GetMapping("/jerkchicken")
    public String jerkchicken(){return "jerkchicken";}

    @GetMapping("/pumkinricenoodles")
    public String pumkinricenoodles(){return "pumkinricenoodles";}

    @GetMapping("/bara")
    public String baranepal(){return "bara";}
    @GetMapping("/croquemadame")
    public String croquemadame(){return "croquemadame";}

    @GetMapping("/gallery")
    public String gallery(){return "gallery";}

}
