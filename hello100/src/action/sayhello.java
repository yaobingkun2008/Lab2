package action;

import java.sql.*;


public class sayhello {
	private String name;
	private bookinfo[] booklist;
	private String sql1;
	private String number;
	private String bookname;
	private String author_id;
	private String x;
	private String y;
	private String z;
	private String h;
	
	public String chaxun() 
	{
		if(name.length()<1)
		{
			return "emptyname";
		}
		else
		{	
			int authorid = 0;
			Connection conn=null;
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			}
			catch (ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			try
			{
				conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book","root","qweasd");//注意是三个参数
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			
			String sql = "select * from author where name=\""+name+"\"";
			Connection cnn = conn;
			String age ="";
			String authorname = "";
			String country = "";
			try
			{
				Statement stmt = cnn.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()!=false)
				{
					authorid = rs.getInt(1);
					age =String.valueOf(rs.getInt(3));
					authorname = rs.getNString(2);
					country = rs.getNString(4);
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			if(authorid == 0)
			{
				return "emptyname";
			}
			else
			{
				String t = "";
				t = String.valueOf(authorid);
				this.sql1 = "select * from Book where authorid=\""+t+"\"";
				int num = 0;
				try
				{
					Statement stmt1 = cnn.createStatement();
					ResultSet rs2 = stmt1.executeQuery(sql1);
					while(rs2.next()!=false)
					{
						num++;
					}
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				this.booklist = new bookinfo[num];
				int y = -1;
				try
				{
					Statement stmt2 = cnn.createStatement();
					ResultSet rs3 = stmt2.executeQuery(sql1);
					while(rs3.next()!=false)
					{
						y++;
						this.booklist[y] = new bookinfo(rs3.getNString(1),rs3.getNString(2),String.valueOf(rs3.getInt(3)),rs3.getNString(4),String.valueOf(rs3.getInt(5)),String.valueOf(rs3.getInt(6)),authorname,age,country);
					}
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}
				this.number = String.valueOf(num);
				if(num == -1)
				{
					return "emptyname";
				}
				else
				{
					return "chaxunjieguo";
				}
			}
		}
	}
	
	
	
	
	public String deletebook()
	{
		Connection conn=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/book","root","qweasd");//注意是三个参数
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		Connection cnn = conn;
		String sql = "delete from Book where title=\""+bookname+"\"";
		//System.out.println("123"+sql);
		try
		{
			Statement stmt = cnn.createStatement();
			stmt.executeUpdate(sql);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
		/*以下删除作者*/
		int remain_book = 0;
		Connection cnn1 = conn;
		String sql1 = "select * from Book where authorid=\""+author_id+"\"";
		try
		{
			Statement stmt1 = cnn1.createStatement();
			ResultSet rs = stmt1.executeQuery(sql1);
			while(rs.next()!=false)
			{
				remain_book++;
			}
		}
		catch (SQLException e1)
		{
			e1.printStackTrace();
		}
		
		if(remain_book==0)
		{
			Connection cnn2 = conn;
			String sql2 = "delete from author where id=\""+author_id+"\"";
			try
			{
				Statement stmt2 = cnn2.createStatement();
				stmt2.executeUpdate(sql2);
			}
			catch (Exception e2)
			{
				e2.printStackTrace();
			}
		}
		return "successdelete";
	}
	public void setbookname(String bookname)
	{
		this.bookname = bookname;
	}
	public String getbookname()
	{
		return bookname;
	}
	public String goindex()
	{
		return "goback";
	}
	public String gochaxun()
	{
		return "gocha";
	}
	public bookinfo[] getbooklist()
	{
		return booklist;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getnumber()
	{
		return number;
	}
	public void setauthor_id(String author_id)
	{
		this.author_id = author_id;
	}
	public String getauthor_id()
	{
		return author_id;
	}
	public String gozhuye()
	{
		return "zhuye";
	}
}
