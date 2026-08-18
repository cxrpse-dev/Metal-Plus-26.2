package za.co.cxrpse.metalplus;

import net.minecraft.world.item.CreativeModeTabs;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import za.co.cxrpse.metalplus.block.ModBlocks;
import za.co.cxrpse.metalplus.creativemodtab.ModCreativeModTabs;
import za.co.cxrpse.metalplus.item.ModItems;

@Mod(Metalplus.MOD_ID)
public class Metalplus {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "metalplus";

    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.

    public Metalplus(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);


        ModBlocks.register(modEventBus); // registers mod block data into the game.
        ModCreativeModTabs.register(modEventBus); // registers the creative mod tab(s) into the game.
        ModItems.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    // Adds the modded blocks & items into the vanilla creative mod tabs.
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.BLOCK_ANTHRACITE);
        }

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ANTHRACITE);
        }

    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
