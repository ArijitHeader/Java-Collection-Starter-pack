package Com.IBM.Advance.Collections.List;

import java.util.Comparator;

public class ArrayListdata {
	String Brand;
	String Model;
	int price;
	int rating;
	 ArrayListdata(String brand, String model, int price, int rating) {
		super();
		Brand = brand;
		Model = model;
		this.price = price;
		this.rating = rating;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public String toString() {
		return "ArrayListdata [Brand=" + Brand + ", Model=" + Model + ", price=" + price + ", rating=" + rating + "]";
	}
	public int compareTo(ArrayListdata d){
		return this.price-d.price;
	}
	
}
