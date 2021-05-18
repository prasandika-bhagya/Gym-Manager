package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.List;

//interface called as GymManager
public interface GymManager {


    //adding new members to the gym data base
     void addingNewMemberToGymDatabase(DefaultMember member);

    //deleting members from the gym data base
     boolean deletingMemberFromGymDatabase(String membershipNoOfTheMemberOfGym);

    //printing members from the gym data base
     void printListOfMemberFromGymDatabase();

    //sorting members of the gym data base
     void reArrangeMemberFromGymDatabase();

    //saving members to the gym data base
     void SavingMemberToGymDatabase();

    //listing members of gym data base
     List<DefaultMember> obtainingMemberList();

    //finding members from database by his membership number
     DefaultMember obtainMemberByHisMembershipNumber(String membershipNoOfTheMemberOfGym, Label labelOutputForTheMemberName, Label labelOutputForTheMembeId, Label labelOutputForTheMemberTelephone, Label labelOutputForTheMembeEmail, Label labelOutputForTheMembeDate);

    //finding members from database by his name
     DefaultMember[] obtainMemberByHisMembershipName(String membershipNameOfTheMemberOfGym);
}
