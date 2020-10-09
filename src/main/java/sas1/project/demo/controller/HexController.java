package sas1.project.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HexController {

    @PostMapping(value = "/testsend", headers = {"Content-type=application/json"})
    @ResponseBody
    public String testSendt(@RequestBody String str){
        System.out.println(str);
        return null;
    }

    @GetMapping(value = "/testget", produces = "application/json; charset=utf-8")
    @ResponseBody
    public String sendTest(){
        return "[{\"name\": \"1,1\"}, " +
                "{\"name\": \"2,2\"}]";
    }
}
