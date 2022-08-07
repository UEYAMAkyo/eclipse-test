package extend.practice;

public class Brave extends Human {

	public Brave(String name) {

		this.name = name;
	}

	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		target.hp -= damage;

		System.out.printf("%sが剣で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);

	}

}
