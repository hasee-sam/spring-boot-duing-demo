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

}
