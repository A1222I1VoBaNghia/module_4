package codegym.vn.furamarepsort.service.employee;

import codegym.vn.furamarepsort.entity.employee.Position;

import java.util.List;

public interface PositionService {
    Position findByName(String positionName);
    Position findById(int id);
    List<Position> findAll();
}
