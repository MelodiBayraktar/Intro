public class arrays {
    public static void main(String[] args) {
        int [] arrays = new int[5];
        arrays[0] = 10;
        arrays[1] = 20;
        arrays[2] = 30;
        arrays[3] = 40;
        arrays[4] = 50;

        for (int i = 0; i< arrays.length; i++){
            System.out.println("Dizi[" +  i + "]: " + arrays[i] );
        }

        int[] arrays1= {1,5,8,4};

        int total = 0;
        for (int i= 0; i<arrays1.length; i++){
            total += arrays1[i];
        }
        System.out.println("Dizi elemanlarının toplamı : " + total);

        String[][] cities = new String[3][3];
        cities[0][0] = "İstanbul";
        cities[0][1] = "Kocaeli";
        cities[0][2] = "Sakarya";

        cities[1][0] = "Ankara";
        cities[1][1] = "Konya";
        cities[1][2] = "Kırşehir";

        cities[2][0] = "Diyarbakır";
        cities[2][1] = "Gaziantep";
        cities[2][2] = "Mardin";

        for(int i = 0; i< cities.length; i++){
            for(int j=0; j< cities.length; j++){
                System.out.println("Şehirler : " + cities[i][j]);
            }
        }


        String[] books = {"Java' ya giriş" , "C# ile programlama", "Microservis mimarisi"};
        String[] writers = {"Berk Mamıkoğlu" , "Ayşegül Kadiroğlu", "Büşra Aydın"};
        double[] prices = {55.99, 79.99, 85};

        System.out.println("Kitaplar: ");

        for (int i = 0; i< books.length; i++){
            System.out.println("Kitap adı: " + books[i] + " Yazar: " + writers[i] + " Fiyat: " + prices[i]);
        }

        String[] products = {"Bilgisayar", "Telefon", "Tablet"};
        int[] stocks = {5,100,20};

        int index = 0;
        for(int stock:stocks){
            if(stock> 0 ){
                System.out.println(products[index] + " ürününden " + stock + " adet stok bulunmaktadır");
            }else{
                System.out.println(products[index] + " ürünü stokta bulunmamaktadır");
            }
            index++;
        }
    }
}
