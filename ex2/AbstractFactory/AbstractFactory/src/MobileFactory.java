

public class MobileFactory {
    public static Mobile createMobile(MobileAbstractFactory maf){
        return maf.createMobile();
    }
}
