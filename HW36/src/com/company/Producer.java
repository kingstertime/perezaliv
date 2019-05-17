//package com.company;
//
//class Producer extends Thread {
//
//    public void run() {
//        while (true) {
//
//            synchronized (product) {
//                while (!product.isUsed()) {
//                    try {
// wait временно снимает блокировку product.wait();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//                product.produce();
//                product.notify();
//            }
//        }
//    }
//}
