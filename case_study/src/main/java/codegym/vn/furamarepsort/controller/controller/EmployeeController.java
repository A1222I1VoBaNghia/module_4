package codegym.vn.furamarepsort.controller.controller;

import codegym.vn.furamarepsort.entity.employee.Employee;
import codegym.vn.furamarepsort.service.employee.DivisionService;
import codegym.vn.furamarepsort.service.employee.EducationDegreeService;
import codegym.vn.furamarepsort.service.employee.EmployeeService;
import codegym.vn.furamarepsort.service.employee.PositionService;
import codegym.vn.furamarepsort.service.role.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DivisionService divisionService;
    @Autowired
    private PositionService positionService;
    @Autowired
    private EducationDegreeService educationDegreeService;
    @Autowired
    private UserService userService;
//    @GetMapping("/list")
//    public String displayEmployeeList(Model model){
//        model.addAttribute("employees", employeeService.findAllEmployees());
//        return "employee/list";
//    }
    @GetMapping("/list")
    public String displayEmployeeList(Model model,
                                    @RequestParam("page") Optional<Integer> page,
                                    @RequestParam("size")Optional<Integer> size) {
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        Pageable pageable = PageRequest.of(currentPage - 1, pageSize);
        Page<Employee> employees = employeeService.findAll(pageable);
        model.addAttribute("employees", employees);
        int totalPage = employees.getTotalPages();
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "employee/list";
    }
    @GetMapping("/create")
    public String displayCreateEmployee(Model model){
        model.addAttribute("employee",new Employee());
        model.addAttribute("educationDegree", educationDegreeService.findAll());
        model.addAttribute("division", divisionService.findAll());
        model.addAttribute("position", positionService.findAll());
        model.addAttribute("user", userService.findAll());
        return "employee/create";
    }
    @PostMapping("/create")
    public String doCreateEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.create(employee);
        return "redirect:/employee/list";
    }
    @GetMapping("/detail")
    public String displayDetail(Model model, @RequestParam("id") int id) {
        Employee employee = employeeService.findEmployeeById(id);
        model.addAttribute("employee", employee);
        return "employee/detail";
    }
    @GetMapping("/update")
    public String displayUpdate(Model model, @RequestParam("id") int id) {
        employeeService.findEmployeeById(id);
        model.addAttribute("employee",  employeeService.findEmployeeById(id));
        model.addAttribute("educationDegree", educationDegreeService.findAll());
        model.addAttribute("division", divisionService.findAll());
        model.addAttribute("position", positionService.findAll());
        model.addAttribute("user", userService.findAll());
        return "employee/update";
    }
    @PostMapping("/update")
    public String doUpdate(@ModelAttribute Employee employee, @PathVariable("id") int id) {
        employeeService.fix(employeeService  .findEmployeeById(id));
        return "redirect:/employee/list";
    }

}
