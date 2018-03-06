/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.com.syscode.dao;

import jdbc.Conexion;
import jdbc.ConsultaBD;

/**
 * FactoryDB
 *
 * @author Ochoa Martinez Sergio Antonio - gnu.java.sergio@gmail.com
 */
public class FactoryDB {

    public static int NONE = 0;
    public static int POSTGRES = 1;
    public static int MYSQL = 2;
    public static int HIBERNATE = 3;
    public static int MYIBATIS = 4;
    public static int HSQLDB = 5;
    private int type = NONE;
    public static FactoryDB factoryDB;
    public ConsultaBD consultaBD;
    public Conexion conexion;

    public FactoryDB(Conexion conexion, int type) {
        this.type = type;
        if (FactoryDB.POSTGRES == this.type) {
            this.conexion = conexion;
            consultaBD = new ConsultaBD(this.conexion);
            factoryDB = this;
        } else if (FactoryDB.MYSQL == type) {
            this.conexion = conexion;
            consultaBD = new ConsultaBD(this.conexion);
            factoryDB = this;
        }
    }
}
