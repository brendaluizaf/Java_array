public class ex5 {
    
    public static void main(String[] args){
        int[] num = {7, 8, 6, 9, 7, 8};

        for (int i = 0; i< num.length; i++){

            if(num[i] % 2 == 0){
                System.out.println("O número é par " + num[i]);  
            }
        }
    }
}
