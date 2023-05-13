package net.rcy.modbuilder.management;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraftforge.client.event.sound.SoundEvent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Formatter {
    /**
     * Gets the new ArmorItem created and creates a string that will be written into ModItems
     *
     * @param name the name of the material
     * @param material the material taken from ArmorMaterial enum
     * @param slot then type of the armor slot FEET, HAND, CHEST, ...
     * @return A string with the structure needed to be functional
     */

    public static void formatArmorItem(String name, ArmorMaterials material, EquipmentSlot slot, int line) throws IOException {
        String textToPaste = "\tpublic static final RegistryObject<Item> " + name.toUpperCase() + "_" + slot.toString().toUpperCase() + " = ITEMS.register(\"" + name.toLowerCase() + "_" + slot.toString().toLowerCase() + "\",\n"
                + "\t\t() -> new ArmorItem(ModArmorMaterials." + material.toString().toUpperCase() + ", EquipmentSlot." + slot + ",\n"
                + "\t\t\t\tnew Item.Properties().tab(ModCreativeModeTab.TUTORIAL_TAB)));\n";

        BufferedReader reader = new BufferedReader(new FileReader("path/to/java/file"));

        String currentLine;
        int lineNumber = 1;
        StringBuilder builder = new StringBuilder();

        while ((currentLine = reader.readLine()) != null) {
            if (lineNumber == line) {
                builder.append(textToPaste);
            }
            builder.append(currentLine).append("\n");
            lineNumber++;
        }

        reader.close();

        FileWriter writer = new FileWriter("net/rcy/modbuilder/items/ModItems.java");
        writer.write(builder.toString());
        writer.close();
    }


    /**
     * Gets the new ArmorItem created and creates a string that will be written into ModItems
     *
     * @param name the name of the material
     * @param durability value of durability multiplier
     * @param damageReductionAmounts value of damage reduction amounts
     * @param enchantability value of enchantability
     * @param soundEvent sound of the material
     * @param toughness value of toughness
     * @param knockbackResistance value of knockback resistance
     * @return A string builded with the structure needed to be functional
     */

    public static String formatArmorMaterial(String name, int durability, int[] damageReductionAmounts, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(name.toUpperCase()).append("(");
        sb.append("\"").append(name.toLowerCase()).append("\"").append(", ");
        sb.append(durability).append(", ");
        sb.append("new int[]{").append(damageReductionAmounts[0]).append(", ").append(damageReductionAmounts[1]).append(", ").append(damageReductionAmounts[2]).append(", ").append(damageReductionAmounts[3]).append("}").append(", ");
        sb.append(enchantability).append(", ");
        sb.append(soundEvent).append(", ");
        sb.append(toughness).append("F, ");
        sb.append(knockbackResistance).append("F, ");
        sb.append("() -> { return Ingredient.of(Items.").append(name.toUpperCase()).append("_INGOT); })");

        FileWriter writer = new FileWriter("net/rcy/modbuilder/items/ModItems.txt");
        writer.write(sb.toString());
        writer.close();

        return sb.toString();

    }

}

