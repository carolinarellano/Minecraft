package net.rcy.modbuilder.item;

import net.minecraft.world.item.ArmorMaterial;
import net.rcy.modbuilder.management.ModFormatter;
import java.io.FileNotFoundException;

public class Armor {

    private ArmorMaterial material;

    public Armor() {
    }

    public Armor(ArmorMaterial material) {
        this.material = material;
    }

    public static void register(ArmorMaterial material) throws FileNotFoundException {
        String formattedMaterial = ModFormatter.LangFormat(material);
        ModFormatter.writeToLangFile(formattedMaterial);
    }

    // Getters y setters
    public ArmorMaterial getMaterial() {
        return material;
    }

    public void setMaterial(ArmorMaterial material) {
        this.material = material;
    }
}
