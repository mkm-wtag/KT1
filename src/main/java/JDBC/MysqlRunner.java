package JDBC;

import org.springframework.dao.DataAccessException;

import java.sql.*;

public class MysqlRunner {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myJDBC", "root", "Milton@1994!");
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            preparedStatement = connection.prepareStatement("insert into people values('12','John','Doe','23')");
            connection.setAutoCommit(false);
            preparedStatement.executeUpdate();
            connection.commit();
            preparedStatement.close();
            connection.close();
        } catch ( SQLException e) {
            System.out.println("Error! Rolling back");
            connection.rollback();
        }
        catch (ClassNotFoundException e){
            System.out.println("Class not found");
        }
        catch (DataAccessException e){
            System.out.println("kjjkhkhghggh");
        }
    }
}
