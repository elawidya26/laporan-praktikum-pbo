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
public class Peminjaman1841720126Ela {
    private int idpeminjaman;
    private Anggota1841720126Ela anggota = new Anggota1841720126Ela();
    private Buku1841720126Ela buku = new Buku1841720126Ela();
    private String tanggalpinjam;
    private String tanggalkembali;

    public Peminjaman1841720126Ela() {
    }

    public Peminjaman1841720126Ela(Anggota1841720126Ela anggota, Buku1841720126Ela buku, String tanggalpinjam, String tanggalkembali) {        
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalpinjam = tanggalpinjam;
        this.tanggalkembali = tanggalkembali;
    }    

    public int getIdpeminjamanEla() {
        return idpeminjaman;
    }

    public void setIdpeminjamanEla(int idpeminjaman) {
        this.idpeminjaman = idpeminjaman;
    }

    public Anggota1841720126Ela getAnggotaEla() {
        return anggota;
    }

    public void setAnggotaEla(Anggota1841720126Ela anggota) {
        this.anggota = anggota;
    }

    public Buku1841720126Ela getBukuEla() {
        return buku;
    }

    public void setBukuEla(Buku1841720126Ela buku) {
        this.buku = buku;
    }

    public String getTanggalpinjamEla() {
        return tanggalpinjam;
    }

    public void setTanggalpinjamEla(String tanggalpinjam) {
        this.tanggalpinjam = tanggalpinjam;
    }

    public String getTanggalkembaliEla() {
        return tanggalkembali;
    }

    public void setTanggalkembaliEla(String tanggalkembali) {
        this.tanggalkembali = tanggalkembali;
    }

    
    
    public Peminjaman1841720126Ela getByIdEla(int id){
        Peminjaman1841720126Ela peminjaman = new Peminjaman1841720126Ela();
        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.idpeminjaman = '"+ id + "'");
        try {
            while(rs.next()){
                peminjaman = new Peminjaman1841720126Ela();
                peminjaman.setIdpeminjamanEla(rs.getInt("idbuku"));
                peminjaman.getAnggotaEla().setIdAnggotaEla(rs.getInt("idanggota"));
                peminjaman.getAnggotaEla().setNamaEla(rs.getString("nama_anggota"));
                peminjaman.getAnggotaEla().setAlamatEla(rs.getString("alamat"));
                peminjaman.getAnggotaEla().setTeleponEla(rs.getString("telepon"));
                peminjaman.getBukuEla().setIdbukuEla(rs.getInt("idbuku"));
                peminjaman.getBukuEla().getKategoriEla().setIdkategoriEla(rs.getInt("idkategori"));
                peminjaman.getBukuEla().getKategoriEla().setNamaEla(rs.getString("nama_kategori"));
                peminjaman.getBukuEla().getKategoriEla().setKeteranganEla(rs.getString("keterangan"));
                peminjaman.getBukuEla().setJudulEla(rs.getString("judul"));
                peminjaman.getBukuEla().setPenerbitEla(rs.getString("penerbit"));
                peminjaman.getBukuEla().setPenulisEla(rs.getString("penulis"));
                peminjaman.setTanggalpinjamEla(rs.getDate("tanggalpinjam").toString());
                peminjaman.setTanggalkembaliEla(rs.getDate("tanggalkembali").toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return peminjaman;
    }
    
    public ArrayList<Peminjaman1841720126Ela> getAllEla(){
        ArrayList<Peminjaman1841720126Ela> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota ");
        
        try {
            while(rs.next()){
                Peminjaman1841720126Ela peminjaman = new Peminjaman1841720126Ela();
                peminjaman.setIdpeminjamanEla(rs.getInt("idpeminjaman"));
                peminjaman.getAnggotaEla().setIdAnggotaEla(rs.getInt("idanggota"));
                peminjaman.getAnggotaEla().setNamaEla(rs.getString("nama_anggota"));
                peminjaman.getAnggotaEla().setAlamatEla(rs.getString("alamat"));
                peminjaman.getAnggotaEla().setTeleponEla(rs.getString("telepon"));
                peminjaman.getBukuEla().setIdbukuEla(rs.getInt("idbuku"));
                peminjaman.getBukuEla().getKategoriEla().setIdkategoriEla(rs.getInt("idkategori"));
                peminjaman.getBukuEla().getKategoriEla().setNamaEla(rs.getString("nama_kategori"));
                peminjaman.getBukuEla().getKategoriEla().setKeteranganEla(rs.getString("keterangan"));
                peminjaman.getBukuEla().setJudulEla(rs.getString("judul"));
                peminjaman.getBukuEla().setPenerbitEla(rs.getString("penerbit"));
                peminjaman.getBukuEla().setPenulisEla(rs.getString("penulis"));
                peminjaman.setTanggalpinjamEla(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliEla(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public ArrayList<Peminjaman1841720126Ela> search(String keyword){
        ArrayList<Peminjaman1841720126Ela> ListPeminjaman = new ArrayList();
        ResultSet rs = DBHelper1841720126Ela.selectQueryEla("SELECT "
                                        +"      p.idpeminjaman AS idpeminjaman, "
                                        +"      p.tanggalpinjam AS tanggalpinjam, "
                                        +"      p.tanggalkembali AS tanggalkembali, "
                                        +"      b.idbuku AS idbuku, "
                                        +"      b.judul AS judul, "
                                        +"      b.penerbit AS penerbit, "
                                        +"      b.penulis AS penulis, "
                                        +"      k.idkategori AS idkategori, "
                                        +"      k.nama AS nama_kategori, "
                                        +"      k.keterangan AS keterangan, "
                                        +"      a.idanggota AS idanggota, "
                                        +"      a.nama AS nama_anggota, "
                                        +"      a.alamat AS alamat, "
                                        +"      a.telepon AS telepon"
                                        +"      FROM peminjaman p"
                                        +"      LEFT JOIN buku b ON p.idbuku = b.idbuku "
                                        +"      LEFT JOIN kategori k ON b.idkategori = k.idkategori "
                                        +"      LEFT JOIN anggota a ON p.idanggota = a.idanggota "
                                        +"      WHERE p.tanggalpinjam LIKE '%" + keyword + "%' "
                                        +"          OR p.tanggalkembali LIKE '%" + keyword + "%' ");
        
        try {
            while(rs.next()){
                Peminjaman1841720126Ela peminjaman = new Peminjaman1841720126Ela();
                peminjaman.setIdpeminjamanEla(rs.getInt("idbuku"));
                peminjaman.getAnggotaEla().setIdAnggotaEla(rs.getInt("idanggota"));
                peminjaman.getAnggotaEla().setNamaEla(rs.getString("nama_anggota"));
                peminjaman.getAnggotaEla().setAlamatEla(rs.getString("alamat"));
                peminjaman.getAnggotaEla().setTeleponEla(rs.getString("telepon"));
                peminjaman.getBukuEla().setIdbukuEla(rs.getInt("idbuku"));
                peminjaman.getBukuEla().getKategoriEla().setIdkategoriEla(rs.getInt("idkategori"));
                peminjaman.getBukuEla().getKategoriEla().setNamaEla(rs.getString("nama_kategori"));
                peminjaman.getBukuEla().getKategoriEla().setKeteranganEla(rs.getString("keterangan"));
                peminjaman.getBukuEla().setJudulEla(rs.getString("judul"));
                peminjaman.getBukuEla().setPenerbitEla(rs.getString("penerbit"));
                peminjaman.getBukuEla().setPenulisEla(rs.getString("penulis"));
                peminjaman.setTanggalpinjamEla(rs.getString("tanggalpinjam"));
                peminjaman.setTanggalkembaliEla(rs.getString("tanggalkembali"));
                
                ListPeminjaman.add(peminjaman);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return ListPeminjaman;
    }
    
    public void saveEla(){
        if(getByIdEla(idpeminjaman).getIdpeminjamanEla()== 0){
            String SQL = "INSERT INTO peminjaman (idanggota, idbuku, tanggalpinjam, tanggalkembali) VALUES("
                    +"      '"+ this.getAnggotaEla().getIdAnggotaEla()+"', "
                    +"      '"+ this.getBukuEla().getIdbukuEla()+"', "
                    +"      '"+ this.tanggalpinjam + "', "
                    +"      '"+ this.tanggalkembali + "' "
                    +"      )";
            this.idpeminjaman = DBHelper1841720126Ela.insertQueryGetIdEla(SQL);
            
        } else {
            String SQL = "UPDATE peminjaman SET "
                    +"      idanggota = '"+ this.getAnggotaEla().getIdAnggotaEla() + "', "
                    +"      idbuku = '"+ this.getBukuEla().getIdbukuEla()+"', "
                    +"      tanggalpinjam = '"+ this.tanggalpinjam +"', "
                    +"      tanggalkembali = '"+ this.tanggalkembali +"' "
                    +"      WHERE idpeminjaman = '"+this.idpeminjaman + "'";
            DBHelper1841720126Ela.executeQueryEla(SQL);
        }
    }
    
    public void deleteEla(){
        String SQL = "DELETE FROM peminjaman WHERE idpeminjaman = '" + this.idpeminjaman + "'";
        DBHelper1841720126Ela.executeQueryEla(SQL);
    }   
    
}
