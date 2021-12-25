package week1.day1;

public class Mobile {

	public static void main(String[] args) {
		Mobile mobile = new Mobile();
		mobile.sendMsg();
		mobile.makeCall();
	}

	public void sendMsg() {
		System.out.println("Message sent from mobile");
	}

	public void makeCall() {
		System.out.println("Call made from mobile");		
	}

}
