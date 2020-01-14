package day15.test7;

public class Ticketbean {
    private String name;
    private int num;

    public Ticketbean() {
    }

    public Ticketbean(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
