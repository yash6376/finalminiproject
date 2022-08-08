
package yash;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class Reservation {
	public void usersignup(String username,String phone_no,String email,String password)throws SQLException{
		Connection con=Caller1.getconn();
		String a1="insert into userlogin(username,phone_no,email,password) values(?,?,?,?);";
		PreparedStatement z1=con.prepareStatement(a1);
		 z1.setString(1,username);
		 z1.setString(2,phone_no);
		 z1.setString(3,email);
		 z1.setString(4,password);
		int r1=z1.executeUpdate();
			System.out.println("U HAVE SUCCESSFULLLY SIGNUP ");
			
			
		}
	String un="",ps="";
	public void userlogin(String username,String password) throws SQLException {
		
		Connection con=Caller1.getconn();
		String se="select username,password from userlogin where username='"+username+"' and password='"+password+"';";
		java.sql.Statement pc=con.createStatement();
		ResultSet rs=pc.executeQuery(se);
		String un="",ps="";
		
		while(rs.next()) {
			this.un=rs.getString(1);
			this.ps=rs.getString(2);
		}
		}
	public void bus_Reservation() {
		try {
		System.out.println("*****Please enter user details*****");
		Connection con=Caller1.getconn();
		String s1 = "insert into bus_reservation(name,phone_no,email,starting_point,designation) values(?,?,?,?,?)";
		PreparedStatement ps= con.prepareStatement(s1);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name");
		String name=sc.next();
		System.out.println("Enter ur phone_no");
		String phone_no=sc.next();
		System.out.println("Enter ur email");
		String email=sc.next();
		System.out.println("Enter ur starting_point");
		String starting_point=sc.next();
		System.out.println("Enter ur designation");
		String designation=sc.next();
		
		   ps.setString(1,name);
	       ps.setString(2,phone_no);
	       ps.setString(3,email);
	       ps.setString(4,starting_point);
	       ps.setString(5,designation);
	       int a = ps.executeUpdate();
	       System.out.println("***Slot booked***");
		}catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
		public void train_Reservation() {
			try {
			System.out.println("*****Please enter user details*****");
			Connection con=Caller1.getconn();
			String s2 = "insert into train_reservation(name,phone_no,email,starting_point,designation) values(?,?,?,?,?)";
			PreparedStatement ps2= con.prepareStatement(s2);
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ur name");
			String name=sc.next();
			System.out.println("Enter ur phone_no");
			String phone_no=sc.next();
			System.out.println("Enter ur email");
			String email=sc.next();
			System.out.println("Enter ur starting_point");
			String starting_point=sc.next();
			System.out.println("Enter ur designation");
			String designation=sc.next();
			
			 ps2.setString(1,name);
		       ps2.setString(2,phone_no);
		       ps2.setString(3,email);
		       ps2.setString(4,starting_point);
		       ps2.setString(5,designation);
		       int a = ps2.executeUpdate();
		       System.out.println("***Slot booked***");
			}catch(Exception e) {
				System.out.println(e);
			}
				
			}
			public void flight_Reservation() {
				try {
				System.out.println("*****Please enter user details*****");
				Connection con=Caller1.getconn();
				String s3 = "insert into flight_reservation(name,phone_no,email,starting_point,designation) values(?,?,?,?,?)";
				PreparedStatement ps1= con.prepareStatement(s3);
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter ur name");
				String name=sc.next();
				System.out.println("Enter ur phone_no");
				String phone_no=sc.next();
				System.out.println("Enter ur email");
				String email=sc.next();
				System.out.println("Enter ur starting_point");
				String starting_point=sc.next();
				System.out.println("Enter ur designation");
				String designation=sc.next();
				
				 ps1.setString(1,name);
			       ps1.setString(2,phone_no);
			       ps1.setString(3,email);
			       ps1.setString(4,starting_point);
			       ps1.setString(5,designation);
			       int i=ps1.executeUpdate();
			       
			       System.out.println("***Slot booked***");
				}catch(Exception e) {
					System.out.println(e);
					
				}
	}
			
		
}
