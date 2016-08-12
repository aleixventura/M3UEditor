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
public class Canal {

    int id;
    String Nom;
    String imgurl;
    titolgrup grup;
    String url;

    public Canal(int id, String Nom, String imgurl, titolgrup grup, String url) {
        this.id = id;
        this.Nom = Nom;
        this.imgurl = imgurl;
        this.grup = grup;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public titolgrup getGrup() {
        return grup;
    }

    public void setGrup(titolgrup grup) {
        this.grup = grup;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String linia() {
        String ini = "#EXTINF: 0";
        String cometes = "\"";
        String ln = "\n";

        String l = "";
        l = ini + " tvg-id=" + cometes + id + cometes + " tvg-name=" + cometes + Nom + cometes + " tvg-logo =" + cometes + imgurl + cometes + " group-title=" + cometes + grup + ", " + Nom + ln
                + url + ln;
        if (Nom.contains(" ")) {
            l = ini + " tvg-id=" + cometes + id + cometes + " tvg-logo =" + cometes + imgurl + cometes + " group-title=" + cometes + grup + ", " + Nom + ln
                    + url + ln;
        }
        if (grup.nom.contains(" ") || grup == null) {
            l = ini + " tvg-id=" + cometes + id + cometes + " tvg-logo =" + cometes + imgurl + cometes + ", " + Nom + ln
                    + url + ln;
        }else{
            l = ini + " tvg-id=" + cometes + id + cometes + " tvg-logo =" + cometes + imgurl + cometes + " group-title=" + cometes + grup + ", " + Nom + ln
                    + url + ln;
        }

        return l;
    }

    @Override
    public String toString() {
        return Nom;
    }
    
}
