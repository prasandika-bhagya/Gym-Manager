package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MyGymManager implements GymManager {
    //list - array
    List<DefaultMember> listOfMembersOfDb=new ArrayList<DefaultMember>();

    @Override
    //add members to the gym data base
    public void addingNewMemberToGymDatabase(DefaultMember member) {

        //checking size
        if(listOfMembersOfDb.size()<100){
            //if size <100 => adding member
            listOfMembersOfDb.add(member);

            //size of no of slots
            System.out.println("No of slots : "+listOfMembersOfDb.size());

            //getting no of free slots
            System.out.println("No of free slots : "+(100-listOfMembersOfDb.size()));

        }else{
            //printing sorry massage
            System.out.println("Sorry. No free slots are available.");
        }
    }
    @Override
    public boolean deletingMemberFromGymDatabase(String membershipNoOfTheMemberOfGym) {
        //getting boolean value as false
        boolean noted = false;

        for (DefaultMember member: listOfMembersOfDb){
            if(member.getMembershipNoOfTheMemberOfGym().equals(membershipNoOfTheMemberOfGym)){

                //getting boolean value as true
                noted =true;
                listOfMembersOfDb.remove(member);

                //printing user removing massage
                System.out.println(membershipNoOfTheMemberOfGym+" is removed.");

                //size of no of slots
                System.out.println("No of slots : "+ listOfMembersOfDb.size());

                //getting no of free slots
                System.out.println("No of free slots : "+(100-listOfMembersOfDb.size()));

                // checking  for adult member - gym
                if(member instanceof Over60Member){
                    System.out.println("Type : Adult Member");
                }

                // checking  for student member - gym
                else if(member instanceof StudentMember){
                    System.out.println("Type : Student Member");
                }

                // checking  for default member - gym
                else if(member instanceof StudentMember){
                    System.out.println("Type : Default Member");
                }

                //breaking flow
                break;
            }

            if (!noted){
                //printing member not found error
                System.out.println("");
            }
        }
        return noted;
    }

    //printing list in console
    @Override
    public void printListOfMemberFromGymDatabase() {
        for(DefaultMember member: listOfMembersOfDb){
            //printing membership number
            System.out.println("Membership Number Is : "+member.getMembershipNoOfTheMemberOfGym()+"");

            // checking  for adult member - gym
            if(member instanceof Over60Member){
                System.out.println("Type : Adult Member");
            }

            // checking  for student member - gym
            else if(member instanceof StudentMember){
                System.out.println("Type : Student Member");
            }

            // checking  for default member - gym
            else if(member instanceof DefaultMember){
                System.out.println("Type : Default Member");
            }

            //getting member name
            System.out.println("Name : "+member.getMembershipNameOfTheMemberOfGym()+" ");

            //getting enrolled date of member
            System.out.println("Enrolled Date: "+ member.getMembershipDateOfTheMemberOfGym());

            //getting telephone numberr
            System.out.println("Telephone Number: "+ member.getTelephoneNumberOfTheMemberOfGym());

            //getting telephone numberr
            System.out.println("Email: "+ member.getEmailAddressOfTheMemberOfGym());

            System.out.println("");
        }

        //checking whether that list equal to 0
        if(listOfMembersOfDb.size()==0){
            //printing empty
            System.out.println("No data to show. List is empty.");
        }
    }
    @Override
    public void reArrangeMemberFromGymDatabase() {
        //sorting list of member information
        Collections.sort(listOfMembersOfDb);
        //printing sorted list of member information
        System.out.println(listOfMembersOfDb);

    }
    @Override
    public void SavingMemberToGymDatabase() {

        //save data to the text file
        FileOutputStream savingMemberDataToTheTextFile = null;

        try {
            //implementing try catch (try)
            savingMemberDataToTheTextFile = new FileOutputStream("Report.txt");

            //implementing try catch (catch)
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //if details of output value equals to the null
        assert savingMemberDataToTheTextFile != null;

        //bufferedWriter function
        BufferedWriter bufferWriterForMemberDetailsOfTheDb = new BufferedWriter(new OutputStreamWriter(savingMemberDataToTheTextFile));

        //converting to an array called" array of member details of gym db"
        DefaultMember[] arrayOfMemberDetailsOfGymDb = new DefaultMember[listOfMembersOfDb.size()];

        //list of members of data base
        listOfMembersOfDb.toArray(arrayOfMemberDetailsOfGymDb);


        for (DefaultMember detailsOfMembersListOfDbGym : arrayOfMemberDetailsOfGymDb) {
            //try catch for error checking
            try {
                bufferWriterForMemberDetailsOfTheDb.write("ID Number: "+detailsOfMembersListOfDbGym.getMembershipNoOfTheMemberOfGym() + "    Name: " + detailsOfMembersListOfDbGym.getMembershipNameOfTheMemberOfGym()+"    Telephone: "+ detailsOfMembersListOfDbGym.getTelephoneNumberOfTheMemberOfGym()+"    Email: "+detailsOfMembersListOfDbGym.getEmailAddressOfTheMemberOfGym()+"    Date of entrance: "+detailsOfMembersListOfDbGym.getMembershipDateOfTheMemberOfGym());
                //try catch for error checking
            } catch (IOException e) {
                e.printStackTrace();
            }
            //try catch for error checking
            try {
                bufferWriterForMemberDetailsOfTheDb.newLine();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //try catch for error checkin
        try {
            bufferWriterForMemberDetailsOfTheDb.close();

            //using catch
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public List<DefaultMember> obtainingMemberList() {
        return null;
    }

    @Override
    //searching member by student number
    public DefaultMember obtainMemberByHisMembershipNumber(String membershipNoOfTheMemberOfGym, Label labelOutputForTheMemberName, Label labelOutputForTheMembeId, Label labelOutputForTheMemberTelephone, Label labelOutputForTheMembeEmail, Label labelOutputForTheMembeDate) {

        for (DefaultMember searchingMemberFromGymDataBase: listOfMembersOfDb) {
            //if function for checking
            if (searchingMemberFromGymDataBase.getMembershipNoOfTheMemberOfGym().equals(membershipNoOfTheMemberOfGym)) {

                //getting member name
                labelOutputForTheMemberName.setText(searchingMemberFromGymDataBase.getMembershipNameOfTheMemberOfGym());
                //getting member id
                labelOutputForTheMembeId.setText(searchingMemberFromGymDataBase.getMembershipNoOfTheMemberOfGym());
                //getting member telephone number
                labelOutputForTheMemberTelephone.setText(searchingMemberFromGymDataBase.getTelephoneNumberOfTheMemberOfGym());
                //getting member email
                labelOutputForTheMembeEmail.setText(searchingMemberFromGymDataBase.getEmailAddressOfTheMemberOfGym());
                //getting membership date
                labelOutputForTheMembeDate.setText(searchingMemberFromGymDataBase.getMembershipDateOfTheMemberOfGym());

            }

        }
        //return null value
        return null;
    }

    @Override
    public DefaultMember[] obtainMemberByHisMembershipName(String membershipNameOfTheMemberOfGym) {
        return new DefaultMember[0];
    }


}
