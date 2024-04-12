package Bai_tap_tu_hoc_1;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;
    public MayBay(String loaiNhienLieu, HangSX hangSX) {
        super("May Bay", hangSX);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }
}
