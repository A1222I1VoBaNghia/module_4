package codegym.vn.furamarepsort.service.employee;

import codegym.vn.furamarepsort.entity.employee.Division;
import codegym.vn.furamarepsort.repository.employee.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService{
    @Autowired
    private DivisionRepository repository;

    @Override
    public Division findByName(String divisionName) {
        return repository.findByDivisionName(divisionName);
    }

    @Override
    public Division findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Division> findAll() {
        return repository.findAll();
    }
}
