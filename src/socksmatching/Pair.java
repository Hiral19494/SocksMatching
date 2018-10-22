/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socksmatching;

/**
 *
 * @author Admin
 */
public class Pair {

    private Sock left;
    private Sock right;

    public Pair(Sock left, Sock right) {
        this.left = left;
        this.right = right;
    }

    public Sock getLeft() {
        return left;
    }

    public void setLeft(Sock left) {
        this.left = left;
    }

    public Sock getRight() {
        return right;
    }

    public void setRight(Sock right) {
        this.right = right;
    }
}
