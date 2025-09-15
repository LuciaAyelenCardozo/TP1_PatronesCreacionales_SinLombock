package builder;

public class Usuario {
    private String nombre;
    private String email;
    private String direccion;
    private String telefono;
    private String fechaNacimiento;

    private Usuario(UsuarioBuilder usuariobuilder) {
        this.nombre = usuariobuilder.nombre;
        this.email = usuariobuilder.email;
        this.direccion = usuariobuilder.direccion;
        this.telefono = usuariobuilder.telefono;
        this.fechaNacimiento = usuariobuilder.fechaNacimiento;
    }

    public static class UsuarioBuilder{ //debe ser una clase publica
        private String nombre;
        private String email;
        private String direccion;
        private String telefono;
        private String fechaNacimiento;
        //todos los atributos opcionales se ponen con set, los obligatorios van en el constructor

        public UsuarioBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public UsuarioBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UsuarioBuilder setDireccion(String direccion) {
            this.direccion = direccion;return this;
        }

        public UsuarioBuilder setTelefono(String telefono) {
            this.telefono = telefono;return this;
        }

        public UsuarioBuilder setFechaNacimiento(String fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;return this;
        }

        public Usuario build(){
            return new Usuario(this);
        }
    }

    @Override
    public String toString() {
        return " nombre= " + nombre +", email= " + email + ", direccion= " + direccion + ", telefono= " + telefono + ", fechaNacimiento= " + fechaNacimiento;
        }
}
