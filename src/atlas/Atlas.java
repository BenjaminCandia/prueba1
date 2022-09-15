
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
        u.setDv("");
        u.setNombre_completo("");
        u.setNombre_usuario("");
        u.setContraseña("");
        u.setEmail("");
        u.setFecha(new Date());
        u.setTelefono(0);
        
               
    }
    
}
