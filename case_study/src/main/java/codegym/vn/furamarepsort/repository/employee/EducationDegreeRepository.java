package codegym.vn.furamarepsort.repository.employee;

import codegym.vn.furamarepsort.entity.employee.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationDegreeRepository extends JpaRepository<EducationDegree,Integer> {
    EducationDegree findByEducationDegreeName(String educationDegreeName);
}
