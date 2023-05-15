/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class main {
     public static void main(String[] args) {
        Order order = new Order(1, LocalDate.now());

        product product1 = new product("Gạo thơm ", "G01", 15.0);
        product product2 = new product("Gạo nếp", "G02", 18.0);
        product product3 = new product("Gạo tám", "G03", 22.0);
        product product4 = new product("Gạo ST25", "G04", 25.0);


        order.addlineItem(product1, 3);
        order.addlineItem(product3, 5);
        order.addlineItem(product2, 5);
        order.addlineItem(product4, 5);


        System.out.println("Mã hóa đơn: " + order.getOrderID());
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = order.getorderDate().format(dateFormatter);
        System.out.println("Ngày lập hóa đơn: " + formattedDate);
        System.out.println("STT       |  Mã Sp   |         Mô tả         |     Đơn giá     |     Số lượng    |    Thành tiền");

        DecimalFormat decimalFormat = new DecimalFormat("#,### VND");
        List<orderdetail> lineItems = order.getLineItems();
        int stt = 1;
        for (orderdetail orderDetail : lineItems) {
            System.out.printf("%-10s|  %-8s|   %-20s|  %-15s|  %-15s|  %-15s\n",
                    stt,
                    orderDetail.getProduct().getProductID(),
                    orderDetail.getProduct().getDescription(),
                    decimalFormat.format(orderDetail.getProduct().getprice()),
                    orderDetail.getQuantity(),
                    decimalFormat.format(orderDetail.calcTotalPrice()));
            stt++;
        }

        System.out.println("Tổng tiền thanh toán: " + decimalFormat.format(order.calcTotalCharge(0)));
    }
}

