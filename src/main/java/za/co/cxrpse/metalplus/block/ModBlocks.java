package za.co.cxrpse.metalplus.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import za.co.cxrpse.metalplus.Metalplus;
import za.co.cxrpse.metalplus.item.ModItems;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Metalplus.MOD_ID);

    // BLOCK OF ANTHRACITE
    public static final DeferredBlock<Block> BLOCK_ANTHRACITE = registerBlock("block_anthracite",
            properties -> new Block(properties.strength(3.5f, 3.0f)
                    .requiresCorrectToolForDrops().sound(SoundType.NETHERRACK)));




    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
