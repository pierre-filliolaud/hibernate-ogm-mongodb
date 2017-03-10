package hibernate;

import javax.persistence.Embeddable;

@Embeddable
//@Entity
public class Item {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private String id;

	 private int quantity;

	 private double price;
	 
//	 @Column(name="desc") 
	 private String description;

	 public Item() {
	 }
	 
	public Item(int quantity, double price, String description) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}
	
//	public void setId(String id) {
//		this.id = id;
//	}
//	
//	public String getId() {
//		return id;
//	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
