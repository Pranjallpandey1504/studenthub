package com.example.studenthub.controller;

import com.example.studenthub.model.Student;
import com.example.studenthub.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public String showStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @PostMapping("/students/add")
    public String addOrUpdateStudent(@RequestParam(required = false) Long id,
                                     @RequestParam String name,
                                     @RequestParam String email,
                                     @RequestParam String course,
                                     Model model) {
        // Backend validation
        if (name == null || name.length() < 2 ||
            email == null || !email.matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$") ||
            course == null || course.length() < 2) {
            model.addAttribute("error", "Invalid input data.");
            model.addAttribute("students", studentService.getAllStudents());
            return "students";
        }

        Student student = (id != null) ? studentService.getStudentById(id) : new Student();
        if (student == null) {
            student = new Student();
        }
        student.setName(name);
        student.setEmail(email);
        student.setCourse(course);
        studentService.saveStudent(student);   
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("studentToEdit", student);
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id); 
        return "redirect:/students";
    }
}
