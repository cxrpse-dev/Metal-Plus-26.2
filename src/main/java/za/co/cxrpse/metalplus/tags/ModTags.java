package za.co.cxrpse.metalplus.tags;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import za.co.cxrpse.metalplus.Metalplus;

public class ModTags {
    public static class Blocks {

        // Creates new block tags. Intended to be used on blocks to define whether they need to use copper tools.
        public static final TagKey<Block> NEEDS_COPPER_TOOL = createTag("needs_copper_tool");
        public static final TagKey<Block> INCORRECT_FOR_COPPER_TOOL = createTag("incorrect_for_copper_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(Identifier.fromNamespaceAndPath(Metalplus.MOD_ID, name));
        }
    }

    public static class Items {

        // Creates new item tag. Intended to be applied to copper tiered tools for mining.
        public static final TagKey<Item> COPPER_TOOLS = createTag("copper_tools");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(Identifier.fromNamespaceAndPath(Metalplus.MOD_ID, name));
        }
    }
}
