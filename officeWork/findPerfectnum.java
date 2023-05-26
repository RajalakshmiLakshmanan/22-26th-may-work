package officeWork;

public class findPerfectnum {

	public static void main(String[] args) {
        int n=15;
        int sum=0;
        for(int i=1;i<n;i++) {
        	int r = n%i;
        	if(r==0) {
        		
        		sum = sum+i;
        	}
        	
        	
        }
        if(sum==n) {
        	System.out.println("It is perfect number");
        	
        }else {
        	
        	System.out.println("its not a perfect number");
        }
        
      

	}

}
