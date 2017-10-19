package ro.sci.restaurant.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ro.sci.restaurant.model.Employee;

import java.util.List;

@Repository
@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Employee findEmployeeById(int uid);

    List<Employee> findAll();
}
