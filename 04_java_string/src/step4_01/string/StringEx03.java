package step4_01.string;

// 문자열 관련 메서드

public class StringEx03 {

	public static void main(String[] args) {
		
		String strData = "megait";
		System.out.println(strData);
		System.out.println("\n =================== \n");
		// [1] 문자열의 길이 : length()
		System.out.println(strData.length());
		int size = strData.length();
		System.out.println(size);
		System.out.println("\n =================== \n");
		
		
		// [2] 문자 한개 추출(인덱싱) : charAt(index)
		System.out.println(strData.charAt(0));
		System.out.println(strData.charAt(1));
		char ch = strData.charAt(2);  // charAt 의 변환타입 = char
	
		System.out.println(ch);
		System.out.println(strData.charAt(strData.length() - 1));
		
		for (int i = 0; i < strData.length(); i++) {
			System.out.println(strData.charAt(i));
		}
		System.out.println("\n =================== \n");
		// [3] 문자 여러개 추출(슬라이싱) : substring()
		
		// 3-1) substring(index1이상, index2미만)
		
		System.out.println(strData.substring(1, 3));
		String subStr = strData.substring(1, 2);  // substring 의 변환타입 = String
		System.out.println(subStr);
		System.out.println("\n =================== \n");
		
		// 3-2) substring(index이상)
		System.out.println(strData.substring(2));

		System.out.println("\n =================== \n");
		// [4] 구분자로 잘라내기 : split("구분자")
		String str1 = "hello,java";
		String str2 = "hello java programing";
		String str3 = "hello@java@programming@megait";
		
		String[] temp = str1.split(",");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		temp = str2.split(" ");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		temp = str3.split("@");
		System.out.println(temp.length);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		// [5] 문자열 비교 : compareTo()
		
		str1 = "ab";
		str2 = "ad";
		str3 = "ac";
		System.out.println(str1.compareTo(str2));  // str1이 str2보다 전의 문자열이면 음수, 같으면 0, 후면 양수
		
	}
	
}
