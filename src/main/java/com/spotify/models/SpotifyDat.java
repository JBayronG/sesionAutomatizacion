package com.spotify.models;

import java.security.PrivateKey;
public class SpotifyDat {
    private String usuario;
    private String pass;

    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public String getPass(){
        return pass;
    }
    public void setPass(String pass){
        this.pass = pass;
    }
}
