/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku;

/**
 *
 * @author Ailsa
 */
public class Buku {

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the judul_buku
     */
    public String getJudul_buku() {
        return judul_buku;
    }

    /**
     * @param judul_buku the judul_buku to set
     */
    public void setJudul_buku(String judul_buku) {
        this.judul_buku = judul_buku;
    }

    /**
     * @return the tahun_terbit
     */
    public String getTahun_terbit() {
        return tahun_terbit;
    }

    /**
     * @param tahun_terbit the tahun_terbit to set
     */
    public void setTahun_terbit(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    /**
     * @return the penerbit_buku
     */
    public String getPenerbit_buku() {
        return penerbit_buku;
    }

    /**
     * @param penerbit_buku the penerbit_buku to set
     */
    public void setPenerbit_buku(String penerbit_buku) {
        this.penerbit_buku = penerbit_buku;
    }
    
    private String isbn;
    private String judul_buku;
    private String tahun_terbit;
    private String penerbit_buku;

}
