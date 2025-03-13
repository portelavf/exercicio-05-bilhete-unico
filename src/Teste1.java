import java.util.Random;

public class Teste1 {
    public static void main(String[] args) {
        int [] v = new int [10];
        entradaDados(v);
        imprimir(v);
    }
        public static void entradaDados(int [] v){
            Random random = new Random();
            for(int i=0;i<v.length;i++){
                v[i] = random.nextInt(15);
            }
        }

        public static void imprimir(int [] v){
            for(int i=0;i<v.length;i++){
                System.out.println(v[i]);
            }
            for(int i : v){
                System.out.println(i);
            }
        }
}
