package work;

public class Cleric {
	// Basicな設定の仕方
//	String name = "Zelda";
//	int hp = 50;
//	final int MAX_HP = 50;
//	int mp = 30;
//	final int MAX_MP = 30;

	// 先生Version
	// static でクラスフィールドに。
	// MAX_HP/MPを効率よく使用するために順番の入れ替え
	// 定義の優先順位
	// １，static 
	// ２，final
	// ３，何もついてないもの
	String name = "Zelda"	;
	static final int MAX_HP = 50;
	int hp = MAX_HP;
	static final int MAX_MP = 30;
	int mp = MAX_MP;

	
		public int pray(int sec) {
			int recover = new java.util.Random().nextInt(6) + sec;
				System.out.println("recover" + recover);
			
			this.mp = this.mp + recover;
				System.out.println("this.mp became " + this.mp);

			// Developer way			
//			int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
//			this.mp += recoverActual;
//			return recoverActual;	
			
				
			// My way (this should be avoided because it once exceed the limit of MAX_MP)	
//			int demand = Math.min(this.MAX_MP, this.mp); // My version
			int demand = Math.min(Cleric.MAX_MP, this.mp); // 先生 version(staticにアクセス)
				System.out.println("compared " + demand);
			this.mp = demand;
			
				System.out.println(this.name + " gained " + recover + " and recovered and become " + this.mp);
				System.out.println("Last output " + this.mp);
			return demand;
		}
	
		public void selfAid() {
			if(this.mp < 5) {
				System.out.println("You need 5mp at least.");
			}
//			this.mp = this.mp - 5;
			this.mp -= 5;
			this.hp = Cleric.MAX_HP; // 先生 version(staticにアクセス)
			System.out.println("Recovered " + this.hp);
			System.out.println("Used " + this.mp);
		}
}





