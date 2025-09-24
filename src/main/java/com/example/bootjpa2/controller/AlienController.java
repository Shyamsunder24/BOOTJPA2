package com.example.bootjpa2.controller;

import com.example.bootjpa2.Alien;
import com.example.bootjpa2.dao.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }
    @RequestMapping("/addAlien")
    public String addAlien(Alien alien){
        repo.save(alien);
        return "home.jsp";
    }
    @RequestMapping("/getAlien")
    public ModelAndView getAlien(@RequestParam int aid){
        ModelAndView mv=new ModelAndView("showAlien.jsp");
        Alien alien=repo.findById(aid).orElse(new Alien());
        System.out.println(repo.findByTech("java"));
        System.out.println(repo.findByTechSorted("java"));
        mv.addObject(alien);
        return mv;
    }
    @RequestMapping("/updateAlien")
    public String updateAlien(Alien alien){
        repo.deleteById(alien.getAid());
        repo.save(alien);
        return "home.jsp";
    }
    @RequestMapping("/deleteAlien")
    public String deleteAlien(@RequestParam int aid){
        repo.deleteById(aid);
        return "home.jsp";
    }
//    @RequestMapping("/findByTech")
//    public ModelAndView  findByTech(@RequestParam String tech){
//        ModelAndView mv=new ModelAndView("showAlien.jsp");
//        Alien alien=repo.findById(aid).orElse(new Alien());
//        repo.findByTech(tech);
//        mv.addObject(alien);
//        return mv;
//    }
}
