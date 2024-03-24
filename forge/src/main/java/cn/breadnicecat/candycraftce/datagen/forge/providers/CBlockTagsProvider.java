package cn.breadnicecat.candycraftce.datagen.forge.providers;

import cn.breadnicecat.candycraftce.CandyCraftCE;
import cn.breadnicecat.candycraftce.block.BlockEntry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import static cn.breadnicecat.candycraftce.block.CBlockTags.*;
import static cn.breadnicecat.candycraftce.block.CBlocks.*;
import static cn.breadnicecat.candycraftce.utils.CommonUtils.accept;
import static cn.breadnicecat.candycraftce.utils.CommonUtils.assertTrue;
import static net.minecraft.tags.BlockTags.*;

/**
 * Created in 2023/10/14 22:39
 * Project: candycraftce
 *
 * @author <a href="https://github.com/Bread-Nicecat">Bread_NiceCat</a>
 * <p>
 */
public class CBlockTagsProvider extends BlockTagsProvider {
	public CBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, CandyCraftCE.MOD_ID, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.@NotNull Provider provider) {
		add(CARAMEL_PORTAL_FRAME, CARAMEL_BLOCK, SUGAR_BLOCK);
		add(PORTALS, CARAMEL_PORTAL);

		add(CLIMBABLE, MARSHMALLOW_LADDER);
		add(CANDY_PLANT_CAN_ON, PUDDING, CUSTARD_PUDDING, PUDDING_FARMLAND);
		add(MINEABLE_WITH_HOE,
				CHEWING_GUM_PUDDLE, MINT_BLOCK, RASPBERRY_BLOCK, BANANA_SEAWEEDS_BLOCK, COTTON_CANDY_BLOCK, CANDIED_CHERRY_SACK, CHEWING_GUM_BLOCK,
				MINT_SLAB, RASPBERRY_SLAB, BANANA_SEAWEEDS_SLAB, COTTON_CANDY_SLAB, CANDIED_CHERRY_SLAB, CHEWING_GUM_SLAB,
				MINT_STAIRS, RASPBERRY_STAIRS, BANANA_SEAWEEDS_STAIRS, COTTON_CANDY_STAIRS, CANDIED_CHERRY_STAIRS, CHEWING_GUM_STAIRS
		);
		add(MINEABLE_WITH_SHOVEL, SUGAR_BLOCK, PUDDING, CUSTARD_PUDDING, PUDDING_FARMLAND,
				ICE_CREAM, MINT_ICE_CREAM, STRAWBERRY_ICE_CREAM, BLUEBERRY_ICE_CREAM,
				ICE_CREAM_SLAB, MINT_ICE_CREAM_SLAB, STRAWBERRY_ICE_CREAM_SLAB, BLUEBERRY_ICE_CREAM_SLAB,
				ICE_CREAM_STAIRS, MINT_ICE_CREAM_STAIRS, STRAWBERRY_ICE_CREAM_STAIRS, BLUEBERRY_ICE_CREAM_STAIRS
		);
		add(MINEABLE_WITH_AXE,
				MARSHMALLOW_CRAFTING_TABLE,
				MARSHMALLOW_LOG, DARK_MARSHMALLOW_LOG, LIGHT_MARSHMALLOW_LOG,
				MARSHMALLOW_PLANKS, LIGHT_MARSHMALLOW_PLANKS, DARK_MARSHMALLOW_PLANKS,
				MARSHMALLOW_FENCE, LIGHT_MARSHMALLOW_FENCE, DARK_MARSHMALLOW_FENCE,
				MARSHMALLOW_SLAB, LIGHT_MARSHMALLOW_SLAB, DARK_MARSHMALLOW_SLAB,
				MARSHMALLOW_STAIRS, LIGHT_MARSHMALLOW_STAIRS, DARK_MARSHMALLOW_STAIRS,
				MARSHMALLOW_DOOR, LIGHT_MARSHMALLOW_DOOR, DARK_MARSHMALLOW_DOOR, MARSHMALLOW_LADDER,
				MARSHMALLOW_FENCE_GATE, LIGHT_MARSHMALLOW_FENCE_GATE, DARK_MARSHMALLOW_FENCE_GATE,
				MARSHMALLOW_TRAPDOOR, LIGHT_MARSHMALLOW_TRAPDOOR, DARK_MARSHMALLOW_TRAPDOOR
		);

		add(MINEABLE_WITH_PICKAXE,
				CHOCOLATE_STONE, CHOCOLATE_COBBLESTONE, BLACK_CHOCOLATE_STONE, BLACK_CHOCOLATE_COBBLESTONE, WHITE_CHOCOLATE_STONE, WHITE_CHOCOLATE_COBBLESTONE,
				LICORICE_ORE, HONEYCOMB_ORE, PEZ_ORE, JELLY_ORE, NOUGAT_ORE,
				CARAMEL_BLOCK, CANDY_CANE_BLOCK, LICORICE_BLOCK, LICORICE_BRICK, PEZ_BLOCK, NOUGAT_BLOCK, NOUGAT_HEAD,
				HONEYCOMB_BLOCK, HONEYCOMB_LAMP,
				LICORICE_FURNACE, CHOCOLATE_FURNACE, SUGAR_FACTORY, ADVANCED_SUGAR_FACTORY, ALCHEMY_MIXER,
				CANDY_CANE_WALL, LICORICE_WALL, LICORICE_BRICK_WALL,
				CANDY_CANE_FENCE,
				CANDY_CANE_SLAB, LICORICE_SLAB, LICORICE_BRICK_SLAB,
				CANDY_CANE_STAIRS, LICORICE_STAIRS, LICORICE_BRICK_STAIRS,
				SUGAR_SPIKES, CRANBERRY_SPIKES
		);
		add(NEEDS_STONE_TOOL, LICORICE_FURNACE, ADVANCED_SUGAR_FACTORY, HONEYCOMB_ORE, HONEYCOMB_BLOCK);
		add(NEEDS_IRON_TOOL,
				JELLY_ORE, NOUGAT_ORE, PEZ_ORE,
				ALCHEMY_MIXER, SUGAR_SPIKES, CRANBERRY_SPIKES,
				NOUGAT_BLOCK, NOUGAT_HEAD, HONEYCOMB_BLOCK, PEZ_BLOCK
		);

		add(NEEDS_DIAMOND_TOOL);
		add(CHOCOLATES, CHOCOLATE_STONE, CHOCOLATE_COBBLESTONE, BLACK_CHOCOLATE_STONE, BLACK_CHOCOLATE_COBBLESTONE, WHITE_CHOCOLATE_STONE, WHITE_CHOCOLATE_COBBLESTONE);
		add(GEN_REPLACEABLE, CHOCOLATE_STONE, CHOCOLATE_COBBLESTONE, BLACK_CHOCOLATE_STONE, BLACK_CHOCOLATE_COBBLESTONE, WHITE_CHOCOLATE_STONE, WHITE_CHOCOLATE_COBBLESTONE);
		add(FENCES, CANDY_CANE_FENCE, MARSHMALLOW_FENCE, LIGHT_MARSHMALLOW_FENCE, DARK_MARSHMALLOW_FENCE);
		add(SLABS, CANDY_CANE_SLAB, LICORICE_SLAB, LICORICE_BRICK_SLAB, MARSHMALLOW_SLAB, LIGHT_MARSHMALLOW_SLAB, DARK_MARSHMALLOW_SLAB, MINT_SLAB, RASPBERRY_SLAB, BANANA_SEAWEEDS_SLAB, COTTON_CANDY_SLAB, CANDIED_CHERRY_SLAB, CHEWING_GUM_SLAB, ICE_CREAM_SLAB, MINT_ICE_CREAM_SLAB, STRAWBERRY_ICE_CREAM_SLAB, BLUEBERRY_ICE_CREAM_SLAB);
		add(STAIRS, CANDY_CANE_STAIRS, LICORICE_STAIRS, LICORICE_BRICK_STAIRS, MARSHMALLOW_STAIRS, LIGHT_MARSHMALLOW_STAIRS, DARK_MARSHMALLOW_STAIRS, MINT_STAIRS, RASPBERRY_STAIRS, BANANA_SEAWEEDS_STAIRS, COTTON_CANDY_STAIRS, CANDIED_CHERRY_STAIRS, CHEWING_GUM_STAIRS, ICE_CREAM_STAIRS, MINT_ICE_CREAM_STAIRS, STRAWBERRY_ICE_CREAM_STAIRS, BLUEBERRY_ICE_CREAM_STAIRS);
		add(WALLS, CANDY_CANE_WALL, LICORICE_WALL, LICORICE_BRICK_WALL);
		add(FENCE_GATES, MARSHMALLOW_FENCE_GATE, LIGHT_MARSHMALLOW_FENCE_GATE, DARK_MARSHMALLOW_FENCE_GATE);
		add(DOORS, MARSHMALLOW_DOOR, LIGHT_MARSHMALLOW_DOOR, DARK_MARSHMALLOW_DOOR);
		add(TRAPDOORS, MARSHMALLOW_TRAPDOOR, LIGHT_MARSHMALLOW_TRAPDOOR, DARK_MARSHMALLOW_TRAPDOOR);

		add(JELLIES, TRAMPOJELLY, RED_TRAMPOJELLY, SOFT_TRAMPOJELLY, JELLY_SHOCK_ABSORBER, SENSITIVE_JELLY);
		add(CANDY_LOGS, MARSHMALLOW_LOG, DARK_MARSHMALLOW_LOG, LIGHT_MARSHMALLOW_LOG);
		add(LOGS, MARSHMALLOW_LOG, DARK_MARSHMALLOW_LOG, LIGHT_MARSHMALLOW_LOG);
		add(LEAVES, WHITE_CHOCOLATE_LEAVES, MAGIC_LEAVES, CHOCOLATE_LEAVES, CARAMEL_LEAVES, CANDIED_CHERRY_LEAVES);
		add(SAPLINGS, CANDIED_CHERRY_SAPLING, CARAMEL_SAPLING, CHOCOLATE_SAPLING, WHITE_CHOCOLATE_SAPLING);
		add(CANDY_PLANKS, MARSHMALLOW_PLANKS, LIGHT_MARSHMALLOW_PLANKS, DARK_MARSHMALLOW_PLANKS);
		add(ICE_CREAMS, ICE_CREAM, MINT_ICE_CREAM, STRAWBERRY_ICE_CREAM, BLUEBERRY_ICE_CREAM);
	}

	private Map<TagKey<Block>, Set<BlockEntry<?>>> validator = new HashMap<>();

	private void add(TagKey<Block> tagKey, BlockEntry<?>... be) {
		if (be.length == 0) return;

		HashSet<BlockEntry<?>> set = new HashSet<>();
		assertTrue(validator.put(tagKey, set) == null, () -> "Duplicate query tag: " + tagKey);
		IntrinsicTagAppender<Block> tag = tag(tagKey);
		accept(i -> {
			assertTrue(set.add(i), () -> "Duplicate block: " + i + " in Tag: " + tagKey);
			tag.add(i.get());
		}, be);
	}
}
