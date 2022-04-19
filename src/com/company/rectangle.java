package com.company;

public class rectangle {
    public int side_1;
    public int side_2;
    public  int side_3;
    public int side_4;

    public int P;

    public rectangle(int side_1, int side_2, int side_3, int side_4) {
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
        this.side_4 = side_4;
    }

    public int getSide_1() {
        return side_1;
    }

    public void setSide_1(int side_1) {
        this.side_1 = side_1;
    }

    public int getSide_2() {
        return side_2;
    }

    public void setSide_2(int side_2) {
        this.side_2 = side_2;
    }

    public int getSide_3() {
        return side_3;
    }

    public void setSide_3(int side_3) {
        this.side_3 = side_3;
    }

    public int getSide_4() {
        return side_4;
    }

    public void setSide_4(int side_4) {
        this.side_4 = side_4;
    }

    public int getP(){
        return side_1+side_2+side_3+side_4;
    }
}
