package src;

public class Procedure {
    private int address;
    private int size;

    public Procedure(int address, int size){
        this.address = address;
        this.size = size;
    }

    public int getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }
}
