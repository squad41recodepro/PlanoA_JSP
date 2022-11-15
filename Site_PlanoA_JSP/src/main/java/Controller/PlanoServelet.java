package Controller;

import java.util.Scanner;

import DAO.PlanoDAO;
import Model.Plano;

public class PlanoServelet {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PlanoDAO planoDAO = new PlanoDAO();
		Scanner entrada = new Scanner(System.in);		

		int opcao=0;
		do {

			System.out.println("===== CADASTRO =====");
			System.out.println("1 - Cadastro de Planos");
			System.out.println("2 - Excluir plano");
			System.out.println("3 - Atualizar plano");
			System.out.println("4 - Mostrar planos");
			System.out.println("5 - Buscar plano por ID");
			System.out.println("6 - Encerrar Programa");
			System.out.println("Selecione uma opção");
			System.out.println("====================");

			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome da aula");
				String nomeDaAula = entrada.next();
				System.out.println("Digite a materia");
				String materia = entrada.next();
				System.out.println("Digite a série");
				String serie = entrada.next();
				

				Plano plano = new Plano();
				
				plano.setNomeDaAula(nomeDaAula);
				plano.setMateria(materia);
				plano.setSerie(serie);
			
			
				planoDAO.save(plano);
				break;

			case 2:
				System.out.println("Digite o código");
				int codigo = entrada.nextInt();

				planoDAO.removeById(codigo);
				break;

			case 3:
				System.out.println("Digite o código");
				codigo = entrada.nextInt();
				System.out.println("Digite o novo nome da aula");
				String novoNomeDaAula = entrada.next();
				System.out.println("Digite a nova materia");
				String novaMateria = entrada.next();
				System.out.println("Digite a nova serie");
				String novaSerie = entrada.next();
		

				Plano plano1 = new Plano();
				
				plano1.setIdPlano(codigo);
				plano1.setNomeDaAula(novoNomeDaAula);
				plano1.setMateria(novaMateria);
				plano1.setSerie(novaSerie);
				

				planoDAO.update(plano1);
				break;

			case 4:

				for (Plano c : planoDAO.getPlanos()) {

					System.out.println("NOME DA AULA: " + c.getNomeDaAula());
					System.out.println("MATERIA: " + c.getMateria());
					System.out.println("SERIE: " + c.getSerie());
					System.out.println("----------------------------------- ");
				}
				break;

			case 5:

				System.out.println("Digite o código");
				int idPlano = entrada.nextInt();

				Plano c = planoDAO.getPlanoById(idPlano);

				System.out.println("NOME DA AULA: " + c.getNomeDaAula());
				System.out.println("MATERIA: " + c.getMateria());
				System.out.println("SERIE: " + c.getSerie());
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
