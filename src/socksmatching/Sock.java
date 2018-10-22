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
class Sock {
    private String index;
    private String colour;
    private String positions;
    private boolean isPaired;

    
    public Sock(String index, String colour, String position) {
        this.index = index;
        this.colour = colour;
        this.positions = position;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getPosition() {
        return positions;
    }

    public void setPosition(String position) {
        this.positions = position;
    }

    public boolean isIsPaired() {
        return isPaired;
    }

    public void setIsPaired(boolean isPaired) {
        this.isPaired = isPaired;
    }
}
