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
			stmt.executeUpdate("insert into user_java values(41,'����',18)");
			stmt.executeUpdate("insert into user_java values(42,'����',20)");
			stmt.executeUpdate("insert into user_java values(43,'����',19)");
			ResultSet rs = stmt.executeQuery("select * from user_java");
			while(rs.next()){
				System.out.print("ѧ�ţ�" + rs.getInt(1));
				System.out.print("\t������"+ rs.getString(2));
				System.out.println("\tнˮ��" + rs.getInt(3));
			}
			rs.close();
			stmt.executeUpdate("delete from user_java where id=2");
			stmt.executeUpdate("update user_java set id=id+10");
			
			System.out.println("---------------����/ɾ�����ݺ�--------------");
			rs = stmt.executeQuery("select * from user_java");
			while(rs.next()){
				System.out.print("ѧ�ţ�" + rs.getInt(1));
				System.out.print("\t������"+ rs.getString(2));
				System.out.println("\tнˮ��" + rs.getInt(3));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
			}
		}
}

