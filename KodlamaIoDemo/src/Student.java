
public class Student extends User {
	
	public Student(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private String dersProgramı,odevGoruntule,degerlendirme;

	

	public String getDersProgramı() {
		return dersProgramı;
	}

	public void setDersProgramı(String dersProgramı) {
		this.dersProgramı = dersProgramı;
	}

	public String getOdevGoruntule() {
		return odevGoruntule;
	}

	public void setOdevGoruntule(String odevGoruntule) {
		this.odevGoruntule = odevGoruntule;
	}

	public String getDegerlendirme() {
		return degerlendirme;
	}

	public void setDegerlendirme(String degerlendirme) {
		this.degerlendirme = degerlendirme;
	}
	

}
