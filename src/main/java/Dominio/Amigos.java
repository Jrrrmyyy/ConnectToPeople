/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Alumno Mañana
 */
@Entity
@Table(name = "amigos")
@NamedQueries({
    @NamedQuery(name = "Amigos.findAll", query = "SELECT a FROM Amigos a"),
    @NamedQuery(name = "Amigos.findByIdUsuario", query = "SELECT a FROM Amigos a WHERE a.amigosPK.idUsuario = :idUsuario"),
    @NamedQuery(name = "Amigos.findByIdUsuario1", query = "SELECT a FROM Amigos a WHERE a.amigosPK.idUsuario1 = :idUsuario1"),
    @NamedQuery(name = "Amigos.findByMejoresAmigos", query = "SELECT a FROM Amigos a WHERE a.mejoresAmigos = :mejoresAmigos"),
    @NamedQuery(name = "Amigos.findByAmigosBloqueados", query = "SELECT a FROM Amigos a WHERE a.amigosBloqueados = :amigosBloqueados"),
    @NamedQuery(name = "Amigos.findByUsuario1", query = "SELECT a FROM Amigos a WHERE a.usuario1 = :usuario1"),
    @NamedQuery(name = "Amigos.findByUsuario2", query = "SELECT a FROM Amigos a WHERE a.usuario2 = :usuario2")})
public class Amigos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AmigosPK amigosPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mejoresAmigos")
    private short mejoresAmigos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amigosBloqueados")
    private short amigosBloqueados;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario1")
    private short usuario1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usuario2")
    private short usuario2;
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario;
    @JoinColumn(name = "idUsuario1", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Usuario usuario3;

    public Amigos() {
    }

    public Amigos(AmigosPK amigosPK) {
        this.amigosPK = amigosPK;
    }

    public Amigos(AmigosPK amigosPK, short mejoresAmigos, short amigosBloqueados, short usuario1, short usuario2) {
        this.amigosPK = amigosPK;
        this.mejoresAmigos = mejoresAmigos;
        this.amigosBloqueados = amigosBloqueados;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }

    public Amigos(int idUsuario, int idUsuario1) {
        this.amigosPK = new AmigosPK(idUsuario, idUsuario1);
    }

    public AmigosPK getAmigosPK() {
        return amigosPK;
    }

    public void setAmigosPK(AmigosPK amigosPK) {
        this.amigosPK = amigosPK;
    }

    public short getMejoresAmigos() {
        return mejoresAmigos;
    }

    public void setMejoresAmigos(short mejoresAmigos) {
        this.mejoresAmigos = mejoresAmigos;
    }

    public short getAmigosBloqueados() {
        return amigosBloqueados;
    }

    public void setAmigosBloqueados(short amigosBloqueados) {
        this.amigosBloqueados = amigosBloqueados;
    }

    public short getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(short usuario1) {
        this.usuario1 = usuario1;
    }

    public short getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(short usuario2) {
        this.usuario2 = usuario2;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Usuario getUsuario3() {
        return usuario3;
    }

    public void setUsuario3(Usuario usuario3) {
        this.usuario3 = usuario3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (amigosPK != null ? amigosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Amigos)) {
            return false;
        }
        Amigos other = (Amigos) object;
        if ((this.amigosPK == null && other.amigosPK != null) || (this.amigosPK != null && !this.amigosPK.equals(other.amigosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Amigos[ amigosPK=" + amigosPK + " ]";
    }
    
}
