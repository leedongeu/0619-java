/*
 *   'A'+'B'
 *   ===    ==
 *   ������ȯ=> 65
 *   65+66=> 131 (int)   char,short,byte => ���� => ����� int
 *   
 *   'ȫ'+'ȫ'          
 *   
 *   ***������ : ���������� �ʰ��ϸ� error�� �ƴ϶� �������ο��� �߻��Ѵ�.
 *   
 *   ��)    int ==> 1~10   11=> 1
 *   
 *   byte�� �ٶ�  -128~127  ==> 128�� �ָ� 
 *   0111111 ==> 127�� 2���� ��ǻ�Ϳ� ����
 *   1000000 ==>128������ ����Ʈ ������ �Ѿ�� ������ -128�� ���´�
 *   
 *   
 *   10+10.5 
 *   == 
 *   10.0==> ���� ���������� ������ ����
 *   
 *   'A'+1   ==> int
 *   ===
 *   65
 *   
 *   ��������ȯ
 *   	(int)(10.5+10.5)
 *   		=========
 *   1=> 21.0 ==> 21
 *    (int)10.5+(int)10.5 ==>20
 *    ======  ======
 *     10        10
 *           +
 */
public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// % 
		int a=5;
		int b=2;
		
		System.out.println(a%b);
		System.out.println(-a%b);
		System.out.println(a%-b);
		System.out.println(-a%-b);
		
		
		System.out.println((int)(10.5+10.5));
				System.out.println((int)10.5+(int)10.5);
		
		

	}

}
