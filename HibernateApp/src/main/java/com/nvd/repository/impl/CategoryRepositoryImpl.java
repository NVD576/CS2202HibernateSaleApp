/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvd.repository.impl;

import java.util.List;

import org.hibernate.Session;

import com.nvd.hibernateapp.HibernateUtils;
import com.nvd.pojo.Category;

import jakarta.persistence.Query;

/**
 *
 * @author admin
 */
public class CategoryRepositoryImpl {
    @SuppressWarnings("unchecked")
    public List<Category> getCates(){
        try(Session s= HibernateUtils.getFACTORY().openSession()){
            Query q= s.createQuery("FROM Category", Category.class);
            return q.getResultList();
        }
    }
}
