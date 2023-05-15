package net.rcy.modbuilder.item;

import net.minecraft.world.item.ArmorMaterial;
import net.rcy.modbuilder.management.ModFormatter;
import java.io.FileNotFoundException;

/**
 * The Armor class represents an armor item in the mod.
 * It provides functionality to register the armor material and perform related operations.
 */

public class Armor {

    private ArmorMaterial material;

    /**
     * Constructs an Armor object with no specified material.
     */

    public Armor() {
    }

    /**
     * Constructs an Armor object with the specified material.
     *
     * @param material The armor material for the armor.
     */

    public Armor(ArmorMaterial material) {
        this.material = material;
    }

    /**
     * Registers the armor material and performs necessary formatting and file writing operations.
     *
     * @param material The armor material to be registered.
     * @throws FileNotFoundException If the lang file cannot be found.
     */

    public static void register(ArmorMaterial material) throws FileNotFoundException {
        String formattedMaterial = ModFormatter.LangFormat(material);
        ModFormatter.writeToLangFile(formattedMaterial);
    }

    /**
     * Retrieves the armor material of the armor.
     *
     * @return The armor material.
     */

    // Getters y setters
    public ArmorMaterial getMaterial() {
        return material;
    }

    /**
     * Sets the armor material of the armor.
     *
     * @param material The armor material to set.
     */

    public void setMaterial(ArmorMaterial material) {
        this.material = material;
    }
}
