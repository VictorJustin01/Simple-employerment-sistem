import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Funcionario> list = new ArrayList<>();

		System.out.println("Quantos Funcionarios você deseja registrar no sistema?");
		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Funcioanrio#" + (i+1) + ":");
			
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario:");
			Double salario = sc.nextDouble();
			
			Funcionario funcionario = new Funcionario(id, nome, salario);
			
			list.add(funcionario);
			
		}
			System.out.println("Entre com o funcionario que terá um aumento no salario: ");
			int idFun = sc.nextInt();
			Integer pos = buscarId(list, idFun);
			
			if(pos == null)
				System.out.println("Esse ID não Existe");
			else {
				System.out.println("Entre com a porcetagem de aumento: (Não necessita de %)");
					double porcetagem = sc.nextDouble();
					list.get(pos).incrementarSalario(porcetagem);
			}
			
			System.out.println("\nLista dos funcionarios: ");
			
				for(Funcionario funcionario: list)
					System.out.println(funcionario);
					
		sc.close();
	}
	public static Integer buscarId(List<Funcionario>list,int id ) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id)
				return i;
			
		}
		return -1;
	}
}
