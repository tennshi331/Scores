public class Deviation{
	public static void main(String[] args){
		int[] var = new int[args.length];  //素点の配列の要素数は8だよね！!半分にしよう!!
		Score[] score = new Score[args.length];  //同じくだよね!!argsの長さは16もあるよね!!
		for(int i = 0; i < args.length; i = i + 2){
			var[i+1] = Integer.parseInt(args[i+1]);  //var[i+1]だと奇数インデックスにだけ値が入ってるキショい配列になるよね!!
			score[i/2] = new Score(args[i],var[i+1],0);
			System.out.println(score[i/2].name + "の素点は" +  score[i/2].rawscore + "です。"); //[i/2]に入れたんだから[i/2]で参照しなきゃダメだよね！！
		    }
		}
	}
