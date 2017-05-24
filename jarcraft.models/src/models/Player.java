package models;

public class Player {
	private String name;
	private int totalHealth;
	private int currentHealth;
	private double attackSpeed;
	private double rangedAttackSpeed;
	
	public Player() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalHealth() {
		return totalHealth;
	}

	public void setTotalHealth(int totalHealth) {
		this.totalHealth = totalHealth;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
	}

	public double getAttackSpeed() {
		return attackSpeed;
	}

	public void setAttackSpeed(double attackSpeed) {
		this.attackSpeed = attackSpeed;
	}

	public double getRangedAttackSpeed() {
		return rangedAttackSpeed;
	}

	public void setRangedAttackSpeed(double rangedAttackSpeed) {
		this.rangedAttackSpeed = rangedAttackSpeed;
	}

}
