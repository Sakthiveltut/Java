import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;//interface
import java.sql.PreparedStatement;//interface
import java.sql.ResultSet;//interface
import java.sql.Statement;//interface

//run cmd - java -cp mysql-connector-j-8.3.0.jar MySQLCRUD.java

public class MySQLCRUD{
	public static void main(String[] args)throws ClassNotFoundException, SQLException{

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
		
		Statement statement = con.createStatement();
		ResultSet resultSet;
		PreparedStatement preparedStatement;
		
		String query = "",name,city;
		int id,age,choice;
		
		while(true){
			System.out.println("MySQL Java CRUD Operation");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Select");
			System.out.println("5. Exit");
			System.out.print("Enter a choice: ");
			
			choice = sc1.nextInt();
			System.out.println("-----------------------------------------");
			
			switch(choice){
				case 1:
					System.out.println("1.Insert new data");
					System.out.println("Enter a name: ");
					name=sc2.nextLine();
					System.out.println("Enter a age: ");
					age=sc1.nextInt();
					System.out.println("Enter a city: ");
					city=sc2.nextLine();
					
					query = "Insert into users (Name,Age,City) values(?,?,?)";
					
					preparedStatement = con.prepareStatement(query);
					preparedStatement.setString(1,name);
					preparedStatement.setInt(2,age);
					preparedStatement.setString(3,city);
					
					preparedStatement.executeUpdate();
					System.out.println("Data inserted successfully.");
					break;
				case 2:
					System.out.println("2.Updating a data");
					
					System.out.println("Enter Id: ");
					id=sc1.nextInt();
					System.out.println("Enter a name: ");
					name=sc2.nextLine();
					System.out.println("Enter a age: ");
					age=sc1.nextInt();
					System.out.println("Enter a city: ");
					city=sc2.nextLine();
					
					query = "update users set Name=?,Age=?,City=? where Id=?";
					
					preparedStatement = con.prepareStatement(query);
					preparedStatement.setString(1,name);
					preparedStatement.setInt(2,age);
					preparedStatement.setString(3,city);
					preparedStatement.setInt(4,id);
					
					preparedStatement.executeUpdate();
					System.out.println("Data updated successfully.");
					break;			

				case 3:
					System.out.println("3.Deleting a data");
					
					System.out.println("Enter Id: ");
					id=sc1.nextInt();
					
					query = "delete from users where Id=?";
					
					preparedStatement = con.prepareStatement(query);
					preparedStatement.setInt(1,id);;
					
					preparedStatement.executeUpdate();
					System.out.println("Data deleted successfully.");
					break;
				case 4:
					System.out.println("4.Print all records");
					query="select Id,Name,Age,City from users";
					resultSet = statement.executeQuery(query);
					while(resultSet.next()){
						id = resultSet.getInt("Id");
						name = resultSet.getString("Name");
						age = resultSet.getInt("Age");
						city = resultSet.getString("City");
						
						System.out.print(id+" ");
						System.out.print(name+" ");
						System.out.print(age+" ");
						System.out.println(city+" ");
					}
					break;
				case 5:
					System.out.println("Thank You");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Selection");
			}
			System.out.println("-----------------------------------------");
		}
	}
}

