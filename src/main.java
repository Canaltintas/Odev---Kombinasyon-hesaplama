import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n,r,k,sum=1,sumN=1,sumR=1;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("N Sayısını Giriniz : ");
            n=input.nextInt();
            System.out.print("R sayısını Giriniz :");
            r = input.nextInt();
            if (r >n){
                System.out.println("R Sayısı N Sayısında küçük veya eşit olmalıdır.");
            }
        }while (r > n);

        k=n-r;
        for (int i=1; i<=n;i++){
            if (i<=k){
                sum *=i;
            }else if (i<=r){
                sumR *=i;
            }
            sumN *=i;
        }



        System.out.println(n+"'nin "+r+"li kombinasyonu "+ ((sumN)/(sum*sumR)));

    }
}
