import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;

        do {
            System.out.println("1이상 80 이하인 원의 크기를 입력하세요 : ");
            size = sc.nextInt(); //정수 입출력 변수
        } while (size <= 1 || size >= 80);

        for (int i = 0; i < size; i++) { //(세로)

            int right = size / 2;  // 우측
            int left = right - 1;  //좌측

            if (i < left) {
                right = right + i;
                left = left - i;
            } else if (i == right || i == left) {
                left = 0;
                right = size - 1;
            } else if (i > right) {
                int t = i - right;
                right = (size - 1) - t;
                left = 0 + t;
            }
            for (int j = 0; j < size; j++) { //(가로)
                if (j == right || j == left) {
                    System.out.print("@");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
    }
}