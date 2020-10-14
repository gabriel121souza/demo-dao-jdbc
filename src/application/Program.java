package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	public static void main(String[] args) {
		
		Department obj = new Department(2, "Books");
		Seller seller = new Seller(22, "gariel","gabriel@gmail.com", new Date(), (double) 3500, obj);
		System.out.println(seller);
	}
}
