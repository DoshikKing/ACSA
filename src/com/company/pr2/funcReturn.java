package com.company.pr2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface funcReturn extends Remote {
    String printResult(double a, double b, double c) throws RemoteException;
}
