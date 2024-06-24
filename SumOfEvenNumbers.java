package JavatrainingBasicsPrograms;

public class SumOfEvenNumbers {


public static void main(String[] args) {
	int i;
	int count =0;
	for(i=1; i<=100; i++) {
		if(i%2==0) {
			count = count+i;
		}
	}
	System.out.println("The total even number is" + count);
} 
}
