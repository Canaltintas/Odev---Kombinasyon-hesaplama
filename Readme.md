# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Ödev - Java ile Kombinasyon Hesaplayan Program
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

## Programın Çalışması
- kullanıcıdan bir n ve r değeri alınır
- Kombinasyonun mantığından ötürü n >= r olmalıdır. bu durum do-while döngüsü ile kontrol ettirilir ve kural sağlanan kadar kullanıcıdan veri alınır.
- Şart sağladıktan sonra n değişkeninden r değişkeni çıkartılır ve sonuç üçüncü(k) bir değişkene atanır.
- for döngüsü oluşturulur ve i sayısı en büyük değişken olan n'e eşit olana kadar çalıştırılır.
- döngü içerisinde i sayının r ve k değişkenine eşitliği kontrol edilir.eşit sağlandığında iki değişkende fazladan bir çarpma işlemi yapılmamasının önüne geçilir 
Ör:n=5,r=4 olduğunda k=1 olur. bu durumda i değeri 1'den 5'e kadar değer alacaktır ancak bir if şartıyla i değeri r değerine geldiğinde r için çarpma 
işlemi biter. yani r =1*2*3*4 olur ve döngü i=5 ile n değerini 5! olacak şekilde sürdürür.

- Döngü tamamlandıktan sonra kombinasyon formülü olan n!/(r)!*(n-r)! işlemi gerçekleştirilir ve sonuç ekrana yazdırılır.