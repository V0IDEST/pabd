/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ianlucas;

import java.sql.*;

/**
 *
 * @author 20221074010018
 */
public class IanLucas {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        Connection con = null;
        
        Customer c = new Customer(1, "Dimitri", "Tolstoi", "d.tolstoi@gmail.com", 10, 1);

        CustomerDAO dao = new CustomerDAO();

        dao.insertCustomer(c);
//        dao.updateCustomer();
//        dao.deleteCustomer();
        dao.showCustomer();

    }

}
