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
public class Originator {
    private BigInteger state;
    
    public void setState(BigInteger state)
    {
        this.state=state;
    }
    
    public BigInteger getState()
    {
        return state;
    }
    
    public Memento saveStateToMemento()
    {
        return new Memento(state);
    }
    
    public void getStateFromMemento(Memento memento)
    {
        state=memento.getState();
    }
}
