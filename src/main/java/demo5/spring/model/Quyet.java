package demo5.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Quyet {
	@Id
	private Long id;
	private String name;
}
