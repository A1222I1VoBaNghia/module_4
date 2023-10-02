package codegym.vn.furamarepsort.repository.employee;

import codegym.vn.furamarepsort.entity.employee.Division;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DivisionRepository extends JpaRepository<Division,Integer> {
    Division findByDivisionName(String divisionName);
}
