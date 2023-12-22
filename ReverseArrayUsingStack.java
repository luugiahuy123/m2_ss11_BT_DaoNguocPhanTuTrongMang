package ss11.BT.DaoNguocPhanTuTrongMang;

import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverseArray(array);
        System.out.println("mang sau khi dao nguoc: ");
        for (int num : array){
            System.out.print(num + " ");
        }
    }
    public  static void reverseArray(int[] array){
        Stack<Integer> stack = new Stack<>();
        for (int num : array){
            stack.push(num);
        }
        int index =0;
        while (!stack.isEmpty()){
            array[index++] = stack.pop();
        }
    }
}
