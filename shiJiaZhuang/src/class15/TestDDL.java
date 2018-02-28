package class15;//2016.07.26 pm.1

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;//pm.1

public class TestDDL {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			conn = DriverManager.getConnection(url,"root","347852901");
			stmt = conn.createStatement();
			stmt.execute("create table mytable(id int,name char(10),phone char(10))");
			stmt.executeUpdate("insert into mytable values(55,'Tom','6766939')");
			rs = stmt.executeQuery("select * from mytable");
			while(rs.next()){
				System.out.println(rs.getString(1) +"\t" + rs.getString(2) + "\t" + rs.getString(3));
			}	
		}catch(Exception e){
				e.printStackTrace();
			}finally{
				try{
					if(rs!=null){
						rs.close();
					}
					if(stmt!=null){
						stmt.close();	
					}
					if(conn!=null){
						conn.close();
					}
				}catch(Exception e){
					e.printStackTrace();
				}
			}
	}

}
