import java.util.Scanner;

public class chapter1_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("(x1, y1), (x2,y2)의 좌표 입력 >> ");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
   
		//x가 10보다 큰경우
		if((x1>= 10)&& (x2>=10)){
			//x가 200보다 작은경우
			if((x1<=200)&& (x2<=200)){
				//y가 10보다 큰 경우
				if((y1>= 10)&& (y2>=10)){
					//y가 300보다 작은경우
					if((y1<=300)&& (y2<=300)){
						//모두 참일시 포함된다 출력
						System.out.print("포함된다");
					}
					else
						System.out.print("포함되지 않는는다");
				}
				else
            	System.out.print("포함되지 않는는다");
			}
			else
        	System.out.print("포함되지 않는는다");
		}
		else
			System.out.print("포함되지 않는는다");
	scanner.close();
	}
}