package java;
import java.util.Scanner;

public class chapter1_3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("생일 입력 하세요 >> ");
        int birth = scanner.nextInt();
        System.out.print(birth/10000+"년 " + (birth%10000)/100+ "월 "+ (birth%10000)%100+"일");
        scanner.close();
	}
}
