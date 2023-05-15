/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package order;

/**
 *
 * @author Asus
 */
public class orderdetail {
    private int quantity;
    private product product;

    public orderdetail(int quantity, product product1) {
        this.product = product;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantily(int quantity) {
		this.quantity = quantity;
	}

    public product getProduct() {
        return product;
    }
    public void setProduct(product product) {
		this.product = product;
    }

    @Override
    public String toString() {
        return "Product: " + product.getProductID() + " - " + product.getDescription() + "\n" + "Quantity: " + quantity;
    }
    public double calcTotalPrice() {
		return quantity * product.getprice();
		
	}
}

    
    

