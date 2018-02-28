package class15;//2016.07.26 pm.2

//ResultSet.TYPE_FORWORD_ONLY 收获集的游标只能向下滚动。
//ResultSet.TYPE_SCROLL_INSENSITIVE 收获集的游标能够上下挪动，当数据库改变时，目前收获集不变。
//ResultSet.TYPE_SCROLL_SENSITIVE 归来可滚动的收获集，当数据库改变时，目前收获集同步改换。
//ResultSet.CONCUR_READ_ONLY 不能用收获集更新数据库中的表。
//ResultSet.CONCUR_UPDATETABLE 能用收获集更新数据库中的表。
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdateResultSet {
	public static void main(String[] args) {
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			conn = DriverManager.getConnection(url,"root","347852901");
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("select * from user_java");
			while(rs.next()){
				showOneRow(rs);
			}
			System.out.println("-----------");
			rs.last();
			showOneRow(rs);
			rs.first();
			showOneRow(rs);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
					conn.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public static void showOneRow(ResultSet rs)throws SQLException{
		System.out.print("第" + rs.getRow() + "行：");
		System.out.print(rs.getString(1));
		System.out.print("\t" + rs.getString(2));
		System.out.print("\t" + rs.getString(3));
		System.out.println();
	}
}
