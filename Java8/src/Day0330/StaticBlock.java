package Day0330;

public class StaticBlock {
	static String company = "�Ｚ";
	static String kind = "LCD";
	static String product = company + "-" + kind;	//������ static������ �ٷ� �����ϴ�.
	static String pro2;
	
	static {
		pro2 = company + "-" + kind;	//�������� �̷��� ����� �ߴ�.
	}
}
