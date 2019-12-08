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
public class Buku1841720126Ela {
    private int idbuku;
    private Kategori1841720126Ela kategori = new Kategori1841720126Ela();
    private String judul;
    private String penerbit;
    private String penulis;

    public int getIdbukuEla() {
        return idbuku;
    }

    public void setIdbukuEla(int idbuku) {
        this.idbuku = idbuku;
    }

    public Kategori1841720126Ela getKategoriEla() {
        return kategori;
    }

    public void setKategoriEla(Kategori1841720126Ela kategori) {
        this.kategori = kategori;
    }

    public String getJudulEla() {
        return judul;
    }

    public void setJudulEla(String judul) {
        this.judul = judul;
    }

    public String getPenerbitEla() {
        return penerbit;
    }

    public void setPenerbitEla(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getPenulisEla() {
        return penulis;
    }

    public void setPenulisEla(String penulis) {
        this.penulis = penulis;
    }
    
    public Buku1841720126Ela() {
    
    }
    
    public Buku1841720126Ela(Kategori1841720126Ela kategori, String judul, String penerbit, String penulis) {
        this.kategori = kategori;
        this.judul = judul;
        this.penerbit = penerbit;
        this.penulis = penulis;
    }
    
    public Buku1841720126Ela getById(int id) {
        Buku1841720126Ela buku = new Buku1841720126Ela();
        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.idbuku = '" + id + "'");
        try {
            while(rs.next()) {
                buku = new Buku1841720126Ela();
                buku.setIdbukuEla(rs.getInt("idbuku"));
                buku.getKategoriEla().setIdkategoriEla(rs.getInt("idkategori"));
                buku.getKategoriEla().setNamaEla(rs.getString("nama"));
                buku.getKategoriEla().setKeteranganEla(rs.getString("keterangan"));
                buku.setJudulEla(rs.getString("judul"));
                buku.setPenerbitEla(rs.getString("penerbit"));
                buku.setPenulisEla(rs.getString("penulis"));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return buku;
    }
    
    public ArrayList<Buku1841720126Ela> getAll() {
        ArrayList<Buku1841720126Ela> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori");
        try {
            while(rs.next()) {
                Buku1841720126Ela buku = new Buku1841720126Ela();
                buku.setIdbukuEla(rs.getInt("idbuku"));
                buku.getKategoriEla().setIdkategoriEla(rs.getInt("idkategori"));
                buku.getKategoriEla().setNamaEla(rs.getString("nama"));
                buku.getKategoriEla().setKeteranganEla(rs.getString("keterangan"));
                buku.setJudulEla(rs.getString("judul"));
                buku.setPenerbitEla(rs.getString("penerbit"));
                buku.setPenulisEla(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public ArrayList<Buku1841720126Ela> search(String keyword) {
        ArrayList<Buku1841720126Ela> ListBuku = new ArrayList();
        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT "
                                            + " b.idbuku AS idbuku,"
                                            + " b.judul AS judul,"
                                            + " b.penerbit AS penerbit,"
                                            + " b.penulis AS penulis,"
                                            + " k.idkategori AS idkategori,"
                                            + " k.nama AS nama,"
                                            + " k.keterangan AS keterangan"
                                            + " FROM buku b"
                                            + " LEFT JOIN kategori k ON b.idkategori = k.idkategori"
                                            + " WHERE b.judul LIKE '%" + keyword + "%'"
                                                    + " OR b.penerbit LIKE '%" + keyword + "%'"
                                                    + " OR b.penulis LIKE '%" + keyword + "%'");
        try {
            while(rs.next()) {
                Buku1841720126Ela buku = new Buku1841720126Ela();
                buku.setIdbukuEla(rs.getInt("idbuku"));
                buku.getKategoriEla().setIdkategoriEla(rs.getInt("idkategori"));
                buku.getKategoriEla().setNamaEla(rs.getString("nama"));
                buku.getKategoriEla().setKeteranganEla(rs.getString("keterangan"));
                buku.setJudulEla(rs.getString("judul"));
                buku.setPenerbitEla(rs.getString("penerbit"));
                buku.setPenulisEla(rs.getString("penulis"));
                
                ListBuku.add(buku);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return ListBuku;
    }
    
    public void saveEla() {
        if(getById(idbuku).getIdbukuEla() == 0) {
            String SQL = "INSERT INTO buku (judul, idkategori, penulis, penerbit) VALUES("
                        + "'" + this.judul + "', "
                        + "'" + this.getKategoriEla().getIdkategoriEla() + "', "
                        + "'" + this.penulis + "', "
                        + "'" + this.penerbit + "'"
                        + ")";
            this.idbuku = DBHelper1841720126Ela.insertQueryGetIdEla(SQL);
        }
        else {
            String SQL = "UPDATE buku SET"
                        + " judul = '" + this.judul + "', "
                        + " idkategori = '" + this.getKategoriEla().getIdkategoriEla() + "', "
                        + " penulis = '" + this.penulis + "', "
                        + " penerbit = '" + this.penerbit + "' "
                        + " WHERE idbuku = '" + this.idbuku + "'";
            DBHelper1841720126Ela.executeQueryEla(SQL);
        }
    }
    
    public void deleteEla() {
        String SQL = "DELETE FROM buku WHERE idbuku = '" + this.idbuku + "'";
        DBHelper1841720126Ela.executeQueryEla(SQL);
    }

}
