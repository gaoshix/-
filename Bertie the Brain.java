import java.util.*;
public class Hw1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] ch = new String[9];
		int round =1;
		String[]symbol ={"○","●"};
		
		for(int a=0;a<ch.length;a++){
			ch[a]=" ";
		}
		System.out.println("---------------------井字遊戲---------------------");
		System.out.println("兩人玩，每人各據一符號，猜拳贏先選擇您要的位置擺放符號，依序你下完，換我下＼n"+"直到相同符號能夠連成一直線及獲勝(縱、橫、斜三相同符號一直線均可，先達成者贏)＼n"+
				"，應盡阻擋對方連成三符號一直線唷!");
		System.out.println("------------------------------------------------");
		System.out.println();
		
		//圖示
		System.out.println("Y座標");
		System.out.println("↓");
		System.out.println("╴╴╴╴╴╴╴╴╴╴");
		System.out.println("|   |   |   |");
		System.out.println("—————————————");
		System.out.println("|   |   |   |");
		System.out.println("—————————————");
		System.out.println("|   |   |   |");
		System.out.println("—————————————");
		System.out.println( "------------------------------------------------");
		
		while(true){
			System.out.println("請輸入你要擺放的位置");
		
		while(true){
			System.out.print("X座標:");
			int keyinX=sc.nextInt();
			if(!(keyinX>=1&& keyinX<=3)){
				System.out.println("輸入錯誤，重新輸入");
				continue;		
			}
			System.out.print("Y座標:");
			int keyinY=sc.nextInt();
			if(!(keyinY>=1&& keyinY<=3)){
				System.out.println("輸入錯誤，重新輸入");
				continue;
			}
			
			int number = (keyinX-1)*1+(keyinY-1)*3;
			if(ch[number].equals(" ")){
				if(round%2==0){
					ch[number]="●";
				}else{
					ch[number]="○";		
				}
				break;
			}else{
				System.out.println("此處已經有棋了!重新輸入好嗎!");
			}
			}
			}
		}
	}


			
			
		
	

			

		
		
		

	


