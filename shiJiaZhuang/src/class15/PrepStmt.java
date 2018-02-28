package class15;//pm.4

//PreparedStatement可重复使用，提高效率；另外还可防止注入攻击，例如用户登录的时候查询SQL拼装语句为：
//String sql = "select * from tb_user where name = '" + username + "' and passwd = '" + password + "'";
//假如程序中没有进行必要的输入合法性检测，别有用心的人在用户名栏输入：abc' or '1'='1，在密码栏输入：123，
//则拼装后的SQL语句为：select * from tb_user where name = 'abc' or '1'='1' and passwd = '123'，则此语句永远都能正确执行，从而实现注入方式攻击。
//如果使用PreparedStatement，则会将输入的内容全部解析为字符串，而不会出现此漏洞。String sql = "select * from tb_user where name = ? and passwd = ?"

import java.sql.*;

public class PrepStmt {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst =null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/test";
			con = DriverManager.getConnection(url,"root","347852901");
//			String sql = "insert into mytable2 values(?,?,?)";
			pst = con.prepareStatement("insert into mytable2 values(?,?,?)");
			for(int i = 101;i<200;i++){
				pst.setInt(1,i);
				pst.setString(2,"Tom" + i);
				pst.setDouble(3,(100+i)*10);
				pst.executeUpdate();
			}
			System.out.println("id:\tname:\tsalary:");
			pst = con.prepareStatement("select * from mytable2 where tid=?");
			pst.setInt(1,157);
			ResultSet rs = pst.executeQuery();
			if(rs.next()){
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2).trim() + "\t" + rs.getDouble(3));
			}
			int[] ids= {160,171,182};
			for(int i:ids){
				pst.setInt(1,i);
				rs = pst.executeQuery();
				if(rs.next()){
					System.out.println(rs.getInt(1) + "\t" + rs.getString(2).trim() + "\t" + rs.getDouble(3));
				}
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				if(pst!=null){
					pst.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			try{
				if(con!=null){
					con.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
	}

}
