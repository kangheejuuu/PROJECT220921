/*2021041025 강희주
 *양수 5개를 입력 받아 배열에 저장하고, 제일 큰 수를 출력하는 프로그램
 */
import java.util.Scanner;
public class ArrayAccess {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int intArray[]=new int[5]; //배열 생성
		
		int max=0; //현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0;i<5;i++) {
			intArray[i]=scanner.nextInt(); //입력받은 정수를 배열에 저장
			if(intArray[i]>max)
				max=intArray[i];
		}
		System.out.print("가장 큰 수는 "+max+"입니다.");
		
		scanner.close();

	}

}
