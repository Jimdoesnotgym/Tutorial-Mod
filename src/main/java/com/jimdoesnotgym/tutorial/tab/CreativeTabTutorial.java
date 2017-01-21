package com.jimdoesnotgym.tutorial.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by ms076 on 2017-01-20.
 */
public class CreativeTabTutorial extends CreativeTabs{
    @Override
    public Item getTabIconItem() {
        return Items.EMERALD;
    }

    public CreativeTabTutorial(int index, String label) {
        super(index, label);
    }

}
