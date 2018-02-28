package class15;//pm.4

//PreparedStatement���ظ�ʹ�ã����Ч�ʣ����⻹�ɷ�ֹע�빥���������û���¼��ʱ���ѯSQLƴװ���Ϊ��
//String sql = "select * from tb_user where name = '" + username + "' and passwd = '" + password + "'";
//���������û�н��б�Ҫ������Ϸ��Լ�⣬�������ĵ������û��������룺abc' or '1'='1�������������룺123��
//��ƴװ���SQL���Ϊ��select * from tb_user where name = 'abc' or '1'='1' and passwd = '123'����������Զ������ȷִ�У��Ӷ�ʵ��ע�뷽ʽ������
//���ʹ��PreparedStatement����Ὣ���������ȫ������Ϊ�ַ�������������ִ�©����String sql = "select * from tb_user where name = ? and passwd = ?"

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
