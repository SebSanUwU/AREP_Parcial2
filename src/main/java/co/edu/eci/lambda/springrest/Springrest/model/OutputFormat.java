package co.edu.eci.lambda.springrest.Springrest.model;

public class OutputFormat {
    private String operation;
    private String inputlist;
    private  String value;
    private  String output;

    public OutputFormat(String operation, String inputlist, String value, String output) {
        this.operation = operation;
        this.inputlist = inputlist;
        this.value = value;
        this.output = output;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getInputlist() {
        return inputlist;
    }

    public void setInputlist(String inputlist) {
        this.inputlist = inputlist;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
