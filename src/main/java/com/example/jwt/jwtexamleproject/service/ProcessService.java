package com.example.jwt.jwtexamleproject.service;

import com.example.jwt.jwtexamleproject.model.DHSProcess;

import java.util.List;

public interface ProcessService {

    List<DHSProcess> findAllProcesses();
}
