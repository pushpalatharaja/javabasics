package week1.home_practice;

public class Mobile {
	
	
	public void makeCall() 
		{
			String mobileModel="iPhone10";
			float mobileWeight = 200.20f ;
			System.out.println("Mobile model is:"+ mobileModel);
			System.out.println("Mobile Weight is:" +mobileWeight);
		}
	
	public void sendMsg(boolean isFullCharged, int mobileCost)
		{
		
		System.out.println("Mobile model is:"+isFullCharged);
		System.out.println("Mobile Weight is:"+mobileCost);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is my mobile");
		Mobile obj=new Mobile();
		obj.makeCall();
		obj.sendMsg(true,50000);
		
		
	}

}
