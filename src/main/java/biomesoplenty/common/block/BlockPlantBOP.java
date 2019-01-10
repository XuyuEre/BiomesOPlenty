/*******************************************************************************
 * Copyright 2014-2019, the Biomes O' Plenty Team
 *
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International Public License.
 *
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/4.0/.
 ******************************************************************************/
package biomesoplenty.common.block;

import net.minecraft.block.BlockBush;
import net.minecraft.block.material.Material;

public class BlockPlantBOP extends BlockBush
{
    public BlockPlantBOP()
    {
    	// TODO: Sound
        super(Builder.create(Material.PLANTS).doesNotBlockMovement().hardnessAndResistance(0.0F, 0.0F));
    }
}
