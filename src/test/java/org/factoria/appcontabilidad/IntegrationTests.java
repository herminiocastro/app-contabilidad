package org.factoria.appcontabilidad;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class IntegrationTests {

    @Autowired
    MockMvc api;

    @Test
    public void registrar_ventas_por_400_euros() throws Exception {

        api.perform(post("/asientos?code=701&amount=400"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        "Registrado asiento contable. Importe: 400 EURO. Tipo de cuenta: Ingresos. Código de cuenta: 701. Nombre de cuenta: Ventas de productos terminados"));

    }

    @Test
    public void registrar_provision_por_riesgos_1200_euros() throws Exception {

        api.perform(post("/asientos?code=14&amount=1200"))
                .andExpect(status().isOk())
                .andExpect(content().string(
                        "Registrado asiento contable. Importe: 1200 EURO. Tipo de cuenta: Gastos. Código de cuenta: 14. Nombre de cuenta: PROVISIONES PARA RIESGOS Y GASTOS"));

    }

    // @Test
    // public void test_de_ejemplo() throws Exception {

    // api.perform(get("/books/14"))
    // .andExpect(status().isOk())
    // .andExpect(jsonPath("$title", equalTo("El señor del los anillos")));
    // }
}
