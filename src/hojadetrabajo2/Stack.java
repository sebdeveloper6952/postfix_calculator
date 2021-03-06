package hojadetrabajo2;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public interface Stack<E>
{
    /**
     * 
     */
    public void push(E element);
    
    /**
     * 
     * @return 
     */
    public E pop();
    
    /**
     * 
     * @return 
     */
    public E peek();
    
    /**
     * 
     * @return 
     */
    public boolean empty();
    
    
    /**
     * 
     * @return 
     */
    public int size();
}
