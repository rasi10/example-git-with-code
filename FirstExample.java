public class FirstExample{
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        System.out.println("A:" +a); //10
        System.out.println("B:" +b); //20
        //Swap the values

        int aux = 0;
        aux = a;
        a = b;
        b = aux;   
        
        System.out.println("A:" +a); // 20
        System.out.println("B:" +b); // 10   
    }
}