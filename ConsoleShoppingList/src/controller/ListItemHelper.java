package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ListItem;

public class ListItemHelper {
  static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("ConsoleShoppingList");
  public void insertItem(ListItem li) {
    EntityManager em = emfactory.createEntityManager();
    em.getTransaction().begin();
    em.persist(li);
    em.getTransaction().commit();
    em.close();
  }
  public void removeItem(int id) {
    EntityManager em = emfactory.createEntityManager();
    ListItem rem = em.find(ListItem.class, id);
    em.remove(rem);
    em.getTransaction().commit();
    em.close();
  }
  public ListItem searchForItemById(int id) {
     EntityManager em = emfactory.createEntityManager();
     ListItem found = em.find(ListItem.class, id);
     System.out.println("~ "+found.getStore()+": "+found.getItem());
    return null;
  }
  public void updateItem(ListItem toEdit) {
   
    
  }
}
