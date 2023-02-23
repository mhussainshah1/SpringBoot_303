package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

@Controller
public class HomeController {
    @Autowired
    CourseRepository courseRepository;

    @RequestMapping("/")
    public String listCourses(Model model) {
        model.addAttribute("courses", courseRepository.findAll()); //generate select * statement
        return "list";
    }

    @GetMapping("/add")
    public String courseForm(Model model) {
        model.addAttribute("course", new Course());
        return "courseform";
    }

    @PostMapping("/process")
    public String processForm(@Valid Course course, BindingResult result) {
        if (result.hasErrors()) {
            return "courseform";
        }
        courseRepository.save(course);//generate SQL statement and insert into database
        return "redirect:/";
    }

    @RequestMapping("/detail/{id}")
    public String showCourse(@PathVariable("id") long id, Model model) {
        model.addAttribute("course", courseRepository.findById(id).get());
        return "show";
    }

    @RequestMapping("/update/{id}")
    public String updateCourse(@PathVariable("id") long id, Model model) {
        model.addAttribute("course", courseRepository.findById(id).get());
        return "courseform";
    }

    @RequestMapping("/delete/{id}")
    public String delCourse(@PathVariable("id") long id) {
        courseRepository.deleteById(id);
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String delCourses(@RequestParam("check") long[] ids) {
        for (long id : ids) {
            courseRepository.deleteById(id);
        }
        return "redirect:/";
    }

    @GetMapping("/about")
    public String getAbout() {
        return "about";
    }
}
