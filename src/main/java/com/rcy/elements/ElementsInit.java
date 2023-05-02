package com.rcy.elements;

import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ElementsInit.MODID)
public class ElementsInit {
    public static final String MODID = "elements";
    private static final Logger LOGGER =  LogManager.getLogger();

    public ElementsInit(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
        LOGGER.info("HELLO THERE! :)");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getName());
    }
}
