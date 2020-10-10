public class Deviation{
  public static void main(String[] args){
    for(int i = 0; i < args.length; i = i + 2){
      Score[] score = {
        new Score(args[i],args[i+1],"")
        };
    }
    
    // caluculate average
    int sum = 0;
    double sd = 0.0;
    for(int i = 0; i < score.length; i++){
      sum += score[i].rawscore;
    }
    double average = sum / score.length;
    
    // caluculate standard deviation
    int summultiplier = 0;
    for(int i = 0; i < score.length; i++){
      summultiplier += Math.pow(score[i].rawscore,2);
    }
    double averagemultiplier = summultiplier / score.length;
    double distributed = averagemultiplier - Math.pow(average,2);
    double sd = Math.sqrt(distributed);
    
    // caluculate deviation and express
    for(int i = 0; i < score.length; i++){
      score[i].deviation = (score[i].rawscore - average) / sd * 10 + 50;
      System.out.println(score[i].name + "の偏差値は" +  score[i].deviation + "です。");
    }
  }
}
