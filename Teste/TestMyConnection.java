package Teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import interfata.MyConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class TestMyConnection {
	
	public static boolean checkConnection(MyConnection connection) {
        boolean answer = false;
        try {
        	String sql = "SELECT 1 FROM DUAL";     
            ResultSet rs = connection.query(sql);
            if (rs != null) {
                answer = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return answer;
    }
	@Test
	public void testgetConnection(){
		  MyConnection db = MyConnection.getConnection();
	        System.out.println(TestMyConnection.checkConnection(db));
	        assertNotNull("DB connection ", TestMyConnection.checkConnection(db));
	}
	
}

