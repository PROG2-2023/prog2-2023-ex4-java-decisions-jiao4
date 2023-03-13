package prog2.exercise4.flight.booking.system;
import java.time.LocalDate;
import java.util.Random;
import javax.lang.model.util.ElementScanner14;
  
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
   
   public FlightBooking(String a, LocalDate depart, LocalDate returnDate, int w, int e) 
   {
   this.PassengerFullName = a;
   this.DepartingDate = depart;
   this.ReturnDate = returnDate;
   this.ChildPassengers =w;
   this.AdultPassengers =e;
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
  
   public void setDepartingDate(LocalDate DepartingDate)
   {this.DepartingDate = DepartingDate;
   }
  
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





   private  BookingClass bookingClass;
   public enum BookingClass
   {
   FIRST,BUSINESS,ECONOMY;
   }
   public void setBookingClass(String bookingClass)
   {
   switch (bookingClass) 
    {

    case"1":
    this.bookingClass = BookingClass.FIRST;;
    break;
    
    case"2":
    this.bookingClass = BookingClass.BUSINESS;
    break;
    
    case"3":
    this.bookingClass = BookingClass.ECONOMY;
    break;
    default:
     }
   }
   public BookingClass getBookingClass()
   {
   return bookingClass;
   }


   private TripType tripType;
   public enum TripType
   {
    ONE_WAY, RETURN;
   }
   public void setTripType(String tripType ) 
    {
    switch (tripType )
     {
      case "1":
      this.tripType = TripType.ONE_WAY;
      break;
      case "2":
      this.tripType = TripType.RETURN;
      break;
      default:
     }
    }
   public TripType getTripType()
   {
   return tripType;
   }
   
   
   private TripSource tripSource;
   public enum TripSource 
   {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS;
   }
  public void setTripSource(String tripSource) 
  {
    switch (tripSource) 
     {
      case "1":
      this.tripSource = TripSource.NANJING;
      break;
      case "2":
      this.tripSource = TripSource.BEIJING;
      break;
      case "3":
      this.tripSource = TripSource.SHANGHAI;
      break;
      case "4":
      this.tripSource = TripSource.OULU;
      break;
      case "5":
      this.tripSource = TripSource.HELSINKI;
      break;
      case "6":
      this.tripSource = TripSource.PARIS;
      break;
      default:
     }
  }
   public TripSource getTripSource()
   {
   return tripSource;
   }








   private TripDestination tripDestination;
   public enum TripDestination 
   {
    NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS;
   }
  private SourceAirport sourceAirport;
   public enum SourceAirport
   {
    NANJING_LUKOU_INTERNATIONAL_AIRPORT,BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,
   OULU_AIRPORT,HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAUUE_AIRPORT;
   }
    
    public void setTripDestination(String tripdestination,String tripDestination2) 
    {
    switch (tripdestination) 
    {
      case "1":
      this.tripDestination = TripDestination.NANJING;
      this.sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
      break;
      case "2":
      this.tripDestination = TripDestination.BEIJING;
      this.sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
      break;
      case "3":
      this.tripDestination = TripDestination.SHANGHAI;
      this.sourceAirport = SourceAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
      break;
      case "4":
      this.tripDestination = TripDestination.OULU;
      this.sourceAirport = SourceAirport.OULU_AIRPORT;
      break;
      case "5":
      this.tripDestination = TripDestination.HELSINKI;
      this.sourceAirport = SourceAirport.HELSINKI_AIRPORT;
      break;
      case "6":
      this.tripDestination = TripDestination.PARIS;
      this.sourceAirport = SourceAirport.PARIS_CHARLES_DE_GAUUE_AIRPORT;
      break;
      default:
    }
    if (tripSource.equals(tripdestination))
   {
    System.out.print ("Error,please choose correct trip destination");
   }
   
   
    }
    public TripDestination getTripDestination() 
    {
    return tripDestination;
    }
  
    
    
    private DestinationAirport destinationAirport;
   public enum DestinationAirport 
   {
    NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAUUE_AIRPORT;
   }

  public void setDestinationAirport(String destinationAirport) {
    if (tripDestination == TripDestination.NANJING) {
      this.destinationAirport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
  }
  if (tripDestination == TripDestination.SHANGHAI) {
      this.destinationAirport = DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
  }
  if (tripDestination == TripDestination.SHANGHAI) {
      this.destinationAirport = DestinationAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
  }
  if (tripDestination == TripDestination.OULU) {
      this.destinationAirport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
  }
  if (tripDestination == TripDestination.HELSINKI) {
      this.destinationAirport = DestinationAirport.HELSINKI_AIRPORT;
  }
  if (tripDestination == TripDestination.PARIS) {
      this.destinationAirport = DestinationAirport.PARIS_CHARLES_DE_GAUUE_AIRPORT;
  }
  }
 public DestinationAirport destinationAirport()
 {
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
  this.departingTicketPrice = departingTicketPrice;
 }
 public void setReturnTicketPrice() 
 {
  this.returnTicketPrice = returnTicketPrice;
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





  }


