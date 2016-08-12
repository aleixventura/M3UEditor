/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m3ueditor;

/**
 *
 * @author Aleix
 */
public class M3UEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    static void exportar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void exportar(String nom){
        
    }
    String examplesimple= "#EXTINF:-1,HK:TRTHD\n" +
"http://trtcanlitv-lh.akamaihd.net/i/TRTHD_1@182045/index_1500_av-p.m3u8";
    String example = "# EXTM3U\n" +
"# EXTINF: -1 tvg-id = \"1\" tvg-name = \"Pervyy_kanal\" tvg-logo = \"PervyyKanal\" group-title = \"The federal channels,\" Channel\n" +
"udp :/ / @ 224.2.0.1:6000\n" +
"# EXTINF: -1 tvg-name = \"Rossiya_1\" tvg-logo = \"Russia1\" Russia-1\n" +
"udp :/ / @ 224.2.0.6:6000\n" +
"# EXTINF: -1 tvg-name = \"Rossiya_Kultura\" tvg-logo = \"RossiyaK\" to Russia\n" +
"udp :/ / @ 224.1.1.120:6000\n" +
"# EXTINF: -1 tvg-name = \"NTV\" tvg-logo = \"NTV\", NTV\n" +
"udp :/ / @ 224.2.0.5:6000\n" +
"# EXTINF: -1 tvg-name = \"Pyatyy_Kanal\" tvg-logo = \"PyatyyKanal\" Channel Five\n" +
"udp :/ / @ 224.1.1.53:6000\n" +
"# EXTINF: -1 tvg-name = \"Rossiya_2_ (Sport)\" tvg-logo = \"Russia2\" Russia-2\n" +
"udp :/ / @ 224.2.0.10:6000\n" +
"# EXTINF: -1 tvg-name = \"MCM_Top\" tvg-logo = \"MCMTop\" group-title = \"Music and Entertainment\", MCM Top\n" +
"udp :/ / @ 224.1.1.30:6000\n" +
"# EXTINF: -1 tvg-name = \"Bridge_TV\" tvg-logo = \"BridgeTV\", BRIDGE TV\n" +
"udp :/ / @ 224.1.1.21:6000\n" +
"# EXTINF: -1 tvg-name = \"\" tvg-logo = \"@ EuropaPlusTV\", Europa Plus TV ";
    String inifile = "#EXTM3U";
    String newline = "\n";
    String channelini = "#EXTINF:";
    String tvg_id="tvg-id =";
    String tvg_name = "tvg-name =";
    
    
}
