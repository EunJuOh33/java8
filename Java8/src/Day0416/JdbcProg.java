package Day0416;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProg {
	public static void main(String args[]) {
//		String jdbc_url = "jdbc:mysql://localhost:3306/my_database";
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?userUnicode=true"
				+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";		
		
		String sql = "SELECT * FROM student";
		try(
				Connection conn = DriverManager.getConnection(jdbc_url, "root", "yt1234");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				) {
//			Class.forName("com.mysql.jdbc.Driver");		//6.0 이전	
			Class.forName("com.mysql.cj.jdbc.Driver");	//6.0 이후
			System.out.println("데이터베이스에 접속했습니다!");
			System.out.println("<< 학생명단 >>");
			System.out.println("[학번]\t[이름]");
			
			while(rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}

