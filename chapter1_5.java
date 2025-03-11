package java;
import java.util.Scanner;

public class chapter1_5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 >> ");
        //나이 입력
        int age = scanner.nextInt();
        
        //나이가 0보다 클 시
        if(age >0){
            int red = 0;
            int blue = 0;
            int yellow = 0;
            
            red =age/10;
            blue=(age%10)/5;
            yellow=(age%10)%5;
            System.out.println("빨간 초"+red+"개,파란 초" +blue+"개, 노란 초 " + yellow+"개"+". 총 "+(red+yellow+blue)+"개가 필요합니다.");
        }   
        //나이가 0보다 작을 시
        else
            System.out.println("나이는 양수로만 입력하세요.");
        scanner.close();
	}
}
