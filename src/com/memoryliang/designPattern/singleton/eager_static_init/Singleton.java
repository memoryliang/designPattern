//package com.memoryliang.designPattern.singleton.eager_static_init;
//
//public class Singleton {
//    private Singleton instance = null;
//    static {
//        instance = new Singleton();
//    }
//    private Singleton (){}
//    public static Singleton getInstance() {
//        return this.instance;
//    }
//}