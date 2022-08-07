package extend.practice;

public class Dragon extends Monster {

	public Dragon(String name) {
		this.name = name;
	}

	@Override
	public void attack(Living target) {
		int damage = this.offensive * Rand.get(10);
		target.hp -= damage;

		System.out.printf("%sが炎で攻撃！%sに%dのダメージを与えた。%n", name, target.name, damage);

	}
}
