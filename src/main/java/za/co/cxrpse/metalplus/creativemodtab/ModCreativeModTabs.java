package za.co.cxrpse.metalplus.creativemodtab;

import net.minecraft.core.registries.Registries;

import net.minecraft.world.item.CreativeModeTab;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import za.co.cxrpse.metalplus.Metalplus;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MOD_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Metalplus.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MOD_TABS.register(eventBus);
    }
}
