
public class Main {
    public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++){
//            if (i % 2 != 0){
//                continue;
//            }
//            System.out.println("Уволен айтишник с id " + i);
//
//        }
        int i = 1;
        while (i <= 100){
            if(i % 2 != 0){
                i++;
                continue;
            }
            System.out.println("Уволен айтишник с id " + i);
            i++;
        }
    }
}