package Bai_tap_tu_hoc_1;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSX hangSX;

    public PhuongTienDiChuyen() {
    }

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSX hangSX) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSX = hangSX;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public HangSX getHangSX() {
        return hangSX;
    }

    public void setHangSX(HangSX hangSX) {
        this.hangSX = hangSX;
    }
}
