public class Deviation{
	public static void main(String[] args){
		int[] var = new int[args.length];
		Score[] score = new Score[args.length];
		for(int i = 0; i < args.length; i = i + 2){
			var[i+1] = Integer.parseInt(args[i+1]);
			score[i/2] = new Score(args[i],var[i+1],0);
			System.out.println(score[i/2].name + "の素点は" +  score[i/2].rawscore + "です。"); //[i/2]に入れたんだから[i/2]で参照しなきゃダメだよね！！
		    }
		}
	}
