package com.luv2code.springboot.cruddemo;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.luv2code.springboot.cruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.cruddemo.entity.Employee;
import com.luv2code.springboot.cruddemo.service.EmployeeServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class CruddemoApplicationTests {

	
	@Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeServiceImpl ;

    @InjectMocks
    Employee emp ;
    
    

    
    public Employee getMeTestEmployee() {
    	Employee emp = new Employee();
    	emp.setId(1);
    	emp.setFirstName("Test first name");
    	emp.setLastName("Test lastname");
    	emp.setEmail("one@one.com");
        return emp;
      }
	 @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }
	 
    @Test
    public void testFindUserByIdPositive() {
    	
    	Employee empEntity = new Employee() ;
    	empEntity.setId(12);
         
         assertTrue(getMeTestEmployee().getId()+" "
         		+ "is saved - Id "+empEntity.getId(),getMeTestEmployee().getId() > 0);


}

}