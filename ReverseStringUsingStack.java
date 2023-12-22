package ss11.BT.DaoNguocPhanTuTrongMang;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "hello world";
        String reversedString = reverseString(input);
        System.out.println("chuoi sau khi dao nguoc: " + reversedString);
    }
    public static String reverseString(String input){
        Stack<Character> stack = new Stack<>();
        // khai bao Stack voi kieu Character

        for (char c : input.toCharArray()){
            // toCharArray chuyen doi chuoi thanh cac ky tu rieng le
            stack.push(c);
            // dua tung ky tu trong c vao dinh stack
        }
        StringBuilder reverseString = new StringBuilder();
        while (!stack.isEmpty()){
            // Kiem tra xem stack co rong hay ko
            reverseString.append(stack.pop());
        }
        return reverseString.toString();
        // toString chuyen doi 1 doi tuong thanh 1 chuoi
    }
}
