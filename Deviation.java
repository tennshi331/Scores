public class Deviation{
	public static void main(String[] args){
		// create instances
		int[] var = new int[args.length/2]; //素点の配列の要素数は8だよね！!半分にしよう!!
		Score[] score = new Score[args.length/2]; //同じくだよね!!argsの長さは16もあるよね!!
		for(int i = 0; i < args.length; i = i + 2){
			var[i/2] = Integer.parseInt(args[i+1]); //var[i+1]だと奇数インデックスにだけ値が入ってるキショい配列になるよね!!
			score[i/2] = new Score(args[i],var[i+1],0);
		    }

		// calculate average
		//今回のエラーの核はここだね！！scoreをargs.length の長さで定義したせいでこのループが16回まわってたよね！!
		//nullPointerExceptionは配列内で指定されたインデックスに要素が存在しないよ〜><ってやつだね！！エラー名でググろう!!
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			sum += score[i].rawscore;
			}
		double average = sum / score.length;

		// calculate standard deviation
		int summultiplier = 0;
		double sd = 0;
		for(int i = 0; i < score.length; i++){
			summultiplier += Math.pow(score[i].rawscore,2); //読みづらいから変数名が複数単語になるときはキャメルケースにするなどしようね！！ググってね！！
			}
		double averagemultiplier = summultiplier / score.length; //読みづらいから変s...
		double distributed = averagemultiplier - Math.pow(average,2);
		sd = Math.sqrt(distributed);

		// calculate deviation and express
		for(int i = 0; i < score.length; i++){
			score[i].deviation = (score[i].rawscore - average) / sd * 10 + 50;
			System.out.println(score[i].name + "の偏差値は" + score[i].deviation + "です。");
			}
		}
	}

