package first1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class UserMain {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("����ʼ:");
		User user = new User();
		SetUserName(user);
		SetPassword(user);
		SetEmail(user);
		System.out.println("ע�����");
		
		
		
//		System.out.print("�������û�����");
//		while(true){
//			String userName = input.next();
//			if(userNameUtil.isCorUserName(userName.trim())){
//				user.setUserName(userName.trim());
//				break;}
//			else System.out.print("��������ȷ��ʽ���û�����");
//		}
//
//		System.out.print("���������룺");
//		while(true){
//			String password = input.next();
//			if(passwordUtil.isCorPassword(password.trim())){
//				user.setPassword(password.trim());
//				break;}
//			else System.out.print("��������ȷ��ʽ�����룺");
//		}
//		System.out.println("����ȼ�Ϊ��" +
//				passwordUtil.powerOfPassword(user.getPassword()));	
//		
//		
//		System.out.print("������email��");
//		while(true){
//			String email = input.next();
//			if(emailUtil.isCorEmail(email.trim())){
//				user.setPassword(email.trim());
//				break;}
//			else System.out.print("��������ȷ��ʽ��email��");
//		}
		
	
	}
	public static void SetUserName(User user){
		Scanner input = new Scanner(System.in);
		System.out.print("�������û�����");
		while(true){
			String userName = input.next();
			if(userNameUtil.isCorUserName(userName.trim())){
				user.setUserName(userName.trim());
				break;}
			else System.out.print("��������ȷ��ʽ���û�����");
		}
	}
	
	public static void SetPassword(User user){
		Scanner input = new Scanner(System.in);
		System.out.print("���������룺");		
		while(true){
			String password = input.next();
			if(passwordUtil.isCorPassword(password.trim())){	
				System.out.print("��ȷ�����룺");
				while(true){				
					String str = input.next();
					if(password.trim().equals(str.trim())){
						user.setPassword(password.trim());
						break;
					}else System.out.print("������������벻��ͬ��\n���������룺");
				}
				user.setPassword(password.trim());
				break;}
			else System.out.print("��������ȷ��ʽ�����룺");
		}
		System.out.println("����ȼ�Ϊ��" +
				passwordUtil.powerOfPassword(user.getPassword()));	
	}
	
	public static void SetEmail(User user){
		Scanner input = new Scanner(System.in);
		System.out.print("������email��");
		while(true){
			String email = input.next();
			if(emailUtil.isCorEmail(email.trim())){
				user.setPassword(email.trim());
				break;}
			else System.out.print("��������ȷ��ʽ��email��");
		}
	}
}



