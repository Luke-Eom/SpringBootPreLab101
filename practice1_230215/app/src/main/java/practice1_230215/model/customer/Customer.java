package practice1_230215.model.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
	private String id;
	private int credit;


	
		// Customer customer = new Customer(id, credit);

	// public String getId() {
	// 	return id;
	// }

	// public void setId(String param) {
	// 	this.id = param;
	// }

	// public int getCredit() {
	// 	return credit;
	// }

	// public void setCredit(int param) {
	// 	this.credit = param;
	// }

}