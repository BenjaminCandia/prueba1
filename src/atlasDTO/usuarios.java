
package atlasDTO;

import java.util.Date;
import java.util.regex.Pattern;

public class usuarios 
{
    private int id;
    private String nombre_completo;
    private int rut;       
    private String dv;      
    private String fecha_nac;
    private int telefono;
    private String email;
    private String nombre_usuario;
    private String contraseña;

    public usuarios() {
        this.id = 0;
        this.nombre_completo = "";
        this.rut = 0;
        this.dv = "";
        this.fecha_nac = "";
        this.telefono = 0;
        this.email = "";
        this.nombre_usuario = "";
        this.contraseña = "";
    }

    public usuarios(int id, String nombre_completo, int rut, String dv, String fecha_nac, int telefono, String email, String nombre_usuario, String contraseña) {
        this.id = id;
        this.nombre_completo = nombre_completo;
        this.rut = rut;
        this.dv = dv;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
        this.email = email;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(String fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        StringBuilder sb = new StringBuilder();
        sb.append(telefono);
        
        if(sb.length() >= 8){
            this.telefono = telefono;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email.contains("@")){
        if(email.contains(".cl")|| email.contains(".com"))
        
        this.email = email;
        }
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        if(nombre_usuario.length()>=4)
        this.nombre_usuario = nombre_usuario;
    }

    private static final String PASSWORD_REGEX = "^(?=.[0-9])(?=.[a-z])(?=.*[A-Z]).{6,}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String Contraseña) {
        if (PASSWORD_PATTERN.matcher(Contraseña).matches()) {
            this.contraseña = Contraseña;
        }
    }

    
    
    
    
    
}  