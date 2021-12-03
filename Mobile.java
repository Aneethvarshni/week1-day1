package week1.day1;

public class Mobile {
	String mobileModel = "OnePlus Nord";
	int mobileWeight = 1;
	boolean isFullCharge = true;
	double mobileCost = 24999.9999999999;
	public void makeCall() {
		System.out.println("Call connected");

	}

	public void sendMessage() {

		System.out.println("Message sent");
	}

	public static void main(String[] args) {
		
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		
		System.out.println("time calculated: "+ Mobile.timeConsumingMethod()/1000);
		myMobile.sendMessage();
		System.out.println("Mobile model:"+myMobile.mobileModel);
		System.out.println("Mobile weight in kg:"+myMobile.mobileWeight);
		System.out.println("Is mobile fully charged:"+myMobile.isFullCharge);
		System.out.println("Cost of the mobile:"+myMobile.mobileCost);
		
	}
	
	public static long timeConsumingMethod() {
		long startTime = System.currentTimeMillis();
		for(int i=0; i<=5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		long stopTime = System.currentTimeMillis();
	      long elapsedTime = stopTime - startTime;
	      //System.out.println(elapsedTime);
		return elapsedTime;
	}
}
// Print the odd and even numbers in a single line
// Measure the time taken to execute a method
// Reduce the float precision to 2.