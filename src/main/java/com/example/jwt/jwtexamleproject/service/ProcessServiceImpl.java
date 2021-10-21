package com.example.jwt.jwtexamleproject.service;

import com.example.jwt.jwtexamleproject.model.DHSProcess;
import com.example.jwt.jwtexamleproject.repository.ProcessMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ProcessServiceImpl implements ProcessService {

    private ProcessMapper processMapper;

    @Override
    public List<DHSProcess> findAllProcesses() {
        return processMapper.findAll();
    }
}
