package Day0416;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProg2 {
	public static void main(String args[]) {
//		String jdbc_url = "jdbc:mysql://localhost:3306/my_database";
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?userUnicode=true"
				+ "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";		
		
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");		//6.0 이전	
			Class.forName("com.mysql.cj.jdbc.Driver");	//6.0 이후
			System.out.println("데이터베이스에 접속했습니다!");
			System.out.println("<< 학생명단 >>");
			System.out.println("[학번]\t[이름]");
			
			String sql = "SELECT * FROM student WHERE sex=? && address=?";	// 물음표로 코드를 숨겨준다.
			conn = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "F");	// M을 넣으면 남자만 출력된다.
			pstmt.setString(2, "Seoul");	// JKYEE 한 명만 나타난다.
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}

