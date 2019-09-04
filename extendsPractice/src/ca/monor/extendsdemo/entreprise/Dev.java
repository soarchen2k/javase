package ca.monor.extendsdemo.entreprise;

public class Dev extends Employee {
    private int lines;

    public Dev(String id, String name, double salary, int lines) {
        super(id, name, salary);
        this.lines = lines;
    }

    public int getLines() {
        return lines;
    }

    public void setLines(int lines) {
        this.lines = lines;
    }

    @Override
    public String toString() {
        return super.toString() +
                " , lines= " + lines;
    }

    public void work() {
        System.out.println("Coding");
    }
}
