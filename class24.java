public class class24 {
 static int sum(int ... arr) {
     int result = 0;
     for(int i:arr){
        result+=i;
     }
     return result;
    }

    public static void main(String[] args) {
 System.out.println(sum(4, 5, 6));
    }
}