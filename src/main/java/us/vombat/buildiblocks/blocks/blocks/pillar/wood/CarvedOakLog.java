package us.vombat.buildiblocks.blocks.blocks.pillar.wood;

import net.minecraft.block.Block;
import us.vombat.buildiblocks.blocks.handlers.RotatedBlock;

public class CarvedOakLog extends RotatedBlock
{
	public static String name = "carved_oak_log";
	public CarvedOakLog(Block block)
	{
		super(block, name, "axe", 0);
	}
}