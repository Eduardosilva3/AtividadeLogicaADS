package bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlConnection {

    public void BD (int no, String nome, String cpf, int navegacao) {
        Connection conn = null;
        String dbServer = "mysql-82620-0.cloudclusters.net"; // change it to your database server name
        int dbPort = 10488; // change it to your database server port
        String dbName = "DBTESTE";
        String userName = "Eduardo";
        String password = "12345678";
        String url = String.format("jdbc:mysql://%s:%d?user=%s&password=%s", 
                                    dbServer, dbPort, userName, password);
        try {

            // Attention:
            // You need to change the driver name to "com.mysql.jdbc.Driver"
            // if your MySQL connector version is lower than 8.0.
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            // change database
            String sqlusedb = "use " + dbName;
            int result = stmt.executeUpdate(sqlusedb);

            // create table
           // String sql = "SELECT TESTE FROM DBTESTE;";
           // result = stmt.executeUpdate(sql);

            // insert data
            if (navegacao == 1){
            	if (result != -1) {
                   String sql = String.format("insert into TESTE(NOME,CPF) values('%s','%s')",nome, cpf);
                    result = stmt.executeUpdate(sql);
                    System.out.println("Cadastro Realizado com sucesso");
                }
            }
            
            
            if(navegacao == 2) {
            	// query data
                String sql = "select * from TESTE where `ID` ="+no;
                ResultSet rs = stmt.executeQuery(sql);
                System.out.println("ID \t Name \t CPF");
                while (rs.next()) {
                    System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
                }
            }
            
        } catch (SQLException e) {
            System.out.println("MySQL connection had an exception");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
