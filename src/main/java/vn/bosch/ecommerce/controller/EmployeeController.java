package vn.bosch.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.bosch.ecommerce.model.Employee;
import vn.bosch.ecommerce.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	@Autowired
	   EmployeeService employeeService;
		
	   @GetMapping
	   public ResponseEntity<Object> getAll() {
	      return new ResponseEntity<>(employeeService.getAll(), HttpStatus.OK);
	   }
	   
	   @PostMapping
	   public ResponseEntity<Object> save(@RequestBody Employee employee) {
		  employeeService.save(employee);
	      return new ResponseEntity<>("Employee is saved successfully", HttpStatus.CREATED);
	   }

	   @PutMapping
	   public ResponseEntity<Object> update(@PathVariable("id") Long id, @RequestBody Employee employee) {
		  employeeService.update(id, employee);
	      return new ResponseEntity<>("Employee is updated successfully", HttpStatus.CREATED);
	   }
	   
	   @DeleteMapping("/{id}")
	   public ResponseEntity<Object> delete(@PathVariable("id") Long id) { 
		   employeeService.delete(id);
	      return new ResponseEntity<>("Employee is deleted successsfully", HttpStatus.OK);
	   }
	   
	   @GetMapping("/{id}")
	   public ResponseEntity<Object> get(@PathVariable("id") Long id) {
	      return new ResponseEntity<>(employeeService.findById(id), HttpStatus.OK);
	   }
}
