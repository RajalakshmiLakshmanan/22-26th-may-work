package officeWork;

public class FindArmstrong {
	
	public static void findRangeofArmstong(int s, int d) {
		
		for(int i= s ; i<d; i++) {
			int n =0;
			int y=i;
			while(y!=0) {
				
				 y= y/10;
				  n++;
			}
			int sum=0;
			y=i;
			while(y!=0) {
				int r =y;
				r= r%10;
				sum= (int) (sum+ Math.pow((r), (n)));
				y = y/10;	
			}
			
			if(sum==i) {
				
				System.out.print(sum+",");
			}
			
			
			
		}
		
		
		
	}

	public static void main(String[] args) {

         int startRange = 50;
         int endRange = 500;
         
         findRangeofArmstong(startRange,endRange);

	}

}
