
package atlasDTO;

import java.util.Date;

public class suscripcion 
{
    private int numero;
    private String fecha_inicio;
    private usuarios usuario;
    private int valor_sub ;      
    private int abono_total;
    private club_deportivo club;

    public suscripcion() {
        this.numero = 0;
        this.fecha_inicio = "";
        this.usuario = new usuarios();
        this.valor_sub = 0;
        this.abono_total = 0;
        this.club = new club_deportivo();
    }

    public suscripcion(int numero, String fecha_inicio, usuarios usuario, int valor_sub, int abono_total, club_deportivo club) {
        this.numero = numero;
        this.fecha_inicio = fecha_inicio;
        this.usuario = usuario;
        this.valor_sub = valor_sub;
        this.abono_total = abono_total;
        this.club = club;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarios usuario) {
        this.usuario = usuario;
    }

    public int getValor_sub() {
        return valor_sub;
    }

    public void setValor_sub(int valor_sub) {
        this.valor_sub = valor_sub;
    }

    public int getAbono_total() {
        return abono_total;
    }

    public void setAbono_total(int abono_total) {
        this.abono_total = abono_total;
    }

    public club_deportivo getClub() {
        return club;
    }

    public void setClub(club_deportivo club) {
        this.club = club;
    }



    
            
        
}
