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
     * Constructor de un vector con tamaño fijo de 10 elementos.
     */
    public VectorMutable()
    {
        this(10);
    }
    
    /**
     * Constructor de un vector con un tamaño indicado por el usuario.
     * @param capacidadInicial tamaño del vector 
     */
    public VectorMutable(int capacidadInicial)
    {
        array = new Object[capacidadInicial];
    }
    
    /**
     * Agrega un elemento al vector. De ser necesario, se agranda el tamaño
     * del vector para que los elementos quepan
     * @param element el elemento a agregar al vector
     */
    public void add(E element)
    {
        adjustArray(posicion+1);
        array[posicion++] = element;
    }
    
    /**
     * Metodo que lee el valor que este en la posicion indicada
     * @param index posicion del elemento dentro del array
     * @return el elemento deseado.
     */  
    public E get(int index)
    {
        return (E)array[index];
    }
    
    /**
    * 
    * @param index
    * @return 
    */
    public E remove(int index)
    {
        E temp = (E)array[index];
        if(posicion < array.length)
        {
            for (int i = index; i < posicion; i++)
            {
                array[i] = array[i+1];
            }
            array[posicion--] = null;
        }
        else
        {
            array[posicion-1] = null;
            posicion--;
        }
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
