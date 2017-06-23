package palindrom;

public class Panlindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "radar";
		String s2 = " ";
		String sWithoutSpaces = " ";
		System.out.println(s);
		System.out.println(s.length());
		for (int i = s.length()-1; i >= 0; i--) {
			
			System.out.printf("%d is %s\n", i,s.charAt(i));
			if (s.charAt(i) == (' ')) {
				
			}
			else {
				s2 = s2 + s.charAt(i);
				sWithoutSpaces = sWithoutSpaces + s.charAt(i);
				
			}
			
		
		}
		System.out.println(s2.toLowerCase());
		System.out.println(sWithoutSpaces.toLowerCase());
		if (s2.equals(sWithoutSpaces)) {
			System.out.println("it is a panlindrome!");
		}
			else {
				System.out.println("No! It is not a panlindrome!");
			}
		}
	}	

