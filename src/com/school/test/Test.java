package com.school.test;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

import com.school.JFreeChartTest2.JFreeChartTest2;
import com.school.dao.DataDao;
import com.school.pojo.Student;
//��һ�������ļ���������100�� 2000 ����ְ��/ѧ�������з�����Ϣ��
//�����һ�������г��� 
//֧�ֲ�ѯĳ����ĳһ������������  ��ѯĳ�����ݵ���/�µ�����ͳ�������������״ͼ��ʾͳ�ƽ����
public class Test {
	public static void main(String[] args) throws SQLException, ParseException {
		DataDao dd = new DataDao();
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			System.out.println("1����ѯ�� ָ��ѧ������");
			System.out.println("2����ѯ����ͳ��ͼ");
			System.out.println("3���˳�");
			System.out.println("���������ѡ��");
			String choose = sc.nextLine();
			switch(choose){
				case "1":
					System.out.println("������ѧ������");
					String name = sc.nextLine();
					Student stu = new Student();
					stu.setName(name);
					dd.queryCase(stu);
					break;
				case "2":
					List<Integer> list = dd.getAllInfo();
					JFreeChartTest2.picture(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4));
					break;
				case "3":
					System.out.println("���˳�");
					return;
				default :
				System.out.println("������ĸ�ʽ����ȷ");
			}
		}
	}

	private static void getAllInfo() {
		// TODO Auto-generated method stub
		
	}
}
