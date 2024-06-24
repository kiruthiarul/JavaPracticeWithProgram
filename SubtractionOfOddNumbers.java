
//subtract the odd numbers from the total of 100 sequence number
// A= Add 1 to 100 numbers
//B = Add only odd numbers in 1to 100
//C = A-B

package JavatrainingBasicsPrograms;

public class SubtractionOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k ;
		int A = 0, B= 0;
		int c;
		//int B =0;
		for (i = 0; i <= 100; i++) {
			A = A + i;
		}
		System.out.println("Sequence of 100 numbers total is" + A);
		
		for(j=0; j<=100; j++) {
			if(j%2==1) {
				B= B+j;
				
			}
			
		}
		System.out.println(" Total number of odd number is" + B);
		c=A-B;
		System.out.println(" Total number is" + c);
	}

}
