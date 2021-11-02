package oneToone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StudentsOne {

	@Id
	private int id;
	
	private String name;
	
	@OneToOne(mappedBy="student")
	private Books book;
	
	

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	
	
	Books getBook() {
		return book;
	}

	void setBook(Books book) {
		this.book = book;
	}
	
	
	@Override
	public String toString() {
		return "StudentsOne [id=" + id + ", name=" + name + "]";
	}

	
	
	
	
	
}
