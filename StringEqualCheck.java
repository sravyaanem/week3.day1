package week3.day1;

public class StringEqualCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="I am Learning Java";
		String str2="I am Learning Java";
		if(str1==str2) {
			System.out.println("exact equal==");
		}
		if(str1.equals(str2)) {
			System.out.println("check equals");
		}
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("checkj equalignoerecase");
		}
		else
			System.out.println("hi");

	}

}
