package view;

import java.util.List;
import java.util.Scanner;

import controller.ListItemHelper;
import model.ListItem;

public class StartProgram {

    static Scanner in = new Scanner(System.in);
    static ListItemHelper lih = new ListItemHelper();

    private static void addAnItem() {
      System.out.print("Enter a store: ");
      String store = in.nextLine();
      System.out.print("Enter an item: ");
      String item = in.nextLine();
      ListItem toAdd = new ListItem(store,item);
      lih.insertItem(toAdd);
    }/*
    private static void findItem() {
      List<ListItem> found;
      if(searchBy==1) System.out.println("");
    }*/
    private static void deleteAnItem() {
      //System.out.print("Enter the store to delete: ");
      //String store = in.nextLine();
      System.out.print("Enter the id to delete: ");
      int id = in.nextInt();
      lih.removeItem(id);
    }

    private static void editAnItem() {
      System.out.println("How would you like to search? ");
      System.out.println("1 : Search by Store");
      System.out.println("2 : Search by Item");
      int i = in.nextInt();
      in.nextLine();
      String result = null;
      Integer id = null;
      switch(i) {
      case 1: System.out.println("Enter store name: "); result = in.nextLine();break;
      case 2: System.out.println("Enter item id: "); id = in.nextInt();lih.searchForItemById(id);break;
      }
      /*
      List<ListItem> foundItems;
      if (searchBy == 1) {
        System.out.print("Enter the store name: ");
        String storeName = in.nextLine();
        
      } else {
        System.out.print("Enter the item: ");
        String itemName = in.nextLine();
        

      }

      if (!foundItems.isEmpty()) {
        System.out.println("Found Results.");
        for (ListItem l : foundItems) {
          System.out.println(l.getId() + " : " + l.toString());
        }
        System.out.print("Which ID to edit: ");
        int idToEdit = in.nextInt();

        ListItem toEdit = lih.searchForItemById(idToEdit);
        System.out.println("Retrieved " + toEdit.getItem() + " from " + toEdit.getStore());
        System.out.println("1 : Update Store");
        System.out.println("2 : Update Item");
        int update = in.nextInt();
        in.nextLine();

        if (update == 1) {
          System.out.print("New Store: ");
          String newStore = in.nextLine();
          toEdit.setStore(newStore);
        } else if (update == 2) {
          System.out.print("New Item: ");
          String newItem = in.nextLine();
          toEdit.setItem(newItem);
        }

        lih.updateItem(toEdit);

      } else {
        System.out.println("---- No results found");
      }
*/
    }

    public static void main(String[] args) {
      runMenu();

    }

    public static void runMenu() {
      boolean goAgain = true;
      System.out.println("--- Welcome to our awesome shopping list! ---");
      while (goAgain) {
        System.out.println("*  Select an item:");
        System.out.println("*  1 -- Add an item");
        System.out.println("*  2 -- View an item by id");
        System.out.println("*  3 -- Delete an item");
        System.out.println("*  4 -- View the list");
        System.out.println("*  5 -- Exit the awesome program");
        System.out.print("*  Your selection: ");
        int selection = in.nextInt();
        in.nextLine();

        if (selection == 1) {
          addAnItem();
        } else if (selection == 2) {
          editAnItem();
        } else if (selection == 3) {
          deleteAnItem();
        } else if (selection == 4) {
          viewTheList();
        } else {
          //lih.cleanUp();
          System.out.println("   Goodbye!   ");
          goAgain = false;
        }

      }

    }

    private static void viewTheList() {
      

    }

  }