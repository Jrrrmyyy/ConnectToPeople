/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Alumno Mañana
 */
@Embeddable
public class AmigosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsuario")
    private int idUsuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUsuario1")
    private int idUsuario1;

    public AmigosPK() {
    }

    public AmigosPK(int idUsuario, int idUsuario1) {
        this.idUsuario = idUsuario;
        this.idUsuario1 = idUsuario1;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario1() {
        return idUsuario1;
    }

    public void setIdUsuario1(int idUsuario1) {
        this.idUsuario1 = idUsuario1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idUsuario;
        hash += (int) idUsuario1;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AmigosPK)) {
            return false;
        }
        AmigosPK other = (AmigosPK) object;
        if (this.idUsuario != other.idUsuario) {
            return false;
        }
        if (this.idUsuario1 != other.idUsuario1) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.AmigosPK[ idUsuario=" + idUsuario + ", idUsuario1=" + idUsuario1 + " ]";
    }
    
}
