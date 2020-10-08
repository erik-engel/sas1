package sas1.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import sas1.project.demo.service.PlayerService;
import sas1.project.demo.service.WindService;

@Controller
public class HomeController {

    @Autowired
    PlayerService playerService;
    WindService windService;

    @GetMapping ("/")
    public String index(Model model){
        model.addAttribute("players", playerService.readAll());
        return "index";
    }

    @GetMapping ("/hexagon")
    public String ocean(){
        return "hexagon";
    }

}
