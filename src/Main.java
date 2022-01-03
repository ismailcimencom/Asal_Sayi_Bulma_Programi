import java.util.Scanner;
public class Main {
    static int asal(int number,int i){
        if (i==1){
            return 1;
        }
        else {
            if (number%2==0||number%3==0||number%5==0){
                return 0;
            }
            else {
                return asal(number,i-1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int number= inp.nextInt();
        int prime=asal(number,number/2);
        if (prime==1){
            System.out.println("Asal Sayıdır...");

        }
        else {
            System.out.println("Asal Sayı DEĞİLDİR!!!");
        }
    }
}