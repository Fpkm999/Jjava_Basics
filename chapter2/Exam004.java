package chapter2;

public class Exam004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 산술 연산자
		 * 변수 또는 상수와 함께 사용하여 기본적인 계산을 할 수 있음.
		 * 나머지 연산자는 데이터 타입이 정수형인 경우에만 사용.
		 */
		int num1 = 10; // a에 10을 대입
		int num2 = 3; // b에 3을 대입
		
		System.out.println(num1 + num2);	// 13
		System.out.println(num1 - num2);	// 7
		System.out.println(num1 * num2);	// 30
		System.out.println(num1 / num2);	// 3
		System.out.println(num1 % num2);	// 나머지 연산. a를 b로 나눈 후 나머지를 반환.
		// 나머지 연산을 짝수, 홀수 구분에 사용. // 1
		System.out.println(num1 % 2);	// 0
		System.out.println(num2 % 2);	// 1

	}

}
