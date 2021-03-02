class Xprinter extends Printer {

    public Xprinter(String brand, int id){
        this.brand = brand;
        this.id = id;
    }

    public void ShowInfo(){
        System.out.println("Brand :" + brand + ", id :" + id);
    }
}