package cn.breadnicecat.candycraftce.registration.block;

import cn.breadnicecat.candycraftce.CandyCraftCE;
import cn.breadnicecat.candycraftce.registration.block.blocks.SugarBlock;
import cn.breadnicecat.candycraftce.utils.CLogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import org.slf4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static cn.breadnicecat.candycraftce.registration.block.CBlockBuilder.create;


/**
 * Created in 2023/11/26 9:41
 * Project: candycraftce
 *
 * @author <a href="https://github.com/BreadNiceCat">Bread_NiceCat</a>
 * <p>
 */
public class CBlocks {

	private static final Logger LOGGER = CLogUtils.sign();

	static {
		CandyCraftCE.hookMinecraftSetup(() -> BLOCKS = Collections.unmodifiableMap(CBlocks.BLOCKS));
	}

	public static Map<ResourceLocation, BlockEntry<? extends Block>> BLOCKS = new HashMap<>();

	public static final BlockEntry<Block> TEST_BLOCK = create("test").setProperties(Blocks.BEDROCK).save();
	//HELPER.single(SUGAR_BLOCK, BlockSugar::new, CCBlockManager::simpleBlockItem,
//        MODEL_SIMPLE, VTAG_MINEABLE_WITH_SHOVEL, CANDYLAND_PORTAL_FRAME.getGroupId());
//HELPER.single(CARAMEL_BLOCK, () -> new BlockSugar(Properties.copy(Blocks.STONE)), CCBlockManager::simpleBlockItem,
//        MODEL_SIMPLE, VTAG_MINEABLE_WITH_PICKAXE, CANDYLAND_PORTAL_FRAME.getGroupId(), LOOT_DROP_SELF);
//
//HELPER.single(CHOCOLATE_STONE, () -> new Block(Properties.copy(Blocks.STONE)), CCBlockManager::simpleBlockItem,
//        MODEL_SIMPLE, VTAG_MINEABLE_WITH_PICKAXE);
//HELPER.single(CHOCOLATE_COBBLESTONE, () -> new Block(Properties.copy(Blocks.COBBLESTONE)), CCBlockManager::simpleBlockItem,
//        MODEL_SIMPLE, LOOT_DROP_SELF, VTAG_MINEABLE_WITH_PICKAXE);

	public static final BlockEntry<SugarBlock> SUGAR_BLOCK = create("sugar_block", SugarBlock::new).setProperties(Blocks.SAND).save();

	public static void init() {
	}
}
