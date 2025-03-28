package com.example.controller;

import com.example.model.User;
import com.example.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.dsig.keyinfo.PGPData;
import java.util.List;

@Controller
//@RequestMapping("/api")
public class UserController {
    private static final int PAGE_SIZE=20;
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public String getAllUsers(@RequestParam(defaultValue = "0") int page, Model model) {
        logger.info("Fetching all users.");
        Pageable pageable= PageRequest.of(page,PAGE_SIZE, Sort.by("id"));

        Page<User> userPage = userRepository.findAll(pageable);
        model.addAttribute("users", userPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", userPage.getTotalPages());
        model.addAttribute("hasNext", userPage.hasNext());
        model.addAttribute("hasPrevious", userPage.hasPrevious());
        //List<User> users = userRepository.findAll();
        //model.addAttribute("users", users);
        return "userList";

    }

    @GetMapping("/test")
    public String test() {
        logger.info("Test endpoint called.");
        return "Test endpoint is working!";
    }
}
