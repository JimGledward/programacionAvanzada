/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JGLEDWARD
 */
@Entity(name = "NextEntregas")
@Table(name = "next_entregas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NextEntregas.findAll", query = "SELECT n FROM NextEntregas n"),
    @NamedQuery(name = "NextEntregas.findByIdEntrega", query = "SELECT n FROM NextEntregas n WHERE n.idEntrega = :idEntrega"),
    @NamedQuery(name = "NextEntregas.findByIdCliente", query = "SELECT n FROM NextEntregas n WHERE n.idCliente = :idCliente"),
    @NamedQuery(name = "NextEntregas.findByNombresCliente", query = "SELECT n FROM NextEntregas n WHERE n.nombresCliente = :nombresCliente"),
    @NamedQuery(name = "NextEntregas.findByApellidosCliente", query = "SELECT n FROM NextEntregas n WHERE n.apellidosCliente = :apellidosCliente"),
    @NamedQuery(name = "NextEntregas.findByDireccion", query = "SELECT n FROM NextEntregas n WHERE n.direccion = :direccion"),
    @NamedQuery(name = "NextEntregas.findByTelefono", query = "SELECT n FROM NextEntregas n WHERE n.telefono = :telefono"),
    @NamedQuery(name = "NextEntregas.findByTipoServicio", query = "SELECT n FROM NextEntregas n WHERE n.tipoServicio = :tipoServicio"),
    @NamedQuery(name = "NextEntregas.findByFecha", query = "SELECT n FROM NextEntregas n WHERE n.fecha = :fecha")})
public class NextEntregas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_entrega")
    private Long idEntrega;
    @Column(name = "id_cliente")
    private Integer idCliente;
    @Size(max = 20)
    @Column(name = "nombres_cliente")
    private String nombresCliente;
    @Size(max = 20)
    @Column(name = "apellidos_cliente")
    private String apellidosCliente;
    @Size(max = 100)
    @Column(name = "direccion")
    private String direccion;
    @Size(max = 20)
    @Column(name = "telefono")
    private String telefono;
    @Size(max = 2)
    @Column(name = "tipo_servicio")
    private String tipoServicio;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    public NextEntregas() {
    }

    public NextEntregas(Long idEntrega) {
        this.idEntrega = idEntrega;
    }

    public Long getIdEntrega() {
        return idEntrega;
    }

    public void setIdEntrega(Long idEntrega) {
        this.idEntrega = idEntrega;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombresCliente() {
        return nombresCliente;
    }

    public void setNombresCliente(String nombresCliente) {
        this.nombresCliente = nombresCliente;
    }

    public String getApellidosCliente() {
        return apellidosCliente;
    }

    public void setApellidosCliente(String apellidosCliente) {
        this.apellidosCliente = apellidosCliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEntrega != null ? idEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NextEntregas)) {
            return false;
        }
        NextEntregas other = (NextEntregas) object;
        if ((this.idEntrega == null && other.idEntrega != null) || (this.idEntrega != null && !this.idEntrega.equals(other.idEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.NextEntregas[ idEntrega=" + idEntrega + " ]";
    }
    
}
