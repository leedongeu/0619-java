/*
 *    �ʿ�ÿ� ���������� �����ؼ� ���: ���� ����ȯ
 *    
 *    int + double =double (�ڵ�����ȯ)
 *    ===
 *    double
 *    
 *    char+int=int
 *    ===
 *    int
 *    
 *    int+long=long
 *    ===
 *    long
 *    
 *    char+int+long+double=double
 *    ===
 *    int
 *    ===========
 *    int  
 *    ========
 *    long
 *    ======double   �� ���� ����ȴ�.
 *    
 *    
 *    (int)double ==> int      ���� ����ȯ : ū�����͸� ���� �����ͷ� �����Ҷ� ��
 *    (char)int==>
 *    
 *    1)����ȯ�� boolean�� ����
 *    2)int���ϴ� ������ �ϸ� ������� int�̴�
 *    	��: byte+byte=int
 *         char+char=int
 *         shart+byte=int
 *         char+byte+short=int
 */
public class ���׿�����_����ȯ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڵ�������
		int a='A'; //a=65	
		double d=10;  //d=10.0
		//      int
		char c=65;     //c='A'
		System.out.println("a="+a);
		System.out.println("d="+d);
		System.out.println("c="+c);
		
		//��������ȯ
		int i=(int)10.5;
		int ii=(int)'A';
		System.out.println("ii="+ii);
		System.out.println("i="+i);
		
		

	}

}
