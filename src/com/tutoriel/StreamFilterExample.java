package com.tutoriel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//traditional methode
		List<Product> list=new ArrayList<Product>();
		for(Product product:getProducts()) {
			if(product.getPrice()>400) {
			list.add(product);
		}
			}
		for(Product product:list) {
			System.out.println(product);
		}
		//using stream APi filter ->filtrer les produits qui ont un prix plus que 400
		List <Product> list2=getProducts().stream().filter((product)->product.getPrice()>400)
		.collect(Collectors.toList());
		list2.forEach(System.out::println);
		
	}
	private static List<Product> getProducts(){
		List<Product> productsList= new ArrayList<Product>();
		productsList.add(new Product(1,"Hp Laptop",400));
		productsList.add(new Product(2,"Asus VivoBook",500));
		productsList.add(new Product(3,"Lenovo",600));
		productsList.add(new Product(4,"Apple macbook",1300));
		return productsList;
	}	

}
class Product{
	private int id;
	private  String name;
	private float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

}