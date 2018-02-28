package class16;//2016.07.26 am.3

import java.sql.*;

public class SingExample {
	Connection con;
	PreparedStatement ps;
	
	public void doSing(String sql){
		JdbcUtilsSing jdbcUtilsSing = JdbcUtilsSing.getIntstance();
		try{
			con = jdbcUtilsSing.getConnection();
			ps=con.prepareStatement(sql);
			ps.execute();
			ps.close();
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args){
		SingExample singExample = new SingExample();
		singExample.doSing("insert into user_java (id,name,salary) values (100,'jerry',1002)");
	}

}
