package codegym.vn.furamarepsort.service.employee;

import codegym.vn.furamarepsort.entity.employee.Division;
import codegym.vn.furamarepsort.entity.employee.Position;

import java.util.List;

public interface DivisionService {
    Division findByName(String divisionName);
    Division findById(int id);
    List<Division> findAll();
}
