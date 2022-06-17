package org.generation.ecommercedb.model;

import javax.persistence.*;


@Entity
@Table(name="registro")
public class Registro {

    public Registro(Long id, String nombre, String apellidoPat, String apellidoMat, String telefono, String username, String password, String email, String email2, String terminos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.telefono = telefono;
        this.username = username;
        this.password = password;
        this.email = email;
        this.email2 = email2;
        this.terminos = terminos;
    }

    public Registro() {
        super();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idregistro", unique = true, nullable = false)
    private Long id;

    @Column(nullable = false, name="nombre")
    private String nombre;

    @Column(nullable = false, name="apellidoPat")
    private String apellidoPat;

    @Column(nullable = false, name="apellidoMat")
    private String apellidoMat;

    @Column(nullable = false, name="telefono")
    private String telefono;

    @Column(nullable = false, name="user")
    private String username;

    @Column(nullable = false, name="contra")
    private String password;

    @Column(nullable = false, name="correo")
    private String email;

    @Column(nullable = false, name="correo2")
    private String email2;

    @Column(nullable = false, name="terminos")
    private String terminos;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }

    public String getTerminos() {
        return terminos;
    }

    public void setTerminos(String terminos) {
        this.terminos = terminos;
    }

}
