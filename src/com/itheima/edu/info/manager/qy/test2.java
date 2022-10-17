package com.itheima.edu.info.manager.qy;

public class test2 {
    public static void main(String[] args) {
        userhandle(new useRandomNumHandler() {
            @Override
            public int getint() {
                return 1;
            }
        });
        userhandle(()->{return 1;});

    }
    public static void userhandle(useRandomNumHandler handler){
        handler.getint();
    }
}

interface useRandomNumHandler{
    public abstract int getint();
}
