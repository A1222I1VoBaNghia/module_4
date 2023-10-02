package codegym.vn.furamarepsort.entity.employee;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import javax.validation.constraints.Future;
import java.util.List;

@Entity
public class Position {
    @Id
    @GeneratedValue
    @Column(name = "position_id")
    private int positionId;
    @Column(name = "position_name",columnDefinition = "varchar(45)")
    private String positionName;
    @OneToMany(mappedBy = "position")
    @JsonBackReference
    private List<Employee> employeeList;

    public Position() {
    }

    public Position(int positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public int getPositionId() {
        return positionId;
    }

    public void setPositionId(int positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
