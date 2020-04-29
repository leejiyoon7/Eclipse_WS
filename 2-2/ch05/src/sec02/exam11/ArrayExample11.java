package sec02.exam11;

public class ArrayExample11 {
	
	public static void main(String[] args) {
		int[][] arr = { {95, 92, 94}, {93, 97, 99}, {98, 93, 100} };
		
		int cnt1=0, cnt2=0, sum=0;
		
		for (int[] i : arr) {
			for (int j : i) {
				System.out.println("arr[" + cnt1 + "][" + cnt2 + "] = " + j + "\t");
				sum = sum + j;
				cnt2++;
			}
			System.out.println("ÃÑÁ¡ = " + sum);
			double avg = (double) sum / i.length;
			System.out.println("Æò±Õ = " + avg);
			
			cnt2=0;
			cnt1++;
			sum=0;
			
			System.out.println();	
		}
	}
}
