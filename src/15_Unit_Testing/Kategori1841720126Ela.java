/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

import java.sql.ResultSet;
import java.util.ArrayList;


public class Kategori1841720126Ela {

    private int idkategori;
    private String nama;
    private String keterangan;

    public int getIdkategori() {
        return idkategori;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public Kategori1841720126Ela() {
    }

    public Kategori1841720126Ela(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public Kategori1841720126Ela getById(int id) {
        Kategori1841720126Ela kat = new Kategori1841720126Ela();
        ResultSet rs = DBHelper1841720126Ela.selectQuery("SELECT * FROM kategori "
                + " WHERE idkategori = '" + id + "'");
        try {
            while (rs.next()) {
                kat = new Kategori1841720126Ela();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan("Keterangan");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }
    

    public ArrayList<Kategori1841720126Ela> getByNamaAndKeterangan(String nama, String keterangan) {
        ArrayList<Kategori1841720126Ela> ListKategori = new ArrayList();
        ResultSet rs;
       
        if ((nama.trim().length()>0) && (keterangan.trim().length()>0)){
             rs = DBHelper1841720126Ela.selectQuery("SELECT * FROM kategori Where nama = '"+ nama +"' and keterangan = '"+ keterangan+"'");
        }else if ((nama.trim().length()>0) && (keterangan.trim().length()==0)){
            rs = DBHelper1841720126Ela.selectQuery("SELECT * FROM kategori Where nama = '"+ nama+"'");
        }else {
            rs = DBHelper1841720126Ela.selectQuery("SELECT * FROM kategori Where keterangan = '"+ keterangan+"'");
        }      
        
        try {
            while (rs.next()) {
                Kategori1841720126Ela kat = new Kategori1841720126Ela();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public ArrayList<Kategori1841720126Ela> getAll() {
        ArrayList<Kategori1841720126Ela> ListKategori = new ArrayList();
        ResultSet rs;
        rs = DBHelper1841720126Ela.selectQuery("SELECT * FROM kategori");
        
        try {
            while (rs.next()) {
                Kategori1841720126Ela kat = new Kategori1841720126Ela();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }
    public ArrayList<Kategori1841720126Ela> search(String keyword) {
        ArrayList<Kategori1841720126Ela> ListKategori = new ArrayList();
        String sql = "SELECT * FROM kategori WHERE " + " nama LIKE '%"
                + keyword + "%' " + " OR keterangan LIKE '%" + keyword + "%' ";
        ResultSet rs = DBHelper1841720126Ela.selectQuery(sql);
        try {
            while (rs.next()) {
                Kategori1841720126Ela kat = new Kategori1841720126Ela();
                kat.setIdkategori(rs.getInt("idkategori"));
                kat.setNama(rs.getString("nama"));
                kat.setKeterangan(rs.getString("keterangan"));
                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListKategori;
    }

    public void save() {
        if (getById(idkategori).getIdkategori() == 0) {
            String SQL = "INSERT INTO kategori (nama, keterangan) VALUES (" + " '" + this.nama + "', " + " '" + this.keterangan + "' " + " )";
            this.idkategori = DBHelper1841720126Ela.insertQueryGetId(SQL);
        } else {
            String SQL = "UPDATE kategori SET" + " nama = '" + this.nama + "', " + " keterangan = '" + this.keterangan + "' " + " WHERE idkategori = '" + this.idkategori + "'";
            DBHelper1841720126Ela.executeQuery(SQL);
        }
    }

    public void delete() {
        String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1841720126Ela.executeQuery(SQL);
    }

}
