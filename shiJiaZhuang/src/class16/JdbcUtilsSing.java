package class16;//2016.07.26 am.2
import java.sql.*;
//1 �������ݿ����ӵĲ���
//2 ʵ�ֵ���ģʽ
//3 ��̬�ļ���mysql����
//4 �ṩһ�������ĵ���connection�ķ���
//5 �ͷ�conn��stmt��rs����
public final class JdbcUtilsSing {
	//1 �������ݿ����ӵĲ���
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password = "347852901";
	private static JdbcUtilsSing instance = null;
	private JdbcUtilsSing(){}
	//2 ʵ�ֵ���ģʽ
	public static JdbcUtilsSing getIntstance(){
		if(instance == null){
			synchronized(JdbcUtilsSing.class){
				if(instance == null){
					instance = new JdbcUtilsSing();
				}
			}
		}
		return instance;
	}
	//3 ��̬�ļ���mysql����
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			throw new ExceptionInInitializerError(e);
		}
	}
	//4 �ṩһ�������ĵ���connection�ķ���
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, user, password);
	}
	//5 �ͷ�conn��stmt��rs����
	public void free(ResultSet rs,PreparedStatement ps, Connection conn){
		try{
			if(rs!=null)
				rs.close();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(ps!=null)
					ps.close();
			}catch(SQLException e){
				e.printStackTrace();
			}finally{
				try{
					if(conn!=null)
					   ps.close();
					}catch(SQLException e){
						e.printStackTrace();
					}
			}
	}
	}
}
