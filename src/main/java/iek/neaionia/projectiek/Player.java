/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iek.neaionia.projectiek;

import java.util.Date;

/**
 *
 * @author spyro
 */
public class Player {
  private String firstName;
  private String lastName;
  private  Date birthDate;
  
  public Player (String f, String l) {
      this.firstName = f;
      this.lastName = l;
  }  
 //TODO Να φτιαξω μεθοδο για υπολογισμο ηλικιας απο ημερομηνια
 //TODO Να φτιαξω μεθοδο για προσθηκη καλαθιων
  
  public void printStats()
  {
      System.out.println("First Name: " + firstName);
      System.out.println("Last Name: " + lastName);
      System.out.println("Birth Date: " + birthDate);
       
      
      }
 
      
  
      
  
    
}
