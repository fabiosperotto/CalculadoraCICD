
package com.mycompany.calculadoracicd;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraTest {
    
    private final Calculadora calculadora = new Calculadora();        

    @Test
    public void testSomarCorretamenteDoisInteiros() {
        assertEquals(5, this.calculadora.somar(2, 3), "teste deveria retornar 5 ao somar 2 com 3");        
    }

    
    
}
