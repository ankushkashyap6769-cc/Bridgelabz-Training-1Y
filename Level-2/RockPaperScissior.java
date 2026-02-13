import java.util.Scanner;
public class RockPaperScissor{
static String getComputerChoice(){
double r=Math.random();
if(r<0.33){return"rock";}
else if(r<0.66){return"paper";}
else{return"scissors";}
}
static String findWinner(String user,String comp){
if(user.equals(comp)){return"Draw";}
if(user.equals("rock")&&comp.equals("scissors")){return"User";}
if(user.equals("rock")&&comp.equals("paper")){return"Computer";}
if(user.equals("paper")&&comp.equals("rock")){return"User";}
if(user.equals("paper")&&comp.equals("scissors")){return"Computer";}
if(user.equals("scissors")&&comp.equals("paper")){return"User";}
if(user.equals("scissors")&&comp.equals("rock")){return"Computer";}
return"Invalid";
}
static String[][] calculateStats(int userWins,int compWins,int totalGames){
String[][] stats=new String[2][3];
double userPercent=(double)userWins/totalGames*100;
double compPercent=(double)compWins/totalGames*100;
stats[0][0]="User";
stats[0][1]=String.valueOf(userWins);
stats[0][2]=String.format("%.2f",userPercent);
stats[1][0]="Computer";
stats[1][1]=String.valueOf(compWins);
stats[1][2]=String.format("%.2f",compPercent);
return stats;
}
static void displayResults(String[][] games,String[][] stats){
System.out.println("Game\tUser\tComputer\tWinner");
for(int i=0;i<games.length;i++){
System.out.println((i+1)+"\t"+games[i][0]+"\t"+games[i][1]+"\t\t"+games[i][2]);
}
System.out.println("\nPlayer\tWins\tWin%");
for(int i=0;i<stats.length;i++){
System.out.println(stats[i][0]+"\t"+stats[i][1]+"\t"+stats[i][2]);
}
}
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number of games: ");
int n=sc.nextInt();
sc.nextLine();
String[][] games=new String[n][3];
int userWins=0,compWins=0;
for(int i=0;i<n;i++){
System.out.print("Enter choice (rock/paper/scissors): ");
String user=sc.nextLine().toLowerCase();
String comp=getComputerChoice();
String winner=findWinner(user,comp);
if(winner.equals("User")){userWins++;}
else if(winner.equals("Computer")){compWins++;}
games[i][0]=user;
games[i][1]=comp;
games[i][2]=winner;
}
String[][] stats=calculateStats(userWins,compWins,n);
displayResults(games,stats);
sc.close();
}
}
