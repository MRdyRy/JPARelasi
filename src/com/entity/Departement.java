/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author rudy
 */
@Entity
public class Departement implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String departementName;
    @OneToMany(mappedBy = "department")
    private List<Employee> employees;

    public Departement() {
    }

    public Departement(String departementName, List<Employee> employees) {
        this.id = id;
        this.departementName = departementName;
        this.employees = employees;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departement)) {
            return false;
        }
        Departement other = (Departement) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Departement[ id=" + id + " ]";
    }

    /**
     * @return the departementName
     */
    public String getDepartementName() {
        return departementName;
    }

    /**
     * @param departementName the departementName to set
     */
    public void setDepartementName(String departementName) {
        this.departementName = departementName;
    }

    /**
     * @return the employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }

    /**
     * @param employees the employees to set
     */
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
}
