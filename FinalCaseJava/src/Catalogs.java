public class Catalogs {
    double currencyRate = 18.62;
    int price;
    int discountRate;
    int inStock;
    String model;
    int memory;
    int screenSize;
    int[] batteryCapacity={3500,4000,4500,5000,5500};
    int ram;
    String[] color= {"Kırmızı", "Siyah", "Mavi"};
    String brandInfo;

    Catalogs(String brandInfo,String[] color,int price,
             int discountRate, int inStock, String name,
             int memory,int screenSize,int ram,
             int[] batteryCapacity){

        this.price =price;
        this.discountRate=discountRate;
        this.inStock =inStock;
        this.model  = name;
        this.brandInfo = brandInfo;
        this.color =color;
        this.memory=memory;
        this.screenSize=screenSize;
        this.ram=ram;
        this.batteryCapacity=batteryCapacity;

    }

    static void mobilePhones(String model, String brandInfo){

    }

}
