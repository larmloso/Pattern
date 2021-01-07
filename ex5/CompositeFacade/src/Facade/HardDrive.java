

public class HardDrive {
    
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive is reading...");
        return hexStringToByteArray("e04fd020ea3a6910");
    }

    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
}
