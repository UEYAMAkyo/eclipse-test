package extend.practice;

public class Wizard extends Human {

	public Wizard(String name) {
		this.name = name;
	}

	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		target.hp -= damage;

		System.out.printf("%sが魔法で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);

	}
}
