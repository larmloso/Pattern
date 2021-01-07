

public class ComputerFacade {

    private CPU processor;
    private Memory ram;
    private HardDrive hd;
    private long BOOT_ADDRESS = 123456;
    private long BOOT_SECTOR = 1234;
    private int SECTOR_SIZE = 4;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hd = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }
}
