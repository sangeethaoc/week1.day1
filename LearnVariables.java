package week1.day1;

public class LearnVariables {
	String mobileModel = "Samsung Galaxy";
	int mobileWeight = 850;
	boolean isFullCharge = false;
	double mobilecost = 7500.00;
	
	public static void main(String[] args) {
		LearnVariables learnVariables = new LearnVariables();
		System.out.println("mobileModel : "+learnVariables.mobileModel);
		System.out.println("mobileWeight :" +learnVariables.mobileWeight);
		System.out.println("isFullCharge : "+learnVariables.isFullCharge);
		System.out.println("mobilecost : "+learnVariables.mobilecost);
	}

}
