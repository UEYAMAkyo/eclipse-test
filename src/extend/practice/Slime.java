package extend.practice;

public class Slime extends Monster {

	public Slime(String name) {
		this.name = name;
	}

	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		target.hp -= damage;

		System.out.printf("%sが体当たりで攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);

	}
}
