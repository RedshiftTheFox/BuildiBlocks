package us.vombat.buildiblocks.blocks.blocks.block.paintedplanks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import us.vombat.buildiblocks.blocks.handlers.BasicBlock;

public class PaintedOakLightBlue extends BasicBlock
{
	public static String name = "oak_plank_light_blue";
	public PaintedOakLightBlue()
	{
		super(Blocks.PLANKS, name, CreativeTabs.BUILDING_BLOCKS);
	}
}