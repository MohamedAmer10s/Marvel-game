package model.abilities;

import java.util.ArrayList;

import model.world.Damageable;

abstract public class Ability{
	private String name;
	private int manaCost;
	private int baseCooldown;
	private int currentCooldown;
	private int castRange;
	private int requiredActionPoints;
	private AreaOfEffect castArea;
	public Ability(String name,int cost,int baseCoolDown,int castRange,AreaOfEffect area ,int required)
	{
		this.name=name;
		this.manaCost=cost;
		this.baseCooldown=baseCoolDown;
		this.castRange=castRange;
		this.castArea=area;
		this.requiredActionPoints=required;
	}
	public String getName() {
		return name;
	}
	public int getManaCost() {
		return manaCost;
	}
	public int getBaseCooldown() {
		return baseCooldown;
	}
	public int getCurrentCooldown() {
		return currentCooldown;
	}
	public void setCurrentCooldown(int currentCoolDown) {
		if (currentCoolDown < 0)
			currentCoolDown = 0;
		else if (currentCoolDown > baseCooldown)
			currentCoolDown = baseCooldown;
		this.currentCooldown = currentCoolDown;
	}
	public int getCastRange() {
		return castRange;
	}
	public int getRequiredActionPoints() {
		return requiredActionPoints;
	}
	public AreaOfEffect getCastArea() {
		return castArea;
	}
	public abstract void execute(ArrayList<Damageable> targets) throws CloneNotSupportedException;
	
	
	

}
