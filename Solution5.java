import java.util.*;
import java.lang.*;
class Solution5{
  static int result=0;
    static int findPointsForGivenSkill(Player player[],String sk){
      for(Player p:player){
        if(p.skill.equalsIgnoreCase(sk)){
          result += p.points;
        }
      }
      if(result!=0){
        return result;
      }
      else{
        return 0;
      }
    }

    static Player getPlayerBasedOnLevel(Player p[],String sk,String lvl){
      for(int i=0;i<4;i++){
      if(p[i].skill.equalsIgnoreCase(sk) && p[i].level.equalsIgnoreCase(lvl) && p[i].points>=20){
        return p[i];
      }
    }
    return null;
    }
    public static void main(String args[]){
      Player player[] = new Player[4];
      Scanner sc = new Scanner(System.in);
      for(int i = 0;i<4;i++){
        int playedId = sc.nextInt();
        sc.nextLine();
        String skill = sc.nextLine();
        String level = sc.nextLine();
        int points = sc.nextInt();
        player[i] = new Player(playedId,skill,level,points);
        //player[i].printall();
      }
      sc.nextLine();
      String sk = sc.nextLine();
      String lvl = sc.nextLine();
      System.out.println(findPointsForGivenSkill(player,sk));
      Player p = getPlayerBasedOnLevel(player,sk,lvl);
      if(p==null){
        System.out.println("NULL");
      }
      else{
        System.out.println(p.playedId);
      }
    }
}
class Player{
  int playedId;
  String skill;
  String level;
  int points;

  public Player(int id,String skill,String level,int points){
    this.playedId = id;
    this.skill = skill;
    this.level = level;
    this.points = points;
  }

  // public void printall(){
  //   System.out.println(this.playedId);
  //   System.out.println(this.skill);
  //   System.out.println(this.level);
  //   System.out.println(this.points);
  // }

}
