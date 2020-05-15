import java.util.Random;

public class ArrayExample {
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[50];
        System.out.println("Danh sách phần tử của mảng: " );
        for (int i = 0; i < 50; i++) {
            arr[i] = rd.nextInt(50);
            System.out.print(arr[i]+ " ");
        }
        return arr;
    }
}
