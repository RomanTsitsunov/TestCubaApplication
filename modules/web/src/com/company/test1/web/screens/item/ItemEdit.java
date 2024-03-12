package com.company.test1.web.screens.item;

import com.haulmont.cuba.gui.screen.*;
import com.company.test1.entity.Item;

@UiController("test1_Item.edit")
@UiDescriptor("item-edit.xml")
@EditedEntityContainer("itemDc")
@LoadDataBeforeShow
public class ItemEdit extends StandardEditor<Item> {
}