package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Conexion
 *
 * @author Sergio Antonio Ochoa Martinez - gnu.java.sergio@gmail.com
 */
public class Conexion {

    public static final int DEFAULT = 0;
    public static final int MYSQL = 1;
    public static final int POSTGRES = 2;
    public static final int SQLSERVER = 3;
    public static final int HSQLDB = 4;

    private Connection conn;
    private String user;
    private String password;
    private String dataBase;
    private String host;
    private int type;
    private String URL = "";

    public Conexion() {
    }

    /**
     * connection
     */
    public void selecction() throws ClassNotFoundException {
        switch (type) {
            case MYSQL:
                URL = "jdbc:mysql://" + host + ":3306/" + dataBase;
                Class.forName("com.mysql.jdbc.Driver");
                break;
            case POSTGRES:
                URL = "jdbc:postgresql://" + host + ":5432/" + dataBase;
                Class.forName("org.postgresql.Driver");
                break;
            case SQLSERVER:
                URL = "jdbc:sqlserver://" + host + ":1433;databaseName=" + dataBase;
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                break;
            case HSQLDB:
                URL = "jdbc:hsqldb:file:data/" + dataBase;
                Class.forName("org.hsqldb.jdbcDriver");
                break;
            default:
                URL = "jdbc:odbc:" + dataBase;
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                break;
        }
    }

    public boolean connection() {
        try {
            selecction();
        } catch (ClassNotFoundException ex) {
            System.err.println("No puedo encontrar el driver para la base de datos.");
            System.err.println(ex.getMessage());
        }
        try {
            conn = DriverManager.getConnection(URL, user, password);
        } catch (SQLException e) {
            System.out.println("No se encontraron parametros para la conexion a la BD");
            System.err.println("Error SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Excepcion SQL: " + e.getMessage());
            return false;
        }
        return true;
    }

    /**
     * close
     */
    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error SQLState: " + e.getSQLState());
            System.err.println("Error Code: " + e.getErrorCode());
            System.err.println("Excepcion SQL: " + e.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDataBase() {
        return dataBase;
    }

    public void setDataBase(String dataBase) {
        this.dataBase = dataBase;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

}//Fin de la Clase
