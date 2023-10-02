package codegym.vn.furamarepsort.entity.role;

import codegym.vn.furamarepsort.entity.employee.Employee;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class User {
    @Id
    @Column(columnDefinition = "varchar(45)")
    private String username;
    @Column(columnDefinition = "varchar(255)")
    private String password;
    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<Employee> employeeList;
    @JsonBackReference
    @OneToMany(mappedBy = "user")
    private List<UserRole> userRoleList;
    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public List<UserRole> getUserRoleList() {
        return userRoleList;
    }

    public void setUserRoleList(List<UserRole> userRoleList) {
        this.userRoleList = userRoleList;
    }
}
