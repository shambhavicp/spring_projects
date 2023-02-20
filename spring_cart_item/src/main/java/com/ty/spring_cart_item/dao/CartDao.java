package com.ty.spring_cart_item.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.spring_cart_item.dto.Cart;

@Component
public class CartDao {
	
	@Autowired
	public EntityManager entityManager;
	
	public void saveCart(Cart cart) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(cart);
		entityTransaction.commit();
	}
	
	public void updateCart(Cart cart) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Cart cart2=entityManager.find(Cart.class, cart.getId());
		
		if(cart2!=null) {
			cart.setList(cart2.getList());
			entityTransaction.begin();
			entityManager.merge(cart);
			entityTransaction.commit();
			System.out.println("updated");
		}else {
			System.out.println("id not present");
		}
		
	}
	

	public void deleteCart(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Cart cart=entityManager.find(Cart.class, id);
	
		if(cart!=null) {
			entityTransaction.begin();
			entityManager.remove(cart);
			entityTransaction.commit();
			System.out.println("deleted");
		}else {
			System.out.println("id not present");
		}
		
	}
	

	public void getCartById(int id) {
		Cart cart=entityManager.find(Cart.class, id);
		System.out.println(cart);
	}
	
	public List<Cart> getAllCart(){
		Query query=entityManager.createQuery("select c from Cart c");
		List<Cart> list=query.getResultList();
		return list;
		
	}
	

	
}
