package bai6;

import java.util.Arrays;
import java.util.Scanner;

//Nhập một câu không quá 20 từ, mỗi từ không quá 10 ký tự.
// Viết chương trình tách các từ trong câu và in các từ theo thứ tự Alphabet.
public class bai6 {
    public static void main(String[] args) {
        inputsentence();
    }

    private static void inputsentence() {
        System.out.print("Nhap mot cau khong qua 20 tu: ");
        String sentence = new Scanner(System.in).nextLine();
        String[] sentences = sentence.split("\\s+");
        if (sentences.length > 21) {
            System.out.println("qua so luong");
            return;
        }
        for (int k = 0; k < sentences.length; k++) {
            String[] Charss = sentences[k].split("");
            if (Charss.length > 11) {
                System.out.println("qua so luong");
                return;
            }
        }
        Alphabet(sentences);
    }

    private static void Alphabet(String[] sentences) {
        for (int i = 0; i < sentences.length - 1; i++) {
            for (int j = i + 1; j < sentences.length; j++) {
                if (sentences[i].compareTo(sentences[j]) > 0) {
                    String temp = sentences[i];
                    sentences[i] = sentences[j];
                    sentences[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sentences));

    }
}




