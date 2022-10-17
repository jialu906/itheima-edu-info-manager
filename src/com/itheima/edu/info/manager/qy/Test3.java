package com.itheima.edu.info.manager.qy;

import java.math.BigDecimal;
import java.util.Objects;

public class Test3 {
    public static void main(String args[]){
        Test3 t=new Test3();
        t.Test3();
    }
    public void Test3() {
        StringBuilder sb = new StringBuilder();
        sb.equals("12");
        BigDecimal db = null;
        BigDecimal db2 = null;
        try {
            db = new BigDecimal(10);
            db2 = new BigDecimal(1);
            throw new AgeOutException("age++");
        } catch (AgeOutException e) {
            System.out.println(e.toString());
        }
        db.add(db2);
    }
}
