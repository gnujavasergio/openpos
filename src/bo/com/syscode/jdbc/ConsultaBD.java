package jdbc;

import java.sql.*;

/**
 * ConsultaBD
 *
 * @author Sergio Antonio Ochoa Martinez - gnu.java.sergio@gmail.com
 */
public class ConsultaBD {

    private Statement statementNavegable;
    private Statement statementUpdate;
    private Statement statementFunction;
    private Conexion conexion;
    private PreparedStatement ps;

    /**
     * ConsultaBD
     */
    public ConsultaBD(Conexion conexion) {
        this.conexion = conexion;
        try {
            statementNavegable = conexion.getConn().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            statementUpdate = conexion.getConn().createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            statementFunction = conexion.getConn().createStatement();
        } catch (SQLException e) {
            System.err.println("Error SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Excepcion SQL: " + e.getMessage());
        }
    }

    /**
     * executeQuery
     *
     * @param sql
     * @return Returns one ResultSet object.
     */
    public ResultSet executeQuery(String sql) {
        try {
            return statementNavegable.executeQuery(sql);
        } catch (SQLException e) {
            System.err.println("Error SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Excepcion SQL: " + e.getMessage());
            return null;
        }
    }

    /**
     * Method insert, delete, update
     *
     * @param sql
     * @return
     */
    public int update(String sql) {
        try {
            return statementUpdate.executeUpdate(sql);
        } catch (SQLException e) {
            System.err.println("Error SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Excepcion SQL: " + e.getMessage());
            return 0;
        }
    }

    /**
     * execute - Method execute function
     *
     * @param sql
     * @return Boolean
     */
    public boolean execute(String sql) {
        try {
            return statementFunction.execute(sql);
        } catch (SQLException e) {
            System.err.println("Error SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Excepcion SQL: " + e.getMessage());
            return false;
        }
    }    

    /**
     * closeStatemnt
     */
    public void closeStatemnt() {
        try {
            statementNavegable.close();
            statementUpdate.close();
        } catch (SQLException e) {
            System.err.println("Error SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Excepcion SQL: " + e.getMessage());
        }
    }
}
