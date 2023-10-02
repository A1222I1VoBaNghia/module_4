package codegym.vn.furamarepsort.service.employee;

import codegym.vn.furamarepsort.entity.employee.EducationDegree;
import codegym.vn.furamarepsort.repository.employee.EducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService{
    @Autowired
    private EducationDegreeRepository repository;

    @Override
    public EducationDegree findByName(String educationDegreeName) {
        return repository.findByEducationDegreeName(educationDegreeName);
    }

    @Override
    public EducationDegree findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<EducationDegree> findAll() {
        return repository.findAll();
    }
}
