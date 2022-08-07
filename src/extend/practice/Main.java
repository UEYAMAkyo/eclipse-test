package extend.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		Human brave = new Brave("勇者");
		// 他の人間クラスも、同じようにnewする
		brave.hp = 1000;
		brave.offensive = 15;
		Human fighter = new Fighter("戦士");
		fighter.hp = 1500;
		fighter.offensive = 10;

		Human wizard = new Wizard("魔法使い");
		wizard.hp = 500;
		wizard.offensive = 20;
		Monster slime = new Slime("スライム");
		slime.hp = 300;
		slime.offensive = 10;
		Monster oak = new Oak("オーク");
		oak.hp = 500;
		oak.offensive = 10;
		Monster dragon = new Dragon("ドラゴン");

		dragon.hp = 1200;
		dragon.offensive = 15;
		List<Human> humans = new ArrayList<>();
		humans.add(brave);

		humans.add(fighter);

		humans.add(wizard);

		List<Monster> monsters = new ArrayList<>();

		monsters.add(slime);

		monsters.add(oak);

		monsters.add(dragon);

		// 上記と同じように、モンスターもListをつくる

		while (true) {

			// 人間とモンスターを戦わせる実装をする

			Human human = humans.get(Rand.get(humans.size()));

			Monster monster = monsters.get(Rand.get(monsters.size()));
			System.out.println("勇者のターン！");
			human.attack(monster);

			if (monster.hp <= 0) {
				System.out.println(monster.name+"が倒れた");
				monsters.remove(monster);
			}

			if (monsters.isEmpty()) {
				System.out.println("勇者たちは勝利した！");
				break;
			}
			System.out.println("モンスターのターン！");
			monster.attack(human);

			if (human.hp <= 0) {
				System.out.println(human.name+"が倒れた");
				humans.remove(human);
			}

			if (humans.isEmpty()) {
				System.out.println("ドラゴンたちは勝利した！");

				break;

			}

		}

	}
}
