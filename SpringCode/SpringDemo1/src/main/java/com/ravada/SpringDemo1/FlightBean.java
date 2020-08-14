package com.ravada.SpringDemo1;
  public class FlightBean {
    String source;
    String destination;
    Double price;
    public FlightBean(String source, String destination, Double price) {
      // TODO Auto-generated constructor stub
      this.source=source;
      this.destination=destination;
      this.price=price;
    }
      public void display() {
      System.out.println("Source  :"+source);
      System.out.println("Destination:"+destination);
      System.out.println("Price: "+price);	
    }
  }