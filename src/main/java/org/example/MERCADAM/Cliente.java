package org.example.MERCADAM;

public class Cliente {
    private String usuario;
    private String contrasena;
    private String direccion;
    Pedido pedido;
    boolean promociones;

    public Cliente(String usuario, String contrasena, String direccion, Pedido pedido) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.pedido = pedido;
        this.promociones = false;
    }
}
