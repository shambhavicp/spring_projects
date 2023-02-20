package com.ty.spring_cart_item.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ty.spring_cart_item.dto.Cart;
import com.ty.spring_cart_item.dto.Item;

@Component
public class ItemDao {
	
	@Autowired
	public EntityManager entityManager;
	
	public void saveItem(Item item, int cart_id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Cart cart=entityManager.find(Cart.class, cart_id);
		
		List<Item> list=cart.getList();
		if(cart!=null) {
			list.add(item);
			cart.setId(cart_id);
			cart.setList(list);
			entityTransaction.begin();
			entityManager.persist(item);
			entityManager.merge(cart);
			entityTransaction.commit();
		}
	}
	
	public void updateItem(Item item) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Item item2=entityManager.find(Item.class, item.getId());
		
		if(item2!=null) {
			entityTransaction.begin();
			entityManager.merge(item);
			entityTransaction.commit();
			System.out.println("updated");
		}else {
			System.out.println("id not present");
		}
		
	}
	

	public void deleteItem(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Item item=entityManager.find(Item.class, id);
		
		if(item!=null) {
			item.setId(id);
			entityTransaction.begin();
			entityManager.remove(item);
			entityTransaction.commit();
			System.out.println("deleted");
		}else {
			System.out.println("id not present");
		}
		
	}
	

	public void getItemById(int id) {
		Item item=entityManager.find(Item.class, id);
		System.out.println(item);
	}
	
	public List<Item> getAllItem(){
		Query query=entityManager.createQuery("select i from Item i");
		List<Item> list=query.getResultList();
		return list;
		
	}
	

}
