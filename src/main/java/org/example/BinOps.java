package org.example;

import static java.lang.Integer.parseInt;

public class BinOps {
    public enum Type {SUM, MULT}

    public String sum(String a, String b) {
        String sum = Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
        return sum;
    }

    public String mult(String a, String b) {
        String mult = Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
        return mult;
    }

    public void result(Type type, String a, String b) {
        if (Type.SUM == type) {
            System.out.println(sum(a, b));
        } else if (Type.MULT == type) {
            System.out.println(mult(a, b));
        }
    }

}
