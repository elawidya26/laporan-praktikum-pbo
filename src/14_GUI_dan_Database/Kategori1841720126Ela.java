/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend1841720126Ela;
import java.util.ArrayList;
import java.sql.*;
/**
 *
 * @author Ela Widya
 */
public class Kategori1841720126Ela {
    private int idKategori;
    private String nama;
    private String keterangan;

    public int getIdKategoriEla() {
        return idKategori;
    }

    public void setIdKategoriEla(int idKategori) {
        this.idKategori = idKategori;
    }

    public String getNamaEla() {
        return nama;
    }

    public void setNamaEla(String nama) {
        this.nama = nama;
    }

    public String getKeteranganEla() {
        return keterangan;
    }

    public void setKeteranganEla(String keterangan) {
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
        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT * FROM kategori " + " WHERE idkategori = '" + id + "'");

        try {
            while (rs.next()) {
                kat = new Kategori1841720126Ela();
                kat.setIdKategoriEla(rs.getInt("idKategori"));
                kat.setNamaEla(rs.getString("nama"));
                kat.setKeteranganEla(rs.getString("keterangan"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kat;
    }

    public ArrayList<Kategori1841720126Ela> getAll() {
        ArrayList<Kategori1841720126Ela> ListKategori = new ArrayList();

        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT * FROM kategori");

        try {
            while (rs.next()) {
                Kategori1841720126Ela kat = new Kategori1841720126Ela();
                kat.setIdKategoriEla(rs.getInt("idkategori"));
                kat.setNamaEla(rs.getString("nama"));
                kat.setKeteranganEla(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }

    public ArrayList<Kategori1841720126Ela> search(String keyword) {
        ArrayList<Kategori1841720126Ela> ListKategori = new ArrayList();

        String sql = "Select * from kategori where " + " nama like '%" + keyword + "%' " + " or keterangan like '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720126Ela.selectQueryEla(sql);

        try {
            while (rs.next()) {
                Kategori1841720126Ela kat = new Kategori1841720126Ela();
                kat.setIdKategoriEla(rs.getInt("idkategori"));
                kat.setNamaEla(rs.getString("nama"));
                kat.setKeteranganEla(rs.getString("keterangan"));

                ListKategori.add(kat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ListKategori;
    }
    
    public void saveEla(){
        if(getById(idKategori).getIdKategoriEla() == 0){
            String SQL = "Insert into kategori (nama,keterangan) values(" 
                    + " '" +this.nama + "', "
                    + " '"+this.keterangan+"' "
                    + " )";
                    this.idKategori = DBHelper1841720126Ela.insertQueryGetIdEla(SQL);
        }else{
            String SQL = "Update kategori set"
                   + " nama = '" +this.nama +"', "
                   + " keterangan = '"+this.keterangan+"' "
                   +"Where idKategori = '"+this.idKategori+"'";
            DBHelper1841720126Ela.executeQueryEla(SQL);
        }
    }
    
    public void deleteEla(){
        String SQL = "DELETE FROM kategori WHERE idKategori = '"+this.idKategori+"'";
        DBHelper1841720126Ela.executeQueryEla(SQL);
    }
    
    @Override
    public String toString() {
        return nama;
    }

    void setIdkategoriEla(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getIdkategoriEla() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
