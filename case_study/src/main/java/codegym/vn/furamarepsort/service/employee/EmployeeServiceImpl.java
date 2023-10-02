package codegym.vn.furamarepsort.service.employee;

import codegym.vn.furamarepsort.entity.employee.Employee;
import codegym.vn.furamarepsort.repository.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;
    @Override
    public void create(Employee employee) {
        repository.save(employee);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public void fix(Employee employee) {
        repository.save(employee);
    }

    @Override
    public Employee findEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> findAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
