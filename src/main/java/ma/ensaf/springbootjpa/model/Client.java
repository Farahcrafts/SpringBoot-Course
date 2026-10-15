package ma.ensaf.springbootjpa.model;

public class Client {
	//Attributs
	private int id;
	private String name;
	
	//Getter et Setter pour id
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	
	//Getter et setter pour name
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	
	//methode toString
	@Override
	public String toString() {
	return "Client [Id:" + id + ", Name:" + name + "]";
	}

}
