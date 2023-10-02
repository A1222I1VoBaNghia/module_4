package codegym.vn.furamarepsort.repository.employee;

import codegym.vn.furamarepsort.entity.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Integer> {
    Position findByPositionName(String positionName);
}
