package codegym.vn.furamarepsort.repository.employee;

import codegym.vn.furamarepsort.entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
