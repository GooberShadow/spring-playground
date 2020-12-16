package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;




//START OF MY CODE

//public class Flight {
//    private Date departsOn;
//    private List<Ticket> tickets;
//
//    public void setDepartsOn(Date dateTime)
//    {
//        this.departsOn = dateTime;
//    }
//
//    @JsonFormat(pattern = "yyyy-MM-dd")
//    public Date getDepartsOn()
//    {
//        return departsOn;
//    }
//
//    public List<Ticket> getTickets() { return tickets; }
//
//    public void setTickets(List<Ticket> ticket) { this.tickets = ticket; }
//
//    static class Ticket
//    {
//        private List<Passenger> passenger;
//        private int price = 100;
//
//        public int getPrice()
//        {
//            return price;
//        }
//
//        public void setPrice(int newPrice)
//        {
//            this.price = newPrice;
//        }
//
//        public List getPassengers()
//        {
//            return passenger;
//        }
//
//
//
//            static class Passenger {
//                private String firstName = "John";
//                private String lastName = "Cena";
//
//                public String getFirstName()
//                {
//                    return firstName;
//                }
//
//                public String getLastName()
//                {
//                    return lastName;
//                }
//
//            }
//
//    }

//}

//START OF LEARN CODE
class Flight {
    private int id;
    private String destination;
    private Date departsOn;
    private List<Person> passengers;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getDestination() { return destination; }

    public void setDestination(String destination) { this.destination = destination; }

    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getDepartsOn() { return departsOn; }

    public void setDepartsOn(Date dateTime) { this.departsOn = dateTime; }

    public List<Person> getPassengers() { return passengers; }

    public void setPassengers(List<Person> passengers) { this.passengers = passengers; }

    static class Person {
        private String name;

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }
    }
}
