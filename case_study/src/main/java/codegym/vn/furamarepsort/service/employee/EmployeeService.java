package codegym.vn.furamarepsort.service.employee;

import codegym.vn.furamarepsort.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    void create(Employee employee);
    void delete(int id);
    void fix(Employee employee);
    Employee findEmployeeById(int id);
    List<Employee> findAllEmployees();
    Page<Employee> findAll(Pageable pageable);
}
