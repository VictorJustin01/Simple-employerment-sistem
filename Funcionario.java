public class Funcionario {
private Integer id;
private String name;
private Double salario;

//Definição do construtor

	public Funcionario() {
		
	}

	public Funcionario( Integer id, String name, Double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}
//Métodos getters e setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
// Metedo de incrementação do salario
	public void incrementarSalario(double porcetagem) {
	salario += salario * porcetagem/100.0;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salario);
	}

}
