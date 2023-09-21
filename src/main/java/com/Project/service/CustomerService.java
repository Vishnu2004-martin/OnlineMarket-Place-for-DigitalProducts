//package com.Project.service;
//
//
//import java.util.Optional;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import org.springframework.stereotype.Service;
//
//import com.Project.model.Customers;
//import com.Project.repository.MainCustomerRepo;
//
//
//
//@Service
//public class CustomerService {
//
//	@Autowired
//	MainCustomerRepo rep;
//	public Customers saveinfo(Customers cu) {
//		return rep.save(cu);
//	}
//	public Optional<Customers> show(int cusid) {
//		// TODO Auto-generated method stub
//		return rep.findById(cusid);
//	}
//	
//	
//	public String save(Customers cu) {
//		// TODO Auto-generated method stub
//		rep.save(cu);
//		return ("Updated");
//	}
//	public String deleteByid(Customers cu) {
//		// TODO Auto-generated method stub
//		rep.delete(cu);
//		return("deleted");
//	}
//	
//	
//		
//		
//	
//	
//	
//	
//	
//	
//	
//	
//	
//
//}
package com.Project.service;
import com.Project.model.Customers;
import jakarta.transaction.Transactional;


public interface CustomerService {
	public boolean addUser(Customers user);
	public boolean getUser(Customers user);
}
