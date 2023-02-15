package practice1_230215.view;

import practice1_230215.model.customer.Customer;

public class SuccessView {

	public static void print(Customer c) {
		System.out.println("고객 정보 " + c.getId() + " " + c.getCredit());
	}
	public static void printMSG(String msg) {
		System.out.println(msg);
	}
}