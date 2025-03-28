package co.edu.eci.AREPPARCIAL2;

public class MathModel {
    private String operation;
    private String list;

    private String value ;

    private int output;
    public MathModel(String operation, String list, String value, int output){
        this.output=output;
        this.list=list;
        this.value=value;
        this.operation=operation;
    }
    public MathModel(){

    }

    public int getOutput() {
        return output;
    }

    public String getList() {
        return list;
    }

    public String getOperation() {
        return operation;
    }

    public String getValue() {
        return value;
    }

    public void setList(String list) {
        this.list = list;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setOutput(int output) {
        this.output = output;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
