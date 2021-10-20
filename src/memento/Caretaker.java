/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BenjaminFamily
 */
public class Caretaker {
    private List<Memento> mementoList=new ArrayList<Memento>();
    
    public void add(Memento state)
    {
        mementoList.add(state);
        //System.out.println(mementoList.size());
    }
    
    public Memento get(int index)
    {
        return mementoList.get(index);
    }
}