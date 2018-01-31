package hojadetrabajo2;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public class ImplementacionCalculadora implements CalculadoraI
{
    private final String ERROR_CARACTER_INVALIDO = "ERROR: la expresion contiene un caracter invalido.";
    private final String ERROR_OPERANDOS_INSUFICIENTES = "ERROR: operandos insuficientes.";
    private final String ERROR_DIVISION_POR_CERO = "ERROR: divison por cero detectada.";
    private final String ERROR_EXPRESION_INVALIDA = "ERROR: expresion invalida.";
    
    //private Stack<Integer> stack;
    private java.util.Stack<Integer> stack; // para mientras terminamos la implementacion del 
    
    public ImplementacionCalculadora()
    {
        //stack = new ImplementacionStack<>();
        stack = new java.util.Stack<Integer>();
    }
    
    @Override
    public String calcular(String expresion)
    {
        String result = "";
        // procesar cada caracter de la expresion
        for(char c : expresion.toCharArray())
        {
            if(c == ' ') continue; // no se procesan los espacios
            else if(c >= '0' && c <= '9') // el caracter es un digito
            {
                stack.push(Integer.valueOf(String.valueOf(c)));
            }
            // el caracter debe ser un operando, de lo contrario, es un caracter invalido
            else
            {
                // revisar si hay al menos dos operandos en el stack
                if(stack.size() > 1)
                {
                    Integer o1 = stack.pop();
                    Integer o2 = stack.pop();
                    if(c == '+')
                    {
                        stack.push(suma(o1, o2));
                    }
                    else if(c == '-')
                    {
                        stack.push(resta(o1,o2));
                    }
                    else if(c == '*')
                    {
                        stack.push(multiplicacion(o1, o2));
                    }
                    else if(c == '/')
                    {
                        try
                        {
                            stack.push(division(o1, o2));
                        }
                        catch(IllegalArgumentException e)
                        {
                            return ERROR_DIVISION_POR_CERO;
                        }
                    }
                    else
                    {
                        // caracter invalido
                        return ERROR_CARACTER_INVALIDO;
                    }
                }
                else
                {
                    // hay una cantidad insuficiente de operandos
                    return ERROR_OPERANDOS_INSUFICIENTES;
                }
            }
        }
        // el stack deberia contener el resultado como el unico elemento
        if(stack.size() == 1)
            result = String.valueOf(stack.pop());
        // hay un error en la expresion
        else result = ERROR_EXPRESION_INVALIDA;
        return result;
    }
    
    private Integer suma(Integer o1, Integer o2)
    {
        return o1 + o2;
    }
    
    private Integer resta(Integer o1, Integer o2)
    {
        return o1 - o2;
    }
    
    private Integer multiplicacion(Integer o1, Integer o2)
    {
        return o1 * o2;
    }
    
    private Integer division(Integer o1, Integer o2)
            throws IllegalArgumentException
    {
        if(o2 == 0) throw new IllegalArgumentException(
        "Se detecto una division por cero.");
        return o1 / o2;
    }
}
