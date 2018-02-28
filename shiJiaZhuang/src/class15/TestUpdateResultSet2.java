package class15;//2016.07.26 pm.3

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdateResultSet2 {
	public static void main(String[] args) {
		Connection conn = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			conn = DriverManager.getConnection(url,"root","347852901");
			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from user_java");
//			����ǰ�����������
			while(rs.next()){
				showOneRow(rs);
			}
//			���º�ɾ����¼
			rs.beforeFirst();
			while(rs.next()){
				String name = rs.getString("name").trim();
				if(name.equals("����")){
					int sal = rs.getInt("salary");
					rs.updateInt("salary", sal+8888);
					rs.updateRow();
				}else if(name.equals("����")){
					rs.deleteRow();
				}
			}
			rs.moveToInsertRow();
			rs.updateInt("id",1005);
			rs.updateString("name","�Ʒ���");
			rs.updateInt("salary",8840);
			rs.insertRow();
			rs.close();
			
//			��������º����ݿ��е�����
			System.out.println("-----------------------------------------");
			rs = stmt.executeQuery("select * from user_java");
			while(rs.next()){
				showOneRow(rs);
			}
			rs.close();
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
		System.out.print("��" + rs.getRow() + "�У�");
		System.out.print(rs.getString(1));
		System.out.print("\t" + rs.getString(2));
		System.out.print("\t" + rs.getString(3));
		System.out.println();
	}		

}
