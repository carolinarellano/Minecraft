package net.rcy.modbuilder.building;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;
import static net.rcy.modbuilder.building.Materials.CHAIN;


public class Chain extends Material {
    private static final Materials material = CHAIN;
    private final EquipmentSlot type;

    public Chain(String name, int durabilityM, float toughness, float knockbackResistance, EquipmentSlot type) {
        super(name, material, durabilityM, toughness, knockbackResistance, type);
        this.type = type;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot type) {
        return ArmorMaterials.CHAIN.getDurabilityForSlot(type);
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot type) {
        return ArmorMaterials.CHAIN.getDurabilityForSlot(type);
    }

    @Override
    public int getEnchantmentValue() {
        return ArmorMaterials.CHAIN.getEnchantmentValue();
    }

    @Override
    public SoundEvent getEquipSound() {
        return ArmorMaterials.CHAIN.getEquipSound();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return ArmorMaterials.CHAIN.getRepairIngredient();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return knockbackResistance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
