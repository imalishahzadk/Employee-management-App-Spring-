package ca.clinda_prakash.repository;

import ca.clinda_prakash.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
