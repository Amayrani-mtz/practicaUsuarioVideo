/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.youtube;

/**
 *
 * @author jafet mtz
 */
public class Visualizacion {
    Usuario Espectador;
    Video video;
    public Visualizacion () {
    }
    public Visualizacion (Video video,Usuario Viewer){
        this.Espectador=Viewer;
        this.video= video;
    }
    public Video getVideo(){
        return video;
        }
    public void setVideo(Video video){
        this.video= video;
        }
    public Usuario getViewer(){
        return Espectador;
        }
    public void setViewer (Usuario Vierwer){
        this.Espectador=Vierwer;
        }
    }
    
