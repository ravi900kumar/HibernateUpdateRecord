package java9r.main.com;

import java.util.Date;
import java.util.List;

import java9r.dao.com.*;
import java9r.entites.com.*;

public class ProductMain {
	public static void main(String[] args) {
		ProductDAO product = new ProductDAO();
		// update
		Product p = product.FindParticularProduct(2);
		p.setCreateiondate(new Date());
		p.setDescription("new description 1 ");
		p.setName("product new name 1");
		p.setPhoto("photo 1");
		p.setPrice(Long.valueOf(1000));
		p.setQuantity(6);
		product.updaterecord(p);
		System.out.println("Successfully Updated new record");
	}
}