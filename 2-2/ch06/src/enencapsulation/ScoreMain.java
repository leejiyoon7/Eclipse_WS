package enencapsulation;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		 
        ArrayList<Student> slist = new ArrayList<Student>();
 
        Scanner sc = new Scanner(System.in);
 
        String selName;// ����, ������ �Է��� �̸�
 
        while (true) {
            System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ��������ѤѤѤѤѤѤѤѤѤѤѤѤ�");
            System.out.println(" 1.�����Է�   2.�������   3.��������   4.��������   5.����");
            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
            int input = sc.nextInt();
            Student std = new Student();
 
            if (input == 1) {
                // �����Է�
                System.out.println("�̸��� �Է��Ͻÿ� :");
                std.setName(sc.next());// �̸�
                System.out.println("��� �Է��Ͻÿ� :");
                std.setKor(sc.nextInt());// ��
                System.out.println("��� �Է��Ͻÿ� :");
                std.setEng(sc.nextInt());// ��
                System.out.println("������ �Է��Ͻÿ�");
                std.setMath(sc.nextInt());// 
 
                slist.add(std);// Arraylist�� std �Է°��� �־��ش�.
            } else if (input == 2) {
                System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ�����¤ѤѤѤѤѤѤѤѤѤѤѤѤ�");
                System.out.println("�̸�\t����\t����\t����\t����\t���");
                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                // �������
                for (Student n : slist) {// foreach������ ���
                    System.out.print(n.getName() + "\t");
                    System.out.print(n.getKor() + "\t");
                    System.out.print(n.getEng() + "\t");
                    System.out.print(n.getMath() + "\t");
                    System.out.print(n.Total() + "\t");
                    System.out.println(n.Avg() + "\t");
 
                }
            }
            // ��������
            else if (input == 3) {
                System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ��������ѤѤѤѤѤѤѤѤѤѤѤѤ�");
                System.out.println("              ������ �л��̸��� �Է��Ͻÿ�");
                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                selName = sc.next();
                for (int i = 0; i < slist.size(); i++) {
                    if (slist.get(i).getName().equals(selName)) {
                        while (true) {
                            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                            System.out.println(selName + "�� ������ �����͸� ���ÿ�.");
                            System.out.println("1.����\t 2.����\t 3.����\t 4.��������");
                            System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
 
                            int button = sc.nextInt();
 
                            if (button == 1) {
                                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                                System.out.println("���� ������ �����մϴ�.");
                                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                                slist.get(i).setKor(sc.nextInt());
                            }
                            if (button == 2) {
                                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤ�");
                                System.out.println("���� ������ �����մϴ�.");
                                System.out.println("������ ������ �Է��ϼ���.");
                                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤ�");
                                slist.get(i).setEng(sc.nextInt());
                            }
                            if (button == 3) {
                                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                                System.out.println("���� ������ �����մϴ�.");
                                System.out.println("������ ������ �Է��ϼ���.");
                                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                                slist.get(i).setMath(sc.nextInt());
                            }
                            if (button == 4) {
                                System.out.println("���α׷��������մϴ�");
                                break;
                            }
                        }
 
                    }
                }
 
            } else if (input == 4) {
                System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ��������ѤѤѤѤѤѤѤѤѤѤѤѤ�");
                System.out.println("                     ������ �л��̸��� �Է��Ͻÿ�");
                System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
                selName = sc.next();
                for (int i = 0; i < slist.size(); i++) {
                    if (slist.get(i).getName().equals(selName)) {
                        slist.remove(i);
                        System.out.println("�����Ϸ�");
                    }
                }
            } else if (input == 5) {
                System.out.println("���α׷��������մϴ�");
                System.exit(-1);
            }
 
        } // while
 
    }
}
 

