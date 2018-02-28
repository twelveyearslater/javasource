package class16;//2016.07.26 am.2
import java.sql.*;
//1 定义数据库连接的参数
//2 实现单例模式
//3 静态的加载mysql驱动
//4 提供一个公共的调用connection的方法
//5 释放conn，stmt，rs对象
public final class JdbcUtilsSing {
	//1 定义数据库连接的参数
	private String url = "jdbc:mysql://localhost:3306/test";
	private String user = "root";
	private String password = "347852901";
	private static JdbcUtilsSing instance = null;
	private JdbcUtilsSing(){}
	//2 实现单例模式
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
	//3 静态的加载mysql驱动
	static{
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
			throw new ExceptionInInitializerError(e);
		}
	}
	//4 提供一个公共的调用connection的方法
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, user, password);
	}
	//5 释放conn，stmt，rs对象
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
