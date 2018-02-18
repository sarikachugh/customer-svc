package sf.crom.customer;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="customers")
public class Customer {
	
	public Customer() {}
	
	
	public Customer(String custName, String custAddress) {
		super();
		this.custName = custName;
		this.custAddress = custAddress;
	}


	public Customer(long custId, String custName, String custAddress) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}
	
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long custId;
	private String custName;
	private String custAddress;
	public long getCustId() {
		return custId;
	}
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddress() {
		return custAddress;
	}
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	

	

}
