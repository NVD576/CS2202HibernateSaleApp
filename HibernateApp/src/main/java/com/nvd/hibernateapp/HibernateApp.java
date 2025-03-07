/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nvd.hibernateapp;

import com.nvd.repository.impl.CategoryRepositoryImpl;
import com.nvd.repository.impl.ProductRepositoryImpl;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author admin
 */
public class HibernateApp {

    public static void main(String[] args) {
        CategoryRepositoryImpl s= new CategoryRepositoryImpl();
        s.getCates().forEach(p->System.out.println(p.getName()+"\n"));
        
        ProductRepositoryImpl s2= new ProductRepositoryImpl();
        Map<String , String> params= new HashMap<>();
        params.put("page", "1");
//        params.put ("kw", "iPhone");
//        params.put ("fromPrice", "30000000");
        
        
        s2.getProducts(params).forEach(p->System.out.printf("%d - %s - %.1f\n", 
                p.getId(), p.getName(), p.getPrice()));
        
    }
}
