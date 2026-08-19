package za.co.cxrpse.metalplus.creativemodtab;

import net.minecraft.core.registries.Registries;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import za.co.cxrpse.metalplus.Metalplus;
import za.co.cxrpse.metalplus.block.ModBlocks;
import za.co.cxrpse.metalplus.item.ModItems;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Metalplus.MOD_ID);

    public static final Supplier<CreativeModeTab> METALLURGY = CREATIVE_MOD_TABS.register("metallurgy_item_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ANTHRACITE.get()))
                    .title(Component.translatable("creativetab.metalplus.metallurgy"))
                    .withTabsBefore(CreativeModeTabs.INGREDIENTS)
                    .displayItems((itemDisplayParameters, output) -> {
                        // ITEMS
                        output.accept(ModItems.ANTHRACITE);

                        // BLOCKS
                        output.accept(ModBlocks.BLOCK_ANTHRACITE);

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
