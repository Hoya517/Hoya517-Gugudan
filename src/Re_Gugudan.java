
import java.util.Scanner;

public class Re_Gugudan {
	public static void main(String[] args) {
		//2단 - 계산 및 출력
//		System.out.println("2단");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
		
		//3단 - 계산 및 출력
//		System.out.println("3단");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
		
		//4단 - 결과를 변수로 출력
//		int number = 4;
//		
//		System.out.println("4단");
//		int result = number * 1;
//		System.out.println(result);
//		result = number * 2;
//		System.out.println(result);
//		result = number * 3;
//		System.out.println(result);
//		result = number * 4;
//		System.out.println(result);
//		result = number * 5;
//		System.out.println(result);
//		result = number * 6;
//		System.out.println(result);
//		result = number * 7;
//		System.out.println(result);
//		result = number * 8;
//		System.out.println(result);
//		result = number * 9;
//		System.out.println(result);
		
		//5단 - 사용자에게 숫자 값을 입력 받는 방법
//		System.out.println("구구단 중 출력할 단은? : ");
//        Scanner scanner = new Scanner(System.in);
//        int number = scanner.nextInt();
//        System.out.println("number : " + number);
//
//        int result = number * 1;
//        System.out.println(result);
//        result = number * 2;
//        System.out.println(result);
//        result = number * 3;
//        System.out.println(result);
//        result = number * 4;
//        System.out.println(result);
//        result = number * 5;
//        System.out.println(result);
//        result = number * 6;
//        System.out.println(result);
//        result = number * 7;
//        System.out.println(result);
//        result = number * 8;
//        System.out.println(result);
//        result = number * 9;
//        System.out.println(result);

		//6단 - while 반복문 사용
//		int i = 1;
//		while (i < 10) {
//			System.out.println(6 * i);
//			i += 1;
//		}
		
		//7단 - for 반복문 사용
//		for(int i = 1; i < 10; i++) {
//			System.out.println(7 * i);
//		}
		
		//8단 - 스캐너, for문 사용
//		 System.out.println("구구단 중 출력할 단은? : ");
//	     Scanner scanner = new Scanner(System.in);
//	     int number = scanner.nextInt();
//	     System.out.println("number : " + number);
//	     
//	     for(int i = 1; i < 10; i++) {
//				System.out.println(number * i);
//	     }
		
	    //9단 - 입력한 숫자 값이 2이상, 9이하인지 확인
	     System.out.println("구구단 중 출력할 단은? : ");
	     Scanner scanner = new Scanner(System.in);
	     int number = scanner.nextInt();
	     System.out.println("number : " + number);
		
	     if (number < 2) {
	    	    // 사용자에게 에러 메시지 출력
	    	 	System.out.println("erorr");
	    	} else if (number > 9) {
	    	    // 사용자에게 에러 메시지 출력
	    		System.out.println("erorr");
	    	} else {
	    	    // number에 해당하는 구구단 계산 결과 출력
	    		for(int i = 1; i < 10; i++) {
					System.out.println(number * i);
	    		}
	    	}
		
	}
}
