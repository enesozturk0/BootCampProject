package com.BootCampProject.service.abstracts;

import com.BootCampProject.service.dtos.requests.Employee.CreateEmployeeRequest;
import com.BootCampProject.service.dtos.requests.Employee.UpdateEmployeeRequest;
import com.BootCampProject.service.dtos.responses.Employee.CreatedEmployeeResponse;
import com.BootCampProject.service.dtos.responses.Employee.UpdatedEmployeeResponse;

public interface EmployeeService {
    CreatedEmployeeResponse createEmployee(CreateEmployeeRequest createEmployeeRequest);
    UpdatedEmployeeResponse updateEmployee(UpdateEmployeeRequest updateEmployeeRequest);
}
