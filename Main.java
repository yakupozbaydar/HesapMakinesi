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
                if(ikinci == 0){
                    System.out.println("bir sayıyı 0'a bölemezsin");
                    break;
                }
                sonuc=birinci/ikinci;
                System.out.println("sonuç:"+ sonuc);
                break;
            default:
                System.out.println("geçersiz islem");
                break;
        }
    giris.close();
    }
}