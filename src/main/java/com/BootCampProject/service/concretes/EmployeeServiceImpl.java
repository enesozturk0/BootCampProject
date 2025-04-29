package com.BootCampProject.service.concretes;

import org.springframework.stereotype.Service;
import com.BootCampProject.service.abstracts.EmployeeService;
import com.BootCampProject.service.dtos.requests.Employee.CreateEmployeeRequest;
import com.BootCampProject.service.dtos.requests.Employee.UpdateEmployeeRequest;
import com.BootCampProject.service.dtos.responses.Employee.CreatedEmployeeResponse;
import com.BootCampProject.service.dtos.responses.Employee.UpdatedEmployeeResponse;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public CreatedEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest) {
        return null;
    }

    @Override
    public UpdatedEmployeeResponse updateEmployee(UpdateEmployeeRequest updateEmployeeRequest) {
        return null;
    }
}
