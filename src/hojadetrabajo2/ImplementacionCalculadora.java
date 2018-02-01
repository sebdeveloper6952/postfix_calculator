package hojadetrabajo2;

/**
 *
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Arenas 14470
 */
public class ImplementacionCalculadora implements CalculadoraI
{
    /**
     * Mensaje de error que se muestra cuando la expresion contiene un caracter invalido.
     */
    private final String ERROR_CARACTER_INVALIDO = "ERROR: la expresion contiene un caracter invalido.";
    /**
     * Mensaje de error que se muestra cuando la expresion contiene operandos insuficientes.
     */
    private final String ERROR_OPERANDOS_INSUFICIENTES = "ERROR: operandos insuficientes.";
    /**
     * Mensaje de error que se muestra cuando se trata de hacer una division por cero.
     */
    private final String ERROR_DIVISION_POR_CERO = "ERROR: division por cero detectada.";
    /**
     * Mensaje de error que se muestra cuando la expresion es invalida.
     */
    private final String ERROR_EXPRESION_INVALIDA = "ERROR: expresion invalida.";
    
    private Stack<Float> stack;
    
    /**
     * Regresa una instancia de ImplementacionCalculadora.
     */
    public ImplementacionCalculadora()
    {
        stack = new ImplementacionStack();
    }
    
    /**
     * Procesa la expresion caracter por caracter e intenta evaluarla. Si la
     * expresion es valida, regresa el resultado, de lo contrario se regresa
     * un mensaje de error.
     * @param expresion La expresion que se desea evaluar.
     * @return Resultado de la expresion, o un mensaje de error.
     */
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
                stack.push(Float.parseFloat(String.valueOf(c)));
            }
            // el caracter debe ser un operando, de lo contrario, es un caracter invalido
            else
            {
                // revisar si hay al menos dos operandos en el stack
                if(stack.size() > 1)
                {
                    Float o1 = stack.pop();
                    Float o2 = stack.pop();
                    switch(c)
                    {
                        case '+':
                            stack.push(suma(o1, o2));
                            break;
                        case '-':
                            stack.push(resta(o1,o2));
                            break;
                        case '*':
                            stack.push(multiplicacion(o1,o2));
                            break;
                        case '/':
                            try
                            {
                                stack.push(division(o1,o2));
                            }
                            catch(IllegalArgumentException e)
                            {
                                return ERROR_DIVISION_POR_CERO;
                            }
                            break;
                        default:
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
    
    /**
     * Operacion binaria de suma.
     * @param o1 Operando 1.
     * @param o2 Operando 2.
     * @return Resultado de la operacion suma aplicada a ambos operandos.
     */
    private Float suma(Float o1, Float o2)
    {
        return o1 + o2;
    }
    
    /**
     * Operacion binaria de resta.
     * @param o1 Operando 1.
     * @param o2 Operando 2.
     * @return Resultado de la operacion resta aplicada a ambos operandos.
     */
    private Float resta(Float o1, Float o2)
    {
        return o1 - o2;
    }
    
    /**
     * Operacion binaria de multiplicacion.
     * @param o1 Operando 1.
     * @param o2 Operando 2.
     * @return Resultado de la operacion multiplicacion aplicada a ambos
     * operandos.
     */
    private Float multiplicacion(Float o1, Float o2)
    {
        return o1 * o2;
    }
    
    /**
     * Operacion binaria de division.
     * @param o1 Operando 1.
     * @param o2 Operando 2.
     * @return Resultado de la operacion division aplicada a ambos operandos.
     * @throws IllegalArgumentException 
     */
    private Float division(Float o1, Float o2)
            throws IllegalArgumentException
    {
        if(o2 == 0) throw new IllegalArgumentException(
        "Se detecto una division por cero.");
        return o1 / o2;
    }
}