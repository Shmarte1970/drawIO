
package com.mitocode.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DAO {
    
    private Connection cn;
    
    public Connection getCn() {
        return cn;
    }
    
    public void setCn(Connection cn){
        this.cn=cn;
    }

    public void Conectar() throws Exception{
        
            try{
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mitocode?user=root");
            
            }catch(Exception e){
                throw e;
            }
                
    }
    
    public void Cerrar() throws Exception{
        try{
            if (cn !=null) {
                if (cn.isClosed() == false){
                    cn.close();
                }
            }            
        }catch (Exception e){
            throw e;
        }
    }
    
}
