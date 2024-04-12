package Bai_tap_tu_hoc_1;

public class HangSX {
    private String tenHangSX;
    private String tenQuocGiaSX;

    public HangSX() {
    }

    public HangSX(String tenHangSX, String tenQuocGiaSX) {
        this.tenHangSX = tenHangSX;
        this.tenQuocGiaSX = tenQuocGiaSX;
    }

    public String getTenHangSX() {
        return tenHangSX;
    }

    public void setTenHangSX(String tenHangSX) {
        this.tenHangSX = tenHangSX;
    }

    public String getTenQuocGiaSX() {
        return tenQuocGiaSX;
    }

    public void setTenQuocGiaSX(String tenQuocGiaSX) {
        this.tenQuocGiaSX = tenQuocGiaSX;
    }

    @Override
    public String toString() {
        return "HangSX{" +
                "tenHangSX='" + tenHangSX + '\'' +
                ", tenQuocGiaSX='" + tenQuocGiaSX + '\'' +
                '}';
    }
}
