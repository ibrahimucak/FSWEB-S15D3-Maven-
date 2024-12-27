#  Java Maps
### Hedeflerimiz:
1. Employee Sınıfı ve LinkedList Manipülasyonu

Problem: Şirketimizde bazı çalışanlar, aynı ID ile kaydedilmiş. Bu durumu düzeltmek için veri kontrolü yapılacak.
Çözüm:
org.example.entity paketinde Employee sınıfı oluşturulacak. Bu sınıfın 3 özelliği olacak: id, firstname, lastname.
Sınıfın tüm değişkenleri private olacak.
Sınıfın bir tek constructor'ı olacak ve bu constructor 3 parametre alacak.
Main sınıfında, Employee nesnelerinin bulunduğu bir LinkedList tanımlanacak. Aynı çalışan bilgileri tekrar eklenebilir.
findDuplicates metodu ile, aynı çalışanların bulunduğu bir liste döndürülecek.
findUniques metodu ile tekrar eden çalışanlardan sadece bir tanesi ve benzersiz çalışanlar bir HashMap'e eklenip döndürülecek.
removeDuplicates metodu ile aynı veriyi birden fazla kez içeren elemanlar silinip sadece tekil olanlar döndürülecek.
2. Kelime Sayma Projesi

Problem: Verilen metin içerisindeki her kelimenin kaç kez tekrar ettiğini bulmamız gerekiyor.
Çözüm:
WordCounter sınıfı oluşturulacak.
calculateWord metodu, verilen metin içerisindeki her kelimenin frekansını hesaplayacak.
Bu işlem, zaman karmaşıklığı açısından O(n) olmalı.
Her kelimeyi ve tekrar sayısını tutmak için bir Map<String, Integer> kullanılacak.
Teknik Gereksinimler ve Uygulama:

Projede LinkedList ve HashMap kullanımı zorunludur.
Bu iki yapıyı etkin kullanarak, çalışan verileri üzerinde işlem yapılacak ve kelime sayımı yapılacaktır.











