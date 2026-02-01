package principal;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 2) {

            System.out.println("Sistema de Check CyberSecurity");
            System.out.println("Escolha uma opção");
            System.out.println("1 - Verificar acesso");
            System.out.println("2 - Encerrar Sistema");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:

                    System.out.println("Digite o nivel do cidadão");
                    int nivelCD = teclado.nextInt();
                    double ameaca = 0;

                    if (nivelCD < 0) {
                        System.out.println("Dados invalidos");
                    }
                    else if (nivelCD < 50) {
                        System.out.println("Acesso negado");
                    }
                    else {
                        System.out.println("Digite o nível da ameaca");
                        ameaca = teclado.nextInt();
                    }

                    if (ameaca >= 1 && ameaca <= 3 && nivelCD >= 50) {
                        System.out.println("#ACESSO PERMITIDO#");
                        System.out.println("");

                        int opcao1 = 0;

                        while (opcao1 != 3) {

                            System.out.println("SISTEMA DE CARREGAMENTO");
                            System.out.println("1 - Carregar bateria");
                            System.out.println("2 - Verificar status da bateria");
                            System.out.println("3 - Encerrar Sistema");

                            opcao1 = teclado.nextInt();

                            switch (opcao1) {

                                case 1:
                                    System.out.println("Digite o nivel da bateria");
                                    double nivelCB = teclado.nextInt();

                                    if (nivelCB < 0) {
                                        System.out.println("Dados invalidos");
                                    }
                                    else if (nivelCB > 100) {
                                        System.out.println("Carregamento invalido");
                                    }
                                    else {
                                        double carga = 100 - nivelCB;
                                        System.out.println("Carga realizada: " + carga);
                                        System.out.println("Nivel final da bateria: 100");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Status da bateria indisponivel nesta versão");
                                    break;

                                case 3:
                                    System.out.println("Encerrando sistema de carregamento...");
                                    break;

                                default:
                                    System.out.println("Opcao invalida");
                            }
                        }

                    }
                    else if (ameaca >= 4) {
                        System.out.println("Acesso negado");
                    }
                    else if (ameaca < 0) {
                        System.out.println("Dados invalidos");
                    }

                    break;

                case 2:
                    System.out.println("Sistema encerrado");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }

        teclado.close();
    }
}
