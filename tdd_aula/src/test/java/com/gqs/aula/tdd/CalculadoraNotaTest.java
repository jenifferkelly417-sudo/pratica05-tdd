package com.gqs.aula.tdd;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraNotaTest {
// os testes vêm aqui
@Test
void deveSomarAsTresNotas() {
CalculadoraNota calc = new CalculadoraNota();
double resultado = calc.calcularNotaFinal(20, 20, 30);
assertEquals(70, resultado);
}
@Test
void deveSomarOutrasNotas() {
CalculadoraNota calc = new CalculadoraNota();
double resultado = calc.calcularNotaFinal(10, 15, 25);
assertEquals(50, resultado);
}
@Test
void deveAprovarComNota70() {
CalculadoraNota calc = new CalculadoraNota();
assertTrue(calc.estaAprovadoPorNota(70));
}

@Test
void deveReprovarComNota69() {
    CalculadoraNota calc = new CalculadoraNota();
    assertFalse(calc.estaAprovadoPorNota(69));
}

@Test
void deveRejeitarA1MaiorQue30() {
    CalculadoraNota calc = new CalculadoraNota();
    assertThrows(IllegalArgumentException.class,
    () -> calc.calcularNotaFinal(35, 20, 30));

}

@Test
void deveRejeitarA2inválida() {
    CalculadoraNota calc = new CalculadoraNota();
    assertThrows(IllegalArgumentException.class,
    () -> calc.calcularNotaFinal(20, 35 ,30));

}

@Test
void deveRejeitarA3inválida() {
    CalculadoraNota calc = new CalculadoraNota();
    assertThrows(IllegalArgumentException.class,
    () -> calc.calcularNotaFinal(20, 20, 50));

}

@Test
void deveRejeitarA1Negativa() {
    CalculadoraNota calc = new CalculadoraNota();
    assertThrows(IllegalArgumentException.class,
    () -> calc.calcularNotaFinal(-20, 20, 30));

}

@Test
void maximasvalem() {
    CalculadoraNota calc = new CalculadoraNota();
    assertThrows(IllegalArgumentException.class,
    () -> calc.calcularNotaFinal(31, 31, 41));

}

@Test 
    void deveAprovarComNotaEFrequenciaSuficiente(){
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals("APRAVADO", calc.situacao(80,75));
    
}
@Test 
    void deveReprovarcomNotaBaixa(){
        CalculadoraNota calc = new CalculadoraNota();
        assertEquals( "REPROVADO", calc.situacao(60, 75));

    }
    @Test 
    void deveReprovarPorFrequenciaMesmoComNotaAlta() {
        CalculadoraNota calc = new CalculadoraNota();
        assertEquals( "REPROVADO", calc.situacao(80, 60));
}
@Test 
void deveAprovarComFrequenciaExatamente75 (){
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals("APROVADO", calc.situacao(80, 75));
}
} 