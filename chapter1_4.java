package java;
import java.util.Scanner;

public class chapter1_4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //여행지 입력
        System.out.println("여행지 >> ");
        String locate = scanner.nextLine();
        
        //인원수 입력
        System.out.println("인원수 >> ");
        int people = scanner.nextInt();
        
        //숙박일 입력
        System.out.println("숙박일 >> ");
        int day = scanner.nextInt();
        
        //인당 항공료 입력
        System.out.println("1인당 항공료 >> ");
        int airplane = scanner.nextInt();
        
        //일당 숙박비 입력
        System.out.println("1방 숙박비 >> ");
        int hotel = scanner.nextInt();     

        System.out.println(people+"명의 " + locate + day + "박 " + (day+1)+"일 여행에는"+ (people/2 + people%2)+"개 필요하며 경비는 " + ((airplane*people)+(day*(people/2 + people%2)*hotel))+"원 입니다.");
        scanner.close();
	}
}
