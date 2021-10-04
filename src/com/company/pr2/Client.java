package com.company.pr2;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    private Client(){}
    public static void main(String[] args){
        try{
            Registry registry = LocateRegistry.getRegistry(2732);

            funcReturn stub = (funcReturn) registry.lookup("func");

            System.out.println(stub.printResult(1, -8 ,15));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
