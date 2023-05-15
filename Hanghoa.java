
package hanghoa;

import java.util.Locale;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Calendar;

public class Hanghoa {
    private int mahang;
    private String tenhang;
    private int soluongton;
    private double dongia;
    public Hanghoa(int mahang, String tenhang, double dongia, int soluongton) {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.dongia = dongia;
        this.soluongton = soluongton;
         }
    public Hanghoa() {
    }
 
    //-------------------begin getter and setter-----------------------
    public int getmahang() {
        return mahang;
    }
 
    public void setmahang(int mahang) {
        this.mahang = mahang;
    }
 
    public String gettenhang() {
        return tenhang;
    }
 
    public void settenhang(String tenhang) {
        this.tenhang = tenhang;
    }
 
    public double getdongia() {
        return dongia;
    }
 
    public void setdongia(double dongia) {
        this.dongia = dongia;
    }
 
    public int getsoluongton() {
        return soluongton;
    }
 
    public void setsoluongton(int soluongton) {
        this.soluongton = soluongton;
    }
    public class thucpham {
        private Date nsx, hsd;
        private String tenhang;
        public thucpham(Date nsx, Date hsd) {
        this.nsx = nsx;
        this.hsd = hsd;
 }
        public Date getnsx() {
        return nsx;
    }
 
    public void setnsx(Date nsx) {
        this.nsx = nsx;
    }
 
    public Date gethsd() {
        return hsd;
    }
 
    public void sethsd(Date hsd) {
        this.hsd = hsd;
    }
        @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String str = numberFormat.format(dongia);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(nsx);
        String str2 = simpleDateFormat.format(hsd);
        return "Thông tin về thực phẩm: \n" +
                "Mã hàng : " + mahang +
                "\nTên hàng : '" + tenhang +
                "\nĐơn giá : " + str +
                "\nNgày sản xuất : " + str1 +
                "\nHạn sử dụng : " + str2;        
    }
    public void setnsx(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.nsx = calendar.getTime();
    }
    public void sethsd(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.hsd = calendar.getTime();
    }
    public boolean kiemtratenhang(boolean k) {
        if ("".equals(this.tenhang) || this.tenhang.isEmpty()) {
            System.out.println("Tên hàng không được để trống : ");
        } else {
            k = false;
        }
        return k;
    }
    public boolean kiemtrangay(boolean t) {
        if (this.getnsx().compareTo(this.gethsd()) < 0) {
            t = false;
        } else {
            System.out.println("Ngày hết hạn không được nhỏ hơn ngày sản xuất : ");
        }
        return t;
    }
    public void kiemtrahsd() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(today);
        if (this.gethsd().compareTo(today) < 0) {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa đã hết hạn ");
        } else {
            System.out.println("Hôm nay là ngày " + st + ", hàng hóa vẫn còn hạn ");
        }
    }
    }
}


    
    
    
    
 
    

    
    
        
    

