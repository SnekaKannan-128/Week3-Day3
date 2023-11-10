package week3.day3;

public class BasePage {

public void findElement(){
		
		System.out.println("Element Found");
		
	}
	
    public void clickElement(){
    	
    	System.out.println("Element clicked");
		
	}
    
    public void enterText(){
    	
    	System.out.println("Text Entered");
		
	}
    
    public void performCommonTasks(String url, boolean refresh){
    	
    	System.out.println("URL entered is " + url);
    	System.out.println("Refresh done = " + refresh);
    	
		
	}
    
    public static void main(String[] args) {
		
    	BasePage obj=new BasePage();
    	obj.findElement();
    	obj.clickElement();
    	obj.enterText();
    	obj.performCommonTasks("https://www.testleaf.com/", false);
    	
	}
}
