package net.rcy.modbuilder.management;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.rcy.modbuilder.item.Armor;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

import static net.rcy.modbuilder.item.ModArmorMaterials.GOLD;

public class ModFormatter {
    public static String formatModItem(String name, ArmorMaterials material, EquipmentSlot slot) {
        String textToPaste = "\tpublic static final RegistryObject<Item> " + name.toUpperCase() + "_" + slot.toString().toUpperCase() + " = ITEMS.register(\"" + name.toLowerCase() + "_" + slot.toString().toLowerCase() + "\",\n"
                + "\t\t() -> new ArmorItem(ModArmorMaterials." + material.toString().toUpperCase() + ", EquipmentSlot." + slot + ",\n"
                + "\t\t\t\tnew Item.Properties().tab(ModCreativeModeTab.MODBUILDER_TAB)));\n";
        return textToPaste;
    }

    public static String LangFormat(ArmorMaterial material) {
        String str = material.toString();
        String cap = str.substring(0,1).toUpperCase() + str.toString().toLowerCase();
        String formattedString = String.format("\"item.modbuilder.%s\": \"%s\"\n", material, cap);
        return formattedString;
    }

    public static void writeModItem(String name, ArmorMaterials material, EquipmentSlot slot) throws IOException {
        String formattedString = formatModItem(name, material, slot);
        File file = new File("src/main/java/com/example/modname/ModItems.java");
        List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
        List<String> newLines = new ArrayList<>();
        boolean inserted = false;
        for (String line : lines) {
            newLines.add(line);
            if (!inserted && line.contains("public static final RegistryObject<Item>")) {
                newLines.add(formattedString);
                inserted = true;
            }
        }
        if (!inserted) {
            throw new IOException("Failed to insert formatted string into ModItems.java");
        }
        Files.write(file.toPath(), newLines, StandardCharsets.UTF_8);
    }

    public static void writeToLangFile(String str) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("resources/assets/modbuilder/lang/en_us.json");
        writer.print("{\n" + str + "\n}");
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Armor.register(GOLD);
    }






}

