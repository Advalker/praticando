public class teste
{
    public static void main(String[] args) {

        int contPar = 0;
        int contImp = 0;

        for (int x = 0; x < 11; x++){
            System.out.println(x);
            if (x % 2 == 0 ){
               contPar = contPar + 1;
                  
            }
            else {
                contImp = contImp +1;
            } 
           
        }

        System.out.println("total de números pares é: " + contPar);
        System.out.println("total de números impares é: " + contImp);
    }

    
}
      
       
        