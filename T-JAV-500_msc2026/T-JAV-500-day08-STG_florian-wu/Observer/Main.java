package Observer;

public class Main {
	public static void main(String[] args) {

		Order order = new Order();
	    Customer customer = new Customer();
	    
	    order.addObserver(customer);
	    order.setData("123.5326, 237.9277", "6W 40th Street, New York", 10);
	    order.notifyObservers();
	}
	
//	public static void main(String[] args) {
//        Order order = new Order();
//        Customer customer1 = new Customer();
//        Customer customer2 = new Customer();
//
//        order.addObserver(customer1);
//        order.addObserver(customer2);
//        
//        order.setData("C", "D", 15);
//    }
}
