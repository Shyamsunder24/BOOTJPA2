package com.example.bootjpa2.controller;

import com.example.bootjpa2.Alien;
import com.example.bootjpa2.dao.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
public class AlienController {

    @Autowired
    AlienRepo repo;

    @RequestMapping("/")
    public String home(){
        return "home.jsp";
    }
    @DeleteMapping("/alien/{aid}")
    public String  deleteAlien(@PathVariable int aid){
        Alien a=repo.getOne(aid);
        repo.delete(a);
        return "deleted";
    }
    @PutMapping(path = "/alien")
    public String updateAlien(@RequestBody Alien alien){
        repo.save(alien);
        return "updated";
    }
    @PostMapping("/alien")
    public Alien addAlien(Alien alien){
        repo.save(alien);
        return alien;
    }

    @GetMapping("/aliens")
    public List<Alien> getAliens(){
        return repo.findAll();
    }

    @RequestMapping("/alien/{aid}")
    public Optional<Alien> getAliens(@PathVariable int aid){
        return repo.findById(aid);
    }

}
