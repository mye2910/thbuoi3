
package order;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Order{
    private int OrderID;
    private LocalDate orderDate;
    private final List<orderdetail>lineItems;

    public Order(int orderID,LocalDate orderDate){
        this.OrderID = orderID;
        this.orderDate = orderDate;
        this.lineItems=new ArrayList<>();
    }
    public void addlineItem(product product, int quality){
        if(lineItems.size()<20){
            lineItems.add(new orderdetail(quality,product));
        }
        else{
            System.out.println("đã đạt giới hạn đơn hàng");
        }
    }
    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        this.OrderID = orderID;
    }

    
    public LocalDate getorderDate() {
        return orderDate;
    }

    public void setorderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<orderdetail> getLineItems() {
        return lineItems;
    }
    public double calcTotalCharge(int n) {
        double totalCharge = 0;
        int count = 0;
        for (int i = n; count < lineItems.size(); i++) {
            orderdetail orderDetail = lineItems.get(count);
            totalCharge += orderDetail.calcTotalPrice();
            count++;
        }
        return totalCharge;
    }

    @Override
    public String toString (){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order ID:").append(OrderID).append("\n");
        stringBuilder.append("OrderDate:").append(orderDate).append("\n");
        stringBuilder.append("LineItems:\n");
        for(orderdetail orderDetail : lineItems){
            stringBuilder.append(orderDetail).append("\n");
        }
        return stringBuilder.toString();
    }
}
    

