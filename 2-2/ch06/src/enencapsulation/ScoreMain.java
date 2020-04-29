package enencapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		 
        ArrayList<Student> slist = new ArrayList<Student>();
 
        Scanner sc = new Scanner(System.in);
 
        String selName;// 수정, 삭제시 입력할 이름
 
        while (true) {
            System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ성적관리ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println(" 1.성적입력   2.성적출력   3.성적수정   4.성적삭제   5.종료");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            int input = sc.nextInt();
            Student std = new Student();
 
            if (input == 1) {
                // 성적입력
                System.out.println("이름을 입력하시오 :");
                std.setName(sc.next());// 이름
                System.out.println("국어를 입력하시오 :");
                std.setKor(sc.nextInt());// 국
                System.out.println("영어를 입력하시오 :");
                std.setEng(sc.nextInt());// 영
                System.out.println("수학을 입력하시오");
                std.setMath(sc.nextInt());// 
 
                slist.add(std);// Arraylist에 std 입력값을 넣어준다.
            } else if (input == 2) {
                System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ성적출력ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                // 성적출력
                for (Student n : slist) {// foreach문으로 출력
                    System.out.print(n.getName() + "\t");
                    System.out.print(n.getKor() + "\t");
                    System.out.print(n.getEng() + "\t");
                    System.out.print(n.getMath() + "\t");
                    System.out.print(n.Total() + "\t");
                    System.out.println(n.Avg() + "\t");
 
                }
            }
            // 성적수정
            else if (input == 3) {
                System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ성적수정ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                System.out.println("              수정할 학생이름을 입력하시오");
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                selName = sc.next();
                for (int i = 0; i < slist.size(); i++) {
                    if (slist.get(i).getName().equals(selName)) {
                        while (true) {
                            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                            System.out.println(selName + "의 수정할 데이터를 고르시오.");
                            System.out.println("1.국어\t 2.영어\t 3.수학\t 4.수정종료");
                            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
 
                            int button = sc.nextInt();
 
                            if (button == 1) {
                                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                                System.out.println("국어 성적을 수정합니다.");
                                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                                slist.get(i).setKor(sc.nextInt());
                            }
                            if (button == 2) {
                                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                                System.out.println("영어 성적을 수정합니다.");
                                System.out.println("수정할 점수를 입력하세요.");
                                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                                slist.get(i).setEng(sc.nextInt());
                            }
                            if (button == 3) {
                                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                                System.out.println("수학 성적을 수정합니다.");
                                System.out.println("수정할 점수를 입력하세요.");
                                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                                slist.get(i).setMath(sc.nextInt());
                            }
                            if (button == 4) {
                                System.out.println("프로그램을종료합니다");
                                break;
                            }
                        }
 
                    }
                }
 
            } else if (input == 4) {
                System.out.println("\nㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ성적삭제ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                System.out.println("                     삭제할 학생이름을 입력하시오");
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                selName = sc.next();
                for (int i = 0; i < slist.size(); i++) {
                    if (slist.get(i).getName().equals(selName)) {
                        slist.remove(i);
                        System.out.println("삭제완료");
                    }
                }
            } else if (input == 5) {
                System.out.println("프로그램을종료합니다");
                System.exit(-1);
            }
 
        } // while
 
    }
}
 

