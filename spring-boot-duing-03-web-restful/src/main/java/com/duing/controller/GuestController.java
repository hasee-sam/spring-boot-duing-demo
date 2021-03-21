package com.duing.controller;

import com.duing.bean.Guest;
import com.duing.service.GuestServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestServiceImp guestServiceImp;

    @GetMapping
    public String list(Model model){
        List<Guest> guestList = guestServiceImp.list();
        model.addAttribute("guestList",guestList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    @PostMapping
    public String add(Guest guest){
        guestServiceImp.add(guest);
        return "redirect:/guest";
    }

    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name){
        Guest guest = guestServiceImp.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @PutMapping
    public String update(Guest newGuest){
        guestServiceImp.update(newGuest);
        return "redirect:/guest";
    }

    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name){
        guestServiceImp.delete(name);
        return "redirect:/guest";
    }
}
