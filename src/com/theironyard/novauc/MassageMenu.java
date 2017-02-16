package com.theironyard.novauc;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by souporman on 2/15/17.
 */
public class MassageMenu {

    //These are preset people who massage in a list so that the new user doesn't feel alone
    public void createOptions() {
        Main.listMasseuse.add(new HappyEnding("Will", 60, 220, 5, "Happy Endings"));
        Main.listMasseuse.add(new Aromatherapy("Prakash", 90, 400, 5, "Aromatherapy"));
        Main.listMasseuse.add(new SwedishMassage("D'Angelo", 45, 200, 2, "Swedish Massage"));
        Main.listMasseuse.add(new HotStoneMassage("Ross", 75, 333, 3, "Hot Stone Massage"));
        Main.listMasseuse.add(new DeepTissueMassage("Peter", 60, 450, 1, "Deep Tissue Massage"));
        Main.listMasseuse.add(new HotStoneMassage("Mike", 10, 222, 3, "Hot Stone Massage"));
        Main.listMasseuse.add(new Aromatherapy("Alvin", 50, 322, 2, "Aromatherapy"));
    }

    //This is the welcome screen showing our top of the line display page setup
    public void massageMenu() throws IOException {
        while (true) {
            System.out.println("##############################################################");
            System.out.println("################                               ###############");
            System.out.println("########             HELLO AND WELCOME TO             ########");
            System.out.println("######                                                  ######");
            System.out.println("#####           MADAM TRUNG'S MASSAGE PALACE             #####");
            System.out.println("#####                                                    #####");
            System.out.println("#####        PLEASE SELECT ONE OF THESE OPTIONS          #####");
            System.out.println("#####                                                    #####");
            System.out.println("#####    (1)[SHOW OUR 'GIRLS']  ##  (2)[RATE A SERVICE]  #####");
            System.out.println("#####                                                    #####");
            System.out.println("######                (3)[JOIN OUR TEAM]                ######");
            System.out.println("##############################################################");
            int menuResponse = Main.kb.nextInt();
            switch (menuResponse) {
                case 1:
                    showGirls();
                    System.out.println("Would you like to return to the main menu??");
                    System.out.println("YES or YES or 1 ?");
                    String worthlessInput1 = Main.kb2.nextLine();
                    break;
                case 2:
                    rateGirl();
                    System.out.println("Would you like to return to the main menu??");
                    System.out.println("YES or YES or 1 ?");
                    String worthlessInput2 = Main.kb2.nextLine();
                    break;
                case 3:
                    joinTeam();
                    System.out.println("Would you like to return to the main menu??");
                    System.out.println("YES or YES or 1 ?");
                    String worthlessInput3 = Main.kb2.nextLine();
                    break;
                default:
                    System.out.println("You have chosen to have all out 'GIRLS' rub up against you for $10000");
                    System.out.println("now you have cholera and you're broke please leave the establishment before I have to call security");
                    System.out.println("decide :  [RETURN] with a disguise or [Leave] the establishment");
                    String leaveStatement=Main.kb4.nextLine();
                    if(leaveStatement.equalsIgnoreCase("leave")){
                        System.out.println("Don't let the door hit you where the good Lord split ya");
                    }
                    if(leaveStatement.equalsIgnoreCase("return")){
                        System.out.println("You return in the back door");
                    }
                    break;
            }

        }
    }

    public void showGirls() throws IOException {

        File file = new File("masseuse.json");
        FileWriter fwriter = new FileWriter(file);

        for (Massage listItem : Main.listMasseuse) {
            listItem.print();
        }
        String jsonFormatedItem = Main.serializer.serialize(Main.listMasseuse);
        fwriter.append(jsonFormatedItem);
        fwriter.close();
//        Person p = new Person();
//        p.setName("Alice Smith");
//        p.setAge(30);
//        File f=new File("person.json");
//        JsonSerializer serializer=new JsonSerializer();
//        String jsonFormatedPerson =serializer.serialize(p);
//        FileWriter fw = new FileWriter(f);
//        fw.write(jsonFormatedPerson);
//        fw.close();

//        Scanner s = new Scanner(f);
//        s.useDelimiter("\\Z");
//        String contents =s.next();
//        JsonParser parser = new JsonParser();
//        Person p2 = parser.parse(contents,Person.class);
//        System.out.println(p2);
//        System.out.println("p2 name is "+ p2.name);
//        System.out.println("p2 age is "+ p2.age);
//        System.out.println("p2 is alive ? "+ p2.isAlive);
    }

    public void rateGirl() throws IOException {
        System.out.println("Which one of our 'girls' serviced you this afternoon");
        String ratedGirl = Main.kb3.nextLine();
        for (Massage listItem : Main.listMasseuse) {
//            listItem.print();
            if (ratedGirl.equalsIgnoreCase(listItem.getMasseuse())) {
                listItem.print();
                System.out.printf("You choose to rate %s\n", listItem.getMasseuse());
                System.out.printf("Please leave your YELP rating for %s\n", listItem.getMasseuse());
                System.out.println("    1       2     3     4     5     ");
                System.out.println("   Star   Star   Star  Star  Star   ");
                int starChoice = Main.kb2.nextInt();
                switch (starChoice) {
                    case 1:
                        listItem.setYelpRating(1);
                        break;
                    case 2:
                        listItem.setYelpRating(2);
                        break;
                    case 3:
                        listItem.setYelpRating(3);
                        break;
                    case 4:
                        listItem.setYelpRating(4);
                        break;
                    case 5:
                        listItem.setYelpRating(5);
                        break;
                    default:
                        System.out.println("for some reason you can't understand simple logic");
                        System.out.println("please leave now before we call security");
                        break;
                }
            }
            if(!ratedGirl.equalsIgnoreCase(listItem.getMasseuse())) {
                System.out.println("You chose a 'girl' not employed here seems like you got scammed");

            }
        }

        File file = new File("masseuse.json");
        FileWriter fwriter = new FileWriter(file);
        String jsonFormatedItem = Main.serializer.serialize(Main.listMasseuse);
        fwriter.append(jsonFormatedItem);
        fwriter.close();
    }

    public void joinTeam()throws IOException {
        System.out.println("Perfect you are a beautiful girl some one would be happy to get a 'massage' from you");
        System.out.println("Please fill out the form so you can join our little family");
        System.out.println("Please give us you name");
        String joinTeamName = Main.kb7.nextLine();
        System.out.println("How long are your 'massage' sessions for");
        int joinTeamLength = Main.kb6.nextInt();
        System.out.println("What's your price for you sessions");
        int joinTeamPrice = Main.kb5.nextInt();
        System.out.println("What's your average YELP rating");
        int joinTeamYelp = Main.kb4.nextInt();
        System.out.println("And finally what is your specialty that brings the boys to the yard?");
        String throwAwayAnswer = Main.kb3.nextLine();

        new HappyEnding(joinTeamName,joinTeamLength,joinTeamPrice,joinTeamYelp,"Happy Endings");
        System.out.println("Thank you for joining us at Madam Trungs' massage palace");
        System.out.println("There has been an error we no longer have any openings in the "+ throwAwayAnswer+ " department");
        System.out.println("You have been re assigned to the Happy Endings department");
        System.out.println("Too bad you signed the waiver so you must complete your year in service.");


        File file = new File("masseuse.json");
        FileWriter fwriter = new FileWriter(file);

        String jsonFormatedItem = Main.serializer.serialize(Main.listMasseuse);
        fwriter.append(jsonFormatedItem);
        fwriter.close();

    }
}
