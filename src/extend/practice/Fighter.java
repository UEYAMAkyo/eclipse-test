package extend.practice;

public class Fighter extends Human {

	public Fighter(String name) {
		this.name = name;
	}

	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		target.hp -= damage;

		System.out.printf("%sが斧で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);

	}
}
