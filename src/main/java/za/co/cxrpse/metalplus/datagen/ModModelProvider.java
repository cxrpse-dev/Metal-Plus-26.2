package za.co.cxrpse.metalplus.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplate;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;
import za.co.cxrpse.metalplus.Metalplus;
import za.co.cxrpse.metalplus.block.ModBlocks;
import za.co.cxrpse.metalplus.item.ModItems;

public class ModModelProvider extends ModelProvider{
    public ModModelProvider(PackOutput output) {
        super(output, Metalplus.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModel) {
        // ITEMS
        itemModel.generateFlatItem(ModItems.ANTHRACITE.get(), ModelTemplates.FLAT_ITEM);


        // BLOCK
        blockModels.createTrivialCube(ModBlocks.BLOCK_ANTHRACITE.get());
    }
}