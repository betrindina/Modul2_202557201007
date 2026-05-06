public class percobaan1 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        //eror 1 : pembagian dengan nol
        try{
            System.out.println(bil / 0);
        }catch (ArithmeticException ai){
            System.err.println("Eror Aritmatik");
            System.out.println(ai.getMessage());
        }
    }
 
}
