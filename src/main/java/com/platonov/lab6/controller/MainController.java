package com.platonov.lab6.controller;
import com.platonov.lab6.model.service.StudentService;
import com.platonov.lab6.util.StudentForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private final StudentService studentService;
    MainController(StudentService studentService){
        this.studentService = studentService;
    }


    @ModelAttribute("formStudent")
    public StudentForm student(){
        return new StudentForm();
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    String index(Model model){
        model.addAttribute("students",studentService.findAll());
        return "index";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST)
    String createStudent(Model model, @ModelAttribute("formStudent") StudentForm studentForm){
        studentService.save(studentForm.toStudent());
        model.addAttribute("students",studentService.findAll());
        return "index";
    }

    @RequestMapping(value = "/",method = RequestMethod.POST, params = "action=delete")
    String deleteStudent(@RequestParam("id") Long id,Model model){
        studentService.delete(id);
        model.addAttribute("students",studentService.findAll());
        return "index";
    }

}
