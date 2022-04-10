import java.util.Scanner;

class Main{
    public static void main(String [] args){
        char islem;
        int birinci,ikinci,sonuc;

        Scanner giris = new Scanner (System.in);

        System.out.println("işlem seçini: + , / ");
        islem = giris.next().charAt(0);
        System.out.println("ilk sayıyı girin:");

        birinci = giris.nextInt();

        System.out.println("ikinci sayıyı girin:");

        ikinci = giris.nextInt();

        switch (islem) {
            case '+':
                sonuc=birinci+ikinci;
                System.out.println("sonuç:"+ sonuc);
                break;
            case '/':
                sonuc=birinci/ikinci;
                System.out.println("sonuç:"+ sonuc);
                break;
            default:
                System.out.println("Invalid /!");
                break;
        }
    giris.close();
    }
}