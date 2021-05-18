
package sample;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import static javafx.application.Application.launch;

public class ConsoleInterface extends Application {
    private final static MyGymManager controllerSystem = new MyGymManager();
// main window of gui -----------------------------------------------------------------------------------------------------------
    @Override
    public void start(Stage primaryStage) throws Exception{
        //main background image
        Image mainImageOfTheProgram = new Image("file:main.png");
        //setting main background image
        ImageView backgroundImageViewOfTheMainWindow = new ImageView(mainImageOfTheProgram);
        //getting new pane

        Pane paneForMain = new Pane();
        //title naming
        primaryStage.setTitle("Gym Management System");
        //topic of main window
        Label topicOfMain = new Label("Gym Management System");
        topicOfMain.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 35));
        topicOfMain.setLayoutY(45);
        topicOfMain.setLayoutX(225);
        primaryStage.setScene(new Scene(paneForMain, 850, 600));

        //setting resizable function disable
        primaryStage.setResizable(false);
        primaryStage.show();

        //button of sorting elements
        Button mainMenuSortedButtonOfGym = new Button("Sorted List Of Members");

        //setting button place fo window
        mainMenuSortedButtonOfGym.setLayoutX(320);
        mainMenuSortedButtonOfGym.setLayoutY(210);
        //pre defined length and width
        mainMenuSortedButtonOfGym.setPrefWidth(210);
        mainMenuSortedButtonOfGym.setPrefHeight(40);

        //design of the button
        mainMenuSortedButtonOfGym.setStyle("-fx-background-radius: 40; -fx-border-radius: 40;-fx-border-color:  #900C3F ;-fx-border-width: 4;-fx-font-weight: bold;");

        //button of search elements
        Button searchMemberButtonOfGym = new Button("Search Member");

        //setting button place fo window
        searchMemberButtonOfGym.setLayoutX(320);
        searchMemberButtonOfGym.setLayoutY(280);
        //pre defined length and width
        searchMemberButtonOfGym.setPrefWidth(210);
        searchMemberButtonOfGym.setPrefHeight(40);

        //design of the button
        searchMemberButtonOfGym.setStyle("-fx-background-radius: 40; -fx-border-radius: 40;-fx-border-color:  #900C3F ;-fx-border-width: 4;-fx-font-weight: bold;");

        //button of help elements
        Button helpButtonOfGym = new Button("Help");

        //setting button place fo window
        helpButtonOfGym.setLayoutX(320);
        helpButtonOfGym.setLayoutY(350);
        //pre defined length and width
        helpButtonOfGym.setPrefWidth(210);
        helpButtonOfGym.setPrefHeight(40);

        //design of the button
        helpButtonOfGym.setStyle("-fx-background-radius: 40; -fx-border-radius: 40;-fx-border-color:  #900C3F ;-fx-border-width: 4;-fx-font-weight: bold;");

        //adding background image to the pane
        paneForMain.getChildren().addAll(backgroundImageViewOfTheMainWindow);

        //adding topic to the pane
        paneForMain.getChildren().addAll(topicOfMain);

        //adding buttons to the pane
        paneForMain.getChildren().addAll(mainMenuSortedButtonOfGym);

        //adding buttons to the pane
        paneForMain.getChildren().addAll(searchMemberButtonOfGym);

        //adding buttons to the pane
        paneForMain.getChildren().addAll(helpButtonOfGym);


// sorted member window of gui -----------------------------------------------------------------------------------------------------------

        mainMenuSortedButtonOfGym.setOnAction(eventA1 -> {

            Stage sortedListWindowGymDb = new Stage();
            Pane rootForSortedMemberView = new Pane();

            // background image of sorted member view
            Image sortedListImage = new Image("file:list.png");
            ImageView sortedImage = new ImageView(sortedListImage);
            primaryStage.close();

            //topic of window
            Label topicOfListOfGymDb = new Label("Sorted List Of Members");
            //properties of topic
            topicOfListOfGymDb.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 35));
            topicOfListOfGymDb.setLayoutY(55);
            topicOfListOfGymDb.setLayoutX(225);


            sortedListWindowGymDb.setScene(new Scene(rootForSortedMemberView, 850, 600));

            //setting title
            sortedListWindowGymDb.setTitle("Sorted list of members");

            //setting resizable disable
            sortedListWindowGymDb.setResizable(false);
            sortedListWindowGymDb.show();

            //back button
            Button backButtonForGymDb = new Button("BACK");

            //button position creating
            backButtonForGymDb.setLayoutX(10);
            backButtonForGymDb.setLayoutY(544);

            //design of the button
            backButtonForGymDb.setStyle("-fx-background-radius: 40; -fx-border-radius: 40;-fx-border-color:  #2e7ac6 ;-fx-border-width: 4;-fx-font-weight: bold;");

            //fixed length and height to the button
            backButtonForGymDb.setPrefHeight(30);
            backButtonForGymDb.setPrefWidth(80);


            //table view - column of membership number
            TableColumn<DefaultMember, String> clmnMemberDetailsOfDbOfGym = new TableColumn<>("Member ID Number");//member id
            //denoting maximum width
            //width set to 150px
            clmnMemberDetailsOfDbOfGym.setMinWidth(150);
            //getting membership number
            clmnMemberDetailsOfDbOfGym.setCellValueFactory(new PropertyValueFactory<>("membershipNoOfTheMemberOfGym"));


            //table view - column of membership name
            TableColumn<DefaultMember, String> clmnMemberDetailsOfDbOfGym02 = new TableColumn<>("Member Name"); //member name
            //denoting maximum width
            //width set to 150
            clmnMemberDetailsOfDbOfGym02.setMinWidth(150);
            //getting membership number
            clmnMemberDetailsOfDbOfGym02.setCellValueFactory(new PropertyValueFactory<>("membershipNameOfTheMemberOfGym"));


            //table view - column of member tp number
            TableColumn<DefaultMember, String> clmnMemberDetailsOfDbOfGym03 = new TableColumn<>("Member TP Number");//member tp number
            //denoting maximum width
            clmnMemberDetailsOfDbOfGym03.setMinWidth(150);
            //getting membership number
            clmnMemberDetailsOfDbOfGym03.setCellValueFactory(new PropertyValueFactory<>("telephoneNumberOfTheMemberOfGym"));


            //table view - column of email
            TableColumn<DefaultMember, String> clmnMemberDetailsOfDbOfGym04 = new TableColumn<>("Member Email");//memebr e mail
            //denoting maximum width
            //width set to 150
            clmnMemberDetailsOfDbOfGym04.setMinWidth(150);
            //getting membership number
            clmnMemberDetailsOfDbOfGym04.setCellValueFactory(new PropertyValueFactory<>("emailAddressOfTheMemberOfGym"));


            //table view - column of date of admission
            TableColumn<DefaultMember, String> clmnMemberDetailsOfDbOfGym05 = new TableColumn<>("Date Of Admission");//memebr date of admission
            //denoting maximum width
            clmnMemberDetailsOfDbOfGym05.setMinWidth(150);
            //getting membership number
            clmnMemberDetailsOfDbOfGym05.setCellValueFactory(new PropertyValueFactory<>("membershipDateOfTheMemberOfGym"));


            //table view setting
            TableView<DefaultMember> tableForMember = new TableView<>();
            //setting items to the table view
            tableForMember.setItems(setMembersToTableViewOfDb());
            //getting details
            tableForMember.getColumns().addAll(clmnMemberDetailsOfDbOfGym, clmnMemberDetailsOfDbOfGym02, clmnMemberDetailsOfDbOfGym03, clmnMemberDetailsOfDbOfGym04, clmnMemberDetailsOfDbOfGym05);




            backButtonForGymDb.setOnAction(eventE1 -> {
                Stage goToMainStage = (Stage) backButtonForGymDb.getScene().getWindow();

                //closing current window
                goToMainStage.close();

                //showing primary stage
                primaryStage.show();
            });



            //adding background image to the pane
            rootForSortedMemberView.getChildren().addAll(sortedImage);

            //adding topic to the pane
            rootForSortedMemberView.getChildren().addAll(backButtonForGymDb);

            //adding back button to the pane
            rootForSortedMemberView.getChildren().addAll(topicOfListOfGymDb);

            //adding table view to the pane
            rootForSortedMemberView.getChildren().addAll(tableForMember);

        });


// search member window of gui -----------------------------------------------------------------------------------------------------------



        searchMemberButtonOfGym.setOnAction(eventA1 -> {

            //new stage
            Stage SearchMemberWindowGymDb = new Stage();
            //new pane
            Pane rootForSearchdMemberView = new Pane();

            // background image of sorted member view
            Image searchListImage = new Image("file:search.png");
            ImageView searchImage = new ImageView(searchListImage);
            primaryStage.close();

            //topic of window
            Label topicOfSearchOfGymDb = new Label("Search Members");
            //properties of topic
            topicOfSearchOfGymDb.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 35));
            topicOfSearchOfGymDb.setLayoutY(45);
            topicOfSearchOfGymDb.setLayoutX(225);

            SearchMemberWindowGymDb.setScene(new Scene(rootForSearchdMemberView, 850, 600));


            //setting title
            SearchMemberWindowGymDb.setTitle("Search members");

            //setting resizable disable
            SearchMemberWindowGymDb.setResizable(false);
            SearchMemberWindowGymDb.show();

            //back button
            Button backButtonForGymDbTwo = new Button("BACK");
            //button position creating
            backButtonForGymDbTwo.setLayoutX(10);
            backButtonForGymDbTwo.setLayoutY(544);

            //design of the button
            backButtonForGymDbTwo.setStyle("-fx-background-radius: 40; -fx-border-radius: 40;-fx-border-color:  #2e7ac6 ;-fx-border-width: 4;-fx-font-weight: bold;");

            //fixed length and height to the button
            backButtonForGymDbTwo.setPrefHeight(30);
            backButtonForGymDbTwo.setPrefWidth(80);

            // text fields of search
            TextField textFieldOfSearchField = new TextField();
            textFieldOfSearchField.setLayoutY(210);
            textFieldOfSearchField.setLayoutX(185);

            //properties of text field
            textFieldOfSearchField.setFont(Font.font("Times New Roman", FontWeight.BOLD, 30));
            textFieldOfSearchField.setPrefHeight(60);
            textFieldOfSearchField.setPrefWidth(430);

            //label for member details
            Label labelForTheMemberName = new Label("Member Name            -:");
            labelForTheMemberName.setLayoutY(380);
            labelForTheMemberName.setLayoutX(250);

            //text design
            labelForTheMemberName.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

            //label for member details
            Label labelForTheMemberId = new Label("ID Number                  -:");
            labelForTheMemberId.setLayoutY(410);
            labelForTheMemberId.setLayoutX(250);

            //text design
            labelForTheMemberId.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

            //label for member details
            Label labelForTheMemberTp = new Label("Telephone No              -:");
            labelForTheMemberTp.setLayoutY(440);
            labelForTheMemberTp.setLayoutX(250);

            //text design
            labelForTheMemberTp.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

            //label for member details
            Label labelForTheMemberEmail = new Label("E mail Address           -:");
            labelForTheMemberEmail.setLayoutY(470);
            labelForTheMemberEmail.setLayoutX(250);

            //text design
            labelForTheMemberEmail.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

            //label for member details
            Label labelForTheMemberDate = new Label("Date Of Entrance       -:");
            labelForTheMemberDate.setLayoutY(500);
            labelForTheMemberDate.setLayoutX(250);

            //text design
            labelForTheMemberDate.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

            //label output for member details
            Label labelOutputForTheMemberName = new Label();
            labelOutputForTheMemberName.setLayoutY(380);
            labelOutputForTheMemberName.setLayoutX(470);

            //text design
            labelOutputForTheMemberName.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));


            //label output for member details
            Label labelOutputForTheMembeId = new Label();
            labelOutputForTheMembeId.setLayoutY(410);
            labelOutputForTheMembeId.setLayoutX(470);

            //text design
            labelOutputForTheMembeId.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));

            //label output for member details
            Label labelOutputForTheMemberTelephone = new Label();
            labelOutputForTheMemberTelephone.setLayoutY(440);
            labelOutputForTheMemberTelephone.setLayoutX(470);

            //text design
            labelOutputForTheMemberTelephone.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));


            //label output for member details
            Label labelOutputForTheMembeEmail = new Label();
            labelOutputForTheMembeEmail.setLayoutY(470);
            labelOutputForTheMembeEmail.setLayoutX(470);

            //text design
            labelOutputForTheMembeEmail.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));


            //label output for member details
            Label labelOutputForTheMembeDate = new Label();
            labelOutputForTheMembeDate.setLayoutY(500);
            labelOutputForTheMembeDate.setLayoutX(470);

            //text design
            labelOutputForTheMembeDate.setFont(Font.font("Times New Roman", FontWeight.BOLD, 20));


            //search elements
            Button searchMemberButtonOfDb = new Button("Search Member");

            //setting button place fo window
            searchMemberButtonOfDb.setLayoutX(320);
            searchMemberButtonOfDb.setLayoutY(300);

            //pre defined length and width
            searchMemberButtonOfDb.setPrefWidth(210);
            searchMemberButtonOfDb.setPrefHeight(40);

            //design of the button
            searchMemberButtonOfDb.setStyle("-fx-background-radius: 40; -fx-border-radius: 40;-fx-border-color:   #a7afb8  ;-fx-border-width: 4;-fx-font-weight: bold;");


            searchMemberButtonOfDb.setOnAction(eventE1 -> {
                String membershipNoOfTheMemberOfGym=null;
                controllerSystem.obtainMemberByHisMembershipNumber(textFieldOfSearchField.getText(), labelOutputForTheMemberName, labelOutputForTheMembeId, labelOutputForTheMemberTelephone, labelOutputForTheMembeEmail, labelOutputForTheMembeDate);

            });

            backButtonForGymDbTwo.setOnAction(eventE1 -> {
                Stage goToMainStage = (Stage) backButtonForGymDbTwo.getScene().getWindow();

                //closing current window
                goToMainStage.close();

                //showing primary stage
                primaryStage.show();
            });

            //adding background image to the pane
            rootForSearchdMemberView.getChildren().addAll(searchImage);

            //adding topic to the pane
            rootForSearchdMemberView.getChildren().addAll(backButtonForGymDbTwo);

            //adding search button to the pane
            rootForSearchdMemberView.getChildren().addAll(searchMemberButtonOfDb);

            //adding back button to the pane
            rootForSearchdMemberView.getChildren().addAll(topicOfSearchOfGymDb);

            //adding text field to the pane
            rootForSearchdMemberView.getChildren().addAll(textFieldOfSearchField);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelForTheMemberName);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelForTheMemberDate);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelForTheMemberEmail);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelForTheMemberId);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelForTheMemberTp);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelOutputForTheMemberName);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelOutputForTheMembeId);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelOutputForTheMemberTelephone);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelOutputForTheMembeEmail);

            //adding labels to pane
            rootForSearchdMemberView.getChildren().addAll(labelOutputForTheMembeDate);


        });

// Help window of gui -----------------------------------------------------------------------------------------------------------



        helpButtonOfGym.setOnAction(eventA1 -> {

            //new stage
            Stage helpWindowGymDb = new Stage();
            //new pane
            Pane rootForHelpView = new Pane();

            // background image of sorted member view
            Image helpViewImage = new Image("file:help.png");
            ImageView helpViewOfWindow = new ImageView(helpViewImage);

            //topic of window
            Label topicOfHelpOfGymDb = new Label("Sorted List Of Members\n");
            //properties of topic
            topicOfHelpOfGymDb.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 22));

            //positioning help content
            topicOfHelpOfGymDb.setLayoutY(20);
            topicOfHelpOfGymDb.setLayoutX(30);

            Label contentHelpOne = new Label("Click \"Sorted List Of Members\" Button to view a full list of member \ndetails that you have entered into the database in ascending \norder ( By name ).");

            contentHelpOne.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

            //positioning help content
            contentHelpOne.setLayoutY(60);
            contentHelpOne.setLayoutX(30);

            //topic of window 02
            Label topicOfHelpOfGymDbtwo = new Label("Search Member\n");
            //properties of topic
            topicOfHelpOfGymDbtwo.setFont(Font.font("Comic Sans MS", FontWeight.BOLD, 22));

            //positioning help content two
            topicOfHelpOfGymDbtwo.setLayoutY(140);
            topicOfHelpOfGymDbtwo.setLayoutX(30);

            Label contentHelpTwo = new Label("Click on the search bar and search member by member ID. ");

            contentHelpTwo.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));

            //positioning help content
            contentHelpTwo.setLayoutY(255);
            contentHelpTwo.setLayoutX(30);

            helpWindowGymDb.setScene(new Scene(rootForHelpView, 600, 350));

            //setting title
            helpWindowGymDb.setTitle("Help");

            //setting resizable disable
            helpWindowGymDb.setResizable(false);
            helpWindowGymDb.show();


            //adding background image to the pane
            rootForHelpView.getChildren().addAll(helpViewOfWindow);

            //adding topic to the pane
            rootForHelpView.getChildren().addAll(topicOfHelpOfGymDb);

            //help content one to the pane
            rootForHelpView.getChildren().addAll(contentHelpOne);

            //adding topic to the pane
            rootForHelpView.getChildren().addAll(topicOfHelpOfGymDbtwo);

            //help content one to the pane
            rootForHelpView.getChildren().addAll(contentHelpTwo);

        });

        }


        //observable list
    public ObservableList<DefaultMember> setMembersToTableViewOfDb(){
        //return
        return FXCollections.observableArrayList(controllerSystem.listOfMembersOfDb);
    }



    private static int checkTheReachOfMaxMember =0;


    public static void main (String[] args) {

        boolean exitCommandOfMainWindow=true;
        //welcome massage
        System.out.println("\nWelcome To The Gym Management System!");
        //importing date and time from computer
        DateFormat currentDateTimeByYourLocalComputer = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date liveDate = new Date();
        //showing date and time
        System.out.println("━━━━━━━ " + currentDateTimeByYourLocalComputer.format(liveDate)+" ━━━━━━━━");
        while(exitCommandOfMainWindow) {
            //user command list
            System.out.println("\nINSTRUCTIONS ❖");

            //add member by "A"
            System.out.println("\nPRESS 【A】 : ADD A NEW MEMBER");

            //delete member by "D"
            System.out.println("PRESS 【D】 : DELETE A MEMBER");

            //check the list by "L"
            System.out.println("PRESS 【L】 : CHECK THE LIST OF MEMBERS");

            //Save member list by "S"
            System.out.println("PRESS 【S】 : SAVE DATA FILE");

            //gui by "G"
            System.out.println("PRESS 【G】 : SEARCH MEMBERS / FINAL LIST OF MEMBERS (GUI)");

            //help by "H"
            System.out.println("PRESS 【H】 : HELP");


            //Exit by "E"
            System.out.println("PRESS 【E】 : EXIT\n");

            System.out.print("Please Enter Your Command : ");
            Scanner inputByTheUser = new Scanner(System.in);
            String scanInputOfTheUser = inputByTheUser.nextLine();


            //calling method by user input A
            if (scanInputOfTheUser.equals("A") || scanInputOfTheUser.equals("a")) {
                addNewMemberToTheDataBase();

                //calling method by user input D
            } else if (scanInputOfTheUser.equals("D") || scanInputOfTheUser.equals("d")) {
                deleteMemberDetailFromTheDataBase();

                //calling method by user input G
            } else if (scanInputOfTheUser.equals("G") || scanInputOfTheUser.equals("g")) {
                launch(args);

                //calling method by user input E
            }
            else if (scanInputOfTheUser.equals("E") || scanInputOfTheUser.equals("e")) {
                System.exit(0);
            }

            //calling method by user input S
            else if (scanInputOfTheUser.equals("S") || scanInputOfTheUser.equals("s")) {
                controllerSystem.SavingMemberToGymDatabase();


            }
            //calling method by user input L
            else if (scanInputOfTheUser.equals("L") || scanInputOfTheUser.equals("l")) {
                controllerSystem.printListOfMemberFromGymDatabase();


            }

            //calling method by user input H
            else if (scanInputOfTheUser.equals("H") || scanInputOfTheUser.equals("h")) {
                helpViewOfCliOfGymDb();


            }

}
    }

    public static void addNewMemberToTheDataBase(){

        //adding members to the gym database
        Scanner userInputForAddMembers = new Scanner(System.in);

        //adding members to the gym database - checking user inputs by if functio
        if(checkTheReachOfMaxMember<100) {
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");

            //getting membership number
            System.out.print("Please enter the Membership Number: ");
            String membershipNoOfTheMemberOfGym = userInputForAddMembers.next();

            //getting membership name
            System.out.print("Please enter the Membership Name: ");
            String membershipNameOfTheMemberOfGym = userInputForAddMembers.next();

            //getting member date of admission
            System.out.print("Please enter the Date of entrance: ");
            String membershipDateOfTheMemberOfGym = userInputForAddMembers.next();

            //getting member tp number
            System.out.print("Please enter the Telephone Number: ");
            String telephoneNumberOfTheMemberOfGym = userInputForAddMembers.next();

            //getting member email
            System.out.print("Please enter the Email: ");
            String emailAddressOfTheMemberOfGym = userInputForAddMembers.next();

            //selecting membership type
            System.out.println("\nSELECT THE MEMBER TYPE ❖ \n");

            //getting default member type by user input
            System.out.println("PRESS 【D】 : DEFAULT MEMBER");

            //getting student member type by user input
            System.out.println("PRESS 【S】 : STUDENT MEMBER");

            //getting adult member type by user input
            System.out.println("PRESS 【A】 : ADULT MEMBER\n");

            System.out.print("Please Enter Your Command : ");
            String membershipTypeOfTheMemberOfGymByUserInput = userInputForAddMembers.next();

            //setting default value null
            DefaultMember member = null;

            //switch used to get specialise information according to the member type
            //if function also can use  instead of this
            switch (membershipTypeOfTheMemberOfGymByUserInput){

                //case for selecting
                case "D":
                case "d":

                    //getiing member details
                    member = new DefaultMember(membershipNoOfTheMemberOfGym,membershipNameOfTheMemberOfGym,membershipDateOfTheMemberOfGym,telephoneNumberOfTheMemberOfGym,emailAddressOfTheMemberOfGym);
                    break;

                //case for selecting
                case "S":
                case "s":

                    //requesting other related data
                    System.out.print("Please enter the School name: ");
                    String schoolNameOfStudentMembersOfGym=userInputForAddMembers.next();
                    System.out.print("Please enter the Parent/Guardian name: ");
                    String guardianNameOfStudentMembersOfGym=userInputForAddMembers.next();

                    //getiing member details
                    member=new StudentMember(membershipNoOfTheMemberOfGym,membershipNameOfTheMemberOfGym,membershipDateOfTheMemberOfGym,telephoneNumberOfTheMemberOfGym,emailAddressOfTheMemberOfGym,schoolNameOfStudentMembersOfGym,guardianNameOfStudentMembersOfGym);
                    break;

                //case for selecting
                case "A":
                case "a":

                    //requesting other related data
                    System.out.print("Please enter your age: ");
                    try{int memberAgeAbove60OfGym=userInputForAddMembers.nextInt();}catch (InputMismatchException | IllegalArgumentException e){e.getMessage();userInputForAddMembers.next();}
                    System.out.print("Please enter your relative name: ");
                    String memberRelativeAbove60OfGym=userInputForAddMembers.next();
                    int memberAgeAbove60OfGym = 0;

                    //getiing member details
                    member = new Over60Member(membershipNoOfTheMemberOfGym,membershipNameOfTheMemberOfGym,membershipDateOfTheMemberOfGym,telephoneNumberOfTheMemberOfGym,emailAddressOfTheMemberOfGym,memberAgeAbove60OfGym,memberRelativeAbove60OfGym);
                default:

                    //in a case of wrong input it says this phrase
                    System.out.println("Invalid User Input.Try Again");

            }

            controllerSystem.addingNewMemberToGymDatabase(member);

            //increase count by 01
            checkTheReachOfMaxMember++;

            //slots full error massage
        }else{
            System.out.println("Sorry. No free slots available. Try again later\n");

        }


    }
    //delete members of gym data base
    public static void deleteMemberDetailFromTheDataBase(){

        //instructions for delete members
        System.out.println("\nINSTRUCTIONS ❖");
        System.out.println("\nYou can delete a member by using his/her  Member ID.\n");

        //requesting member id to identify member
        System.out.print("Please enter member id: ");
        Scanner userInputForDeleteMembers = new Scanner(System.in);

        //getting user input
        String deleteUser = userInputForDeleteMembers.next();

        //boolean value
        boolean notedDelete =controllerSystem.deletingMemberFromGymDatabase(deleteUser);

        //checking condition
        if (notedDelete){
            //slot cound decrease by 01 if member deleted
            checkTheReachOfMaxMember--;
        }
    }

    //help view of CLI
    public static void helpViewOfCliOfGymDb(){

        System.out.println("\nHelp ❖ \n");
        //help view content
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
        System.out.println("A gym management system is a software which can use to manage gym user's details. The operator can add, remove, and get customer information.\n\nThe operator can add members to the database by the \"ADD A NEW MEMBER\" section. \n\nThe operator can delete members by \"DELETE A MEMBER\" Section.\n\n\"CHECK THE LIST OF MEMBERS\" function helps to check realtime added member details. \n\nThe operator can use \"SAVE DATA FILE\" function to save current details to a local text  file which named as \"Report\"\n\n" +
                "To open GUI, the operator can use the \"SEARCH MEMBERS / FINAL LIST OF MEMBERS (GUI)\" function.\n\nIt has two functions. The first one is List and second is the Search function. \n\nThe list shows all the information according to the ascending order by member id and Search can use to search specific members by his name. \n\nAlways main menu loads and operator can exit from the program by using the \"EXIT\" function.");
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n");
    }


}
