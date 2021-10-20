/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.math.BigInteger;

/**
 *
 * @author BenjaminFamily
 */
public class Memento {
    private BigInteger state;
    
    public Memento(BigInteger state)
    {
        this.state=state;
    }
    
    public BigInteger getState()
    {
        return state;
    }
}
