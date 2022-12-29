package demo5.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HelloWorld {
	@Id
	private Long id;
	private String message;
	private String datetime;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
}
