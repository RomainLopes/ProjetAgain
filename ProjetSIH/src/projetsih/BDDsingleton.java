/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsih;

public class BDDsingleton {
	/**
	 * Le singleton
	 */
	private volatile static BDDsingleton single;
	/**
	 * Variable d'instance
	 */
	private String name = "";
	
	/**
	 * Constructeur privé
	 */
	private BDDsingleton(){
		this.name = "Mon singleton";
		System.out.println("\n\t\tCREATION DE L'INSTANCE ! ! !");
	}
	
	/**
	 * Méthode d'accès au singleton
	 * @return SdzSingleton
	 */
	public static BDDsingleton getInstance(){
		if(single == null){
			synchronized(BDDsingleton.class){
				if(single == null)
					single = new BDDsingleton();
			}
		}
		
		return single;
	}
	
	/**
	 * Accesseur 
	 * @return
	 */
	public String getName(){
		return this.name;
	}
}
