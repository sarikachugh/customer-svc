package sf.crom.customer;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepo extends CrudRepository<Customer, Long> {

	List<Customer> findBycustAddress(String custAddress, Pageable pageable);
	
	
}





