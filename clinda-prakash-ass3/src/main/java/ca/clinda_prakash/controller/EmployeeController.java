package ca.clinda_prakash.controller;

import ca.clinda_prakash.model.Employee;
import ca.clinda_prakash.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/index.html")
    public String index(Model model) {
        List<Employee> employees = employeeService.getAllEmployees();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping("/employee.html")
    public String employeeForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "employee";
    }

    @PostMapping("/api/employees")
    public String createEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return "redirect:/index.html";
    }

    @GetMapping("/api/employees")
    @ResponseBody
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/api/employees/{id}")
    @ResponseBody
    public Employee getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/api/employees")
    @ResponseBody
    public void updateEmployee(@RequestBody List<Employee> employees) {
        for (Employee employee : employees) {
            employeeService.saveEmployee(employee);
        }
    }

    @DeleteMapping("/api/employees/{id}")
    @ResponseBody
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @DeleteMapping("/api/employees")
    @ResponseBody
    public void deleteAllEmployees() {
        employeeService.deleteAllEmployees();
    }
}
