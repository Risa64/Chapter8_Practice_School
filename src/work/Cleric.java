package work;

public class Cleric {
	String name = "Zelda";
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 30;
	final int MAX_MP = 30;
	
		public int pray(int sec) {
			int recover = new java.util.Random().nextInt(6) + sec;
				System.out.println("recover" + recover);
			
			this.mp = this.mp + recover;
				System.out.println("this.mp became " + this.mp);
			
			int compared = Math.min(this.MAX_MP, this.mp);
				System.out.println("compared " + compared);
			this.mp = compared;
			
				System.out.println(this.name + " gained " + recover + " and recovered and become " + this.mp);
				System.out.println("Last output " + this.mp);
			return compared;
		}
	
		public void selfAid() {
			this.mp = this.mp - 5;
			this.hp = this.MAX_HP;
			System.out.println("Recovered " + this.hp);
			System.out.println("Used " + this.mp);
		}
}

