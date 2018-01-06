/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Acer
 */
@Entity
@Table(name = "clientes", catalog = "escola", schema = "")
@NamedQueries({
    @NamedQuery(name = "Clientes.findAll", query = "SELECT c FROM Clientes c")
    , @NamedQuery(name = "Clientes.findByClientesID", query = "SELECT c FROM Clientes c WHERE c.clientesID = :clientesID")
    , @NamedQuery(name = "Clientes.findByStorId", query = "SELECT c FROM Clientes c WHERE c.storId = :storId")
    , @NamedQuery(name = "Clientes.findByName", query = "SELECT c FROM Clientes c WHERE c.name = :name")
    , @NamedQuery(name = "Clientes.findByAddress", query = "SELECT c FROM Clientes c WHERE c.address = :address")
    , @NamedQuery(name = "Clientes.findByCity", query = "SELECT c FROM Clientes c WHERE c.city = :city")
    , @NamedQuery(name = "Clientes.findByState", query = "SELECT c FROM Clientes c WHERE c.state = :state")
    , @NamedQuery(name = "Clientes.findByCountry", query = "SELECT c FROM Clientes c WHERE c.country = :country")})
public class Clientes implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "clientes_ID")
    private Integer clientesID;
    @Basic(optional = false)
    @Column(name = "stor_id")
    private String storId;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Column(name = "address")
    private String address;
    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "country")
    private String country;

    public Clientes() {
    }

    public Clientes(Integer clientesID) {
        this.clientesID = clientesID;
    }

    public Clientes(Integer clientesID, String storId, String name) {
        this.clientesID = clientesID;
        this.storId = storId;
        this.name = name;
    }

    public Integer getClientesID() {
        return clientesID;
    }

    public void setClientesID(Integer clientesID) {
        Integer oldClientesID = this.clientesID;
        this.clientesID = clientesID;
        changeSupport.firePropertyChange("clientesID", oldClientesID, clientesID);
    }

    public String getStorId() {
        return storId;
    }

    public void setStorId(String storId) {
        String oldStorId = this.storId;
        this.storId = storId;
        changeSupport.firePropertyChange("storId", oldStorId, storId);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        String oldCity = this.city;
        this.city = city;
        changeSupport.firePropertyChange("city", oldCity, city);
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        String oldState = this.state;
        this.state = state;
        changeSupport.firePropertyChange("state", oldState, state);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        String oldCountry = this.country;
        this.country = country;
        changeSupport.firePropertyChange("country", oldCountry, country);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientesID != null ? clientesID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Clientes)) {
            return false;
        }
        Clientes other = (Clientes) object;
        if ((this.clientesID == null && other.clientesID != null) || (this.clientesID != null && !this.clientesID.equals(other.clientesID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.Clientes[ clientesID=" + clientesID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
