package class15;//am.2

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestDML {
	public static void main(String[] args) {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			Connection conn = DriverManager.getConnection(url,"root","347852901");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into user_java values(41,'张三',18)");
			stmt.executeUpdate("insert into user_java values(42,'李四',20)");
			stmt.executeUpdate("insert into user_java values(43,'王五',19)");
			ResultSet rs = stmt.executeQuery("select * from user_java");
			while(rs.next()){
				System.out.print("学号：" + rs.getInt(1));
				System.out.print("\t姓名："+ rs.getString(2));
				System.out.println("\t薪水：" + rs.getInt(3));
			}
			rs.close();
			stmt.executeUpdate("delete from user_java where id=2");
			stmt.executeUpdate("update user_java set id=id+10");
			
			System.out.println("---------------更新/删除数据后--------------");
			rs = stmt.executeQuery("select * from user_java");
			while(rs.next()){
				System.out.print("学号：" + rs.getInt(1));
				System.out.print("\t姓名："+ rs.getString(2));
				System.out.println("\t薪水：" + rs.getInt(3));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
			}
		}
}

