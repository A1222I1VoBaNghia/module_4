package codegym.vn.furamarepsort.entity.employee;

import codegym.vn.furamarepsort.entity.contract.Contract;
import codegym.vn.furamarepsort.entity.role.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

@Entity(name = "employee")
public class Employee {
    @Id
    @Column(name = "employee_id")
    private int employeeId;
    @JsonBackReference
    @OneToMany(mappedBy = "employee")
    private List<Contract> contractList;
    @ManyToOne
    @JoinColumn(name = "division_id")
    @NotNull
    private Division division;
    @ManyToOne
    @JoinColumn(name = "position_id")
    @NotNull
    private Position position;
    @ManyToOne
    @JoinColumn(name = "education_degree_id")
    @NotNull
    private EducationDegree educationDegree;
    @Column(name = "employee_name",columnDefinition = "varchar(45)")
    @NotNull
    private String employeeName;
    @Column(name = "employee_birthday",columnDefinition = "DATE")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull
    private Date employeeBirthday;
    @Column(name = "employee_id_card",columnDefinition = "varchar(45)")
    @NotNull
    private String employeeIdCard;
    @Column(name = "employee_salary")
    @NotNull
    private double employeeSalary;
    @Column(name = "employee_phone",columnDefinition = "varchar(45)")
    @NotNull
    private String employeePhone;
    @Column(name = "employee_email",columnDefinition = "varchar(45)")
    private String employeeEmail;
    @Column(name = "employee_address",columnDefinition = "varchar(45)")
    private String employeeAddress;
    @ManyToOne
    @JoinColumn(name = "username")
    private User user;

    public Employee() {
    }

    public Employee(int employeeId, List<Contract> contractList, Division division, Position position, EducationDegree educationDegree, String employeeName, Date employeeBirthday, String employeeIdCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress, User user) {
        this.employeeId = employeeId;
        this.contractList = contractList;
        this.division = division;
        this.position = position;
        this.educationDegree = educationDegree;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
        this.user = user;
    }

    public Employee(int employeeId, Division division, Position position, EducationDegree educationDegree, String employeeName, Date employeeBirthday, String employeeIdCard, double employeeSalary, String employeePhone, String employeeEmail, String employeeAddress) {
        this.employeeId = employeeId;
        this.division = division;
        this.position = position;
        this.educationDegree = educationDegree;
        this.employeeName = employeeName;
        this.employeeBirthday = employeeBirthday;
        this.employeeIdCard = employeeIdCard;
        this.employeeSalary = employeeSalary;
        this.employeePhone = employeePhone;
        this.employeeEmail = employeeEmail;
        this.employeeAddress = employeeAddress;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
