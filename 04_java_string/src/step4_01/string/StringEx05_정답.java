package step4_01.string;


public class StringEx05_정답 {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 34세
		
		String age = jumin.substring(0, 2);
		int intAge = 123 - Integer.parseInt(age);
		System.out.println(intAge + "세");
		// 문제 2) 성별 출력
		
		char gender = jumin.charAt(7);
		if (gender == '1') System.out.println("남성");
		else if (gender == '2') System.out.println("여성");
		// 정답 2) 여성

	}

}
