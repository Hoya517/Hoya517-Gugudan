

public class Re_Gugudan {
	public static void main(String[] args) {
		//배열 + 이중반복문
		int[] result = new int[9];
		for(int j=2; j<10; j++) {
			for(int i=0; i<result.length; i++) {
				result[i] = j*(i+1);
				System.out.println(result[i]);
			}
		}
		
		//배열 + for반복
//		for(int i=0; i<result.length; i++) {
//			result[i] = 2 * (i+1);
//		}
//		for(int j=0; j<result.length; j++) {
//			System.out.println(result[j]);
//		}
		
		
	}
}
