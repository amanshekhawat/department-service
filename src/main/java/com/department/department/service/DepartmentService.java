package com.department.department.service;
import com.department.department.entity.Department;
import com.department.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }

    public List<Department> fetchAllDepartments(){
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Integer id){
        return departmentRepository.findById(id).orElseThrow();
    }
}
