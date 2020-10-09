public class Score {
  // declaration of fields
  String name;
  int rawscore;
  double deviation;
  // declaration of constructor
  public score(String name, int rawscore,double deviation){
    this.name = name;
    this.rawscore = rawscore;
    this.deviation = deviation;
  }
  // declaration of methods
  @override
  public String toString(){
    return this.name + "の偏差値は" + this.deviation + "です。";
  }
}