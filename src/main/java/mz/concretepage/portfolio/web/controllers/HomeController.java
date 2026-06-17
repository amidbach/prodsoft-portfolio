package mz.concretepage.portfolio.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);

    @GetMapping({"/", "", "/home"})
    String showHomePage(/*@RequestParam(name = "page", defaultValue = "1") int page,*/ Model model) {
        LOG.debug("/home URI: INI...");
        model.addAttribute("title", "Home");
        return "master";
    }

    @GetMapping({"/resume"})
    String showResumePage(Model model) {
        LOG.debug("/resume URI: INI...");
        model.addAttribute("title", "Resume");
        return "master";
    }

    @GetMapping({"/projects"})
    String showProjectsPage(Model model) {
        LOG.debug("/projects URI: INI...");
        model.addAttribute("title", "Projects");
        return "master";
    }

    @GetMapping({"/contact"})
    String showContactPage(Model model) {
        LOG.debug("/contact URI: INI...");
        model.addAttribute("title", "Contact");
        return "master";
    }
}
