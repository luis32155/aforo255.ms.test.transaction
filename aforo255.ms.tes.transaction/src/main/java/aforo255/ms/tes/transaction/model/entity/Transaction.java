package aforo255.ms.tes.transaction.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection =  "transaction")
public class Transaction {
   
	
	private String id ;
	private int idinvoce;
	private double amount ;
	private String date;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public int getIdinvoce() {
		return idinvoce;
	}
	public void setIdinvoce(int idinvoce) {
		this.idinvoce = idinvoce;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
