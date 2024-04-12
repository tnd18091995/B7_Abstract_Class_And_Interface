package Bai_tap_tu_hoc_1;

public class XeOto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public XeOto(String loaiNhienLieu, HangSX hangSX) {
        super("Xe Oto", hangSX);
        this.loaiNhienLieu = loaiNhienLieu;

    }
}
