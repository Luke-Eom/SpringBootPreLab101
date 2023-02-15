package practice1_230215.model;

import practice1_230215.model.customer.Customer;

/*
실제 db와 연동되는 핵심 
 */


public class Model {

	private Customer c = new Customer("id01", 0);
	

	// id로 고객 검색(고객정보) 제공해주는 메소드
	public Customer select(String id){
		// id 값으로 비교 검증 로직이 있다 가정
		return c;
	}
	
	
	public boolean update(String id, int newParam) {
		c.setCredit(newParam);
		return true;
	}
}
