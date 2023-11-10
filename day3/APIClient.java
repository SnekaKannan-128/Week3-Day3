package week3.day3;

public class APIClient {

	    public void sendRequest(String endpoint) {
		  System.out.println(endpoint);

	  }
	
	    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		  System.out.println(endpoint + requestBody + requestStatus);
   
	  }
	    
     	public static void main(String[] args) {
     		APIClient api = new APIClient();
     		api.sendRequest("Completed");
		    api.sendRequest("Completed ", " Hello ", false);
		
	}

}
