package codegym.vn.furamarepsort.service.employee;

import codegym.vn.furamarepsort.entity.employee.Division;
import codegym.vn.furamarepsort.entity.employee.EducationDegree;

import java.util.List;

public interface EducationDegreeService {
    EducationDegree findByName(String educationDegreeName);
    EducationDegree findById(int id);
    List<EducationDegree> findAll();
}
