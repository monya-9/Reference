package While;

import java.util.Scanner;

public class num1 {
	public static void main(String[] args) {
		System.out.print("두자리 정수를 입력 : "); // 두자리 정수 자릿수 더해서 빼기
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int sum = 0;
		int a = num;
		int b = 0;

		while (a > 0) {
			sum += num % 10;
			num /= 10;
			while (b != 0) {
				a -= sum;
				break;
			}
			b++;
			System.out.print(a + ", ");
		}
	}
}
