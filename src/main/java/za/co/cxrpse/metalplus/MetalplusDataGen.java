package za.co.cxrpse.metalplus;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import za.co.cxrpse.metalplus.datagen.ModItemTagsProvider;
import za.co.cxrpse.metalplus.datagen.ModModelProvider;

@EventBusSubscriber(modid = Metalplus.MOD_ID)
public class MetalplusDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new ModItemTagsProvider(packOutput, lookupProvider)); // Datagen for modded item tags.
        generator.addProvider(true, new ModModelProvider(packOutput)); // Datagen for adding models for modded item/block states.
    }
}
