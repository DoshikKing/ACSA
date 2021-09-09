package com.company.pr1;

public class PingPongThread implements  Runnable {

    private Object SyncObject;
    private String name;

    public PingPongThread(Object SyncObject, String name) {
        this.SyncObject = SyncObject;
        this.name = name;
    }

    @Override
    public void run() {
        synchronized (SyncObject) {
            while(true) {
                System.out.println(name);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                SyncObject.notify();

                try {
                    SyncObject.wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
