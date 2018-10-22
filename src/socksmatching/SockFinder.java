/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socksmatching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
class SockFinder {
     String socksString;

    private ArrayList<Sock> sockDataArrayList;
    private ArrayList<Pair> pairedSockArrayList;
    private ArrayList<Sock> singleSockArrayList;

    public SockFinder(String socksString) {
        if (socksString == null || socksString.trim().equals("")) {
            throw new UnsupportedOperationException("Sock string input is not valid");
        }
        this.socksString = socksString;
    }

    public void findSocks() {
        prepateData();
        findPairedSocks();
        findUnpairedSocks();
        printResult();
    }

    private void prepateData() {
        sockDataArrayList = new ArrayList<>();
        ArrayList<String> singleSockStrArrayList = new ArrayList<String>(Arrays.asList(socksString.split(",")));
        for (String singleSockStr : singleSockStrArrayList) {
            String[] sockData = singleSockStr.split("/");
            Sock sock = new Sock(sockData[0], sockData[1], sockData[2]);
            sockDataArrayList.add(sock);
        }
        System.err.println("Total socks = " + sockDataArrayList.size());
    }

    private void findPairedSocks() {
        pairedSockArrayList = new ArrayList<>();

        for (Sock sock1 : sockDataArrayList) {
            for (Sock sock2 : sockDataArrayList) {
                // Conditions:
                // is already paired
                // index is not same
                // colour should be same
                // both position should be different
                if (!sock1.isIsPaired()
                        && !sock2.isIsPaired()
                        && !sock1.getIndex().equals(sock2.getIndex())
                        && sock1.getColour().equals(sock2.getColour())
                        && !sock1.getPosition().equals(sock2.getPosition())) {
                    sock1.setIsPaired(true);
                    sock2.setIsPaired(true);
                    pairedSockArrayList.add(new Pair(sock1, sock2));
                }
            }
        }
    }

    private void findUnpairedSocks() {
        singleSockArrayList = new ArrayList<>();
        for (Sock sock : sockDataArrayList) {
            if (!sock.isIsPaired()) {
                singleSockArrayList.add(sock);
            }
        }
        singleSockArrayList.sort(new Comparator<Sock>() {
            @Override
            public int compare(Sock sock1, Sock sock2) {
                return sock1.getColour().compareTo(sock2.getColour());
            }
        });
    }

    private void printResult() {
        for (Pair pair : pairedSockArrayList) {
            System.err.println("pair = " + pair.getLeft().getIndex()
                    + " " + pair.getRight().getIndex());
        }

        for (Sock sock : singleSockArrayList) {
            System.err.println("single = " + sock.getIndex());
        }
    }
}

