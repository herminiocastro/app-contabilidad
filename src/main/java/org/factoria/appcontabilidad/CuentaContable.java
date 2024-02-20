package org.factoria.appcontabilidad;

public class CuentaContable {

    public String nombreDeCuenta(int code) {

        switch (code) {
            case 14:
                return "PROVISIONES PARA RIESGOS Y GASTOS";
            case 142:
                return "PROVISIÓN PARA RESPONSABILIDADES";
            case 150:
                return "OBLIGACIONES Y BONOS";
            case 300:
                return "MERCADERIAS";
            default:
                return "";
        }
    }

    public Integer codigoDeLaCuenta(String nombre) {

        if (nombre == "PROVISIONES PARA RIESGOS Y GASTOS") {
            return 14;
        }
        return 142;

    }

}
