package com.ty.spring_cart_item.controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ty.spring_cart_item.dao.CartDao;
import com.ty.spring_cart_item.dao.ItemDao;
import com.ty.spring_cart_item.dto.Cart;
import com.ty.spring_cart_item.dto.Config;
import com.ty.spring_cart_item.dto.Item;

public class CartController {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		CartDao cartDao=context.getBean("cartDao", CartDao.class);
		ItemDao itemDao=context.getBean("itemDao", ItemDao.class);
		
		Scanner scanner=new Scanner(System.in);
		
		boolean exit=true;
		do {
			System.out.println("which one do u want to perform CRUD operations");
			System.out.println(" 1.Cart \n 2.Item \n 3.Exit");
			System.out.println("========Enter your choice========");

			int choice1=scanner.nextInt();
			
			switch(choice1) {
			
			case 1:{
				boolean exit1=true;
			do {
				
				System.out.println(" 1.Add Cart \n 2.Update Cart \n 3.Remove Cart \n 4 GetCart details By ID \n 5.GetAllCart \n 6.exit");
				System.out.println("========Enter your choice========");

				int choice=scanner.nextInt();
				switch(choice) {
				
				case 1: {
					System.out.println("Enter the Email");
					String email=scanner.next();
					
					System.out.println("Enter the Password");
					String password=scanner.next();
					
					Cart cart=context.getBean("cart", Cart.class);
					
					cart.setEmail(email);
					cart.setPassword(password);
					
				
					cartDao.saveCart(cart);
					
					}
				break;
				case 2:{
					System.out.println("Enter the cart id");
					int id=scanner.nextInt();
					
					System.out.println("Enter the Email");
					String email=scanner.next();
					
					System.out.println("Enter the Password");
					String password=scanner.next();
					
					Cart cart=context.getBean("cart", Cart.class);
					
					cart.setId(id);
					cart.setEmail(email);
					cart.setPassword(password);
					
					cartDao.updateCart(cart);
					
				}
				break;
				case 3:{
					System.out.println("Enter the cart id");
					int id=scanner.nextInt();
					
					cartDao.deleteCart(id);
					
				}
				break;
				case 4:{
					System.out.println("Enter the cart id");
					int id=scanner.nextInt();
					
					cartDao.getCartById(id);
				}
				break;
				case 5:{
					System.out.println(cartDao.getAllCart());
					
				}
				break;
				case 6:{
					exit1=false;
					System.out.println("thank u");
					
				}
				break;
				default:{
					System.out.println("Invalid choice");
				}
				
				}
				}while(exit1);
			}
			break;
			case 2:{
				
				boolean exit2=true;
				do {
					
					System.out.println(" 1.Add Item \n 2.Update Item \n 3.Remove Item \n 4 GetItem details By ID \n 5.GetAllItem \n 6.exit");
					System.out.println("========Enter your choice========");

					int choice=scanner.nextInt();
					switch(choice) {
					
					case 1: {
						System.out.println("enter the cart id");
						int cart_id=scanner.nextInt();
						
						System.out.println("Enter the item name");
						String name=scanner.next();
						
						System.out.println("Enter the item cost");
						double cost=scanner.nextDouble();	
				
						System.out.println("Enter the manufacturer");
						String manufacturer=scanner.next();
						
						System.out.println("Enter the item review");
						String review=scanner.next();
						
						Item item=context.getBean("item", Item.class);
						
						item.setName(name);
						item.setCost(cost);
						item.setManufracturer(manufacturer);
						item.setReview(review);
				
						itemDao.saveItem(item, cart_id);
						}
					break;
					case 2:{
						System.out.println("enter the item id");
						int id=scanner.nextInt();
						
						System.out.println("Enter the item name");
						String name=scanner.next();
						
						System.out.println("Enter the item cost");
						double cost=scanner.nextDouble();	
				
						System.out.println("Enter the manufacturer");
						String manufacturer=scanner.next();
						
						System.out.println("Enter the item review");
						String review=scanner.next();
						
						Item item=context.getBean("item", Item.class);
						
						item.setId(id);
						item.setName(name);
						item.setCost(cost);
						item.setManufracturer(manufacturer);
						item.setReview(review);
				
						itemDao.updateItem(item);
						
						
					}
					break;
					case 3:{
						System.out.println("Enter the item id");
						int id=scanner.nextInt();
						
						itemDao.deleteItem(id);
						
					}
					break;
					case 4:{
						System.out.println("Enter the item id");
						int id=scanner.nextInt();
						
						itemDao.getItemById(id);
					}
					break;
					case 5:{
						System.out.println(itemDao.getAllItem());
						
					}
					break;
					case 6:{
						exit2=false;
						System.out.println("thank u");
						
					}
					break;
					default:{
						System.out.println("Invalid choice");
					}
					
					}
					}while(exit2);
				
			}
			break;
			case 3:{
				exit=false;
				System.out.println("thank u");
			}
			break;
			default:{
				System.out.println("Invalid choice");
			}
			}
			
		}while(exit);
		
		
	}

}
