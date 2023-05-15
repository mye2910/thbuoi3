/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hanghoa;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dienmay {
       private Date baohanh;
       private int congsuat;
       public dienmay(Date baohanh, int congsuat){
           this.baohanh = baohanh;
           this.congsuat = congsuat;
    }
       public dienmay(){
       }
       public Date getbaohanh(){
           return baohanh;
       }
       public void setbaohanh(Date baohanh){
           this.baohanh = baohanh;
       }
       public int getcongsuat(){
           return congsuat;
       }
       public void setcongsuat (int congsuat){
           this.congsuat = congsuat;
       }
       @Override
       public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String str1 = simpleDateFormat.format(baohanh);
        return "Thông tin về thực phẩm: \n" + "bao hanh : " + baohanh +
                "\ncong suat : '" + congsuat;
       }
       public void setbaohanh(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.baohanh = calendar.getTime();
    }
       
       
       
}
