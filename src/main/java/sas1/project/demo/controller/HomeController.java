package sas1.project.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import sas1.project.demo.model.Game;
import sas1.project.demo.service.GameService;
import sas1.project.demo.service.PlayerService;
import sas1.project.demo.service.WindService;
import sas1.project.demo.util.RoundCalculator;

@Controller
public class HomeController {
    CommunicationController comController;
    RoundCalculator roundCalc;

    @Autowired
    PlayerService playerService;

    @Autowired
    GameService gameService;

    @GetMapping ("/")
    public String index(Model model){
        return "index";
    }

    @GetMapping ("/hexagon")
    public String ocean(){
        return "hexagon";
    }

    @GetMapping ("/newGame")
    public String newGame(@ModelAttribute Game game){
        Game g = new Game();
//        gameService.create(model);
        return "redirect:/hexagon";
    }


    public void initializeGame(){

    }
}
