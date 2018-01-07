package src;

import java.util.ArrayList;
import java.util.List;

public class Procedure {
    private int address;
    private int size;
    private List<Integer> arguments;

    public Procedure(int address, int size, List<Integer> arguments){
        this.address = address;
        this.size = size;
        this.arguments = new ArrayList<>(arguments);
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
}
