public class percobaan1 {
    public static void main(String[] args) {
        int bil = 10;
        String b[] = {"a", "b", "c"};
        //eror 1 : pembagian dengan nol
        try{
            System.out.println(bil / 0);
        }catch (ArithmeticException ai){
            System.err.println("Error Aritmatik");
            System.out.println(ai.getMessage());
        }
        //eror 2 : index array
        try{
            System.out.println(b[3]);
        }catch (ArrayIndexOutOfBoundsException n){
            System.err.println("Error karena melebihi kapasitas array");
            System.out.println(n.getMessage());
        }catch (Exception e){
            System.err.println("Ada error");
            System.out.println(e.getMessage());
        }
    }
 
}
