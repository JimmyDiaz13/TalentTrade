
package com.mycompany.talenttrade;

import controlador.ControladorLogin;
import modelo.Conexion;
import vista.VistaLogin;

public class TalentTrade {

    public static void main(String[] args) {
        Conexion cxn = new Conexion();
        cxn.getCon();
        VistaLogin vistaLogin = new VistaLogin();
        ControladorLogin control = new ControladorLogin(vistaLogin);
        control.iniciarControl();
    }
}

