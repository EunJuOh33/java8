package Day0416;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConProg {
	public static void main(String args[]) {
//		String jdbc_url = "jdbc:mysql://localhost:3306/my_database";	//6.0이전
		String jdbc_url = "jdbc:mysql://localhost:3306/my_database?userUnicode=true"
				+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";			//6.0 이후
																		//Timezone 설정을 해야 한다.
		Connection conn = null;
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");		//6.0 이전	
			Class.forName("com.mysql.cj.jdbc.Driver");	//6.0 이후
			conn = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			System.out.println("데이터베이스에 접속했습니다!");
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
