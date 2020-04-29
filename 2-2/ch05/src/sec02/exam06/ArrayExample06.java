package sec02.exam06;

public class ArrayExample06 {
	public static void main(String[] args) {	
		
		int[][] mathScores = new int[2][3];//2행3열 배열
		for(int i=0; i<mathScores.length; i++) {
			for(int k=0; k<mathScores[i].length; k++) {
				System.out.println("mathScores["+i+"]["+k+"]="
						+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];//계단식 배열
		englishScores[0] = new int[2];//0행 : 크기 2
		englishScores[1] = new int[3];//1행 : 크기 3
		for(int i=0; i<englishScores.length; i++) {
			for(int k=0; k<englishScores[i].length; k++) {
				System.out.println("englishScores["+i+"]["+k+"]=" + englishScores[i][k]);
			}
		}
		System.out.println();		
		
		int[][] javaScores = { {95, 80}, {92, 96, 80} };//목록 값으로 계단식 배열 생성
		for(int i=0; i<javaScores.length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]="
						+javaScores[i][k]);
			}
		}
	} 
}

