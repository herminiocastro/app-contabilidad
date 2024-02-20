package org.factoria.appcontabilidad.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/asientos")
public class CuentaContableController {

    @PostMapping
    // "/asientos?code=14&amount=1200"
    public String nuevoAsiento(
            @RequestParam(name = "code", required = true) Integer code,
            @RequestParam(name = "amount", required = true) Integer amount) {

        System.out.println("Me han pasado " + code + " y " + amount);

        return "Registrado asiento contable. Importe: 400 EURO. Tipo de cuenta: Ingresos. Código de cuenta: 701. Nombre de cuenta: Ventas de productos terminados";
    }
}
