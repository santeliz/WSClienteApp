/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wscliente;

/**
 *
 * @author JAVA
 */
public class ClienteWS {

    public static void main(String[] args) {
        System.out.println(agregarUser("Adriana", "987"));
    }
    
    private static String agregarUser(java.lang.String usuario, java.lang.String pass) {
        wscliente.WSAgregarUsuarios_Service service = new wscliente.WSAgregarUsuarios_Service();
        wscliente.WSAgregarUsuarios port = service.getWSAgregarUsuariosPort();
        return port.agregarUser(usuario, pass);
    }
    
}
