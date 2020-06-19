/*
 *  비트연산자 => 비트와 비트를 연산
 *   8
 *  =======
 *  1000
 *  =======
 *  6
 *  =======
 *  0110
 *  =======
 *  
 *       &   |     ^     ==> 회로, 암호화/복호화
 *       (*) (+)
 *       =============
 *       00  0
 *       01  0 
 *       10	 0		
 *       11  1
 *       
 */
public class 이항연산자_비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10&5);
		System.out.println(10|5);
		System.out.println(10^5);
		System.out.println(27&13);
		System.out.println(27|13);
		System.out.println(27^13);
		System.out.println(0b10110);
	

	}

}
