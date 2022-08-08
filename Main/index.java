import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class index {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);


        clear(); // Limpar a tela


        System.out.println("--------------------------------------");
        System.out.println("\n----> Seja bem vindo a Logistica e CIA :)"); // belo trabalho
        int opcao = 0;
        ArrayList<Fornecedores> list_forn = new ArrayList<Fornecedores>();



        while (opcao != 6) {

            System.out.println("\n-- Menu Principal --");
            System.out.println("Escolha uma opção: ");
            System.out.println("1- Sistema de logistica");
            System.out.println("2 - Sistema de controle (BREVE)");
            System.out.println("3 - Sistema de atualização de dados (BREVE)");
            System.out.println("4 - Sistema de transação - Compra e Venda (BREVE)");
            System.out.println("5 - Relatório (BREVE)");
            System.out.println("6 - Sair ");
            System.out.print("Digite o número da sua opção: ");
            opcao = sc.nextInt();



            switch (opcao) {
                case 1: // Logistica
                    int opcao_log_fornecedores = 0;
                    int opcao_log_cliente = 0;
                    int opcao_log_produto = 0;

                    // Cadastrar novos fornecedores
                    // Cadastrar Clientes
                    // Cadastrar Produtos


                    clear(); // Limpar tela


                    System.out.println("-- Sistema de logistica --");
                    System.out.println(">  Gerenciamento ");
                    System.out.println("1- Gerenciamento fornecedores");
                    System.out.println("2- Gerenciamento clientes");
                    System.out.println("3- Gerenciamento produtos");
                    System.out.println("4 - Voltar");
                    System.out.print("Digite sua opção: ");
                    int opc_gerenciamento = sc.nextInt();


                    clear(); // Limpar a tela



                    switch (opc_gerenciamento) {
                        case 1:// Gerenciar Fornecedor



                            Fornecedores forn = new Fornecedores();
                            boolean cad_Fornecedor = false;


                            while (opcao_log_fornecedores != 3) {


                                System.out.println("-- Sistema de logistica --");
                                System.out.println("-> Fornecedores ");
                                System.out.println("Escolha uma opção -");
                                System.out.println("1 - Cadastrar fornecedor");
                                System.out.println("2 - Excluir fornecedores");
                                System.out.println("3 - Voltar");
                                System.out.print("Digite o número da sua opção: ");
                                opcao_log_fornecedores = sc.nextInt();
                                sc.nextLine(); // Tirar enter do buffer



                                switch (opcao_log_fornecedores) {


                                    case 1://Cadastrar fornecedor


                                        clear(); // Limpar tela


                                        System.out.println("\n-- Sistema de logistica --");
                                        System.out.println("--> Cadastrando o fornecedor");
                                        System.out.print("Digite o nome do fornecedor: ");
                                        String nome = sc.nextLine();
                                        System.out.print("Digite o endereço do fornecedor: ");
                                        String endereco = sc.nextLine();
                                        System.out.print("Digite o CNPJ do fornecedor:  ");
                                        int cnpj = sc.nextInt();
                                        sc.nextLine(); // Tirar enter do Buffer
                                        System.out.print("Digite o telefone do fornecedor: ");
                                        String telefone = sc.nextLine();
                                        System.out.print("Digite o código do fornecedor: ");
                                        int cod_fornecedor = sc.nextInt();


                                        forn = new Fornecedores(nome, cnpj, endereco, telefone, cod_fornecedor);
                                        list_forn.add(forn);
                                        cad_Fornecedor = true;


                                        break;


                                    case 2: //Excluir Fornecedor
                                        System.out.println(cad_Fornecedor); // Debug
                                        if (cad_Fornecedor == true) {
                                            System.out.println("\n \n-- Sistema de logistica --");
                                            System.out.println("--> Excluindo o fornecedor");
                                            System.out.println("1 - CNPJ");
                                            System.out.println("2 - código do fornecedor");
                                            System.out.print(
                                                    "Escolha dentre as alternativas para selecionar o método de exclusão: ");
                                            int excluir_opc = sc.nextInt();



                                            switch (excluir_opc) { 
                                                case 1:// CNPJ
                                                    System.out.println("\nDigite um dos CNPJ para apagar: ");


                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getCnpj());// Aq vai mostrar os cpf para excluir o fornecedor
                                                    }


                                                    System.out.print("\nDigite sua escolha:");
                                                    int esc_CNPJ = sc.nextInt();
                                                    System.out.print("Tem certeza? [1 - Sim, 2 - Não]: ");
                                                    int certeza = sc.nextInt();


                                                    if (certeza == 1) {
                                                        SeachDelete.apagarCnpj(esc_CNPJ, list_forn, cad_Fornecedor);

                                                    } else {
                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;
                                                        
                                                    }
                                                    break; // bom dia Douglas tenta apertar ctrl a + delete alt f4



                                                case 2: // código do fornecedor
                                                    System.out.println(
                                                            "\nDigite um dos códigos dos fornecedores para apagar: ");

                                                    for (int i = 0; i < list_forn.size(); i++) {
                                                        System.out.println(list_forn.get(i).getCod_fornecedor());// Aq
                                                                                                                 // vai
                                                                                                                 // mostrar
                                                                                                                 // os
                                                                                                                 // cpf
                                                                                                                 // para
                                                                                                                 // excluir
                                                                                                                 // o
                                                                                                                 // fornecedor
                                                    }
                                                    System.out.print("\nDigite sua escolha:");
                                                    int esc_Fornecedor = sc.nextInt();


                                                    System.out.print("Tem certeza? 1 - Sim, 2 - Não: ");
                                                    int certeza2 = sc.nextInt();

                                                    if (certeza2 == 1) {
                                                        SeachDelete.apagarCodigoFornecedor(esc_Fornecedor,
                                                                list_forn, cad_Fornecedor);

                                                    } else {
                                                        System.out.println("\n-----> Ação cancelada\n");
                                                        break;
                                                    }
                                                    break;


                                                default:
                                                    break;
                                            }


                                        } else {
                                            System.out.println(
                                                    "\n----------> Não há fornecedores cadastrados, cadastre um forncecedor\n"); // ALERT
                                        }
                                        break;


                                    
                                    default:
                                        break;
                                }

                            }
                            break;


                        case 2: // Gerenciar Cliente

                            break;

                        case 3: // Gerenciar Produto

                            break;


                        default:

                            break;
                    }
                    // clearScreen(); //Função de limpar a tela

                    break;


                case 2://Sistema de Controle

                    break;


                case 3: //Sistema de atualização de dados

                    break;


                case 4: // Sistema de transação

                    break;


                case 5: // Relatório

                    break;


                case 6: // Saída

                    break;


                default:
                    System.out.println("opção inválida, tente novamente. ");
                    break;
            }
        }
        sc.close();

    }



    public static void clearScreen() { // Método para limpar a tela
        char esc = 27;
        String clear = esc + "[2J"; // codigo ansi para limpar a tela
        System.out.print(clear);
    }



    public static void clear() throws IOException, InterruptedException { // Método 2 para limpar a tela
        // Limpa a tela no windows, no linux e no MacOS
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            Runtime.getRuntime().exec("clear");
    }