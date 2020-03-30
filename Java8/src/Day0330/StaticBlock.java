package Day0330;

public class StaticBlock {
	static String company = "삼성";
	static String kind = "LCD";
	static String product = company + "-" + kind;	//이제는 static연산이 바로 가능하다.
	static String pro2;
	
	static {
		pro2 = company + "-" + kind;	//옛날에는 이렇게 해줘야 했다.
	}
}
