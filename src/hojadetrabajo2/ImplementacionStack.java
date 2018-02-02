package hojadetrabajo2;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public class ImplementacionStack<E> implements Stack<E>
{
    
    /**
    * Declaracion de la variable vector de tipo vector mutable para la clase 
    * ImplementacionStack
    */
    protected VectorMutable vector;
    
    /**
    * Declaracion de la variable cont de tipo entero  para la clase 
    * ImplementacionStack
    */
    protected int cont;
    
    /**
     * constructor para la clase ImplementacionStack
     */
    public ImplementacionStack(){
        
        vector = new VectorMutable();
        cont = 0;
    }
    
    /**
     * metodo push que agrega un elemento al stack 
     * @param element 
     */
    @Override
    public void push(E element) 
    {
       vector.add(element);
       cont++;    
    }

    /**
     * metodo pop el cual quita el ultimo elemento del stack y 
     * regresa ese mismo valor 
     * @return 
     */
    @Override
    public E pop() 
    {
       if (cont == 0)
           throw new IllegalStateException("Esta vacio el stack");
       E elementos = (E)vector.remove(cont-1);
       cont--;
       return elementos;
    }

    /**
     * metodo peek el cual revisa la ultima entrada del stack y devuelve el
     * valor 
     * @return 
     */
    @Override
    public E peek()
    {
       if (cont ==0 )
           throw new IllegalStateException("Esta vacio el stack");
       E elementos = (E)vector.get(cont);
       return elementos;
    }

    /**
     * metodo empty que revisa si el stack esta vecio, devolvienco true 
     * si la variable contador es igual a 0, de lo contrario de vuelve
     * false 
     * @return 
     */
    @Override
    public boolean empty() 
    {
        if (cont == 0)
            return true;
        
        return false;
        
        
    }    
       
    /**
     * regresa el valor de la variable contador la cual es la cantidad
     * actual de los elementoz del stack 
     * 
     * @return 
     */
    @Override
    public int size()
    {
       return cont;
    }
    
}
