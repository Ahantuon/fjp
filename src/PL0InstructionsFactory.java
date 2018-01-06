package src;

public class PL0InstructionsFactory {

    public static String getLit(int value){
        return "LIT 0," + value;
    }

    public static String getOpr(int instruction){
        return "OPR 0," + instruction;
    }

    public static String getLod(int address, int value){
        return "LOD " + address + "," + value;
    }

    public static String getSto(int address, int value){
        return "STO " + address + "," + value;
    }

    public static String getCal(int address, int value){
        return "CAL " + address + "," + value;
    }

    public static String getInt(int value){
        return "INT 0," + value;
    }

    public static String getJmp(int value){
        return "JMP 0," + value;
    }

    public static String getJmc(int value){
        return "JMC 0," + value;
    }

    public static String getRet(){
        return "RET 0,0";
    }
}
