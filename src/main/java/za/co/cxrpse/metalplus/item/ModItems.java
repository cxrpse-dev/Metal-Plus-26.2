package za.co.cxrpse.metalplus.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import za.co.cxrpse.metalplus.Metalplus;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Metalplus.MOD_ID);

    // Metallurgy
    public static final DeferredItem<Item> ANTHRACITE = ITEMS.registerSimpleItem("anthracite"); // TODO: make anthracite act as a fuel source.

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
