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
    protected int posicion;
    
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
        array[posicion++] = element;
        
    }
    
    public void add(E element, int index)
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public E get(int index)
    {
        return (E)array[index];
    }
    
    // EXTRA
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
        E temp = (E)array[index];
        for (int i = index; i < posicion; i++)
        {
            array[i] = array[i+1];
        }
        array[posicion--] = null;
        return temp;
    }
    
    /**
     * 
     * @return 
     */
    public boolean isEmpty()
    {
        if(posicion == 0)
        {
            return true;
        }
        else return false;
    }
    
    /**
     * 
     * @return 
     */
    public int size()
    {
        return posicion;
    }
    
    /**
     * 
     */
    protected void adjustArray(int newCapacity)
    {
        if(newCapacity > array.length)
        {
            Object[] nuevoArray = new Object[newCapacity*2];
            for(int i = 0; i < array.length; i++)
            {
                nuevoArray[i] = array[i];
            }
            array = nuevoArray;
        }
    }
}
