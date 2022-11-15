package Controller;

import java.util.Scanner;

import DAO.ProfessorDAO;
import Model.Professor;

public class ProfessorServelet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProfessorDAO professorDAO = new ProfessorDAO();
		Scanner entrada = new Scanner(System.in);		

		int opcao=0;
		do {

			System.out.println("===== CADASTRO =====");
			System.out.println("1 - Cadastro de Professores");
			System.out.println("2 - Excluir professor");
			System.out.println("3 - Atualizar professor");
			System.out.println("4 - Mostrar professores");
			System.out.println("5 - Buscar professor por ID");
			System.out.println("6 - Encerrar Programa");
			System.out.println("Selecione uma opção");
			System.out.println("====================");

			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome");
				String nome = entrada.next();
				System.out.println("Digite o cpf");
				String cpf = entrada.next();
				System.out.println("Digite a formação");
				String formacao = entrada.next();
				

				Professor professor = new Professor();
				
				professor.setNome(nome);
				professor.setCpf(cpf);
				professor.setFormacao(formacao);
			
			
				professorDAO.save(professor);
				break;

			case 2:
				System.out.println("Digite o código");
				int codigo = entrada.nextInt();

				professorDAO.removeById(codigo);
				break;

			case 3:
				System.out.println("Digite o código");
				codigo = entrada.nextInt();
				System.out.println("Digite o novo nome");
				String novoNome = entrada.next();
				System.out.println("Digite o novo CPF");
				String novoCpf = entrada.next();
				System.out.println("Digite a nova formação");
				String novaFormacao = entrada.next();
		

				Professor professor1 = new Professor();
				
				professor1.setIdProfessor(codigo);
				professor1.setNome(novoNome);
				professor1.setCpf(novoCpf);
				professor1.setFormacao(novaFormacao);
				

				professorDAO.update(professor1);
				break;

			case 4:

				for (Professor c : professorDAO.getProfessores()) {

					System.out.println("NOME: " + c.getNome());
					System.out.println("CPF: " + c.getCpf());
					System.out.println("FORMAÇÃO: " + c.getFormacao());
					System.out.println("----------------------------------- ");
				}
				break;

			case 5:

				System.out.println("Digite o código");
				int idProfessor = entrada.nextInt();

				Professor c = professorDAO.getProfessorById(idProfessor);

				System.out.println("NOME: " + c.getNome());
				System.out.println("CPF: " + c.getCpf());
				System.out.println("FORMAÇÃO: " + c.getFormacao());
				System.out.println("----------------------------------- ");
				break;

			case 6:
				System.out.println("ENCERRANDO SISTEMA");
				break;

			}

		} while (opcao != 6);
		entrada.close();
		

	}


}
