
package atlasDTO;

import java.util.Date;

public class club_deportivo 
{
    private int codigo;
    private String nombre_club;
    private String nombre_fundador;
    private Date fecha;
    private String pais_origen;
    private String lema;
    private String colores; 
    private int valor_sub;

    public club_deportivo() {
        this.codigo = 0;
        this.nombre_club = "";
        this.nombre_fundador = "";
        this.fecha = new Date();
        this.pais_origen = "";
        this.lema = "";
        this.colores = "";
        this.valor_sub = 0;
    }

    public club_deportivo(int codigo, String nombre_club, String nombre_fundador, Date fecha, String pais_origen, String lema, String colores, int valor_sub) {
        this.codigo = codigo;
        this.nombre_club = nombre_club;
        this.nombre_fundador = nombre_fundador;
        this.fecha = fecha;
        this.pais_origen = pais_origen;
        this.lema = lema;
        this.colores = colores;
        this.valor_sub = valor_sub;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_club() {
        return nombre_club;
    }

    public void setNombre_club(String nombre_club) {
        this.nombre_club = nombre_club;
    }

    public String getNombre_fundador() {
        return nombre_fundador;
    }

    public void setNombre_fundador(String nombre_fundador) {
        this.nombre_fundador = nombre_fundador;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public int getValor_sub() {
        return valor_sub;
    }

    public void setValor_sub(int valor_sub) {
        this.valor_sub = valor_sub;
    }
    
    
            
            
            
            
}
