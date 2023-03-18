package net.mcreator.mistterysmod.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.LockableLootTileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.mistterysmod.item.FragmentItem;
import net.mcreator.mistterysmod.MistterysModVariables;
import net.mcreator.mistterysmod.MistterysModElements;

@MistterysModElements.ModElement.Tag
public class MezclarprocedureProcedure extends MistterysModElements.ModElement {
	public MezclarprocedureProcedure(MistterysModElements instance) {
		super(instance, 11);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Mezclarprocedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Mezclarprocedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Mezclarprocedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Mezclarprocedure!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				TileEntity inv = world.getTileEntity(pos);
				if (inv instanceof LockableLootTileEntity)
					return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
				return ItemStack.EMPTY;
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(FragmentItem.block, (int) (1)).getItem())
				&& (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						TileEntity inv = world.getTileEntity(pos);
						if (inv instanceof LockableLootTileEntity)
							return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
						return ItemStack.EMPTY;
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Items.BOOK, (int) (1)).getItem())
						&& (((new Object() {
							public int getAmount(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity) {
									ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
									if (stack != null)
										return stack.getCount();
								}
								return 0;
							}
						}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (3))) == 0) || ((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								TileEntity inv = world.getTileEntity(pos);
								if (inv instanceof LockableLootTileEntity)
									return ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								return ItemStack.EMPTY;
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3)))
								.getItem() == new ItemStack(Items.ENCHANTED_BOOK, (int) (1)).getItem()))))) {
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (0), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv instanceof LockableLootTileEntity)
					((LockableLootTileEntity) inv).decrStackSize((int) (1), (int) (1));
			}
			{
				TileEntity inv = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				if (inv != null && (inv instanceof LockableLootTileEntity)) {
					ItemStack _setstack = new ItemStack(Items.ENCHANTED_BOOK, (int) (1));
					_setstack.setCount(((new Object() {
						public int getAmount(BlockPos pos, int sltid) {
							TileEntity inv = world.getTileEntity(pos);
							if (inv instanceof LockableLootTileEntity) {
								ItemStack stack = ((LockableLootTileEntity) inv).getStackInSlot(sltid);
								if (stack != null)
									return stack.getCount();
							}
							return 0;
						}
					}.getAmount(new BlockPos((int) x, (int) y, (int) z), (int) (3))) + 1));
					((LockableLootTileEntity) inv).setInventorySlotContents((int) (3), _setstack);
				}
			}
			while (((MistterysModVariables.MapVariables.get(world).Energy) >= 1)) {
				for (int index1 = 0; index1 < (int) (5); index1++) {
					MistterysModVariables.MapVariables.get(world).Energy = (double) ((MistterysModVariables.MapVariables.get(world).Energy) - 1);
					MistterysModVariables.MapVariables.get(world).syncData(world);
				}
				break;
			}
		}
	}
}
