package com.example.jwt.jwtexamleproject.controller;

import com.example.jwt.jwtexamleproject.model.DHSProcess;
import com.example.jwt.jwtexamleproject.service.ProcessService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class ProcessController {

    private ProcessService processService;

    @GetMapping("/processes")
    public List<DHSProcess> getProcessesByNameAndState() {
        return processService.findAllProcesses();
    }

}
