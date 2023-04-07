/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IO;

import java.sql.Connection;
import DBConnect.DBConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class IO {

    public static int check(String id, int count) {
        try {
            Connection conn = DBConnection.getConnection();
            String s = "Select count from sanpham where id =?";
            PreparedStatement pre = conn.prepareStatement(s);
            pre.setString(0, id);
//            pre.setString(1, id);
            ResultSet rs = pre.executeQuery();
            if (rs.next()) {
                int a = Integer.parseInt(rs.getString("id"));
                int i = Integer.parseInt(rs.getString("count"));
                return i;
            }

        } catch (Exception e) {
            System.out.println("Lỗi truy vấn");
        };
        return 0;
    }
}
