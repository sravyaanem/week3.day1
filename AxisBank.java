package week3.day1;

public class AxisBank extends BankInfo {
public void deposit() {
	System.out.println("deposit in AxisBank overload");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank ax=new AxisBank();
		BankInfo bn=new BankInfo();
		ax.saving();
		ax.fixed();
		ax.deposit();
		//bn.deposit();

	}

}
