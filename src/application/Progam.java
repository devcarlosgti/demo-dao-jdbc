package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Progam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Carlos", "Carlos@gamil.com", new Date(), 3000.0, obj);	
		
		//System.out.println(obj);
		System.out.println(seller);
		
		
	}

}