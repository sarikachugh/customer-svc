package sf.crom.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tc.logging.CustomerLogging;

@RestController
@RequestMapping("/customer")
public class CustController {
	
	

	@Autowired
	CustomerRepo custrepo;
	
	
	@PutMapping("{id}/{name}/{address}")
	public void persistCust(@PathVariable("id") long id, @PathVariable("name") String name,@PathVariable("address") String address) {
		
		custrepo.save(new Customer(id,name,address));
	}
	
	@PostMapping("{name}/{address}")
	public void updateCust(@PathVariable("name") String name, @PathVariable("address") String address) {
		custrepo.save(new Customer(name, address));
	}
	
	@GetMapping("{address}")
	public List<Customer> getCust(@PathVariable("address") String address) {
		Pageable topthree = new PageRequest(0, 2);
		return custrepo.findBycustAddress(address, topthree);
	}
	
}
