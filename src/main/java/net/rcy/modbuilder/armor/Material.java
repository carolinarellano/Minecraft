package net.rcy.modbuilder.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public abstract class Material implements ArmorMaterial {

    //add all the elements non-modified of the material, but define it since the beginning with armor material args
    public final String name;
    public final Materials material;
    public final int durabilityMultiplier;
    public final float toughness;
    public final float knockbackResistance;
    public final EquipmentSlot type;

    public Material(String name, Materials material, int durabilityMultiplier, float toughness, float knockbackResistance, EquipmentSlot type){
        this.name = name;
        this.material = material;
        this.durabilityMultiplier = durabilityMultiplier;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.type = type;
    }

    public abstract int getDurabilityForSlot(EquipmentSlot type);

    public abstract int getDefenseForSlot(EquipmentSlot type);

    public abstract int getEnchantmentValue();

    public abstract SoundEvent getEquipSound();

    public abstract Ingredient getRepairIngredient();

    @Override
    public String getName() {
        return name;
    }

    public Materials getMaterial() {
        return material;
    }

    public int getDurabilityMultiplier() {
        return durabilityMultiplier;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }


    public EquipmentSlot getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", material=" + material +
                ", durabilityMultiplier=" + durabilityMultiplier +
                ", toughness=" + toughness +
                ", knockbackResistance=" + knockbackResistance +
                ", type=" + type +
                '}';
    }
}
