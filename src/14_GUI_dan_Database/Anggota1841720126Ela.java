/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720126Ela;

import java.util.ArrayList;
import java.sql.*;
import backend1841720126Ela.*;
/**
 *
 * @author Ela Widya
 */
public class Anggota1841720126Ela {
    private int idAnggota;
    private String nama;
    private String alamat;
    private String telepon;

    public int getIdAnggotaEla() {
        return idAnggota;
    }

    public void setIdAnggotaEla(int idAnggota) {
        this.idAnggota = idAnggota;
    }

    public String getNamaEla() {
        return nama;
    }

    public void setNamaEla(String nama) {
        this.nama = nama;
    }

    public String getAlamatEla() {
        return alamat;
    }

    public void setAlamatEla(String alamat) {
        this.alamat = alamat;
    }

    public String getTeleponEla() {
        return telepon;
    }

    public void setTeleponEla(String telepon) {
        this.telepon = telepon;
    }

    public Anggota1841720126Ela() {
    }

    public Anggota1841720126Ela(String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }
    
    public Anggota1841720126Ela getByIdEla(int id) {
        Anggota1841720126Ela agt = new Anggota1841720126Ela();
        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT * FROM anggota " + " WHERE idAnggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720126Ela();
                agt.setIdAnggotaEla(rs.getInt("idAnggota"));
                agt.setNamaEla(rs.getString("nama"));
                agt.setAlamatEla(rs.getString("alamat"));
                agt.setTeleponEla(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720126Ela> getAllEla() {
        ArrayList<Anggota1841720126Ela> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720126Ela agt = new Anggota1841720126Ela();
                agt.setIdAnggotaEla(rs.getInt("idAnggota"));
                agt.setNamaEla(rs.getString("nama"));
                agt.setAlamatEla(rs.getString("alamat"));
                agt.setTeleponEla(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }

    public ArrayList<Anggota1841720126Ela> searchEla(String keyword) {
        ArrayList<Anggota1841720126Ela> ListAnggota = new ArrayList();

        String sql = "Select * from anggota where " + " nama like '%" + keyword + "%' " + " or alamat like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720126Ela.selectQueryEla(sql);

        try {
            while (rs.next()) {
                Anggota1841720126Ela agt = new Anggota1841720126Ela();
                agt.setIdAnggotaEla(rs.getInt("idAnggota"));
                agt.setNamaEla(rs.getString("nama"));
                agt.setAlamatEla(rs.getString("alamat"));
                agt.setTeleponEla(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListAnggota;
    }
    
    public void saveEla(){
        if(getByIdEla(idAnggota).getIdAnggotaEla() == 0){
            String SQL = "Insert into anggota (nama,alamat,telepon) values(" 
                    + " '" +this.nama + "', "
                    + " '" +this.alamat + "', "
                    + " '"+this.telepon+"' "
                    + " )";
                    this.idAnggota = DBHelper1841720126Ela.insertQueryGetIdEla(SQL);
        }else{
            String SQL = "Update anggota set"
                   + " nama = '" +this.nama +"', "
                   + " alamat = '" +this.alamat +"', "
                   + " telepon = '"+this.telepon+"' "
                   +"Where idAnggota = '"+this.idAnggota+"'";
            DBHelper1841720126Ela.executeQueryEla(SQL);
        }
    }
    
    public void deleteEla(){
        String SQL = "DELETE FROM anggota WHERE idAnggota = '"+this.idAnggota+"'";
        DBHelper1841720126Ela.executeQueryEla(SQL);
    }
    
}
