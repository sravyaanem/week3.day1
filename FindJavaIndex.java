package week3.day1;

public class FindJavaIndex {
	public static void main(String[] args) {
		String str="Java Exercise";
		String sh="";
		char[] chararr=str.toCharArray();
		for(int i=0;i<chararr.length;i++) {
			if(chararr[i]=='E' || chararr[i]=='s') {
				
				sh+=i+" ";
			}
		}
		
		System.out.println(sh);
	}

}
