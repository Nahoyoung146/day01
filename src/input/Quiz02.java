package input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("당신의 이름은 무엇입니까? ");
		String name = scan.next();
		System.out.print(name + " 님의 국어 점수 : ");
		int korea = scan.nextInt();
		System.out.print(name + " 님의 영어 점수 : ");
		int eng = scan.nextInt();
		System.out.print(name + " 님의 수학 점수 : ");
		int math = scan.nextInt();
		int sum = korea + eng + math;

		System.out.println();
		System.out.println("=====================");
		System.out.println("이 름 : " + name);
		System.out.println("=====================");
		System.out.println("국 어 : " + korea);
		System.out.println("영 어 : " + eng);
		System.out.println("수 학 : " + math);
		System.out.println("=====================");
		System.out.println("합 계 : " + sum);
		System.out.println("=====================");
	}
}