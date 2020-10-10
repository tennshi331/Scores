public class Deviation{
	public static void main(String[] args){
		int[] var = new int[args.length];
		Score[] score = new Score[args.length];
		for(int i = 0; i < args.length; i = i + 2){
			var[i+1] = Integer.parseInt(args[i+1]);
			score[i/2] = new Score(args[i],var[i+1],0);
		    }

		// calculate average
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			sum += score[i].rawscore;
			}
		double average = sum / score.length;

		// calculate standard deviation
		int summultiplier = 0;
		double sd = 0;
		for(int i = 0; i < score.length; i++){
			summultiplier += Math.pow(score[i].rawscore,2);
			}
		double averagemultiplier = summultiplier / score.length;
		double distributed = averagemultiplier - Math.pow(average,2);
		sd = Math.sqrt(distributed);

		// calculate deviation and express
		for(int i = 0; i < score.length; i++){
			score[i].deviation = (score[i].rawscore - average) / sd * 10 + 50;
			System.out.println(score[i].name + "の偏差値は" +  score[i].deviation + "です。");
			}
		}
	}
