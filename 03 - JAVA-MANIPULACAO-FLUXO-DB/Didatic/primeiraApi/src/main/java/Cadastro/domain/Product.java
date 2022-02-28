package Cadastro.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id; // ID identification

@Entity
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String model;
	private Integer quantity;
	private double value;

	public Product() {

	}
	// "Generate constructor using fields" to create the P fields 
	public Product(Integer id, String name, String model, Integer quantity, double value) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.quantity = quantity;
		this.value = value;
	}

	// Generate getters and setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
	//"Generation hashCode() and equals()" to compare  
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id);
	}
	// toString to point to the variables
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", model=" + model + ", quantity=" + quantity + ", value="
				+ value + "]";
	}
	
}
