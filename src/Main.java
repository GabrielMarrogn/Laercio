import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testes = sc.nextInt();
        for (int j = 0; j < testes; j++) {
            int qtd = sc.nextInt();

            int[] arr = new int[qtd];
            List<Integer> list = new ArrayList<>();
            List<Integer> ordem = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 != 0) {
                    list.add(arr[i]);
                }
            }

            Collections.sort(list);
            int tamanho = list.size();

            for (int i = 0; i < tamanho; i++) {
                if (i % 2 == 0) {
                    ordem.add(list.get((list.size() - 1)));
                    list.remove((list.size() - 1));

                } else {
                    ordem.add(list.get(0));
                    list.remove(0);
                }

            }

            for (int i = 0; i < ordem.size(); i++) {
                System.out.print(ordem.get(i));
                if (i != ordem.size() - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
