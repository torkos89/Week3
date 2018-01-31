package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="items")
public class ListItem {
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name="ID")
  private int id;
  @Column(name="STORE")
  private String store;
  @Column(name="ITEM")
  private String item;
  public ListItem() {
    
  }
  public ListItem(String s,String i){
    this.store = s;
    this.item = i;
  }
  public String returnDetails() {
    return store +": "+ item;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getStore() {
    return store;
  }
  public void setStore(String store) {
    this.store = store;
  }
  public String getItem() {
    return item;
  }
  public void setItem(String item) {
    this.item = item;
  }
  
}
