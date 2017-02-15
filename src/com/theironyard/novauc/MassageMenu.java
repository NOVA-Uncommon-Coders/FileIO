package com.theironyard.novauc;

/**
 * Created by souporman on 2/15/17.
 */
public class MassageMenu {
    public void oldCrap() {
//        public Item randomArmorCrafter(String typeOfArmor){
//            int value=(int)((Math.random()*1001)+1);
//            int weight;
//            int damage=0;
//            int damageReduction;
//            String rarity;
//            int randomRarity= (int)((Math.random()*6)+1);
//            switch (randomRarity){
//                case 1:
//                    rarity="common";
//                    break;
//                case 2:
//                    rarity="uncommon";
//                    break;
//                case 3:
//                    rarity="rare";
//                    break;
//                case 4:
//                    rarity="epic";
//                    break;
//                default:
//                    rarity="legendary";
//                    break;
//            }
//
//            String name =(prefixGenerator() + " " +typeOfArmor + " Armor of " + suffixGenerator());
//
//            if(typeOfArmor.equalsIgnoreCase("Cloth")){
//
//                weight=(int)((Math.random()*5)+1);
//                damageReduction=(int)((Math.random()*5)+1);
//
//                return new ClothArmor(value,weight,damage,damageReduction,rarity,"Armor","Plate armor",name);
//            }
//            else if(typeOfArmor.equalsIgnoreCase("Leather")){
//
//                weight=(int)((Math.random()*6)+2);
//                damageReduction=(int)((Math.random()*6)+2);
//                return new LeatherArmor(value,weight,damage,damageReduction,rarity,"Armor","Plate armor",name);
//            }
//            else if(typeOfArmor.equalsIgnoreCase("Mail")){
//
//                weight=(int)((Math.random()*7)+4);
//                damageReduction=(int)((Math.random()*7)+4);
//                return new MailArmor(value,weight,damage,damageReduction,rarity,"Armor","Plate armor",name);
//            }
//            else {
//
//                weight=(int)((Math.random()*11)+5);
//                damageReduction=(int)((Math.random()*11)+5);
//                return new PlateArmor(value,weight,damage,damageReduction,rarity,"Armor","Plate armor",name);
//            }
//        }


        int breaker = 7777;


//        public void whichArmor() {
//            int armorItem = (int) ((Math.random() * 5) + 1);
//            switch (armorItem) {
//                case 1://Cloth armor
//                    Main.itemInventory.add(Main.craftMe.randomArmorCrafter("Cloth"));
//                    break;
//                case 2://Leather armor
//                    Main.itemInventory.add(Main.craftMe.randomArmorCrafter("Leather"));
//                    break;
//                case 3://Mail armor
//                    Main.itemInventory.add(Main.craftMe.randomArmorCrafter("Mail"));
//                    break;
//                default://Plate armor
//                    Main.itemInventory.add(Main.craftMe.randomArmorCrafter("Plate"));
//                    break;
//            }
//        }
    }

    //These are preset people who massage in a list so that the new user doesn't feel alone
    public void createOptions() {
        Main.listMassuese.add(new HappyEnding("Will", 60, 220, 5, "Happy Endings"));
        Main.listMassuese.add(new Aromatherapy("Prakash", 90, 400, 5, "Aromatherapy"));
        Main.listMassuese.add(new SwedishMassage("D'Angelo", 45, 200, 2, "Swedish Massage"));
        Main.listMassuese.add(new HotStoneMassage("Ross", 75, 333, 3, "Hot Stone Massage"));
        Main.listMassuese.add(new DeepTissueMassage("Peter", 60, 450, 1, "Deep Tissue Massage"));
        Main.listMassuese.add(new HotStoneMassage("Mike", 10, 222, 3, "Hot Stone Massage"));
        Main.listMassuese.add(new Aromatherapy("Alvin", 50, 322, 2, "Aromatherapy"));
    }

    public void massageMenu() {
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

                    break;
                case 2:
                    //TODO create a rate a service statement
                    break;
                case 3:
                    //TODO create a join the team statement
                    break;
                default:
                    //TODO You have chosen to have all out "GIRLS" rub up against you for $10000
                    //TODO now you have cholera and you're broke please leave the establishment
                    break;
            }

        }
    }

    public void showGirls() {
        for (Massage listItem : Main.listMassuese) {
            listItem.print();
        }
    }
    public void rateGirl(){

    }
    public void joinTeam(){
        
    }

}
