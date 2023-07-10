import Map.MapABB;
import Map.MapLista;
import Map.MapVetor;
import Map.Veiculo;
import Utils.AppColor;

import java.util.Scanner;

public class Interface {
    public static MapLista mapalista = new MapLista();
    public static MapVetor mapavetor = new MapVetor();
    public static MapABB mapaarvore = new MapABB();
    long tempo[][] = new long[3][5];

    private static void preencheMapArvore(int numero) {
        for (int i = 0; i < numero; i++) {
            mapaarvore.put(new Veiculo());
        }
    }


    private static void preencheMapLista(int numero) {
        for (int i = 0; i < numero; i++) {
            mapalista.put(new Veiculo());
        }
    }

    private static void preencheMapVetor(int numero) {
        for (int i = 0; i < numero; i++) {
            mapavetor.put(new Veiculo());
        }
    }


    public void runapp(){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        vetor();
        lista();
        arvore();

        do {
            System.out.println("\n####################\n");
            System.out.println("Menu mostrar dados.");
            System.out.println("1. Vetor");
            System.out.println("2. Lista");
            System.out.println("3. Árvore");
            System.out.println("4. Mostrar Dados de todas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println("Você escolheu a Vetor");
                    System.out.println(AppColor.BLUE+"Total Ford Vetor: "+mapavetor.getNumeroMarcaFord());
                    System.out.println("\n####################\n");
                    System.out.println("Dados do mapa com vetor:");
                    System.out.printf("Tempo de preenchimento é de: %.3f segundos\n",(float)(tempo[0][1]-tempo[0][0])/1000000000);
                    System.out.printf("Tempo para printar de forma ordenada é de: %.3f segundos\n",(float)(tempo[0][2]-tempo[0][1])/1000000000);
                    System.out.printf("Tempo para remoção dos chassis é de: %.3f segundos\n",(float)(tempo[0][3]-tempo[0][2])/1000000000);
                    System.out.printf("Tempo para contar o numero de veiculos da marca Ford é de: %.3f segundos\n",(float)(tempo[0][4]-tempo[0][3])/1000000000);
                    System.out.printf("Tempo total de execução é de: %.3f segundos\n",(float)(tempo[0][4]-tempo[0][0])/1000000000);
                    System.out.println(AppColor.RESET);

                    break;
                case 2:
                    System.out.println("Você escolheu a Lista.");
                    System.out.println(AppColor.RED+"Total Ford Lista: "+mapalista.getNumeroMarcaFord());
                    System.out.println("\n####################\n");
                    System.out.println("Dados do mapa com lista:");
                    System.out.printf("Tempo de preenchimento  é de: %.3f segundos\n",(float)(tempo[1][1]-tempo[1][0])/1000000000);
                    System.out.printf("Tempo para printar de forma ordenada é de: %.3f segundos\n",(float)(tempo[1][2]-tempo[1][1])/1000000000);
                    System.out.printf("Tempo para remoção dos chassis é de: %.3f segundos\n",(float)(tempo[1][3]-tempo[1][2])/1000000000);
                    System.out.printf("Tempo para contar o numero de veiculos da marca Ford é de: %.3f segundos\n",(float)(tempo[1][4]-tempo[1][3])/1000000000);
                    System.out.printf("Tempo total de execução é de: %.3f segundos\n",(float)(tempo[1][4]-tempo[1][0])/1000000000);
                    System.out.println(AppColor.RESET);
                    break;
                case 3:
                    System.out.println("Você escolheu a Árvore.");
                    System.out.println(AppColor.GREEN+"Total Ford Arvore: " + mapaarvore.getNumeroMarcaFord());
                    System.out.println("\n####################\n");
                    System.out.println("Dados do mapa com arvore:");
                    System.out.printf("Tempo de preenchimento é de: %.3f segundos\n",(float)(tempo[2][1]-tempo[2][0])/1000000000);
                    System.out.printf("Tempo para printar de forma ordenada é de: %.3f segundos\n",(float)(tempo[2][2]-tempo[2][1])/1000000000);
                    System.out.printf("Tempo para remoção dos chassis é de: %.3f segundos\n",(float)(tempo[2][3]-tempo[2][2])/1000000000);
                    System.out.printf("Tempo para contar o numero de veiculos da marca Ford é de: %.3f segundos\n",(float)(tempo[2][4]-tempo[2][3])/1000000000);
                    System.out.printf("Tempo total de execução é de: %.3f segundos\n",(float)(tempo[2][4]-tempo[2][0])/1000000000);
                    System.out.println(AppColor.RESET);

                    break;
                case 4:
                    System.out.println("Você escolheu a Todas.");
                    System.out.println("\n####################\n");
                    System.out.println(AppColor.RED+"Total Ford Lista: "+mapalista.getNumeroMarcaFord());
                    System.out.println("\n####################\n");
                    System.out.println("Dados do mapa com lista:");
                    System.out.printf("Tempo de preenchimento  é de: %.3f segundos\n",(float)(tempo[1][1]-tempo[1][0])/1000000000);
                    System.out.printf("Tempo para printar de forma ordenada é de: %.3f segundos\n",(float)(tempo[1][2]-tempo[1][1])/1000000000);
                    System.out.printf("Tempo para remoção dos chassis é de: %.3f segundos\n",(float)(tempo[1][3]-tempo[1][2])/1000000000);
                    System.out.printf("Tempo para contar o numero de veiculos da marca Ford é de: %.3f segundos\n",(float)(tempo[1][4]-tempo[1][3])/1000000000);
                    System.out.printf("Tempo total de execução é de: %.3f segundos\n",(float)(tempo[1][4]-tempo[1][0])/1000000000);
                    System.out.println("\n####################\n");
                    System.out.println(AppColor.BLUE+"Total Ford Vetor: "+mapavetor.getNumeroMarcaFord());
                    System.out.println("\n####################\n");
                    System.out.println("Dados do mapa com vetor:");
                    System.out.printf("Tempo de preenchimento é de: %.3f segundos\n",(float)(tempo[0][1]-tempo[0][0])/1000000000);
                    System.out.printf("Tempo para printar de forma ordenada é de: %.3f segundos\n",(float)(tempo[0][2]-tempo[0][1])/1000000000);
                    System.out.printf("Tempo para remoção dos chassis é de: %.3f segundos\n",(float)(tempo[0][3]-tempo[0][2])/1000000000);
                    System.out.printf("Tempo para contar o numero de veiculos da marca Ford é de: %.3f segundos\n",(float)(tempo[0][4]-tempo[0][3])/1000000000);
                    System.out.printf("Tempo total de execução é de: %.3f segundos\n",(float)(tempo[0][4]-tempo[0][0])/1000000000);
                    System.out.println("\n####################\n");
                    System.out.println(AppColor.GREEN+"Total Ford Arvore: " + mapaarvore.getNumeroMarcaFord());
                    System.out.println("\n####################\n");
                    System.out.println("Dados do mapa com arvore:");
                    System.out.printf("Tempo de preenchimento é de: %.3f segundos\n",(float)(tempo[2][1]-tempo[2][0])/1000000000);
                    System.out.printf("Tempo para printar de forma ordenada é de: %.3f segundos\n",(float)(tempo[2][2]-tempo[2][1])/1000000000);
                    System.out.printf("Tempo para remoção dos chassis é de: %.3f segundos\n",(float)(tempo[2][3]-tempo[2][2])/1000000000);
                    System.out.printf("Tempo para contar o numero de veiculos da marca Ford é de: %.3f segundos\n",(float)(tempo[2][4]-tempo[2][3])/1000000000);
                    System.out.printf("Tempo total de execução é de: %.3f segundos\n",(float)(tempo[2][4]-tempo[2][0])/1000000000);
                    System.out.println(AppColor.RESET);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();


        System.out.println("\n######### Finalizado ###########\n");


    }
    public void vetor(){
        tempo[0][0]=System.nanoTime(); // tempo de inicio da operação
        preencheMapVetor(100000);
        tempo[0][1]=System.nanoTime();// o tempo antes de executar a próxima operação.
        mapavetor.imprimeOrdenado();
        tempo[0][2]=System.nanoTime();//tempo depois de executar a operação de impressão ordenada.
        mapavetor.removeChassiMenorOuIgual(202050000);
        tempo[0][3]=System.nanoTime(); //tempo depois de executar a operação de remoção.
        mapavetor.getNumeroMarcaFord();
        tempo[0][4]=System.nanoTime();//tempo de término da operação.

    }
    public void lista(){
        tempo[1][0]=System.nanoTime();
        preencheMapLista(100000);
        tempo[1][1]=System.nanoTime();
        mapalista.imprimeOrdenado();
        tempo[1][2]=System.nanoTime();
        mapalista.removeChassiMenorIgual(202050000);
        tempo[1][3]=System.nanoTime();
        mapalista.getNumeroMarcaFord();
        tempo[1][4]=System.nanoTime();


    }


    public void arvore(){
        tempo[2][0]=System.nanoTime();
        preencheMapArvore(100000);
        tempo[2][1]=System.nanoTime();
        mapaarvore.imprimeOrdenado();
        tempo[2][2]=System.nanoTime();
        mapaarvore.removeChassiMenorOuIgual(202050000);
        tempo[2][3]=System.nanoTime();
        mapaarvore.getNumeroMarcaFord();
        tempo[2][4]=System.nanoTime();

    }
}