package codetest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class gugudan {
    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.print("단 수 입력: ");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int dan = Integer.parseInt(br.readLine());

            if (dan == 999) {
                System.out.println("프로그램 종료");
                break;
            }
            if (dan < 1 || dan > 20) {
                continue;
            }

            int getRow = 0;

            if (dan % 3 == 0) {
                getRow = dan / 3;
            } else {
                getRow = (dan / 3) + 1;
            }

            int idx = 1;
            for (int i = 1; i <= getRow; i++) {
                for (int j = 1; j < 10; j++) {
                    for (int k = 0; k < 3; k++) {
                        System.out.print(i + k + " * " + j + " = " + ((i + k) * j) + "    ");
                        idx++;
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }


    }
}
