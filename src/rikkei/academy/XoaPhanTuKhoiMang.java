package rikkei.academy;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner arrayN = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        System.out.println("Phần tử trong mảng là:\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nNhập vào số cần xóa:");
        int target = arrayN.nextInt();
        for (int i = 0; i < array.length; i++) {
            int indexDel = 0;
            if (target != 0) {
                if (target == array[i]) {
                    indexDel = i;
                    for (int j = indexDel; j < array.length; j++) {
                        if ( j != array.length-1){
                            array[j] = array[j + 1];
                        } else {
                            array[j] = 0;
                        }
                    }
                }
            }
        }
        System.out.println("Phần tử trong mảng mới là:\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
