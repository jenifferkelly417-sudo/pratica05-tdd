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
assertThrows(IllegalArgumentException.class,
() -> calc.calcularNotaFinal(20, 35, 30));
assertThrows(IllegalArgumentException.class,
() -> calc.calcularNotaFinal(20, 20, 45));
assertThrows(IllegalArgumentException.class,
() -> calc.calcularNotaFinal(-20, 20, 30));
//assertThrows(IllegalArgumentException.class,
//() -> calc.calcularNotaFinal(30, 30, 40));


}
@Test
void deveAprovarComNotaEFrequenciaSuficientes() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals("APROVADO", calc.situacao(80, 90));
}

@Test
void deveReprovarPorNota() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals("REPROVADO POR NOTA", calc.situacao(60, 90));
}

@Test
void deveReprovarPorFaltaMesmoComNotaAlta() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals("REPROVADO POR FALTA", calc.situacao(95, 74));
}

@Test
void deveReprovarPorFaltaComNotaBaixa() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals("REPROVADO POR FALTA", calc.situacao(50, 60));
}
@Test
void devePermitirAIQuandoA1MaisA3Atinge40() {
    CalculadoraNota calc = new CalculadoraNota();
    assertTrue(calc.podeFazerAI(10, 20, 30, 80));
}

@Test
void devePermitirAIQuandoA2MaisA3Atinge40() {
    CalculadoraNota calc = new CalculadoraNota();
    assertTrue(calc.podeFazerAI(10, 5, 30, 80));
}

@Test
void naoDevePermitirAISeJaEstiverAprovado() {
    CalculadoraNota calc = new CalculadoraNota();
    assertFalse(calc.podeFazerAI(25, 25, 30, 80));
}

@Test
void naoDevePermitirAIComFrequenciaBaixa() {
    CalculadoraNota calc = new CalculadoraNota();
    assertFalse(calc.podeFazerAI(10, 20, 30, 70));
}

@Test
void naoDevePermitirAISeNenhumaSomaAtingir40() {
    CalculadoraNota calc = new CalculadoraNota();
    assertFalse(calc.podeFazerAI(5, 5, 30, 80));
}
@Test
void deveSubstituirA1QuandoForAMenor() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals(75, calc.aplicarAI(10, 20, 30, 25));
}

@Test
void deveSubstituirA2QuandoForAMenor() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals(75, calc.aplicarAI(20, 10, 30, 25));
}

@Test
void naoDeveSubstituirQuandoAINaoForMaior() {
    CalculadoraNota calc = new CalculadoraNota();
    assertEquals(60, calc.aplicarAI(10, 20, 30, 5));
}

@Test
void deveRejeitarAINegativa() {
    CalculadoraNota calc = new CalculadoraNota();

    assertThrows(
        IllegalArgumentException.class,
        () -> calc.aplicarAI(10, 20, 30, -1)
    );
}
}