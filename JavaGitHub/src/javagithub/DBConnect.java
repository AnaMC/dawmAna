/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagithub;

import java.sql.*;


public class DBConnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{  /*Conexion a la base de datos*/
           String host;
           host = "jdbc:mysql://www.db4free.net:3306/izv_dawm";
           String uName = "izv_dawm";
           String uPass= "123456";
       
           Connection con = DriverManager.getConnection( host, uName, uPass );
        
           /*Creacion de tablas*/
           
           String sqlComercio = "CREATE TABLE AMComercio" 
                                + " (id_comercio INTERGER NOT NULL, "
                                + " nombre VARCHAR (50) NOT NULL, "
                                + " Direccion VARCHAR (50) NOT NULL,"
                                + " Tipo VARCHAR (50)"
                                + " PRIMARY KEY (id_comercio))";
            
           String sqlHorario = "CREATE TABLE AMCHorario"
                                + "(id_Horario INTERGER NOT NULL,"
                                + " Dia VARCHAR (10) TIME,"
                                + " HoraInicio TIME, "
                                + " HoraFin TIME, "
                                + " PRIMARY KEY (id_Horario),"
                                + " FOREING KEY (id_comercio))";
           
           
        /*Inserciones de datos en las tablas*/
           String Tabla1Comercio = "INSERT INTO AMComercio VALUES(1,'Zapateria Minelli, 'Calle Gran Via', 'Zapateria')";
           String Tabla2Comercio = "INSERT INTO AMComercio VALUES(2,'Zapateri Rayer, 'Plaza de la pescaderia', 'Zapateria')";
           String Tabla3Comercio = "INSERT INTO AMComercio VALUES(3,'Estudio Saint_Patrik, 'Irlanda', 'Arquitectura')";
           String Tabla4Comercio = "INSERT INTO AMComercio VALUES(4,'Clinica El viejo loco', 'Calle Manicomio', 'Salud')";
           
           /*Horario de Minelli*/
           String Tabla1HorarioMinelli = "INSERT INTO AMCHorario VALUES(1,'Lunes','09:30:00','20:30:00',1)";
           String Tabla2HorarioMinelli = "INSERT INTO AMCHorario VALUES(2,'Martes','10:30:00','20:00:00',1)";
           String Tabla3HorarioMinelli = "INSERT INTO AMCHorario VALUES(3,'Miercoles','09:40:00','20:15:00',1)";
           String Tabla4HorarioMinelli = "INSERT INTO AMCHorario VALUES(4,'Jueves','09:30:00','20:30:00',1)";
           String Tabla5HorarioMinelli = "INSERT INTO AMCHorario VALUES(5,'Viernes','09:30:00','20:30:00',1)";
           String Tabla6HorarioMinelli = "INSERT INTO AMCHorario VALUES(6,'Sabado','09:30:00','14:00:00',1)";
           String Tabla7HorarioMinelli=  "INSERT INTO AMCHorario VALUES(7,'Domingo',null,null,1)";
          
           /*Horario de Rayer*/
           String Tabla1HorarioRayer = "INSERT INTO AMCHorario VALUES(8,'Lunes','09:30:00','20:30:00',2)";
           String Tabla2HorarioRayer = "INSERT INTO AMCHorario VALUES(9,'Martes','10:30:00','20:00:00',2)";
           String Tabla3HorarioRayer = "INSERT INTO AMCHorario VALUES(10,'Miercoles','09:40:00','20:15:00',2)";
           String Tabla4HorarioRayer = "INSERT INTO AMCHorario VALUES(11,'Jueves','09:30:00','20:30:00',2)";
           String Tabla5HorarioRayer = "INSERT INTO AMCHorario VALUES(12,'Viernes','09:30:00','20:30:00',2)";
           String Tabla6HorarioRayer = "INSERT INTO AMCHorario VALUES(13,'Sabado','09:30:00','14:00:00',2)";
           String Tabla7HorarioRayer=  "INSERT INTO AMCHorario VALUES(14,'Domingo',null,null,2)";
           
           /*Horario de Saint Patrik*/
           String Tabla1HorarioSaintPatrik = "INSERT INTO AMCHorario VALUES(15,'Lunes','09:30:00','20:30:00',3)";
           String Tabla2HorarioSaintPatrik = "INSERT INTO AMCHorario VALUES(16,'Martes','10:30:00','20:00:00',3)";
           String Tabla3HorarioSaintPatrik = "INSERT INTO AMCHorario VALUES(17,'Miercoles','09:40:00','20:15:00',3)";
           String Tabla4HorarioSaintPatrik = "INSERT INTO AMCHorario VALUES(18,'Jueves','09:30:00','20:30:00',3)";
           String Tabla5HorarioSaintPatrik = "INSERT INTO AMCHorario VALUES(19,'Viernes','09:30:00','20:30:00',3)";
           String Tabla6HorarioSaintPatrik = "INSERT INTO AMCHorario VALUES(20,'Sabado','09:30:00','14:00:00',3)";
           String Tabla7HorarioSaintPatrik = "INSERT INTO AMCHorario VALUES(21,'Domingo',null,null,3)";
           
            /*Horario de Saint Clinica el viejo Loco*/
           String Tabla1HorarioViejoLoco = "INSERT INTO AMCHorario VALUES(22,'Lunes','09:30:00','20:30:00',4)";
           String Tabla2HorarioViejoLoco = "INSERT INTO AMCHorario VALUES(23,'Martes','10:30:00','24:00:00',4)";
           String Tabla3HorarioViejoLoco= "INSERT INTO AMCHorario VALUES(24,'Miercoles','09:40:00','20:15:00',4)";
           String Tabla4HorarioViejoLoco = "INSERT INTO AMCHorario VALUES(25,'Jueves','09:30:00','20:30:00',4)";
           String Tabla5HorarioViejoLoco = "INSERT INTO AMCHorario VALUES(26,'Viernes','09:30:00','20:30:00',4)";
           String Tabla6HorarioViejoLoco = "INSERT INTO AMCHorario VALUES(27,'Sabado','09:30:00','16:00:00',4)";
           String Tabla7HorarioViejoLoco = "INSERT INTO AMCHorario VALUES(28,'Domingo',10:00:00,24:00:00,4)";
            
                  
        }
        catch ( SQLException err ) {
            System.out.println( err.getMessage( ) );
        }
        
        
    }
    
}
