package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Random;

  
  public class FlightBooking 
  {
   //private String ticketNumber;
   private String PassengerFullName;
   //private String TripSource;
   private String FlightCompany;
   //private String TripDestination;
   
   private LocalDate DepartingDate;
   private LocalDate ReturnDate;
  
   private double TotalTicketPrice;
   
   private int ChildPassengers;
   private int AdultPassengers;
   private int TotalPassengers;
   
   public FlightBooking(String a, LocalDate depart, LocalDate returnDate, int i, int i1) 
   {
   this.PassengerFullName = a;
   this.DepartingDate = depart;
   this.returnDate = returnDate;
   this.ChildPassengers =i;
   this.AdultPassengers =i1;
   } 
  
  // public String getTicketNumber()
  //  {return TicketNumber; 
  // }
  
  public String getPassengerFullName()
   {return PassengerFullName;
  }
  
  //  public String getTripSource()
  //  {return TripSource;
  // }
  
   public String getFlightCompany()
   {return FlightCompany;
   }
  
  //  public String getTripDestination()
  //  {return TripDestination;
  // }
  
  //  public LocalDate getDepartingDate()
  //  {return DepartingDate;
  //  }
  
  //  public LocalDate getReturnDate()
  //  {return ReturnDate;
  //  }
  
   public int getTotalPassengers()
   {return TotalPassengers;
   }
  
   public double getTotalTicketPrice()
   {return TotalTicketPrice;
   }
  
   public int getChildPassengers()
   {return ChildPassengers;
   }
  
   public int getAdultPassengers()
   {return AdultPassengers;
   }
  
  //  public void setTicketNumber(String TicketNumber)
  //  {this.TicketNumber = TicketNumber;
  //  } 
  
   public void setPassengerFullName(String PassengerFullName)
   {this.PassengerFullName = PassengerFullName;
   }
  
  //  public void setTripSource(String TripSource)
  //  {this.TripSource = TripSource;
  //  }
  
   public void setFlightCompany(String FlightCompany)
   {this.FlightCompany = FlightCompany;
   }
  
  //  public void setTripDestination(String TripDestination)
  // {this.TripDestination = TripDestination;
  //  }
  
  //  public void setDepartingDate(LocalDate DepartingDate)
  //  {this.DepartingDate = DepartingDate;
  //  }
  
  //  public void setReturnDate(LocalDate ReturnDate)
  //  {this.ReturnDate = ReturnDate;
  //  }
  
  //  public void setTotalPassengers(int totalPassengers, int TotalPassengers)
  //  {this.TotalPassengers = ChildPassengers+AdultPassengers;
  //  }
  
  //  public void setChildPassengers(int ChildPassengers)
  //  {this.ChildPassengers = ChildPassengers;
  //  }
  
  //  public void setAdultPassengers(int AdultPassengers)
  //  {this.AdultPassengers = AdultPassengers;
  //  }
  
  //  public void setTotalTicketPrice(double TotalTicketPrice)
  //  {this.TotalTicketPrice = TotalTicketPrice;
  //  }
  //  public String toString(){
  //  return "Dear " + PassengerFullName + ". Thank you for booking your flight with " +
  // FlightCompany + ". \nFollowing are the details of your booking and the trip:" + "\n" +
  // "Ticket Number: " + TicketNumber + "\n" +
  // "From " + tripSource + " to " + tripDestination + "\n" +
  // "Date of departure: " + DepartingDate + "\n" +
  // "Date of return: " + ReturnDate + "\n" +
  // "Total passengers: " + TotalPassengers + "\n" +
  // "Total ticket price in Euros: " + TotalTicketPrice;
    
  //  } 





   public enum TripSource{
  NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS;
}
public enum TripDestination{
 NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS;
}
public enum Airport{
  NANJING_LUKOU_AIRPORT,BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAULLE_FIRPORT;
}
private TripSource tripSource;
public TripDestination tripDestination;
public Airport sourceAirport;
public Airport destinationAirport;
public void setTripSource(String tripSource){
  switch(tripSource){
    case "1":
    this.tripSource=TripSource.NANJING;
    this.sourceAirport=Airport.NANJING_LUKOU_AIRPORT;
    break;
    case "2":
    this.tripSource=TripSource.BEIJING;
    this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
    break;
    case "3":
    this.tripSource=TripSource.SHANGHAI;
    this.sourceAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
    break;
    case "4":
    this.tripSource=TripSource.OULU;
    this.sourceAirport=Airport.OULU_AIRPORT;
    break;
    case "5":
    this.tripSource=TripSource.HELSINKI;
    this.sourceAirport=Airport.HELSINKI_AIRPORT;
    break;
    case "6":
    this.tripSource=TripSource.PARIS;
    this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_FIRPORT;
    break;
    default:
    System.out.println("Invaild choice");
    break;
  }
}
public TripSource getTripSource(){
  return this.tripSource;
}



public void setTripDestination(String tripSource , String tripdestination){
  
  switch(tripdestination){
    case "1":
    this.tripDestination=TripDestination.NANJING;
    this.destinationAirport=Airport.NANJING_LUKOU_AIRPORT;
    break;
    case "2":
    this.tripDestination=TripDestination.BEIJING;
    this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
    break;
    case "3":
    this.tripDestination=TripDestination.SHANGHAI;
    this.destinationAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
    break;
    case "4":
    this.tripDestination=TripDestination.OULU;
    this.destinationAirport=Airport.OULU_AIRPORT;
    break;
    case "5":
    this.tripDestination=TripDestination.HELSINKI;
    this.destinationAirport=Airport.HELSINKI_AIRPORT;
    break;
    case "6":
    this.tripDestination=TripDestination.PARIS;
    this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_FIRPORT;
    break;
    default:
    System.out.println("Invaild choice");
    break;
      }
}
public TripDestination getTripDestination(){
  return tripDestination;
}


public void setSourceAirport(Airport sourceAirport){
if(sourceAirport.equals(destinationAirport)){
  this.sourceAirport=sourceAirport;
}else{
  throw new IllegalArgumentException("choose again.");
}
}
public Airport getSourceAirport(){
  return sourceAirport;
}


public void setTripDestination(Airport destinationAirport){
  if(destinationAirport.equals(sourceAirport)){
    this.destinationAirport=destinationAirport;
  }else{
    throw new IllegalArgumentException("choose again.");
  }
}
public Airport getDestinatiAirport(){
  return destinationAirport;
}


  


//  public LocalDate departureDate;
//  public LocalDate returnDate;
//  public void setDepartureDate(LocalDate departureDate) 
//  {
//   String sdepart = "2023-03-04";
//   this.departureDate = LocalDate.parse(sdepart);
//  }

//  public void setReturnDate(LocalDate returnDate) 
//  {
//   String sreturn = "2023-03-05";

//   public void setReturnDate(LocalDate returnDate){
//       String sreturn="2023-03-05";
//       this.returnDate=departureDate.plusDays(2);
//       Period period=Period.between(returnDate,departureDate);
//       long i = departureDate.toEpochDay() - returnDate.toEpochDay();
//       if(i>=0 && i<1){
//         LocalDate returnDate2=departureDate.plusDays(2);
//       }else if(i>=1 && i<2){
//         LocalDate returnDate2=departureDate.plusDays(1);
//       }
//     }
//     public LocalDate getReturnDate(){
//       return returnDate;
//     }
 public LocalDate departureDate;
 public LocalDate returnDate;
 public void setDepartureDate(LocalDate departureDate)
 {
 String sdepart ="2023-03-04";
 this.departureDate=LocalDate.parse(sdepart);
 }
 
 public LocalDate getDepartureDate()
 {
 return departureDate;
 }
 
 public void setReturnDate(LocalDate returnDate)
 {
 
 this.returnDate=departureDate.plusDays(2);
 long i = departureDate.toEpochDay() - returnDate.toEpochDay();
   
   if(i>=0 && i<1)
   {
   this.returnDate=departureDate.plusDays(2);
   }   
   else if(i>=1 && i<2)
   {
   this.returnDate=departureDate.plusDays(1);
   } 
 }
 
 public LocalDate getReturnDate()
 {
 return returnDate;
 }



 private double departingTicketPrice;
 private double returnTicketPrice;

 public void setTotalPassengers(int totalPassengers, int TotalPassengers) 
 {
  this.TotalPassengers = ChildPassengers + AdultPassengers;
 }

 public void setTotalTicketPrice() 
 {
  this.TotalTicketPrice = Math.abs((((2 * ((300 + (0.1 * 300)) + (0.05 * 300))) + (5 * ((300 + (0.1 * 300)) + (0.05 * 300)))) + 250) * 2);
 }

 public void setDepartingTicketPrice(int child, int adult) 
 {
  this.departingTicketPrice = DepartingTicketPrice;
 }
 public void setReturnTicketPrice() 
 {
  this.returnTicketPrice = ReturnTicketPrice;
 }

Random random=new Random();
public String ticketNumber="11FASDFDOM";
 public void setTicketNumber() 
 {
  String ticketNumber = null;
  switch (tripType) {
      case ONE_WAY:
          ticketNumber = "11";
          break;
      case RETURN:
          ticketNumber = "22";
          break;
  }
  switch (bookingClass) {
      case FIRST:
          ticketNumber = ticketNumber + "F";
          break;
      case BUSINESS:
          ticketNumber = ticketNumber + "B";
          break;
      case ECONOMY:
          ticketNumber = ticketNumber + "E";
          break;
  }
  for (int i = 0; i < 4; i++) {
      char f = (char) ((random.nextInt(26) + 65));
      ticketNumber = ticketNumber + f;
  }
  this.ticketNumber = ticketNumber + "DOM";
  if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
      this.ticketNumber = ticketNumber + "DOM";
  }
  if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
      this.ticketNumber = ticketNumber + "DOM";
  }
  if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
      this.ticketNumber = ticketNumber + "DOM";
  }
  if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
      this.ticketNumber = ticketNumber + "DOM";
  }
  if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
  if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
      this.ticketNumber = ticketNumber + "INT";
  }
}

public String getTicketNumber(){
  return ticketNumber;
}

    
    
    
    
    
    
    
    
private ConfirmationMessage ConfirmationMessage;
public enum ConfirmationMessage{
  CHANGE,NOTCHANGE;
}
public void setConfirmationMessage(String confirmationMessage){
switch(confirmationMessage){
  case "1":
  this.ConfirmationMessage = ConfirmationMessage.CHANGE;
  System.out.println("Thank you for booking your flight with " + flightCompany + ". Following are the details \n" +
          "of your booking and the trip: \n" +
          "Ticket Number: " + ticketNumber + "\n" +
          "Passenger Name: " + passengerFullName + "\n" +
          "From TripSource to " + tripDestination + "\n" +
          "Date of departure: " + departureDate + "\n" +
          "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
          returnDate + ")\n" +
          "Total passengers: " + totalPassengers + "\n" +
          "Total ticket price in Euros: " + totalTicketPrice + "\n" +
          "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
          "less than two days apart from your departure date");
  break;
case "2":
  this.ConfirmationMessage = ConfirmationMessage.NOTCHANGE;
  System.out.println("Thank you for booking your flight with " + flightCompany + ".Following are the details \n" +
          "of your booking and the trip: \n" +
          "Ticket Number: " + ticketNumber + "\n" +
          "Passenger Name: " + passengerFullName + "\n" +
          "From TripSource to " + tripDestination + "\n" +
          "Date of departure: " + departureDate + "\n" +
          "Date of return: " + returnDate + "\n" +
          "Total passengers: " + totalPassengers + "\n" +
          "Total ticket price in Euros: " + totalTicketPrice + "\n");

  break;
}
}



  }
