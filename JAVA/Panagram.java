package CloudVadana;

public class Panagram {
	public static void main(String[] args) {
	String s= "abcdefghijklmnopqrstuvwxyz";
	System.out.println(isPanagram(s));
	
	}
	public static  boolean isPanagram(String s) {
		s= s.toLowerCase();
		for (char c= 'a';c<='z';c++) {
			if (s.indexOf(c)==-1)return false;
		}
		return true;
	}
}
