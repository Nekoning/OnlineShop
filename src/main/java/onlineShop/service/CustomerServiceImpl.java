package onlineShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import onlineShop.dao.CustomerDao;
import onlineShop.model.Customer;

// Spring 通过Service Annotation访问bean
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	public Customer getCustomerByUserName(String userName) {
		return customerDao.getCustomer(userName);
	}

}
