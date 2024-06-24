package JavatrainingBasicsPrograms;

public class SumOfOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		int count = 0;

		for (number = 0; number <= 100; number++) {
			if (number % 2 == 1) {
				count = number + count;
				System.out.println("The total countNumber is odd " + count);
			}

		}
		System.out.println("The total countNumber is odd " + count);

	}

}


// for - n=0 if=0 for n=1
// n=1 if =1 c=1
//n=2  if =0
//n=3 if =1 c=4
//n=4 if=0
//n=5 if=1 c=9
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
