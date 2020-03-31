public class Re_Gugudan {
	public static int[] calculate(int times) {	//반환받을 데이터 타입을 지정, 메소드 이름이 필요
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	public	static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	
	public static void main(String[] args) {	//void 메서드를 출력했을때 반환값이 없다
		for(int i=2; i<10; i++) {
			int[] result = calculate(i);
			print(result);
			
		}
		
		
		
		
		
		
		//배열 + 이중반복문
//		int[] result = new int[9];
//		for(int j=2; j<10; j++) {
//			for(int i=0; i<result.length; i++) {
//				result[i] = j*(i+1);
//				System.out.println(result[i]);
//			}
//		}
		
		//배열 + for반복
//		int[] result = new int[9];
//		for(int i=0; i<result.length; i++) {
//			result[i] = 2 * (i+1);
//		}
//		for(int i=0; i<result.length; i++) {
//			System.out.println(result[i]);
//		}
//		
	}
}
