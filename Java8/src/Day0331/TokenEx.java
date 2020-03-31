package Day0331;

import java.util.StringTokenizer;

public class TokenEx {
	public static void main(String[] args) {
		String now = "2020/03/31";
		
		StringTokenizer st = new StringTokenizer(now, "/");
		
		int cnt = st.countTokens();
		System.out.println("현재 토큰 수: " + cnt);	//현재 토큰 수: 3
		
		while(st.hasMoreTokens()) {
			String temp = st.nextToken();	//첫 번째 토큰을 반환하고(temp로 반환) 처음으로 돌아간다.
			System.out.println(temp);	//2020 03 31
		}
		
		
		String[] arr = now.split("/");
		for(String str : arr) {
			System.out.println(str);
		}
	}
}
