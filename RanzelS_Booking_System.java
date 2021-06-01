/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ranzel.s_booking_system;

import javax.swing.JOptionPane;

/**
 *
 * @author rogie
 */
public class RanzelS_Booking_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        char question = 0; // while loop for repeating questions
        
        //Destination 1 - Manila to Legazpi
        double MNLLGP = 1605;
        
        //Destination 2 - MANILA TO CEBU  
        double MNLCEB = 1661;
        
        //Destionation 3 - MANILA TO DAVAO
        double MNLDVO = 1621;
        
        String name;
        int age;
        
        
        while (question != 'X')
        {
        question=JOptionPane.showInputDialog(null, "Welcome to Silver Sky"
                + "\nPlease choose your destination"
                + "\n[A] Manila to Legazpi"
                + "\n[B] Manila to Cebu"
                + "\n[C] Manila to Davao"
                + "\n[X] to exit","Silver Sky",JOptionPane.QUESTION_MESSAGE).charAt(0);
        
            if (question == 'A'||question=='a') ////////////// MANILA TO LEGAZPI
            {  
                JOptionPane.showMessageDialog(null, "You selected Manila to Legazpi"
                        + "\nTicket Price: Php "+MNLLGP);
                name = JOptionPane.showInputDialog(null, "Please enter your complete name","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                char question1;
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age","Silver Sky",JOptionPane.QUESTION_MESSAGE));
                question1 = JOptionPane.showInputDialog(null, "Hello Mr/Mrs. "+name+", please choose your Departure Time"
                        + "\n[A] 9:15 AM - 10:15 AM"
                        + "\n[B] 10:20 AM - 11:20 AM"
                        + "\n[C] 3:00 PM - 4:00 PM","Silver Sky",JOptionPane.QUESTION_MESSAGE).charAt(0);
                if (question1 == 'A'||question1=='a') // 9:15 AM - 10:15 AM
                {
                    JOptionPane.showMessageDialog(null, "You selected 9:15 AM - 10:15 AM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price: Php "+ MNLLGP,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLLGP && age >= 60)
                    {
                                sd = MNLLGP * 0.20;
                                dc = MNLLGP - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Legazpi"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 9:15 AM - 10:15 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLLGP
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else if (payment >=MNLLGP && age < 60)
                    {
                                total = payment - MNLLGP;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Legazpi"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 9:15 AM - 10:15 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLLGP
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
                else if (question1 == 'B'||question1=='b') // 10:20 AM - 11:20 AM
                {
                    JOptionPane.showMessageDialog(null, "You selected 10:20 AM - 11:20 AM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price : Php "+ MNLLGP,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLLGP && age >= 60)
                    {
                                sd = MNLLGP * 0.20;
                                dc = MNLLGP - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Legazpi"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 10:20 AM - 11:20 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid : Php "+payment
                                        + "\nTicket Price : Php "+MNLLGP
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else if (payment >=MNLLGP && age < 60)
                    {
                        total = payment - MNLLGP;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Legazpi"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 10:20 AM - 11:20 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid : Php "+payment
                                        + "\nTicket Price : Php "+MNLLGP
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
                else if (question1 == 'C'||question1=='c') // 3:00 PM - 4:00 PM
                {
                    JOptionPane.showMessageDialog(null, "You selected 3:00 PM - 4:00 PM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price: Php "+ MNLLGP,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLLGP && age >= 60)
                    {
                                sd = MNLLGP * 0.20;
                                dc = MNLLGP - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Legazpi"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 3:00 PM - 4:00 PM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLLGP
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                                
                    else if (payment >=MNLLGP && age < 60)
                    {
                        total = payment - MNLLGP;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Legazpi"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 3:00 PM - 4:00 PM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLLGP
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            
            else if (question == 'B'||question=='b') //////////// MANILA TO CEBU
            {
                JOptionPane.showMessageDialog(null, "You selected Manila to Cebu"
                        + "\nTicket Price: Php "+MNLCEB);
                name = JOptionPane.showInputDialog(null, "Please enter your complete name","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                char question1;
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age","Silver Sky",JOptionPane.QUESTION_MESSAGE));
                question1 = JOptionPane.showInputDialog(null, "Hello Mr/Mrs. "+name+", please choose your Departure Time"
                        + "\n[A] 9:15 AM - 10:15 AM"
                        + "\n[B] 10:20 AM - 11:20 AM"
                        + "\n[C] 3:00 PM - 4:00 PM","Silver Sky",JOptionPane.QUESTION_MESSAGE).charAt(0);
                
                if (question1 == 'A'||question1=='a') // 9:15 AM - 10:15 AM
                {
                    JOptionPane.showMessageDialog(null, "You selected 9:15 AM - 10:15 AM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price: Php "+ MNLCEB,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLCEB && age >= 60)
                    {
                                sd = MNLCEB * 0.20;
                                dc = MNLCEB - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Cebu"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 9:15 AM - 10:15 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLCEB
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else if (payment >=MNLCEB && age < 60)
                    {
                                total = payment - MNLCEB;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Cebu"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 9:15 AM - 10:15 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLCEB
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                       
                }
                
                else if (question1 == 'B'||question1=='b') // 10:20 AM - 11:20 AM
                {
                    JOptionPane.showMessageDialog(null, "You selected 10:20 AM - 11:20 AM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price : Php "+ MNLCEB,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLCEB && age >= 60)
                    {
                                sd = MNLCEB * 0.20;
                                dc = MNLCEB - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Cebu"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 10:20 AM - 11:20 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid : Php "+payment
                                        + "\nTicket Price : Php "+MNLCEB
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else if (payment >=MNLCEB && age < 60)
                    {
                        total = payment - MNLCEB;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Cebu"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 10:20 AM - 11:20 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid : Php "+payment
                                        + "\nTicket Price : Php "+MNLCEB
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                else if (question1 == 'C'||question1=='c') // 3:00 PM - 4:00 PM
                {
                    JOptionPane.showMessageDialog(null, "You selected 3:00 PM - 4:00 PM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price: Php "+ MNLCEB,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLCEB && age >= 60)
                    {
                                sd = MNLCEB * 0.20;
                                dc = MNLCEB - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Cebu"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 3:00 PM - 4:00 PM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLCEB
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                                
                    else if (payment >=MNLCEB && age < 60)
                    {
                        total = payment - MNLCEB;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Cebu"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 3:00 PM - 4:00 PM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLCEB
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            else if (question == 'C' || question =='c') /////////MANILA TO DAVAO
            {
                JOptionPane.showMessageDialog(null, "You selected Manila to Davao"
                        + "\nTicket Price: Php "+MNLDVO);
                name = JOptionPane.showInputDialog(null, "Please enter your complete name","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                char question1;
                age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age","Silver Sky",JOptionPane.QUESTION_MESSAGE));
                question1 = JOptionPane.showInputDialog(null, "Hello Mr/Mrs. "+name+", please choose your Departure Time"
                        + "\n[A] 9:15 AM - 10:15 AM"
                        + "\n[B] 10:20 AM - 11:20 AM"
                        + "\n[C] 3:00 PM - 4:00 PM","Silver Sky",JOptionPane.QUESTION_MESSAGE).charAt(0);
                
                if (question1 == 'A'||question1=='a') // 9:15 AM - 10:15 AM
                {
                    JOptionPane.showMessageDialog(null, "You selected 9:15 AM - 10:15 AM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price: Php "+ MNLDVO,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLDVO && age >= 60)
                    {
                                sd = MNLDVO * 0.20;
                                dc = MNLDVO - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Davao"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 9:15 AM - 10:15 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLDVO
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else if (payment >=MNLDVO && age < 60)
                    {
                                total = payment - MNLDVO;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Davao"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 9:15 AM - 10:15 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLDVO
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                       
                }
                
                else if (question1 == 'B'||question1=='b') // 10:20 AM - 11:20 AM
                {
                    JOptionPane.showMessageDialog(null, "You selected 10:20 AM - 11:20 AM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price : Php "+ MNLDVO,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLDVO && age >= 60)
                    {
                                sd = MNLDVO * 0.20;
                                dc = MNLDVO - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Davao"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 10:20 AM - 11:20 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid : Php "+payment
                                        + "\nTicket Price : Php "+MNLDVO
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else if (payment >=MNLDVO && age < 60)
                    {
                        total = payment - MNLDVO;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Davao"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 10:20 AM - 11:20 AM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid : Php "+payment
                                        + "\nTicket Price : Php "+MNLDVO
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                else if (question1 == 'C'||question1=='c') // 3:00 PM - 4:00 PM
                {
                    JOptionPane.showMessageDialog(null, "You selected 3:00 PM - 4:00 PM","Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    String questiondate1;
                    double payment,sd,dc,total;
                    questiondate1 = JOptionPane.showInputDialog(null, "Please enter the Departure Date in Mon DD, YYYY format (Eg. January 1, 2001).","Silver Sky",JOptionPane.QUESTION_MESSAGE);
                    payment = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter the amount to be paid"
                            + "\nTicket Price: Php "+ MNLDVO,"Payment - Silver Sky",JOptionPane.QUESTION_MESSAGE));
                    if (payment >=MNLDVO && age >= 60)
                    {
                                sd = MNLDVO * 0.20;
                                dc = MNLDVO - sd;
                                total = payment - dc;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Davao"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 3:00 PM - 4:00 PM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: 20%"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLDVO
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                                
                    else if (payment >=MNLDVO && age < 60)
                    {
                        total = payment - MNLDVO;
                                JOptionPane.showMessageDialog(null, "Hello Mr/Mrs. "+name+", this will be your official receipt"
                                        + "\n\nDestination: Manila to Davao"
                                        + "\nDeparture Date: "+questiondate1
                                        + "\nDeparture Time: 3:00 PM - 4:00 PM"
                                        + "\nTravel Time: 1hr"
                                        + "\nSenior Discount: None"
                                        + "\n\nAmount Paid: Php "+payment
                                        + "\nTicket Price: Php "+MNLDVO
                                        + "\nChange: Php "+total,"Official Receipt - Silver Sky",JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Insufficient amount, Please try again","Error Message",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            
            if (question == 'X' || question == 'x')
            {
                JOptionPane.showMessageDialog(null, "You may now exit the program");
                System.exit(0); // for exit
            }
        }
    }  
}