/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube;

/**
 *
 * @author jafet mtz
 */
public class Youtube {

    public static void main(String[] args) {
        Usuario usuario= new Usuario("amayrani");
        Video video= new Video("aprendiendo java",2400,"http;//amayrani.com");
        usuario.subirVideo(video);
        usuario.mostrarInfoUsuario();
    }
}
