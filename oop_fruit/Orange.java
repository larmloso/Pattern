class Orange extends Fruit implements Fruitable {

    private double number;
    private double price;

    Orange(String name, String color, double number, double price){
        this.name = name;
        this.color = color;
        this.number = number;
        this.price = price;
    }
    
    public void showdata(){
        System.out.println("ชือผลไม้ : "+ name + "  สี : " +  color);
    }

    public void getPrice(){
        System.out.println( "จำนวน  : " + number + " กก.  ราคา  " + (number * price) + " บาท" );
    }
}