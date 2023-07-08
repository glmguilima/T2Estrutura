import Map.MapABB;
import Map.MapLista;
import Map.MapVetor;
import Map.Veiculo;

public class Main {
    public static MapLista mapalista = new MapLista();
    public static MapVetor mapavetor = new MapVetor();
    public static MapABB mapaarvore = new MapABB();
    public static void main(String[] args) {

            long tempo[][] = new long[3][5];
            preencheMapVetor(100000);
            tempo[0][0] = System.nanoTime();
            tempo[0][1] = System.nanoTime();
            mapavetor.imprimeOrdenado();
            tempo[0][2] = System.nanoTime();
            mapavetor.removeChassiMenorOuIgual(202050000);
            tempo[0][3] = System.nanoTime();
            System.out.println(mapavetor.getNumeroMarcaFord());
            tempo[0][4] = System.nanoTime();

            tempo[1][0] = System.nanoTime();
            preencheMapLista(100000);
            tempo[1][1] = System.nanoTime();
            mapalista.imprimeOrdenado();
            tempo[1][2] = System.nanoTime();
            mapalista.removeChassiMenorIgual(202050000);
            tempo[1][3] = System.nanoTime();
            System.out.println(mapalista.getNumeroMarcaFord());
            tempo[1][4] = System.nanoTime();

            tempo[2][0] = System.nanoTime();
            preencheMapArvore(100000);
            tempo[2][1] = System.nanoTime();
            mapaarvore.imprimeOrdenado();
            tempo[2][2] = System.nanoTime();
            mapaarvore.removeChassiMenorOuIgual(202050000);
            tempo[2][3] = System.nanoTime();
            System.out.println(mapaarvore.getNumeroMarcaFord());
            tempo[2][4] = System.nanoTime();

            System.out.println("\n\n\n\n");
            System.out.println("Dados do mapa com vetor:");

            System.out.printf("O tempo de preenchimento do vetor é de: %.3f segundos\n" , (float) (tempo[0][1] - tempo[0][0])/1000000000);
            System.out.printf("O tempo para printar o vetor de forma ordenada é de: %.3f segundos\n" , (float) (tempo[0][2] - tempo[0][1])/1000000000);
            System.out.printf("O tempo para remoção dos chassis do vetor é de: %.3f segundos\n" , (float) (tempo[0][3] - tempo[0][2])/1000000000);
            System.out.printf("O tempo para contar o numero de veiculos da marca Ford do vetor é de: %.3f segundos\n" , (float)(tempo[0][4] - tempo[0][3])/1000000000);
            System.out.printf("O tempo total de execução é de: %.3f segundos\n" , (float)(tempo[0][4] - tempo[0][0])/1000000000);

            System.out.println("\n\n");
            System.out.println("Dados do mapa com lista:");

            System.out.printf("O tempo de preenchimento da lista é de: %.3f segundos\n" , (float) (tempo[1][1] - tempo[1][0])/1000000000);
            System.out.printf("O tempo para printar a lista de forma ordenada é de: %.3f segundos\n" , (float) (tempo[1][2] - tempo[1][1])/1000000000);
            System.out.printf("O tempo para remoção dos chassis da lista é de: %.3f segundos\n" , (float) (tempo[1][3] - tempo[1][2])/1000000000);
            System.out.printf("O tempo para contar o numero de veiculos da marca Ford da lista é de: %.3f segundos\n" , (float) (tempo[1][4] - tempo[1][3])/1000000000);
            System.out.printf("O tempo total de execução é de: %.3f segundos\n" , (float)(tempo[1][4] - tempo[1][0])/1000000000);

            System.out.println("\n\n");
            System.out.println("Dados do mapa com arvore:");

            System.out.printf("O tempo de preenchimento da arvore é de: %.3f segundos\n" , (float) (tempo[2][1] - tempo[2][0])/1000000000);
            System.out.printf("O tempo para printar a arvore de forma ordenada é de: %.3f segundos\n" , (float) (tempo[2][2] - tempo[2][1])/1000000000);
            System.out.printf("O tempo para remoção dos chassis da arvore é de: %.3f segundos\n" , (float) (tempo[2][3] - tempo[2][2])/1000000000);
            System.out.printf("O tempo para contar o numero de veiculos da marca Ford da arvore é de: %.3f segundos\n" ,(float) (tempo[2][4] - tempo[2][3])/1000000000);
            System.out.printf("O tempo total de execução é de: %.3f segundos\n" , (float)(tempo[2][4] - tempo[2][0])/1000000000);

        }

    private static void preencheMapArvore(int numero) {
        for(int i = 0; i < numero; i++ ) {
            mapaarvore.put(new Veiculo());
        }
    }

    private static void preencheMapLista(int numero) {
        for(int i = 0; i < numero; i++ ) {
            mapalista.put(new Veiculo());
        }
    }

    private static void preencheMapVetor(int numero) {
        for(int i = 0; i < numero; i++ ) {
            mapavetor.put(new Veiculo());
        }
    }
}
