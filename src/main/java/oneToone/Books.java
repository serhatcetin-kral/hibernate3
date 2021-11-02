package oneToone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Books {

	
	private String book_name;
	
	@Id
	private int book_id;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private StudentsOne student;

	
	
	
	
	
	String getBook_name() {
		return book_name;
	}

	void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	int getBook_id() {
		return book_id;
	}

	void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	StudentsOne getStudent() {
		return student;
	}

	void setStudent(StudentsOne student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Books [book_name=" + book_name + ", book_id=" + book_id + ", student=" + student + "]";
	}
	
	
}
