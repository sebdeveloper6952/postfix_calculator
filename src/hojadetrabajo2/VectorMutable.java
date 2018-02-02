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
    /**
     * Arreglo que el vector usa para guardar elementos
     */
    protected Object[] array;
    
    /**
     * variable que apunta a la primera posicion valida del vector
     */
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
    * Este metodo guarda el elemento en la posicion indicada en una variable 
    * temporal para poder sobreescribirlo despues. Luego mueve todos los 
    * elementos del array una posicion a la izquierda para "llenar el espacio 
    * vacio" que quedo en el array.
    * @param index posicion del elemento que se quiere eliminar del array
    * @return el elemento que se elimino del array
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
     * Metodo que verifica si el array no tiene ningun elemento 
     * @return Regresa true si el array esta vacio, y false en el caso contrario
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
     * Metodo que indica cuantos elementos tiene el vector
     * @return el tamaño del vector
     */
    public int size()
    {
        return posicion;
    }
    
    /**
     * Metodo que duplica el tamaño del vector si este esta lleno, y se quiere
     * agregar un nuevo elemento
     * @param newCapacity cantidad de elementos que se quiere asegurar que 
     * quepan en el vector
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
