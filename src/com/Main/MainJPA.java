/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Main;

import com.entity.Address;
import com.entity.Departement;
import com.entity.Employee;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author rudy
 */
public class MainJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TesterJPARELASIPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
//        Employee rr = new Employee("Kirito", "Warrior", 5000000);
//        Employee rs = new Employee("Asuna", "Support", 450000);
//        em.persist(rr);
//        em.persist(rs);
//        Address rrAdd = new Address("USA");
//        Address rsAdd = new Address("ITA");
//        em.persist(rrAdd);
//        em.persist(rsAdd);
//        Departement departement = new Departement();
//        List<Employee> Department = new ArrayList<>();
//        Department.add(rr);
//        Department.add(rs);
//        departement.setDepartementName("SAO");
//        departement.setEmployees(Department);
//        em.persist(departement);
//        rr.setDepartment(departement);
//        rs.setDepartment(departement);
//        rr.setAddress(rrAdd);
//        rs.setAddress(rsAdd);

        Departement ad = em.find(Departement.class, 305);
        Employee org = new Employee("Aurora", "Mage", 65000);
        org.setDepartment(ad);
        em.persist(org);
        em.getTransaction().commit();

        List<Employee> emps = ad.getEmployees();
        for (Employee emp : emps) {
            System.out.println(emp.getName());
        }
//        Employee kirito = em.find(Employee.class, 301);
//        System.out.println("Name : " + kirito.getName() + "\nPosition : " + kirito.getPosition()
//                + "\nNation : " + kirito.getAddress().getNation()
//                + "\nDepartment : " + kirito.getDepartment().getDepartementName());

    }

}
