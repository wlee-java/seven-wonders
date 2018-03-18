package net.wonlee.sevenwonders.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Card {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long card_id;
	private int age;
	private String card_name;
	private int card_type_id;
	private long upgrade_from_card_id;
	
	
	
	public Card() {

	}

	public Card(long card_id, int age, String card_name, int card_type_id, long upgrade_from_card_id) {
		super();
		this.card_id = card_id;
		this.age = age;
		this.card_name = card_name;
		this.card_type_id = card_type_id;
		this.upgrade_from_card_id = upgrade_from_card_id;
	}
	
	
	public long getCard_id() {
		return card_id;
	}
	public void setCard_id(long card_id) {
		this.card_id = card_id;
	}
	public String getCard_name() {
		return card_name;
	}
	public void setCard_name(String card_name) {
		this.card_name = card_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCard_type_id() {
		return card_type_id;
	}
	public void setCard_type_id(int card_type_id) {
		this.card_type_id = card_type_id;
	}
	public long getUpgrade_from_card_id() {
		return upgrade_from_card_id;
	}
	public void setUpgrade_from_card_id(long upgrade_from_card_id) {
		this.upgrade_from_card_id = upgrade_from_card_id;
	}

	@Override
	public String toString() {
		return "Card [card_id=" + card_id + ", age=" + age + ", card_name=" + card_name + ", card_type_id="
				+ card_type_id + ", upgrade_from_card_id=" + upgrade_from_card_id + "]";
	}
	
}
