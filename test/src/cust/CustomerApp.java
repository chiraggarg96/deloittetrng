package cust;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer();
		Customer c2=new Customer();
		Customer c3=new Customer("kjl","bangalore");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		c2.setCustomerAddress("noida");
		System.out.println(c2);

	}

}
