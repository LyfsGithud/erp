package first1;

public class userNameUtil {
	/** �ж��û����Ƿ���ȷ */
	public static boolean isCorUserName(String userName){
		boolean isCorrect = true;
		//�û������25���ַ�
		if(userName == null)isCorrect = false;
		if(userName.length() > 25)isCorrect = false;
		//���ܰ����������
		char[] errArray = {' ','\'','"','?'};
		for(char ch : errArray){
		if(userName.contains(Character.toString(ch)))
			isCorrect = false;				
		}
		return isCorrect;
	}
	
}
