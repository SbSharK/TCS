import java.util.*;
import java.lang.*;
class Solution4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Movie m[] = new Movie[4];
    for(int i=0;i<4;i++){
      int id =sc.nextInt();
      sc.nextLine();
      String dir = sc.nextLine();
      int rat = sc.nextInt();
      int budget = sc.nextInt();
      m[i] = new Movie(id,dir,rat,budget);
    }
    sc.nextLine();
    String dir = sc.nextLine();
    int rati = sc.nextInt();
    int budg = sc.nextInt();
    System.out.println(findAvgBudgetByDirector(m,dir));
    Movie temp = getMovieByRatingBudget(m,rati,budg);
    if(getMovieByRatingBudget(m,rati,budg) == null){
      System.out.println("Sorry - No movie is available with the specified rating and budget requirement");
    }
    else{
    System.out.println(temp.movieId);
  }
  }
    static int findAvgBudgetByDirector(Movie movie[],String dir){
      int sum = 0;
      int count = 0;
      for(Movie m:movie){
        if(m.director.equals(dir)){
          sum += m.budget;
          count += 1;
        }
      }
      if(count!=0){
      return (sum/count);
    }
    else{
      return 0;
    }
    }
static Movie getMovieByRatingBudget(Movie movie[],int rat,int bud){
  for(Movie m:movie){
    if(m.rating == rat && m.budget == bud){
      if(m.budget % m.rating == 0 ){
      return m;
    }
    }
  }
  return null;
}
}

class Movie{
    int movieId;
    String director;
    int rating;
    int budget;

    public Movie(int id,String dir,int rat,int budget){
      this.movieId = id;
      this.director = dir;
      this.rating = rat;
      this.budget = budget;
    }
    int getMovieId(){
      return this.movieId;
    }
    void setMovieId(int id){
      this.movieId = id;
    }
    String getDirector(){
      return this.director;
    }
    void setDirector(String dir){
      this.director = dir;
    }
    int getRating(){
      return this.rating;
    }
    void setRating(int rat){
      this.rating = rat;
    }
    int getBudget(){
      return this.budget;
    }
    void setBudget(int budget){
      this.budget = budget;
    }
}
