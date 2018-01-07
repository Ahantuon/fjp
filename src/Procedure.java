package src;

import java.util.ArrayList;
import java.util.List;

public class Procedure {
    private int address;
    private int size;
    private List<Integer> arguments;
    private int returnAddress;

    public Procedure(int address, int size, List<Integer> arguments){
        this.address = address;
        this.size = size;
        this.arguments = new ArrayList<>(arguments);
        this.returnAddress = -1;
    }

    public int getAddress() {
        return address;
    }

    public int getSize() {
        return size;
    }

    public List<Integer> getArguments() {
        return arguments;
    }

    public int getReturnAddress() {
        return returnAddress;
    }

    public void setReturnAddress(int returnAddress) {
        this.returnAddress = returnAddress;
    }
}
