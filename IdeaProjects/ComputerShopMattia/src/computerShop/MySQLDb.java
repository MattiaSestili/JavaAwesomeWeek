package computerShop;

import java.sql.*;

/**
 * Created by student on 01-Jul-16.
 */
public class MySQLDb {

    Connection conn;
    Statement statement;
    ResultSet rs = null;

    MySQLDb(Connection connection)
    {
        this.conn = connection;
    }

    private void createTables(Statement statement) throws SQLException
    {
        statement.executeUpdate("CREATE TABLE Customer ("
                + "Id INTEGER NOT NULL AUTO_INCREMENT,"
                + "firstName VARCHAR(40) NOT NULL,"
                + "secondName VARCHAR(100) NOT NULL,"
                + "address VARCHAR(50) NOT NULL,"
                + "phoneNumber VARCHAR(20) NOT NULL,"
                + "PRIMARY KEY (Id))");
    }

    private void createCustomer() throws SQLException
    {
//        for (Blackberry b : bb)
//        {
//            PreparedStatement statement = conn.prepareStatement( "INSERT INTO " +
//                    "Blackberry (model,description, price, category)" +
//                    "VALUE (?,?,?,?)" );
//
//            statement.setString(1, b.getModel());
//            statement.setString(2, b.getDescription());
//            statement.setDouble(3, b.getPrice());
//            statement.setString(4, b.getCategory());
//
//            statement.executeUpdate();
//        }
    }

    public void createDataBaseTables() throws SQLException
    {
        Statement statement = conn.createStatement();
        createTables(statement);
        statement.close();
        createBlackberry();
    }
}
