package za.co.cxrpse.metalplus.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import za.co.cxrpse.metalplus.Metalplus;
import za.co.cxrpse.metalplus.block.ModBlocks;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, Metalplus.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        // BLOCKS
        blockModels.createTrivialCube(ModBlocks.BLOCK_ANTHRACITE.get());
    }
}
