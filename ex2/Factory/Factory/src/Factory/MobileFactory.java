package Factory;

/*
Class MobileFactory
author: Wasana Ngaogate
*/
public class MobileFactory {
    
    public static Mobile createMobile(String type){
        
        /*
            It is easier to add more types of Mobile & config them here
        */
        if(type.equals(Mobile.SmartPhone)){
            return new SmartPhone("Asus", 3000, true);
        }else if(type.equals(Mobile.Tablet)){
            return new Tablet("Samsung", 5000);
        }else{
            return null;
        }
    }
    
}
