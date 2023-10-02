package codegym.vn.furamarepsort.service.employee;

import codegym.vn.furamarepsort.entity.employee.Position;
import codegym.vn.furamarepsort.repository.employee.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionRepository repository;
    @Override
    public Position findByName(String positionName) {
        return repository.findByPositionName(positionName);
    }

    @Override
    public Position findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Position> findAll() {
        return repository.findAll();
    }
}
