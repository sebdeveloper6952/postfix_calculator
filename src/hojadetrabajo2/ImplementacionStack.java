package hojadetrabajo2;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public class ImplementacionStack<E> implements Stack<E>
{
    protected VectorMutable vector;
    protected int cont;
    public ImplementacionStack(){
        
        vector = new VectorMutable(2);
        cont = 0;
    }
    
    @Override
    public void push(E element) 
    {
       vector.add(element);
       cont++;    
    }

    @Override
    public E pop() 
    {
       if (cont == 0)
           throw new IllegalStateException("Esta vacio el stack");
       E elementos = (E)vector.remove(cont-1);
       cont--;
       return elementos;
    }

    @Override
    public E peek()
    {
       if (cont ==0 )
           throw new IllegalStateException("Esta vacio el stack");
       E elementos = (E)vector.get(cont);
       return elementos;
    }

    @Override
    public boolean empty() 
    {
        if (cont == 0)
            return true;
        
        return false;
        
        
    }    
       
    
    @Override
    public int size()
    {
       return cont;
    }
    
}
