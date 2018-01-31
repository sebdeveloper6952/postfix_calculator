package hojadetrabajo2;

import java.util.AbstractList;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public class ImplementacionStack<E> implements Stack<E>
{
    protected VectorMutable vector;
    
    @Override
    public void push(E element) 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E pop() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E peek()
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean empty() 
    {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public int size()
    {
        return vector.size();
    }
    
}
