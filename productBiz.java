package first1;

import javax.swing.JOptionPane;

public class productBiz {
	public static void main(String[] args){
		int[] count = new int[3];
		double total = 0;
		for (int i = 0; i < count.length; i++) {
			product pro = new product();
			String name = JOptionPane.showInputDialog("��������Ʒ���ƣ�");
			pro.setName(name);
			String strPrice = JOptionPane.showInputDialog("��������Ʒ���ۣ�");
			pro.setPrice(Double.parseDouble(strPrice));
			String strCount = JOptionPane.showInputDialog("�����빺�����Ʒ������");
			count[i] = Integer.parseInt(strCount);
			//�ۼ��ܼ�
			total = pro.getPrice() * count[i];
		}
		System.out.println("�ܼۣ�" + total);
	}
}
