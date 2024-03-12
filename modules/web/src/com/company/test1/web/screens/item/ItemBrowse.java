package com.company.test1.web.screens.item;

import com.haulmont.cuba.gui.screen.*;
import com.company.test1.entity.Item;

@UiController("test1_Item.browse")
@UiDescriptor("item-browse.xml")
@LookupComponent("itemsTable")
@LoadDataBeforeShow
public class ItemBrowse extends StandardLookup<Item> {
}