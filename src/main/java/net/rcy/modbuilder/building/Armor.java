package net.rcy.modbuilder.building;
import java.io.*;
import net.rcy.modbuilder.building.Material;

public class Armor {
    public Armor() {

    }

    //Getters

    //Functions
    @Override
    public Armor clone() {
        return new Armor();
    }

    @Override
    public String toString() {
        String Name = "HOLA";
        String id = '"' + Name.toLowerCase() + '"';
        String a = String.format("""
                %s = ITEMS.register(%s,
                \t() -> new ArmorItem(ModArmorMaterials.%s, EquipmentSlot.%s,
                          new Item.Properties().tab(ModCreativeModeTab.INITARMOR)));""" + Name, id, "IRON", "CHEST");
        return a;
    }

}