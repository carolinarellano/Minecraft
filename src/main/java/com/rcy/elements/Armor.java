package com.rcy.elements;

/*
Arma
	Arma (Resistencia, Material, Daño) -> Se llama desde la interfaz
	.
	.
	.
	Get
	Set
	Save
	Delete
	Clone
	Shuffle
	Edit
 */

//Constructors
public class Armor {
    public Material material = Material.LEATHER;
    public int resistance = 0;
    public int damage = 0;
    public Type type = Type.HELMET;

    public Armor(){
    }

    public Armor(Type type, Material material, int resistance, int damage){
        setType(type);
        setMaterial(material);
        setResistance(resistance);
        setDamage(damage);
    }

    public Armor(Type type, Material material, int resistance){
        this(type, material);
        setResistance(resistance);
    }

    public Armor(Type type, Material material){
        this.type = type;
        this.material = material;
    }

    
    //Setters
    void setResistance(int resistance){
        this.resistance = resistance;
    }

    void setMaterial(Material material){
        this.material = material;
    }

    void setDamage(int damage){
        this.damage = damage;
    }

    void setType(Type type) { this.type = type; }

    //Getters

    public int getDamage() {
        return damage;
    }

    public int getResistance() {
        return resistance;
    }

    public Material getMaterial() {
        return material;
    }

    public Type getType() {
        return type;
    }

    //Functions
}

