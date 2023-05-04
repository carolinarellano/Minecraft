package net.rcy.modbuilder.building;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;

import static net.rcy.modbuilder.building.Materials.IRON;

public class Iron extends Material{
    private static final Materials material = IRON;
    private final EquipmentSlot type;

    public Iron(String name, int durabilityM, float toughness, float knockbackResistance, EquipmentSlot type) {
        super(name, material, durabilityM, toughness, knockbackResistance, type);
        this.type = type;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot type) {
        return ArmorMaterials.IRON.getDurabilityForSlot(type);
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot type) {
        return ArmorMaterials.IRON.getDefenseForSlot(type);
    }

    @Override
    public int getEnchantmentValue() {
        return ArmorMaterials.IRON.getEnchantmentValue();
    }

    @Override
    public SoundEvent getEquipSound() {
        return ArmorMaterials.IRON.getEquipSound();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return ArmorMaterials.IRON.getRepairIngredient();
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
