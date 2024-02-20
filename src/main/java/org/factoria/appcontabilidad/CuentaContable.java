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

        switch (nombre) {
            case "PROVISIONES PARA RIESGOS Y GASTOS":
                return 14;
            case "PROVISIÓN PARA RESPONSABILIDADES":
                return 142;
            case "OBLIGACIONES Y BONOS":
                return 150;
            case "MERCADERIAS":
            return 300;
            default:
                return 0;
        }

    }

}
