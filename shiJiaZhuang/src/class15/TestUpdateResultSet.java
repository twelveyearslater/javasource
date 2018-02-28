package class15;//2016.07.26 pm.2

//ResultSet.TYPE_FORWORD_ONLY �ջ񼯵��α�ֻ�����¹�����
//ResultSet.TYPE_SCROLL_INSENSITIVE �ջ񼯵��α��ܹ�����Ų���������ݿ�ı�ʱ��Ŀǰ�ջ񼯲��䡣
//ResultSet.TYPE_SCROLL_SENSITIVE �����ɹ������ջ񼯣������ݿ�ı�ʱ��Ŀǰ�ջ�ͬ���Ļ���
//ResultSet.CONCUR_READ_ONLY �������ջ񼯸������ݿ��еı�
//ResultSet.CONCUR_UPDATETABLE �����ջ񼯸������ݿ��еı�
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
		System.out.print("��" + rs.getRow() + "�У�");
		System.out.print(rs.getString(1));
		System.out.print("\t" + rs.getString(2));
		System.out.print("\t" + rs.getString(3));
		System.out.println();
	}
}
