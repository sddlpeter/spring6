package org.geeksforgeeks.algo;

public class PowerfulNUmber {
    static final int MAX = 100000;
    static int size = 0;
    static int multiply(int x, int res[], int res_size) {

        int carry = 0;

        for (int i = 0; i < res_size; i++) {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry > 0) {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }

    static int[] power(int x, int n) {
        if(n == 0 ){
            System.out.print("1");
            return new int[0];
        }
        int res[] = new int[MAX];
        int res_size = 0;
        int temp = x;


        // 将数字反转，例如： 123 变成 321
        while (temp != 0) {
            res[res_size++] = temp % 10;
            temp = temp / 10;
        }

        // 从 321 的0号位置开始，一次乘以x，计算之后的结果，更新到res数组里
        for (int i = 2; i <= n; i++) {

//            System.out.print(x + ", ");
//            for (int j = 0; j < res_size; j++) {
//                System.out.print(res[j]);
//            }
//            System.out.print(", ");
//            System.out.println(res_size);

            res_size = multiply(x, res, res_size);
        }

//        System.out.print(x + "^" + n + " = ");
//        for (int i = res_size - 1; i >= 0; i--)
//            System.out.print(res[i]);
//        System.out.println();

        size = res_size;
        return res;
    }

    public static void main(String[] args) {
        int exponent = 56277;
        int base = 2;
        int[] res = power(base, exponent);

        // 输出2 ^ 56277 的结果的长度
        System.out.println(base + " ^ " + exponent + " 结果的长度是： " + size);

        System.out.print(base + " ^ " + exponent + " 结果是： ");
        // 打印结果
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(res[i]);
        }
        System.out.println();

        // 计算结果所有的数字相加
        int val = 0;
        for (int i = 0; i < size; i++) {
            val += res[i];
        }
        // 相加所得到的数
        System.out.println("所有数字相加等于： " + val);

        // 如果相加得到的数字 > 10，则继续相加，直到小于10为止
        while (val > 10) {
            int copy = val;
            int sum = 0;
            while (copy > 10) {
                sum += copy % 10;
                copy /= 10;
            }
            sum += copy;
            val = sum;
        }

        System.out.println("最终答案： " + val);
    }
}

