package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("onluy id");
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("id and name"+id+name);
	}
	public void getStudentInfo(String name,String email) {
		System.out.println("name & email");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std=new Students();
		std.getStudentInfo(1);
		std.getStudentInfo(1, "sravya");
std.getStudentInfo("sanju", "srav");
	}

}
