package com.example.demo.Model;


public class Employee {
   int id; 
   String first_name;
   String last_name;
   String email;
   String id_card;
   
public Employee() {
}
public Employee(int id, String first_name, String last_name, String email, String id_card) {
    this.id = id;
    this.first_name = first_name;
    this.last_name = last_name;
    this.email = email;
    this.id_card = id_card;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getFirst_name() {
    return first_name;
}
public void setFirst_name(String first_name) {
    this.first_name = first_name;
}
public String getLast_name() {
    return last_name;
}
public void setLast_name(String last_name) {
    this.last_name = last_name;
}
public String getEmail() {
    return email;
}
public void setEmail(String email) {
    this.email = email;
}
public String getId_card() {
    return id_card;
}
public void setId_card(String id_card) {
    this.id_card = id_card;
}
public boolean matchWithKeyword(String keyword) {
    String keywordLowerCase = keyword.toLowerCase();
    return (first_name.toLowerCase().contains(keywordLowerCase) || 
      last_name.toLowerCase().contains(keywordLowerCase)|| 
      email.toLowerCase().contains(keywordLowerCase)|| 
      id_card.toLowerCase().contains(keywordLowerCase));
  }
}
