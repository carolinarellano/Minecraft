package net.rcy.modbuilder;

import net.rcy.modbuilder.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file

/**
 * The main mod class for ModBuilder.
 * It initializes and handles various mod functionalities.
 */
@Mod(ModBuilder.MOD_ID)
public class ModBuilder {
    public static final String MOD_ID = "modbuilder";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Constructs a ModBuilder object and initializes mod functionalities.
     */

    public ModBuilder() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    /**
     * Handles the client setup event.
     *
     * @param event The FMLClientSetupEvent instance.
     */

    private void clientSetup(final FMLClientSetupEvent event) {
        // Add client-specific setup code here
    }

    /**
     * Handles the common setup event.
     *
     * @param event The FMLCommonSetupEvent instance.
     */

    private void setup(final FMLCommonSetupEvent event) {
        // Some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
