package week1.home_practice;

public class display_Two_methods {
	
	
	public String launchBrowser(String browserName){
		System.out.println("Browser Lanched Successfully");
		return browserName;
	}
	
	public void loadurl() {
		System.out.println("App loaded successfully");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display_Two_methods obj=new display_Two_methods();
		obj.loadurl();
		System.out.println(obj.launchBrowser("chrome"));

		
	}

}
