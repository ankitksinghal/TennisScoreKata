# Tennis Scoring Kata

This short and simple Kata should be performed using Test Driven Development (TDD).
It is about implementing a simple tennis game.
Rules
The scoring system is rather simple:
  1) Each player can have either of these points in one game 0 15 30 40
  2) If you have 40 and you win the ball you win the game, however there are special rules.
  3) If both have 40 the players are deuce.
      a) If the game is in deuce, the winner of a ball will have advantage and game ball.
      b) If the player with advantage wins the ball he wins the game.
      c) If the player without advantage wins they are back at deuce.
Alternate description of the rules per Wikipedia ( http://en.wikipedia.org/wiki/Tennis#Scoring ):
  1) A game is won by the first player to have won at least four points in total and at least two points more than the opponent.
  2) The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as            “love”, “fifteen”, “thirty”, and “forty” respectively.
  3) If at least three points have been scored by each player, and the scores are equal, the score is “deuce”.
  4) If at least three points have been scored by each side and a player has one more point than his opponent, the score of the game is        “advantage” for the player in the lead.
  
  ## Getting Started
  
  In order to run and deploy this application user needs follow below steps-
  
    1) Clone git repostitory in some local folder using below command run on cmder of bash git command prompt.
         git pull https://github.com/AKS291405/TennisScoreKata.git
    2) Open STS and import project as exiting maven project in STS, Setting up STS steps given in installation section.
    3) Right click imported project and go to maven -> update project.
    4) Right click again imported project and go to Run as -> maven clean to clean project.
    5) Right click again imported project and go to Run as -> maven install to install project to compile source code and generate jar
        file in target folder.
    6) Copy TennisKata-1.0-RELEASE.jar file generated in target folder to some local folder.
    7) Start dos command prompt and reach to copied jar folder location and run below java 
        command - Java -jar TennisKata-1.0-RELEASE.jar
    8) One dialog will open in command prompt to enter player names of both players and scores. Once user enters the asked details,
        system calculate match outcome based on the points entered for each player.
     
  Example command dialog -
  
   
  ![Example command dialog](https://github.com/AKS291405/TennisScoreKata/blob/master/command_dialog.png)
        
  ## Installing softwares to create dev setup
  In order to create setup for development or generation of jar file, please follow below steps -
  
  ### Installation and setup of JAVA 
    1) Download Java 8 from the Oracle’s Java official website 
        https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html.
    2) Run exe using as administrator
    3) Set environment variables for JAVA_HOME and PATH
    4) Search for Advanced System Settings in the Windows Search box.
    5) Click on Environmental varaibles from popup.
    6) Click on New button under System variables section to create JAVA_HOME with value ex - C:\Program Files\Java\jdk1.8.0_x.
    7) Click on New button under System variables section to create PATH with value ex - %JAVA_HOME%\bin
    8) Check Java and java compiler version using command ex - Java -version, Javac -version, both versions should be Java 8.
    
  ### Installation and setup of MAVEN  
    1) Now Download Maven from official website https://maven.apache.org/download.cgi
    2) Unzip binary folder at certain location in system.
    3) Set environment variables for MAVEN_HOME and PATH.
    4) Now Search for Advanced System Settings in the Windows Search box.
    5) Click on Environmental varaibles from popup.
    6) Click on New button under System variables section to create MAVEN_HOME with value ex - C:\apache-maven-3.6.3.
    7) Click on New button under System variables section to create PATH with value ex - %MAVEN_HOME%\bin
    8) Check maven version using command mvn -version at dos command prompt.
    9) Modify maven repo path in setting.xml, open setting.xml from path location ex - C:\apache-maven-3.x.x\conf\setting.xml
    10) Add line in setting.xml <localRepository>repo path</localRepository> where repo path can be ex- C:\maven\repo
    
  ### Installation and setup of STS  
    1) Go to the STS download site (http://www.springsource.com/products/sts) and download the variant appropriate to the operating              system being used.
    2) Unzip zipped binary folder to root directory ex - C:/.
    3) To verify the installation, run the eclipse.exe executable in the unzipped directory and check that STS displays a welcome panel.           The first time there may be a short delay due to the initial set-up of indexes.
    4) Once STS started, click Window > Preferences from the menu.
    5) In the Preferences window, click Java > Compiler in the left panel.
    6) In the right panel, set the Compiler compliance level to 1.8.
    7) Click Apply.
    8) 




    
        
        
        
    
