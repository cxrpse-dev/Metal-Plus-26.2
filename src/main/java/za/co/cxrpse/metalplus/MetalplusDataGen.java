package za.co.cxrpse.metalplus;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import za.co.cxrpse.metalplus.datagen.ModItemTagsProvider;

@EventBusSubscriber(modid = Metalplus.MOD_ID)
public class MetalplusDataGen {
    @SubscribeEvent
    public static void gatherClientData(GatherDataEvent.Client event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();

        generator.addProvider(true, new ModItemTagsProvider(packOutput, lookupProvider)); // Data Gen for modded item tags.
    }
}
