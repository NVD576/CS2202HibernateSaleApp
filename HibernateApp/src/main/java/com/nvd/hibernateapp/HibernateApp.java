/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.nvd.hibernateapp;
import com.nvd.repository.impl.CommentRepositoryImpl;
/**
 *
 * @author ADMIN
 */
public class HibernateApp {

    static boolean isNguyenTo(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {

        CommentRepositoryImpl c= new CommentRepositoryImpl();
        c.getComments(1).forEach(p->System.out.println(p.getContent()));
        // StatsRepositoryImpl s = new StatsRepositoryImpl();
        // s.statsRevenueByProduct().forEach(o -> {
        //     System.out.printf("%d - %s - %d\n", 
        //             o[0], o[1], o[2]);
        // });
        // CategoryRepositoryImpl s= new CategoryRepositoryImpl();
        // s.getCates().forEach(p->System.out.println(p.getName()+"\n"));
        
        // ProductRepositoryImpl s2= new ProductRepositoryImpl();
        // Map<String , String> params= new HashMap<>();
        // params.put("page", "1");
        // params.put ("kw", "iPhone");
        // params.put ("fromPrice", "30000000");
       
       
        // s2.getProducts(params).forEach(p->System.out.printf("%d - %s - %.1f\n", 
        //         p.getId(), p.getName(), p.getPrice()));
    }
}
