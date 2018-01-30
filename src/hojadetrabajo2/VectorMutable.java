/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo2;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 * 
 * Esta clase implementa un vector mutable. Dependiendo de las necesidades de
 * espacio, el vector crece o se acorta. Es una clase con un tipo generico,
 * el cual se define en el momento de instanciar.
 */
public class VectorMutable<E>
{
    protected Object[] array;
    
    /**
     * 
     */
    public VectorMutable()
    {
        this(10);
    }
    
    /**
     * 
     * @param capacidadInicial 
     */
    public VectorMutable(int capacidadInicial)
    {
        array = new Object[capacidadInicial];
    }
    
    /**
     * 
     * @param element 
     */
    public void add(E element)
    {
        
    }
    
    public void add(E element, int index)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public E get(int index)
    {
        return null;
    }
    
    public E remove(E element)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * 
     * @param index
     * @return 
     */
    public E remove(int index)
    {
        return null;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isEmpty()
    {
        return array.length == 0;
    }
    
    /**
     * 
     * @return 
     */
    public int size()
    {
        return array.length;
    }
    
    /**
     * 
     */
    protected void adjustArray()
    {
        
    }
}
