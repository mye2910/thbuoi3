/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;


public class product {

    private String description;
    private String productID;
    private double price;

    public product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setdescription(String description) {
        this.description=description;
    }

    public String getProductID() {
        return productID;
    }
    public void setproductID(String productID) {
        this.productID=productID;
    }

    public double getprice() {
        return price;
    }
    public void setprice(Double price) {
        this.price=price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product ID: " + productID + "\n" + "Description: " + description + "\n" + "Price: " + price;
    }
}

