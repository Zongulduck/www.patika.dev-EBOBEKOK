import java.util.Scanner;
public class EBOBEKOK {
    public static void main(String[]args){
        Scanner inp=new Scanner(System.in);
        int secim,ebob=1,ekok,say1=0,say2 = 0,ebobs,sayac1=1;
        System.out.println("Ebob-Ekok hesaplayıcıya hoşgeldiniz\n"+"lütfen seçim yapın\n"+"1-Ebob\n"+"2-Ekok");

        secim= inp.nextInt();
        if(secim==1){
            System.out.println("İlk Sayıyı giriniz:");
            say1= inp.nextInt();
            System.out.println("İkinci Sayıyı giriniz");
            say2=inp.nextInt();
            do {
                if(say1%sayac1==0 && say2%sayac1==0){
                    ebob=sayac1;
                }
                sayac1++;
            }while (sayac1<say1);
            System.out.println("Ebob: "+ebob);
        }
        else if(secim==2) {
            System.out.println("İlk Sayıyı giriniz:");
            say1= inp.nextInt();
            System.out.println("İkinci Sayıyı giriniz");
            say2=inp.nextInt();
            do {
                if(say1%sayac1==0 && say2%sayac1==0){
                    ebob=sayac1;
                }
                sayac1++;
            }while (sayac1<say1);
            ekok=(say1*say2)/ebob;
            System.out.println("Ekok: "+ekok);
            }
        if(secim<1 || secim>2){
            System.out.println("Hatalı seçim yaptınız lütfen yeniden başlatın!");
        }
        }
            }

