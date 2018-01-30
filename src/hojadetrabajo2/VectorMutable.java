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
}
