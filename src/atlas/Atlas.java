
package atlas;

import atlasDTO.club_deportivo;
import atlasDTO.suscripcion;
import atlasDTO.usuarios;
import java.util.Date;

public class Atlas {

    public static void main(String[] args) {
        usuarios u = new usuarios();
        u.setId(1010);
        u.setRut(12345678);
        u.setDv("5");
        u.setNombre_completo("benjamin alberto candia toro");
        u.setNombre_usuario("bencant");
        u.setContraseña("loquillo123");
        u.setEmail("benjita@duocuc.com");
        u.setFecha_nac("29/06/2003");
        u.setTelefono(987651234);
        
        System.out.println("ID: "+u.getId());
        System.out.println("RUT: "+u.getRut()+"-"+u.getDv());
        System.out.println("NOMBRE COMPLETO: "+u.getNombre_completo());
        System.out.println("NOMBRE DE USUARIO: "+u.getNombre_usuario());
        System.out.println("CONTRASEÑA"+u.getContraseña());
        System.out.println("GMAIL: "+u.getEmail());
        System.out.println("FECHA DE NACIMIENTO: "+u.getFecha_nac());
        System.out.println("TELEFONO: "+u.getTelefono());
        
        System.out.println("=============================");
        
        club_deportivo cd =new club_deportivo();
        cd.setCodigo(0);
        cd.setColores("azul, negro");
        cd.setFecha_origen("1999");
        cd.setLema("EL QUE SE RINDE ES WECO");
        cd.setNombre_club("LOS PULENTOS");
        cd.setNombre_fundador("BENJITA FOR THE WIN");
        cd.setPais_origen("CHILE");
        cd.setValor_sub(10000);
        
        System.out.println("CODIGO: "+cd.getCodigo());
        System.out.println("NOMBRE DEL FUNDADOR: "+cd.getNombre_fundador());
        System.out.println("NOMBRE DEL CLUB: "+cd.getNombre_club());
        System.out.println("LEMA: "+cd.getLema());
        System.out.println("PAIS DE ORIGEN: "+cd.getPais_origen());
        System.out.println("VALOR DE SUBCRIPCION: $"+cd.getValor_sub());
        System.out.println("COLOR: "+cd.getColores());
        System.out.println("AÑO DE FUNDACION: "+cd.getFecha_origen());
        
        System.out.println("=============================");
        
        suscripcion s = new suscripcion();
        s.setAbono_total(15000);
        s.setClub(cd);
        s.setFecha_inicio("29/06/2003");
        s.setNumero(1010);
        s.setUsuario(u);
        s.setValor_sub(10000);
        
        System.out.println("NUMERO: "+s.getNumero()); 
        System.out.println("USUARIO: "+s.getUsuario());
        System.out.println("CLUB: "+s.getClub());
        System.out.println("VALOR DE SUSCRIPCION: "+s.getValor_sub());
        System.out.println("ABONO TOTAL: "+s.getAbono_total());
        System.out.println("FECHA INICIO DE LA SUSCRIPCION: "+s.getFecha_inicio());
  
    }
    
}
