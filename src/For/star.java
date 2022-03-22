package For;

public class star {
	public static void main(String[] args) {

		// 왼쪽 기운 삼각형
//		for (int i =0; i < 10; i++)
//			  {
//			    for (int j=0; j < i+1; j++)
//			       System.out.print("*");
//			    System.out.println();
//			  }

		// 왼쪽 기운 삼각 역방향
//		for (int i = 11; i >= 0; i--) {
//			for (int j = 0; j < i - 1; j++)
//				System.out.print("*");
//			System.out.println();
//		}

		// 오른쪽 기운 삼각 역방향
//		for (int count = 0; count < 10; count++) {
//			for (int index = 1; index < count + 1; index++)
//				System.out.print(" ");
//			for (int star = 10; star > count; star--)
//				System.out.print("*");
//			System.out.println();
//		}

		//오른쪽 기운 삼각
//		for (int count = 10; count > 0; count--) {
//			for (int index = 0; index < count - 1; index++)
//				System.out.print(" ");
//			for (int star = 10; star > count - 1; star--)
//				System.out.print("*");
//			System.out.println();
//		}

		
		// 2 4 섞은거
//		for (int i =11; i >= 0; i--) {
//			for (int j = 0; j < i + 1; j++)
//				if(j>=i)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//			for(int k=10; k > i-1; k--)
//				System.out.print("*");
//
//				System.out.println("");
//		}
		
		
		//입력받아 높이만큼 삼각형
//		 int inputNumber;
//	      int cnt = 1;
//	      int center;
//	      
//	      Scanner scan = new Scanner(System.in);
//	      
//	      System.out.print("높이 입력 : ");
//	      inputNumber = scan.nextInt();
//	      
//	      center = inputNumber-1;
//	      
//	      for(int i = 0; i < inputNumber; i++) {
//	         for(int j = 0; j < inputNumber *2 -1; j++) {
//	            if( j > center - cnt && j < center + cnt)
//	               System.out.print("*");
//	            else 
//	               System.out.print(".");
//	         }
//	         System.out.println();
//	         cnt++;
//	      }

	      

//		for (int i =11; i >= 0; i--) {
//			for (int j = 0; j < i + 1; j++)
//				if(j>=i)
//					System.out.print(" ");
//				else
//					System.out.print("*");
//				System.out.println("*");
//		}

//		 for(int i =11; i >= 0; i--) {
//				for (int j = 0; j < i + 1; j++)
//					if(j>=i)
//						System.out.print("*");
//					else
//						System.out.print(" ");
//				System.out.println("");
//			}

//		for (int i =0; i < 10; i++) {
//			for (int j = 0; j < i + 1; j++)
//				if(j>=i)
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			System.out.println("");
//		}
	}
}
