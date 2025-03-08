package com.nvd.repository.impl;

import java.util.List;

import org.hibernate.Session;

import com.nvd.hibernateapp.HibernateUtils;
import com.nvd.pojo.Comment;

import jakarta.persistence.Query;

public class CommentRepositoryImpl {
    public List <Comment> getComments(int productId){
        try(Session s= HibernateUtils.getFACTORY().openSession()){
            Query q = s.createQuery("FROM Comment WHERE productId.id = :productId", Comment.class);
            q.setParameter("productId", productId);

            return q.getResultList();
        }
    }
}
