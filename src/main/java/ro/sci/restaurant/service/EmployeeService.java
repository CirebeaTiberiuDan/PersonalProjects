
package ro.sci.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.sci.restaurant.model.Employee;
import ro.sci.restaurant.repository.EmployeeRepository;

import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getByUid(int uid) {
        return employeeRepository.findEmployeeById(uid);
    }

    public List<Employee> getAll() {
//        List<Employee> employees= new ArrayList<>();
//        employeeRepository.findAll().forEach(employees::add);
//        return employees;
        return employeeRepository.findAll();
    }

    public void add(Employee employee) {
        employeeRepository.save(employee);
    }

    public void update(Employee employee) {
        employeeRepository.save(employee);
    }

    public void remove(Employee employee) {
        employeeRepository.delete(employee);
    }

}
