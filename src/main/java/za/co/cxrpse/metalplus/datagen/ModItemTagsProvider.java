package za.co.cxrpse.metalplus.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import za.co.cxrpse.metalplus.Metalplus;
import za.co.cxrpse.metalplus.tags.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Metalplus.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        String[] coppertools = { "copper_pickaxe", "copper_axe", "copper_shovel", "copper_hoe", "copper_sword" };
        var builder = tag(ModTags.Items.COPPER_TOOLS);
        for (String tool : coppertools) {
            builder.add(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("minecraft", tool))); /* Adds each copper tool's ResourceKey
                                                                                                                             into the COPPER_TOOLS item tag. */
        }
    }
}
