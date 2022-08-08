package yash;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class Caller1 {
		public static Connection getconn() {
			Connection con=null;
			try {
				String url= "jdbc:mysql://localhost:3306/prodapt1";
				String username="root";
				String pass="root";
				con = DriverManager.getConnection(url,username,pass);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			return con;
				
			}
		public static void main(String[]args) {
			try {
				Scanner ss=new Scanner(System.in);
				System.out.println("*****WELCOME TO TICKET RESERVATION*****" );
				System.out.println("1 : PLEASE SIGNUP UR DETAILS");
				System.out.println("2 : PLEASE LOGIN UR DETAILS");
				Reservation r=new Reservation();

				int b=ss.nextInt();
				switch(b) {
				case 1:
					System.out.println("Enter username");
					 String username=ss.next();
					 System.out.println("Enter phone_no");
					 String phone_no=ss.next();
					 System.out.println("Enter email");
					 String email=ss.next();
					 System.out.println("Enter password");
					 String password=ss.next();
					r.usersignup(username, phone_no, email, password);
					System.out.println("**************YOU HAVE  SUCCESSFULLY SIGNUP CONTINUE TO LOGIN**************");
				    //System.out.println("Enter ur chioce");
					//System.out.println("1 : Bus Reservation");
					//System.out.println("2 : train Reservation");
					//System.out.println("3 : flight Reservation");
					
					
				case 2:
					System.out.println("PLEASE LOGIN YOUR ACCOUNT TO BOOK YOUR RESERVATION------>");
					System.out.println("Enter username");
					String un=ss.next();
					System.out.println("Enter password");
					String ps=ss.next();
					r.userlogin(un,ps);
				if(un.equals(r.un) && ps.equals(r.ps)) {
					System.out.println("YOU HAVE LOGIN SUCCESSFULLY CONTINUE UR BOOKING");
					System.out.println("Enter ur chioce:");
					System.out.println("1 : Bus Reservation");
					System.out.println("1 :AC  Bus ");
					System.out.println("2 :NON-AC Bus ");
					System.out.println("2 : train Reservation");
					System.out.println("3 : flight Reservation");
				}else {
					System.out.println("Invalid username or password");
				}
				}
					int i=ss.nextInt();
					
					switch(i) {
					case 1:
						
					r.bus_Reservation();
					break;
					
					case 2:
						
					r.train_Reservation();
					break;
					
					case 3:
					r.flight_Reservation();
					break;
					
					default :
						System.out.println("***WRONG CHIOCE***");
					}
				
			}catch(Exception e){
				e.printStackTrace();;
			}
			
		}
			
		}

