package com.rcy.elements;

import net.minecraft.world.entity.EquipmentSlot;
import static net.minecraft.world.entity.EquipmentSlot.*;
import java.io.*;

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
	Shuffle -> Randomize
	Edit
 */



//Constructors
public class Armor {
    public Material material = Material.LEATHER;
    public int resistance = 0;
    public int damage = 0;
    public EquipmentSlot.Type type = FEET.getType();

    public Armor() {
    }

    public Armor(EquipmentSlot.Type type, Material material) {
        setType(type);
        setMaterial(material);
    }

    public Armor(EquipmentSlot.Type type, Material material, int resistance) {
        this(type, material);
        setResistance(resistance);
    }

    public Armor(EquipmentSlot.Type type, Material material, int resistance, int damage) {
        this(type, material, resistance);
        setDamage(damage);
    }


    //Setters
    void setResistance(int resistance) {
        this.resistance = resistance;
    }

    void setMaterial(Material material) {
        this.material = material;
    }

    void setDamage(int damage) {
        this.damage = damage;
    }

    void setType(EquipmentSlot.Type type) {
        this.type = type;
    }

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

    public EquipmentSlot.Type getType() {
        return type;
    }

    //Functions
    @Override
    public Armor clone() {
        return new Armor(this.type, this.material, this.resistance, this.damage);
    }

    @Override
    public String toString() {
        String Name = this.material + "_" + this.type;
        String id = '"' + Name.toLowerCase() + '"';
        String a = String.format("""
                %s = ITEMS.register(%s,
                \t() -> new ArmorItem(ModArmorMaterials.%s, EquipmentSlot.%s,
                          new Item.Properties().tab(ModCreativeModeTab.INITARMOR)));""" + Name, id, this.material, this.type);
        return a;
    }

    public void saveArmor(String source, String destination) {
        try {
            // Load the source file into a string
            String sourceCode = readFile(source);

            // Find the method in the source code
            int str = sourceCode.indexOf("public static final RegistryObject<Item>" + this.toString());
            String methodCode = sourceCode.substring(str);

            // Write the method code to the destination file
            writeToFile(destination, methodCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(System.lineSeparator());
        }
        reader.close();
        return stringBuilder.toString();
    }

    private void writeToFile(String destination, String methodCode) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(destination));
        writer.write(this.toString());
        writer.close();
    }
}