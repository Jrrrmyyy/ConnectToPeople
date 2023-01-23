/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "perfil")
@NamedQueries({
    @NamedQuery(name = "Perfil.findAll", query = "SELECT p FROM Perfil p"),
    @NamedQuery(name = "Perfil.findByIdPerfil", query = "SELECT p FROM Perfil p WHERE p.perfilPK.idPerfil = :idPerfil"),
    @NamedQuery(name = "Perfil.findByNombre", query = "SELECT p FROM Perfil p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Perfil.findByApellidos", query = "SELECT p FROM Perfil p WHERE p.apellidos = :apellidos"),
    @NamedQuery(name = "Perfil.findByFNacimiento", query = "SELECT p FROM Perfil p WHERE p.fNacimiento = :fNacimiento"),
    @NamedQuery(name = "Perfil.findByGenero", query = "SELECT p FROM Perfil p WHERE p.genero = :genero"),
    @NamedQuery(name = "Perfil.findByDireccion", query = "SELECT p FROM Perfil p WHERE p.direccion = :direccion"),
    @NamedQuery(name = "Perfil.findByContacto", query = "SELECT p FROM Perfil p WHERE p.contacto = :contacto"),
    @NamedQuery(name = "Perfil.findByIdUsuario", query = "SELECT p FROM Perfil p WHERE p.perfilPK.idUsuario = :idUsuario")})
public class Perfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PerfilPK perfilPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fNacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "genero")
    private String genero;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Column(name = "foto")
    private byte[] foto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contacto")
    private short contacto;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;

    public Perfil() {
    }

    public Perfil(PerfilPK perfilPK) {
        this.perfilPK = perfilPK;
    }

    public Perfil(PerfilPK perfilPK, String nombre, String apellidos, Date fNacimiento, String genero, byte[] foto, String direccion, short contacto) {
        this.perfilPK = perfilPK;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fNacimiento = fNacimiento;
        this.genero = genero;
        this.foto = foto;
        this.direccion = direccion;
        this.contacto = contacto;
    }

    public Perfil(int idPerfil, int idUsuario) {
        this.perfilPK = new PerfilPK(idPerfil, idUsuario);
    }

    public PerfilPK getPerfilPK() {
        return perfilPK;
    }

    public void setPerfilPK(PerfilPK perfilPK) {
        this.perfilPK = perfilPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFNacimiento() {
        return fNacimiento;
    }

    public void setFNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public short getContacto() {
        return contacto;
    }

    public void setContacto(short contacto) {
        this.contacto = contacto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (perfilPK != null ? perfilPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Perfil)) {
            return false;
        }
        Perfil other = (Perfil) object;
        if ((this.perfilPK == null && other.perfilPK != null) || (this.perfilPK != null && !this.perfilPK.equals(other.perfilPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Perfil[ perfilPK=" + perfilPK + " ]";
    }
    
}
