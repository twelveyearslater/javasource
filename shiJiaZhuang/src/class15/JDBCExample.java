package class15;//am.1


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) {
		try{
//			加载mysql的驱动
			Class.forName("com.mysql.jdbc.Driver");
//			写明mysql的访问地址及端口号
			String url = "jdbc:mysql://localhost:3306/test";
//			创建数据库链接
			Connection conn = DriverManager.getConnection(url,"root","347852901");
//			查询完sql返回一个结果集
			Statement stmt = conn.createStatement();
			ResultSet rs =  stmt.executeQuery("select * from user_java");
			while(rs.next()){
				System.out.print("id:" + rs.getInt(1));
				System.out.print("\tname:" + rs.getString(2));
				System.out.println("\tsalary:" + rs.getInt(3));
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e){
			
		}
	}

}
