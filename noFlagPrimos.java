
import java.util.Vector;
import java.util.Scanner;

class HelloWorld {
    
    public static void flagNoPrimos(int n, int index, Vector<Integer> myVector){
    
    int counter = 2;    
    for(int mult = index*counter; mult <= n; counter++, mult=index*counter){
        myVector.set(mult-1, mult*-1);
    }
}
    
    public static void main(String[] args) {
        int max_number = 0; // Cantidad maxima a la que se llegara
        long start_time = System.nanoTime();
        Scanner myObj = new Scanner(System.in);
       //System.out.println("Hello world");
        Vector<Integer> number_list = new Vector<>();
        
        System.out.println("Ingrese el numero maximo que se buscaran primos: ");
        max_number = myObj.nextInt();

        for(int index=1; index <= max_number; index++){
            number_list.addElement(index);
        }
        
        for(int index=2; index < (max_number/2)+1; index++){
            flagNoPrimos(max_number, index, number_list);
        }
        
        for(int num = 1; num < number_list.size(); num++){
            if(number_list.get(num) > 0){
                System.out.print(number_list.get(num) + " ");
            }
        }
        
        long end_time = System.nanoTime();
        long execution_time = end_time - start_time;
        System.out.println("     " + execution_time + " nanoseconds");
        
    }
}

/*

Resultados de pruebas de complejidad de tiempo:

Para N = 20: 686,721,236 nanoseconds
Para N = 100: 905,704,566 nanoseconds
Para N = 500: 1 ,240,244,948 nanoseconds

*/
