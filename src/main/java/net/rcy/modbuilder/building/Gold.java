package net.rcy.modbuilder.building;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import static net.rcy.modbuilder.building.Materials.GOLD;

public class Gold extends Material{
    private static final Materials material = GOLD;
    private final EquipmentSlot type;

    public Gold(String name, int durabilityM, float toughness, float knockbackResistance, EquipmentSlot type) {
        super(name, material, durabilityM, toughness, knockbackResistance, type);
        this.type = type;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot type) {
        return ArmorMaterials.GOLD.getDurabilityForSlot(type);
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot type) {
        return ArmorMaterials.GOLD.getDefenseForSlot(type);
    }

    @Override
    public int getEnchantmentValue() {
        return ArmorMaterials.GOLD.getEnchantmentValue();
    }

    @Override
    public SoundEvent getEquipSound() {
        return ArmorMaterials.GOLD.getEquipSound();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return ArmorMaterials.GOLD.getRepairIngredient();
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
