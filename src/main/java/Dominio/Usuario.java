/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "usuario")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario"),
    @NamedQuery(name = "Usuario.findByCorreo", query = "SELECT u FROM Usuario u WHERE u.correo = :correo"),
    @NamedQuery(name = "Usuario.findByPassword", query = "SELECT u FROM Usuario u WHERE u.password = :password"),
    @NamedQuery(name = "Usuario.findByPremium", query = "SELECT u FROM Usuario u WHERE u.premium = :premium"),
    @NamedQuery(name = "Usuario.findByEnlinea", query = "SELECT u FROM Usuario u WHERE u.enlinea = :enlinea"),
    @NamedQuery(name = "Usuario.findByAdmin", query = "SELECT u FROM Usuario u WHERE u.admin = :admin"),
    @NamedQuery(name = "Usuario.findByTlfno", query = "SELECT u FROM Usuario u WHERE u.tlfno = :tlfno"),
    @NamedQuery(name = "Usuario.findByLikes", query = "SELECT u FROM Usuario u WHERE u.likes = :likes"),
    @NamedQuery(name = "Usuario.findByCertificado", query = "SELECT u FROM Usuario u WHERE u.certificado = :certificado")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private Integer idUsuario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "correo")
    private String correo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @NotNull
    @Column(name = "premium")
    private short premium;
    @Basic(optional = false)
    @NotNull
    @Column(name = "enlinea")
    private short enlinea;
    @Basic(optional = false)
    @NotNull
    @Column(name = "admin")
    private short admin;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "tlfno")
    private String tlfno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "likes")
    private String likes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "certificado")
    private short certificado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Amigos> amigosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario3")
    private List<Amigos> amigosList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Perfil> perfilList;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(Integer idUsuario, String correo, String password, short premium, short enlinea, short admin, String tlfno, String likes, short certificado) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.password = password;
        this.premium = premium;
        this.enlinea = enlinea;
        this.admin = admin;
        this.tlfno = tlfno;
        this.likes = likes;
        this.certificado = certificado;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public short getPremium() {
        return premium;
    }

    public void setPremium(short premium) {
        this.premium = premium;
    }

    public short getEnlinea() {
        return enlinea;
    }

    public void setEnlinea(short enlinea) {
        this.enlinea = enlinea;
    }

    public short getAdmin() {
        return admin;
    }

    public void setAdmin(short admin) {
        this.admin = admin;
    }

    public String getTlfno() {
        return tlfno;
    }

    public void setTlfno(String tlfno) {
        this.tlfno = tlfno;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public short getCertificado() {
        return certificado;
    }

    public void setCertificado(short certificado) {
        this.certificado = certificado;
    }

    public List<Amigos> getAmigosList() {
        return amigosList;
    }

    public void setAmigosList(List<Amigos> amigosList) {
        this.amigosList = amigosList;
    }

    public List<Amigos> getAmigosList1() {
        return amigosList1;
    }

    public void setAmigosList1(List<Amigos> amigosList1) {
        this.amigosList1 = amigosList1;
    }

    public List<Perfil> getPerfilList() {
        return perfilList;
    }

    public void setPerfilList(List<Perfil> perfilList) {
        this.perfilList = perfilList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
