/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3ueditor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Aleix
 */
public class Exportarfitxer {

    public void a() {

    }

    public void exportarm3u(String rutaf, String nom, String i) throws IOException {
        String ruta = rutaf + nom + ".m3u";
        File archivo = new File(ruta);
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(archivo));
        String a = "";
        if (archivo.exists()) {

            bw.write(i);
        } else {
            Scanner s = null;
            s = new Scanner(archivo);

            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                 a= a+linea;     // Imprimimos la linea
                 
            }
            a = a + "\n";
            s.close();
            
            bw.write(a+i);
        }
        bw.close();

    }

    public void exportarm3u(String nom) throws IOException {
        String ruta = nom + ".m3u";
        File archivo = new File(ruta);
        BufferedWriter bw;

        if (archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("El fichero de texto ya estaba creado.");
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();

    }
}
